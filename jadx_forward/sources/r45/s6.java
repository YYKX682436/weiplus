package r45;

/* loaded from: classes4.dex */
public class s6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467059d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467060e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467061f;

    /* renamed from: g, reason: collision with root package name */
    public long f467062g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s6)) {
            return false;
        }
        r45.s6 s6Var = (r45.s6) fVar;
        return n51.f.a(this.f467059d, s6Var.f467059d) && n51.f.a(this.f467060e, s6Var.f467060e) && n51.f.a(this.f467061f, s6Var.f467061f) && n51.f.a(java.lang.Long.valueOf(this.f467062g), java.lang.Long.valueOf(s6Var.f467062g));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[SYNTHETIC] */
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
            if (r8 == 0) goto L93
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto Lc
            goto L93
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L93
            r0.<init>(r8)     // Catch: java.lang.Exception -> L93
            java.util.Iterator r8 = r0.keys()     // Catch: java.lang.Exception -> L93
        L15:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Exception -> L93
            if (r1 == 0) goto L93
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Exception -> L93
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L93
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L93
            r3 = 3355(0xd1b, float:4.701E-42)
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == r3) goto L5d
            r3 = 116079(0x1c56f, float:1.62661E-40)
            if (r2 == r3) goto L52
            r3 = 3373707(0x337a8b, float:4.72757E-39)
            if (r2 == r3) goto L47
            r3 = 351608024(0x14f51cd8, float:2.4750055E-26)
            if (r2 == r3) goto L3c
            goto L67
        L3c:
            java.lang.String r2 = "version"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L93
            if (r2 == 0) goto L67
            r2 = r4
            goto L68
        L47:
            java.lang.String r2 = "name"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L93
            if (r2 == 0) goto L67
            r2 = r6
            goto L68
        L52:
            java.lang.String r2 = "url"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L93
            if (r2 == 0) goto L67
            r2 = r5
            goto L68
        L5d:
            java.lang.String r2 = "id"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L93
            if (r2 == 0) goto L67
            r2 = 0
            goto L68
        L67:
            r2 = -1
        L68:
            if (r2 == 0) goto L8a
            if (r2 == r6) goto L81
            if (r2 == r5) goto L78
            if (r2 == r4) goto L71
            goto L15
        L71:
            long r1 = r0.optLong(r1)     // Catch: java.lang.Exception -> L93
            r7.f467062g = r1     // Catch: java.lang.Exception -> L93
            goto L15
        L78:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L93
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L93
            r7.f467061f = r1     // Catch: java.lang.Exception -> L93
            goto L15
        L81:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L93
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L93
            r7.f467060e = r1     // Catch: java.lang.Exception -> L93
            goto L15
        L8a:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L93
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L93
            r7.f467059d = r1     // Catch: java.lang.Exception -> L93
            goto L15
        L93:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.s6.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467059d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f467060e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f467061f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f467062g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f467059d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f467060e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f467061f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.h(4, this.f467062g);
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
        r45.s6 s6Var = (r45.s6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            s6Var.f467059d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            s6Var.f467060e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            s6Var.f467061f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        s6Var.f467062g = aVar2.i(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f467059d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, dm.i4.f66865x76d1ec5a, str, true);
            eVar.d(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, this.f467060e, true);
            eVar.d(jSONObject, "url", this.f467061f, true);
            eVar.d(jSONObject, "version", java.lang.Long.valueOf(this.f467062g), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
