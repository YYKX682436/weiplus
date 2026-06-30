package vg2;

/* loaded from: classes3.dex */
public final class x extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.a0 f518148d;

    public x(vg2.a0 a0Var) {
        this.f518148d = a0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int b17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams).b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GiftBatchSelectToastWidget", "getItemOffsets: pos: " + b17);
        vg2.a0 a0Var = this.f518148d;
        a0Var.f518003f.size();
        outRect.left = b17 > 0 ? a0Var.f518003f.size() > 5 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1) : 0;
        outRect.right = 0;
        outRect.bottom = 0;
        outRect.top = 0;
    }
}
