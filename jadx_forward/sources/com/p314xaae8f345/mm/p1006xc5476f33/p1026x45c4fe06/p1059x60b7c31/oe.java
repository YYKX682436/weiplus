package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class oe extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34574x366c91de = 65;

    /* renamed from: NAME */
    public static final java.lang.String f34575x24728b = "systemLog";

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.ThreadLocal f163999g = new java.lang.ThreadLocal();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l service, org.json.JSONObject data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
        if (optString == null || optString.length() == 0) {
            return;
        }
        try {
            java.lang.ThreadLocal threadLocal = f163999g;
            java.lang.String str = (java.lang.String) threadLocal.get();
            if (str == null) {
                str = C(service);
                threadLocal.set(str);
            }
            vz5.v.a(new java.io.StringReader(optString), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ne(str));
            service.a(i17, o("ok"));
        } catch (java.lang.OutOfMemoryError unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSystemLog", "oom");
        }
    }

    public final java.lang.String C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        java.lang.String str;
        if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Service{appId:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
            sb6.append(e9Var.mo48798x74292566());
            sb6.append(",id:");
            sb6.append(e9Var.mo50260x9f1221c2());
            sb6.append('}');
            str = sb6.toString();
        } else if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Page{appId:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar;
            sb7.append(v5Var.mo48798x74292566());
            sb7.append(",id:");
            sb7.append(v5Var.mo50260x9f1221c2());
            sb7.append('}');
            str = sb7.toString();
        } else {
            str = "";
        }
        return str + " print:";
    }
}
