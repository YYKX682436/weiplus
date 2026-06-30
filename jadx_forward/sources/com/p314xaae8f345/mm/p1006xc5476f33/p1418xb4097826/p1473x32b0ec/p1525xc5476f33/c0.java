package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q0 f193623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f193624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q0 q0Var, yz5.a aVar) {
        super(0);
        this.f193623d = q0Var;
        this.f193624e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q0 q0Var = this.f193623d;
        mm2.h v17 = q0Var.v1();
        android.view.ViewParent parent = v17 != null ? v17.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(q0Var.v1());
        }
        mm2.h v18 = q0Var.v1();
        if (v18 != null) {
            v18.m147954x887cd1cb(q0Var.f195478u);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        mm2.h v19 = q0Var.v1();
        android.widget.FrameLayout frameLayout = q0Var.f195475r;
        frameLayout.addView(v19, layoutParams);
        frameLayout.requestLayout();
        this.f193624e.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
