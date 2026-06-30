package je2;

/* loaded from: classes3.dex */
public final class v extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ je2.w f380811b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(je2.w wVar, java.lang.Class cls) {
        super(cls);
        this.f380811b = wVar;
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.vc2 result = (r45.vc2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        je2.w wVar = this.f380811b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wVar.f380812f, "recevie oneclick msg = " + pm0.b0.g(result) + ", curSeq = " + wVar.f380813g);
        wVar.f380815i = result.m75934xbce7f2f(3);
        dk2.tb tbVar = dk2.ef.f314925k;
        r45.uc2 uc2Var = new r45.uc2();
        uc2Var.set(0, wVar.f380815i);
        tbVar.h(17, uc2Var);
        java.lang.Long l17 = wVar.f380813g;
        if (l17 == null || l17.longValue() - result.m75942xfb822ef2(0) > 0) {
            r45.kv1 kv1Var = (r45.kv1) result.m75936x14adae67(1);
            java.lang.String m75945x2fec8307 = result.m75945x2fec8307(2);
            if (kv1Var == null || m75945x2fec8307 == null) {
                return;
            }
            wVar.f380814h.mo7808x76db6cb1(result);
        }
    }
}
