package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes4.dex */
public final class db extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.eb f75494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.cb f75495e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(com.tencent.mm.plugin.appbrand.appcache.eb ebVar, com.tencent.mm.plugin.appbrand.appcache.cb cbVar) {
        super(0);
        this.f75494d = ebVar;
        this.f75495e = cbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select count(*) from ");
        com.tencent.mm.plugin.appbrand.appcache.eb ebVar = this.f75494d;
        sb6.append(ebVar.getTableName());
        sb6.append(" where pluginAppID=? and pluginAppVersion=?");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.appbrand.appcache.cb cbVar = this.f75495e;
        java.lang.String field_pluginAppID = cbVar.field_pluginAppID;
        kotlin.jvm.internal.o.f(field_pluginAppID, "field_pluginAppID");
        android.database.Cursor B = ebVar.f75518e.B(sb7, new java.lang.String[]{field_pluginAppID, java.lang.String.valueOf(cbVar.field_pluginAppVersion)});
        if (B != null) {
            try {
                if (B.moveToFirst()) {
                    if (B.getInt(0) > 0) {
                        z17 = true;
                        vz5.b.a(B, null);
                    }
                }
                z17 = false;
                vz5.b.a(B, null);
            } finally {
            }
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17 ? ebVar.update(cbVar, new java.lang.String[0]) : ebVar.insert(cbVar));
    }
}
