package hl5;

/* loaded from: classes15.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.PopupWindow f363659a;

    /* renamed from: b, reason: collision with root package name */
    public int f363660b;

    /* renamed from: c, reason: collision with root package name */
    public int f363661c;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f363662d;

    /* renamed from: e, reason: collision with root package name */
    public final hl5.f f363663e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f363664f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f363665g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f363666h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 f363667i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f363668j;

    /* renamed from: l, reason: collision with root package name */
    public android.view.Menu f363670l;

    /* renamed from: k, reason: collision with root package name */
    public boolean f363669k = false;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f363671m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final int[] f363672n = new int[2];

    /* renamed from: o, reason: collision with root package name */
    public final gl5.d0 f363673o = new hl5.b(this);

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f363674p = new hl5.c(this);

    public g(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023) {
        this.f363667i = viewTreeObserverOnPreDrawListenerC22668xe0605023;
        android.content.Context context = viewTreeObserverOnPreDrawListenerC22668xe0605023.getContext();
        this.f363666h = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bon, (android.view.ViewGroup) null);
        this.f363668j = inflate;
        inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f363660b = inflate.getMeasuredWidth();
        this.f363661c = inflate.getMeasuredHeight();
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(inflate, -2, -2, false);
        this.f363659a = popupWindow;
        popupWindow.setClippingEnabled(false);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) inflate.findViewById(com.p314xaae8f345.mm.R.id.m8z);
        this.f363662d = c1163xf1deaba4;
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 0, false));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(new nl5.z(context.getResources().getString(android.R.string.selectAll), android.R.id.selectAll, 12));
        linkedList.add(new nl5.z(context.getResources().getString(android.R.string.cut), android.R.id.cut, 9));
        linkedList.add(new nl5.z(context.getResources().getString(android.R.string.copy), android.R.id.copy, 9));
        linkedList.add(new nl5.z(context.getResources().getString(android.R.string.paste), android.R.id.paste));
        this.f363664f = linkedList;
        hl5.f fVar = new hl5.f(this, linkedList, new hl5.a(this));
        this.f363663e = fVar;
        c1163xf1deaba4.mo7960x6cab2c8d(fVar);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.i0 i0Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.i0(context, 0);
        i0Var.d(new android.graphics.drawable.ColorDrawable(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560811uu)));
        c1163xf1deaba4.N(i0Var);
        this.f363665g = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565539co5);
        popupWindow.setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f575976nb);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("cmEdit.OperateWindow", "new OpWindow @%s", java.lang.Integer.valueOf(hashCode()));
    }

    public final void a(boolean z17) {
        android.widget.PopupWindow popupWindow = this.f363659a;
        if (z17) {
            android.view.View contentView = popupWindow.getContentView();
            contentView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            this.f363660b = contentView.getMeasuredWidth();
            this.f363661c = contentView.getMeasuredHeight();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.f363667i;
        int[] iArr = this.f363672n;
        viewTreeObserverOnPreDrawListenerC22668xe0605023.getLocationInWindow(iArr);
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        android.content.Context context = this.f363666h;
        int n17 = wl5.y.n(context);
        int a17 = com.p314xaae8f345.mm.ui.zk.a(context, 10);
        int i17 = n17 - (a17 * 2);
        if (this.f363660b >= i17) {
            this.f363660b = i17;
        }
        int m81687x6f2c472c = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81687x6f2c472c();
        int m81686xffd93625 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81686xffd93625();
        int primaryHorizontal = ((((((int) m81661x22f21e20.getPrimaryHorizontal(m81687x6f2c472c)) + ((int) m81661x22f21e20.getPrimaryHorizontal(m81686xffd93625))) / 2) + iArr[0]) - (this.f363660b / 2)) + viewTreeObserverOnPreDrawListenerC22668xe0605023.getPaddingLeft();
        if (m81687x6f2c472c != m81686xffd93625 && m81661x22f21e20.getLineForOffset(m81687x6f2c472c) != m81661x22f21e20.getLineForOffset(m81686xffd93625)) {
            primaryHorizontal = (iArr[0] + (viewTreeObserverOnPreDrawListenerC22668xe0605023.getWidth() / 2)) - (this.f363660b / 2);
        }
        int lineTop = ((((m81661x22f21e20.getLineTop(m81661x22f21e20.getLineForOffset(m81687x6f2c472c)) + iArr[1]) - this.f363661c) + viewTreeObserverOnPreDrawListenerC22668xe0605023.getPaddingTop()) - viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollY()) - com.p314xaae8f345.mm.ui.zk.a(context, 5);
        int a18 = (iArr[1] - this.f363661c) - com.p314xaae8f345.mm.ui.zk.a(context, 5);
        int height = ((iArr[1] + viewTreeObserverOnPreDrawListenerC22668xe0605023.getHeight()) - this.f363661c) - com.p314xaae8f345.mm.ui.zk.a(context, 5);
        int i18 = primaryHorizontal <= a17 ? a17 : primaryHorizontal;
        if (lineTop < a18) {
            lineTop = a18;
        }
        if (lineTop > height) {
            return;
        }
        int i19 = this.f363660b;
        if (i18 + i19 > n17) {
            i18 = (n17 - i19) - a17;
        }
        ((android.widget.LinearLayout.LayoutParams) this.f363665g.getLayoutParams()).leftMargin = primaryHorizontal - i18;
        popupWindow.setElevation(8.0f);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager mo7951xfd37656d = this.f363662d.mo7951xfd37656d();
        if (mo7951xfd37656d instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) mo7951xfd37656d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/ui/widget/cedit/menu/OperateWindow", "positionView", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
            c1162x665295de.mo2420xc593c771(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1162x665295de, "com/tencent/mm/ui/widget/cedit/menu/OperateWindow", "positionView", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
        }
        popupWindow.setWidth(this.f363660b);
        try {
            if (popupWindow.isShowing()) {
                popupWindow.update(i18, lineTop, popupWindow.getWidth(), popupWindow.getHeight());
            } else {
                popupWindow.showAtLocation(viewTreeObserverOnPreDrawListenerC22668xe0605023, 0, i18, lineTop);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
