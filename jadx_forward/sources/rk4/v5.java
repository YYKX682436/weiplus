package rk4;

/* loaded from: classes14.dex */
public final class v5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.C18710x505d67f f478554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.C18710x505d67f c18710x505d67f) {
        super(0);
        this.f478554d = c18710x505d67f;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean d76;
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.C18710x505d67f c18710x505d67f = this.f478554d;
        if (c18710x505d67f.f256164f == rk4.z5.f478660e) {
            if (c18710x505d67f.f256167i != 0) {
                d76 = false;
            }
            d76 = true;
        } else {
            m40.p0 p0Var = c18710x505d67f.f256169n;
            if (p0Var != null) {
                d76 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) p0Var).d7();
            }
            d76 = true;
        }
        return java.lang.Boolean.valueOf(d76);
    }
}
