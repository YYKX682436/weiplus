package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes4.dex */
public final class ec extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f75519e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f75520d;

    static {
        l75.e0 e0Var = com.tencent.mm.plugin.appbrand.appcache.dc.f75496r;
        f75519e = com.tencent.mm.plugin.appbrand.appcache.dc.f75497s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(l75.k0 db6) {
        super(db6, com.tencent.mm.plugin.appbrand.appcache.dc.f75496r, "WxaVersionTemplateIdMapping", dm.ed.f236734h);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = com.tencent.mm.plugin.appbrand.appcache.dc.f75496r;
        this.f75520d = db6;
    }

    public final int y0(java.lang.String str, int i17) {
        int delete;
        if (str == null || str.length() == 0) {
            return 0;
        }
        synchronized (this) {
            delete = this.f75520d.delete(getTableName(), "appId=? and appVersion<?", new java.lang.String[]{str, java.lang.String.valueOf(i17)});
        }
        return delete;
    }

    public final boolean z0(java.lang.String str, int i17, long j17) {
        if (str == null || str.length() == 0) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaVersionTemplateIdMappingStorage", "setTemplateId(appId:" + str + ", appVersion:" + i17 + ", templateId:" + j17 + ')');
        synchronized (this) {
            android.database.Cursor B = this.f75520d.B("select count(*) from " + getTableName() + " where appId=? and appVersion=? and templateId=?", new java.lang.String[]{str, java.lang.String.valueOf(i17), java.lang.String.valueOf(j17)});
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
            com.tencent.mm.plugin.appbrand.appcache.dc dcVar = new com.tencent.mm.plugin.appbrand.appcache.dc();
            dcVar.field_appId = str;
            dcVar.field_appVersion = i17;
            dcVar.field_templateId = j17;
            return super.insertNotify(dcVar, true);
        }
    }
}
