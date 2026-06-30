package cb1;

/* loaded from: classes7.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.j2 f121780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eb1.d f121781e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f121782f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cb1.i f121783g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ km5.b f121784h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(vi1.j2 j2Var, eb1.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, cb1.i iVar, km5.b bVar) {
        super(1);
        this.f121780d = j2Var;
        this.f121781e = dVar;
        this.f121782f = v5Var;
        this.f121783g = iVar;
        this.f121784h = bVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.jv5 jv5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 phoneItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phoneItem, "phoneItem");
        phoneItem.m52278x9616526c();
        vi1.j2 j2Var = this.f121780d;
        eb1.d dVar = this.f121781e;
        if (j2Var != null) {
            j2Var.f518888d++;
        }
        boolean z17 = phoneItem.f168937i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f121782f;
        km5.b bVar = this.f121784h;
        if (z17) {
            cb1.g0 g0Var = new cb1.g0(phoneItem, j2Var, v5Var, bVar);
            java.lang.String mo48798x74292566 = v5Var.mo48798x74292566();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
            si1.i0 b17 = dVar.b(v5Var, mo48798x74292566, j2Var, phoneItem, g0Var);
            if (b17 != null) {
                b17.r(v5Var);
            } else {
                vi1.g0 a17 = vi1.l1.f518932a.a();
                android.content.Context f229340d = v5Var.getF229340d();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f229340d, "getContext(...)");
                java.lang.String mo48798x742925662 = v5Var.mo48798x74292566();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x742925662, "getAppId(...)");
                cb1.i iVar = this.f121783g;
                java.lang.String str = (iVar == null || (jv5Var = iVar.f121785a) == null) ? null : jv5Var.f459667g;
                if (str == null) {
                    str = "";
                }
                a17.Ei(f229340d, mo48798x742925662, str, j2Var, phoneItem, g0Var);
            }
        } else {
            if (phoneItem.f168939n) {
                if (j2Var != null) {
                    j2Var.f518891g++;
                }
            } else if (j2Var != null) {
                j2Var.f518892h++;
            }
            java.lang.String mo48798x742925663 = v5Var.mo48798x74292566();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x742925663, "getAppId(...)");
            j2Var.getClass();
            j2Var.A = mo48798x742925663;
            java.lang.String a18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(phoneItem.f168932d));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "getMD5String(...)");
            j2Var.B = a18;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j0("ok", new java.lang.Object[0]);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("encryptedData", phoneItem.f168934f);
            hashMap.put("iv", phoneItem.f168935g);
            hashMap.put("cloud_id", phoneItem.f168936h);
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, phoneItem.f168941p);
            ((java.util.HashMap) j0Var.f162852a).putAll(hashMap);
            bVar.c(j0Var);
            vi1.o0.f518949a.e(phoneItem);
        }
        return jz5.f0.f384359a;
    }
}
