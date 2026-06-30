package cb1;

/* loaded from: classes7.dex */
public final class g0 implements vi1.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 f121774a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vi1.j2 f121775b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f121776c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km5.b f121777d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581, vi1.j2 j2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, km5.b bVar) {
        this.f121774a = c12542x3a17e581;
        this.f121775b = j2Var;
        this.f121776c = v5Var;
        this.f121777d = bVar;
    }

    public void a(boolean z17, java.util.Map result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        km5.b bVar = this.f121777d;
        if (!z17) {
            bVar.a(result.get("errMsg"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581 = this.f121774a;
        boolean z18 = c12542x3a17e581.f168939n;
        vi1.j2 j2Var = this.f121775b;
        if (z18) {
            if (j2Var != null) {
                java.lang.Long valueOf = java.lang.Long.valueOf(j2Var.f518891g);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                j2Var.f518891g = valueOf.longValue() + 1;
            }
        } else if (j2Var != null) {
            java.lang.Long valueOf2 = java.lang.Long.valueOf(j2Var.f518892h);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf2);
            j2Var.f518892h = valueOf2.longValue() + 1;
        }
        java.lang.String mo48798x74292566 = this.f121776c.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        j2Var.getClass();
        j2Var.A = mo48798x74292566;
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(c12542x3a17e581.f168932d));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
        j2Var.B = a17;
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j0("ok", new java.lang.Object[0]);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = (java.lang.String) result.get("encryptedData");
        if (str == null) {
            str = "";
        }
        hashMap.put("encryptedData", str);
        java.lang.String str2 = (java.lang.String) result.get("iv");
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("iv", str2);
        java.lang.String str3 = (java.lang.String) result.get("cloud_id");
        hashMap.put("cloud_id", str3 != null ? str3 : "");
        java.lang.Object obj = result.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        java.util.Map map = j0Var.f162852a;
        ((java.util.HashMap) map).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, obj);
        ((java.util.HashMap) map).putAll(hashMap);
        objArr[0] = j0Var;
        bVar.c(objArr);
        vi1.o0.f518949a.e(c12542x3a17e581);
    }
}
