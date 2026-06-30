package jf2;

/* loaded from: classes3.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e H;
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 I;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.LinkedList f380904J;
    public final jz5.g K;
    public final jz5.g L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(context, false, null, 0.0f, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.H = store;
        this.f380904J = new java.util.LinkedList();
        this.K = jz5.h.b(new jf2.b(context));
        this.L = jz5.h.b(new jf2.f(context, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dr8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int J() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.rpw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById;
        this.I = c22849x81a93d25;
        android.content.Context context = this.f199716e;
        c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(context, 5, 1, false));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.I;
        if (c22849x81a93d252 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rv");
            throw null;
        }
        c22849x81a93d252.mo7960x6cab2c8d((jf2.e) ((jz5.n) this.L).mo141623x754a37bb());
        a0(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.clh));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var, boolean z17, int i17) {
        java.util.LinkedList linkedList;
        super.V(e0Var, z17, i17);
        java.util.LinkedList linkedList2 = this.f380904J;
        linkedList2.clear();
        jf2.k0 k0Var = (jf2.k0) this.H.m56798x25fe639c(jf2.k0.class);
        if (k0Var != null && (linkedList = k0Var.f380915q) != null) {
            linkedList2.addAll(linkedList);
        }
        ((jf2.e) ((jz5.n) this.L).mo141623x754a37bb()).m8146xced61ae5();
        int i18 = 0;
        for (java.lang.Object obj : linkedList2) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            jf2.o oVar = (jf2.o) obj;
            jf2.l lVar = oVar instanceof jf2.l ? (jf2.l) oVar : null;
            if (lVar != null) {
                lVar.F(i18);
            }
            i18 = i19;
        }
    }
}
