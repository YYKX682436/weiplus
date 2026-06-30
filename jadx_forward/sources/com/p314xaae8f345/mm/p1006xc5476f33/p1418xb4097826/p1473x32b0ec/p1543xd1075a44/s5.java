package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class s5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 f201255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var) {
        super(0);
        this.f201255d = d6Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var = this.f201255d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = d6Var.f199607p;
        if (c22613xe7040d9c == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
            throw null;
        }
        if (!c22613xe7040d9c.isShowing) {
            c22613xe7040d9c.f();
        }
        android.widget.TextView textView = d6Var.f199597f;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.FrameLayout frameLayout = d6Var.f199598g;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        d6Var.e();
        return jz5.f0.f384359a;
    }
}
