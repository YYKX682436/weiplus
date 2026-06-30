package iq2;

/* loaded from: classes2.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f375244d;

    public b(iq2.d0 d0Var) {
        this.f375244d = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iq2.d0 d0Var = this.f375244d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a c14594x9de071a = d0Var.f375259j;
        if (c14594x9de071a == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = c14594x9de071a.m7949x5701d990();
        boolean z17 = false;
        if (m7949x5701d990 != null && m7949x5701d990.o()) {
            z17 = true;
        }
        if (z17) {
            m7949x5701d990.p(new iq2.c(d0Var));
        } else {
            d0Var.d("removeItem");
        }
    }
}
