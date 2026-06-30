package com.tencent.mm.plugin.appbrand.widget.desktop;

/* loaded from: classes8.dex */
public class AppBrandDesktopDragView extends com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView implements cl1.m0 {
    public java.util.List G;
    public cl1.k0 H;
    public cl1.l0 I;

    /* renamed from: J, reason: collision with root package name */
    public int f91079J;
    public boolean K;
    public boolean L;
    public final android.graphics.Rect M;

    public AppBrandDesktopDragView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = null;
        this.I = null;
        this.f91079J = 0;
        this.K = true;
        this.L = false;
        this.M = new android.graphics.Rect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getOffsetX() {
        return (-this.f91079J) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getOffsetY() {
        return ((-0.0f) - i65.a.b(getContext(), 40)) - (((cl1.j.a(getContext()) * 1.5f) + (i65.a.b(getContext(), 8) * 2)) / 2.0f);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView
    public dl1.c a(androidx.recyclerview.widget.k3 k3Var) {
        dl1.f fVar = new dl1.f(this, this.G, new cl1.g(this));
        getRecyclerScrollComputer();
        fVar.f235180d = new cl1.h(this);
        return fVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView
    public boolean b(android.view.MotionEvent motionEvent) {
        if (this.f91108i.getItemViewType() == 1) {
            return false;
        }
        return super.b(motionEvent);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView
    public androidx.recyclerview.widget.k3 g(float f17, float f18, boolean z17) {
        androidx.recyclerview.widget.k3 k3Var;
        androidx.recyclerview.widget.RecyclerView recyclerView = getRecyclerView();
        android.graphics.Rect rect = this.C;
        recyclerView.getGlobalVisibleRect(rect);
        int i17 = (int) f17;
        int i18 = (int) f18;
        if (!rect.contains(i17, i18)) {
            return null;
        }
        boolean z18 = false;
        int i19 = 0;
        androidx.recyclerview.widget.k3 k3Var2 = null;
        while (true) {
            if (i19 >= getRecyclerView().getChildCount()) {
                k3Var = null;
                break;
            }
            k3Var = getRecyclerView().w0(getRecyclerView().getChildAt(i19));
            if (k3Var.getItemViewType() != 5 && k3Var.getItemViewType() != 3) {
                k3Var.itemView.getGlobalVisibleRect(rect);
                if (rect.contains(i17, i18)) {
                    z18 = true;
                    k3Var2 = k3Var;
                    break;
                }
                k3Var2 = k3Var;
            }
            i19++;
        }
        if (z18) {
            return k3Var;
        }
        if (z17 || ((f17 <= rect.right || f18 <= rect.top) && f18 <= rect.bottom)) {
            return null;
        }
        return k3Var2;
    }

    public android.view.View o(androidx.recyclerview.widget.RecyclerView recyclerView, cl1.z zVar) {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.bno, (android.view.ViewGroup) null, false);
        inflate.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(-2, -2));
        cl1.z zVar2 = new cl1.z(inflate);
        android.view.View view = zVar2.itemView;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopDragView", "fillFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopDragView", "fillFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopDragView", "fillFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopDragView", "fillFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int[] iArr = new int[2];
        zVar.f42904f.getLocationOnScreen(iArr);
        android.widget.ImageView imageView = zVar.f42904f;
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        android.widget.ImageView imageView2 = zVar2.f42904f;
        imageView2.setImageDrawable(drawable);
        imageView2.setBackground(imageView.getBackground());
        android.widget.TextView textView = zVar.f42908m;
        java.lang.CharSequence text = textView.getText();
        android.widget.TextView textView2 = zVar2.f42908m;
        textView2.setText(text);
        textView2.setVisibility(textView.getVisibility());
        android.widget.ImageView imageView3 = zVar2.f42909n;
        imageView3.setVisibility(4);
        float a17 = cl1.j.a(getContext());
        float b17 = (a17 * 1.5f) + (i65.a.b(getContext(), 8) * 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopDragView", "fillFloatView iconLayout: %f", java.lang.Float.valueOf(b17));
        int i17 = (int) b17;
        view.findViewById(com.tencent.mm.R.id.h7g).getLayoutParams().height = i17;
        android.view.ViewGroup viewGroup = zVar2.f42906h;
        viewGroup.getLayoutParams().height = i17;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        int i18 = (int) a17;
        layoutParams.width = ((int) (i65.a.f(getContext(), com.tencent.mm.R.dimen.f479924j3) * 2 * cl1.k.a(getContext()))) + i18;
        imageView2.getLayoutParams().width = i18;
        imageView2.getLayoutParams().height = i18;
        android.widget.ImageView imageView4 = zVar2.f42905g;
        imageView4.getLayoutParams().width = i18;
        imageView4.getLayoutParams().height = i18;
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView3.getLayoutParams();
        if (layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams) {
            ((android.widget.RelativeLayout.LayoutParams) layoutParams2).topMargin = i65.a.b(getContext(), 6) + ((int) ((a17 * 0.5f) / 2.0f));
            layoutParams2.width = (int) (getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf) * cl1.k.a(getContext()));
            layoutParams2.height = (int) (getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf) * cl1.k.a(getContext()));
        }
        float f17 = a17 / 2.0f;
        int i19 = (int) (iArr[0] + f17);
        iArr[0] = i19;
        iArr[1] = (int) (iArr[1] + f17);
        float offsetX = i19 + getOffsetX();
        float offsetY = iArr[1] + getOffsetY();
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.a0k);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopDragView", "fillFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopDragView", "fillFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.findViewById(com.tencent.mm.R.id.f485298h75).animate().alpha(0.5f).setDuration(300L).setListener(null).start();
        com.tencent.mars.xlog.Log.i("MicroMsg.DragFeatureView", "enableScroll %b", java.lang.Boolean.FALSE);
        this.f91122z = false;
        view.findViewById(com.tencent.mm.R.id.f485298h75).animate().scaleX(1.5f).scaleY(1.5f).setDuration(300L).setListener(new cl1.i(this)).start();
        android.widget.ImageView imageView5 = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.nhu);
        imageView5.getLayoutParams().height = (int) (i65.a.b(getContext(), 24) * cl1.k.a(getContext()));
        imageView5.getLayoutParams().width = (int) (i65.a.b(getContext(), 24) * cl1.k.a(getContext()));
        imageView5.setTranslationY(((-a17) * 0.5f) / 2.0f);
        imageView5.setTranslationX((a17 * 0.5f) / 2.0f);
        view.setTranslationX(offsetX);
        view.setTranslationY(offsetY);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopDragView", "fillFloatView offsetX: %f, transX: %f, transY: %f", java.lang.Float.valueOf(getOffsetX()), java.lang.Float.valueOf(offsetX), java.lang.Float.valueOf(offsetY));
        return view;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        android.graphics.Rect rect = this.f91112p;
        getGlobalVisibleRect(rect);
        int i28 = rect.left;
        int i29 = rect.bottom;
        int i37 = this.f91103d;
        rect.set(i28, ((i29 - i37) - ((int) (getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a2a) * 1.0f))) - 40, rect.right, rect.bottom - i37);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopDragView", "bottomRect: %s", rect);
        androidx.recyclerview.widget.RecyclerView recyclerView = getRecyclerView();
        android.graphics.Rect rect2 = this.f91113q;
        recyclerView.getGlobalVisibleRect(rect2);
        rect2.set(rect2.left, 0, rect2.right, rect2.top + i37);
    }

    @Override // cl1.m0
    public void setAppBrandDragCallback(cl1.k0 k0Var) {
        this.H = k0Var;
    }

    @Override // cl1.m0
    public void setCanMyWeAppMove(boolean z17) {
        this.K = z17;
    }

    @Override // cl1.m0
    public void setList(java.util.List list) {
        this.G = list;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView
    public void setRubbishViewVisible(int i17) {
        super.setRubbishViewVisible(i17);
    }

    @Override // cl1.m0
    public void setSectionCallback(cl1.l0 l0Var) {
        this.I = l0Var;
    }

    @Override // cl1.m0
    public void setShouldDoDeleteAnimation(boolean z17) {
        this.L = z17;
    }

    @Override // cl1.m0
    public void setViewWidth(int i17) {
        this.f91079J = i17;
    }

    public AppBrandDesktopDragView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.H = null;
        this.I = null;
        this.f91079J = 0;
        this.K = true;
        this.L = false;
        this.M = new android.graphics.Rect();
    }
}
