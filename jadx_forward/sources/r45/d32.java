package r45;

/* loaded from: classes4.dex */
public class d32 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453565d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f453566e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d32)) {
            return false;
        }
        r45.d32 d32Var = (r45.d32) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453565d), java.lang.Integer.valueOf(d32Var.f453565d)) && n51.f.a(this.f453566e, d32Var.f453566e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L75
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lc
            goto L75
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L75
            r0.<init>(r6)     // Catch: java.lang.Exception -> L75
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L75
        L15:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L75
            if (r1 == 0) goto L75
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L75
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L75
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L75
            r3 = -751469324(0xffffffffd3357cf4, float:-7.7948545E11)
            r4 = 1
            if (r2 == r3) goto L3c
            r3 = 684824095(0x28d1961f, float:2.3268766E-14)
            if (r2 == r3) goto L31
            goto L46
        L31:
            java.lang.String r2 = "jump_info"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L75
            if (r2 == 0) goto L46
            r2 = r4
            goto L47
        L3c:
            java.lang.String r2 = "attach_type"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L75
            if (r2 == 0) goto L46
            r2 = 0
            goto L47
        L46:
            r2 = -1
        L47:
            if (r2 == 0) goto L68
            if (r2 == r4) goto L4c
            goto L15
        L4c:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L75
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L75
            if (r2 == 0) goto L15
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo     // Catch: java.lang.Exception -> L75
            r2.<init>()     // Catch: java.lang.Exception -> L75
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L75
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L75
            com.tencent.mm.protobuf.e r1 = r2.mo75930xb5cb93b2(r1)     // Catch: java.lang.Exception -> L75
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) r1     // Catch: java.lang.Exception -> L75
            r5.f453566e = r1     // Catch: java.lang.Exception -> L75
            goto L15
        L68:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L75
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L75
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L75
            r5.f453565d = r1     // Catch: java.lang.Exception -> L75
            goto L15
        L75:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.d32.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f453565d);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f453566e;
            if (c19786x6a1e2862 != null) {
                fVar.i(2, c19786x6a1e2862.mo75928xcd1e8d8());
                this.f453566e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f453565d) + 0;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = this.f453566e;
            return c19786x6a1e28622 != null ? e17 + b36.f.i(2, c19786x6a1e28622.mo75928xcd1e8d8()) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.d32 d32Var = (r45.d32) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            d32Var.f453565d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28623 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
            if (bArr != null && bArr.length > 0) {
                c19786x6a1e28623.mo11468x92b714fd(bArr);
            }
            d32Var.f453566e = c19786x6a1e28623;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f453565d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "attach_type", valueOf, true);
            eVar.d(jSONObject, "jump_info", this.f453566e, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
