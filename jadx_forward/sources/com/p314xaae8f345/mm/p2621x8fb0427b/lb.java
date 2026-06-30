package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes4.dex */
public class lb extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f276630e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.kb.f276612r, "VoiceTransText")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f276631d;

    public lb(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.kb.f276612r, "VoiceTransText", null);
        this.f276631d = k0Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: insert */
    public boolean mo880xb970c2b9(l75.f0 f0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.kb kbVar = (com.p314xaae8f345.mm.p2621x8fb0427b.kb) f0Var;
        if (kbVar == null) {
            return false;
        }
        return this.f276631d.m("VoiceTransText", "msgId", kbVar.mo9763xeb27878e()) >= 0;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.kb y0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.kb kbVar = new com.p314xaae8f345.mm.p2621x8fb0427b.kb();
        android.database.Cursor D = this.f276631d.D("VoiceTransText", null, "cmsgId=?", new java.lang.String[]{"" + str}, null, null, null, 2);
        if (D.moveToFirst()) {
            kbVar.mo9015xbf5d97fd(D);
        }
        D.close();
        return kbVar;
    }
}
