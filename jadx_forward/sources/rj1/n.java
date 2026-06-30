package rj1;

/* loaded from: classes7.dex */
public final class n extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f477704e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f477705d;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557.f35291x681a0c0c.getClass();
        f477704e = new java.lang.String[]{l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557.D, "TipsMsgInfo")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l75.k0 DB) {
        super(DB, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557.D, "TipsMsgInfo", dm.jb.f319424q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(DB, "DB");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557.f35291x681a0c0c.getClass();
        this.f477705d = DB;
    }

    public final void y0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980("select * from TipsMsgInfo where appId = '" + info.f67159x28d45f97 + "' AND busiType = " + info.f67160xd95c4268, new java.lang.String[0]);
        while (m145256x1d3f4980.moveToNext()) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557 c12627x488d3557 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557();
                c12627x488d3557.mo9015xbf5d97fd(m145256x1d3f4980);
                z0(c12627x488d3557);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    vz5.b.a(m145256x1d3f4980, th6);
                    throw th7;
                }
            }
        }
        vz5.b.a(m145256x1d3f4980, null);
        if (mo880xb970c2b9(info)) {
            return;
        }
        mo9952xce0038c9(info, new java.lang.String[0]);
    }

    public final boolean z0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1197xb1dfe949.C12627x488d3557 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TipsMsgStorage", "[delete] msgId: " + info.f67164x297eb4f7 + '.');
        return super.mo9951xb06685ab(info, new java.lang.String[0]);
    }
}
