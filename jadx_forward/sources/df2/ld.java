package df2;

/* loaded from: classes3.dex */
public final class ld implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14408x406bfa38 f312189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.od f312190e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.pb2 f312191f;

    public ld(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14408x406bfa38 c14408x406bfa38, df2.od odVar, r45.pb2 pb2Var) {
        this.f312189d = c14408x406bfa38;
        this.f312190e = odVar;
        this.f312191f = pb2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String a76 = df2.od.a7(this.f312190e, (r45.ug1) this.f312191f.m75936x14adae67(0));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14408x406bfa38 c14408x406bfa38 = this.f312189d;
        c14408x406bfa38.m57940x25977aad(a76);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14334xd566b302 c14334xd566b302 = c14408x406bfa38.f199220e;
        if (c14334xd566b302 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("txtView");
            throw null;
        }
        c14334xd566b302.f197558f = 0;
        c14334xd566b302.f197559g = true;
        c14334xd566b302.f197560h = true;
        if (c14334xd566b302.f197565p > 0) {
            c14334xd566b302.c();
        } else {
            c14334xd566b302.b();
        }
    }
}
