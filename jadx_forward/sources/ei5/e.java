package ei5;

/* loaded from: classes3.dex */
public final class e extends dg3.k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // dg3.k
    public java.util.List W6(mf3.k info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new dg3.p(dg3.q.f313874e, com.p314xaae8f345.mm.R.C30867xcad56011.i29, com.p314xaae8f345.mm.R.raw.f79902x4225bfc7, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m)));
        if (info.mo2109xfb85f7b0() == mf3.u.f407656e) {
            arrayList.add(new dg3.p(dg3.q.f313876g, com.p314xaae8f345.mm.R.C30867xcad56011.hjg, com.p314xaae8f345.mm.R.raw.f78683x36757420, null));
        }
        return arrayList;
    }

    @Override // dg3.k
    public dg3.o X6(mf3.k info, mf3.p apiCenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        return new ei5.d(info, this, super.X6(info, apiCenter));
    }

    @Override // dg3.k
    public java.util.List Y6(mf3.k info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        dg3.q qVar = dg3.q.f313875f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
        arrayList.add(new dg3.p(qVar, com.p314xaae8f345.mm.R.C30867xcad56011.i8c, com.p314xaae8f345.mm.R.raw.f80089x8164b1e0, valueOf));
        if (info.mo2109xfb85f7b0() == mf3.u.f407656e) {
            arrayList.add(new dg3.p(dg3.q.f313878i, com.p314xaae8f345.mm.R.C30867xcad56011.b2f, com.p314xaae8f345.mm.R.raw.f80336x9bb432f6, valueOf));
        }
        return arrayList;
    }

    @Override // dg3.k
    public void Z6(mf3.k info) {
        r45.gp0 gp0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85 c6631xd817ea85 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85();
        c6631xd817ea85.f139850e = 1L;
        c6631xd817ea85.f139851f = 5L;
        ai5.c cVar = info instanceof ai5.c ? (ai5.c) info : null;
        if (cVar != null && (gp0Var = cVar.f86740a) != null) {
            c6631xd817ea85.q(gp0Var.f456967s);
            c6631xd817ea85.p(gp0Var.f456971u);
        }
        c6631xd817ea85.k();
    }

    @Override // dg3.k, dg3.m
    public void y6(mf3.k info, mf3.p apiCenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        super.y6(info, apiCenter);
    }
}
