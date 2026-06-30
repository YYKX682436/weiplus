package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes4.dex */
public final class ec extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f157052e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f157053d;

    static {
        l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.dc.f157029r;
        f157052e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.dc.f157030s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(l75.k0 db6) {
        super(db6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.dc.f157029r, "WxaVersionTemplateIdMapping", dm.ed.f318267h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.dc.f157029r;
        this.f157053d = db6;
    }

    public final int y0(java.lang.String str, int i17) {
        int mo70514xb06685ab;
        if (str == null || str.length() == 0) {
            return 0;
        }
        synchronized (this) {
            mo70514xb06685ab = this.f157053d.mo70514xb06685ab(mo145255x88e404c3(), "appId=? and appVersion<?", new java.lang.String[]{str, java.lang.String.valueOf(i17)});
        }
        return mo70514xb06685ab;
    }

    public final boolean z0(java.lang.String str, int i17, long j17) {
        if (str == null || str.length() == 0) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaVersionTemplateIdMappingStorage", "setTemplateId(appId:" + str + ", appVersion:" + i17 + ", templateId:" + j17 + ')');
        synchronized (this) {
            android.database.Cursor B = this.f157053d.B("select count(*) from " + mo145255x88e404c3() + " where appId=? and appVersion=? and templateId=?", new java.lang.String[]{str, java.lang.String.valueOf(i17), java.lang.String.valueOf(j17)});
            if (B != null) {
                try {
                    r2 = B.moveToFirst() ? B.getInt(0) : 0;
                    vz5.b.a(B, null);
                } finally {
                }
            }
            if (r2 > 0) {
                return true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.dc dcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.dc();
            dcVar.f66459x28d45f97 = str;
            dcVar.f66460x119cf7dc = i17;
            dcVar.f66461x6e0d39a = j17;
            return super.mo51731x24249762(dcVar, true);
        }
    }
}
