package al1;

/* loaded from: classes5.dex */
public class p0 extends android.widget.PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5801a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.WindowManager f5802b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f5803c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f5804d;

    public p0(android.content.Context context) {
        super(context);
        this.f5801a = null;
        this.f5801a = context;
        this.f5802b = (android.view.WindowManager) context.getSystemService("window");
        this.f5804d = new android.widget.FrameLayout(context);
    }

    public void a() {
        android.view.View contentView = getContentView();
        android.view.ViewPropertyAnimator animate = contentView.animate();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/MMPopupWindowWithMask", "exitAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        contentView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/appbrand/widget/actionbar/MMPopupWindowWithMask", "exitAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        animate.alpha(0.0f).setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(250L).setListener(new al1.o0(this, contentView, animate)).start();
    }

    public void b(android.view.View view, android.widget.FrameLayout.LayoutParams layoutParams) {
        this.f5804d.addView(view, layoutParams);
        super.setContentView(this.f5804d);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        android.view.View view = this.f5803c;
        if (view != null) {
            try {
                this.f5802b.removeViewImmediate(view);
            } catch (java.lang.IllegalArgumentException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.MMPopupWindowWithMask", e17, "removeMask protected", new java.lang.Object[0]);
            }
            this.f5803c = null;
        }
        super.dismiss();
    }

    @Override // android.widget.PopupWindow
    public void setContentView(android.view.View view) {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        android.content.Context context = this.f5801a;
        layoutParams.topMargin = i65.a.f(context, com.tencent.mm.R.dimen.f480031m4);
        layoutParams.rightMargin = i65.a.f(context, com.tencent.mm.R.dimen.f480030m3);
        layoutParams.leftMargin = i65.a.f(context, com.tencent.mm.R.dimen.f480030m3);
        this.f5804d.addView(view, layoutParams);
        super.setContentView(this.f5804d);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view) {
        android.os.IBinder windowToken = view.getWindowToken();
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.type = 1000;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        layoutParams.token = windowToken;
        android.view.View view2 = new android.view.View(this.f5801a);
        this.f5803c = view2;
        view2.setBackgroundColor(2130706432);
        this.f5803c.setFitsSystemWindows(false);
        this.f5803c.setOnTouchListener(new al1.l0(this));
        this.f5803c.setOnKeyListener(new al1.m0(this));
        this.f5802b.addView(this.f5803c, layoutParams);
        super.showAsDropDown(view);
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(android.view.View view, int i17, int i18, int i19) {
        super.showAtLocation(view, i17, i18, i19);
        android.view.View rootView = getContentView().getRootView();
        android.view.ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (layoutParams instanceof android.view.WindowManager.LayoutParams) {
            android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                layoutParams2.layoutInDisplayCutoutMode = 1;
            }
            this.f5802b.updateViewLayout(rootView, layoutParams2);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MMPopupWindowWithMask", "showMultiTaskView updateViewLayout");
        }
    }
}
