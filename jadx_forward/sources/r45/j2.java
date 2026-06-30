package r45;

/* loaded from: classes4.dex */
public class j2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459037d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459038e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f459039f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459040g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j2)) {
            return false;
        }
        r45.j2 j2Var = (r45.j2) fVar;
        return n51.f.a(this.f459037d, j2Var.f459037d) && n51.f.a(this.f459038e, j2Var.f459038e) && n51.f.a(this.f459039f, j2Var.f459039f) && n51.f.a(this.f459040g, j2Var.f459040g);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L95
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto Lc
            goto L95
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L95
            r0.<init>(r8)     // Catch: java.lang.Exception -> L95
            java.util.Iterator r8 = r0.keys()     // Catch: java.lang.Exception -> L95
        L15:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Exception -> L95
            if (r1 == 0) goto L95
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Exception -> L95
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L95
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L95
            r3 = 3241(0xca9, float:4.542E-42)
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == r3) goto L5d
            r3 = 115861276(0x6e7e71c, float:8.7232127E-35)
            if (r2 == r3) goto L52
            r3 = 115861428(0x6e7e7b4, float:8.7233E-35)
            if (r2 == r3) goto L47
            r3 = 115861812(0x6e7e934, float:8.7235204E-35)
            if (r2 == r3) goto L3c
            goto L67
        L3c:
            java.lang.String r2 = "zh_TW"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L95
            if (r2 == 0) goto L67
            r2 = r5
            goto L68
        L47:
            java.lang.String r2 = "zh_HK"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L95
            if (r2 == 0) goto L67
            r2 = r6
            goto L68
        L52:
            java.lang.String r2 = "zh_CN"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L95
            if (r2 == 0) goto L67
            r2 = 0
            goto L68
        L5d:
            java.lang.String r2 = "en"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L95
            if (r2 == 0) goto L67
            r2 = r4
            goto L68
        L67:
            r2 = -1
        L68:
            if (r2 == 0) goto L8c
            if (r2 == r6) goto L83
            if (r2 == r5) goto L7a
            if (r2 == r4) goto L71
            goto L15
        L71:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L95
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L95
            r7.f459040g = r1     // Catch: java.lang.Exception -> L95
            goto L15
        L7a:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L95
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L95
            r7.f459039f = r1     // Catch: java.lang.Exception -> L95
            goto L15
        L83:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L95
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L95
            r7.f459038e = r1     // Catch: java.lang.Exception -> L95
            goto L15
        L8c:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L95
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L95
            r7.f459037d = r1     // Catch: java.lang.Exception -> L95
            goto L15
        L95:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.j2.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459037d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f459038e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f459039f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f459040g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f459037d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f459038e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f459039f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f459040g;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
        r45.j2 j2Var = (r45.j2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            j2Var.f459037d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            j2Var.f459038e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            j2Var.f459039f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        j2Var.f459040g = aVar2.k(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f459037d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "zh_CN", str, false);
            eVar.d(jSONObject, "zh_HK", this.f459038e, false);
            eVar.d(jSONObject, "zh_TW", this.f459039f, false);
            eVar.d(jSONObject, "en", this.f459040g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
