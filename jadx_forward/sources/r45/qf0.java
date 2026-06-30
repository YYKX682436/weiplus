package r45;

/* loaded from: classes4.dex */
public class qf0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465458d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465459e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465460f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qf0)) {
            return false;
        }
        r45.qf0 qf0Var = (r45.qf0) fVar;
        return n51.f.a(this.f465458d, qf0Var.f465458d) && n51.f.a(this.f465459e, qf0Var.f465459e) && n51.f.a(this.f465460f, qf0Var.f465460f);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L78
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lc
            goto L78
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L78
            r0.<init>(r7)     // Catch: java.lang.Exception -> L78
            java.util.Iterator r7 = r0.keys()     // Catch: java.lang.Exception -> L78
        L15:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> L78
            if (r1 == 0) goto L78
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L78
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L78
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L78
            r3 = 936955573(0x37d8ceb5, float:2.5845462E-5)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L4b
            r3 = 1167501271(0x4596a7d7, float:4820.98)
            if (r2 == r3) goto L41
            r3 = 1167648233(0x4598e5e9, float:4892.739)
            if (r2 == r3) goto L37
            goto L55
        L37:
            java.lang.String r2 = "app_name"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L78
            if (r2 == 0) goto L55
            r2 = r5
            goto L56
        L41:
            java.lang.String r2 = "app_icon"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L78
            if (r2 == 0) goto L55
            r2 = 0
            goto L56
        L4b:
            java.lang.String r2 = "btn_title"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L78
            if (r2 == 0) goto L55
            r2 = r4
            goto L56
        L55:
            r2 = -1
        L56:
            if (r2 == 0) goto L6f
            if (r2 == r5) goto L66
            if (r2 == r4) goto L5d
            goto L15
        L5d:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L78
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L78
            r6.f465460f = r1     // Catch: java.lang.Exception -> L78
            goto L15
        L66:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L78
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L78
            r6.f465459e = r1     // Catch: java.lang.Exception -> L78
            goto L15
        L6f:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L78
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L78
            r6.f465458d = r1     // Catch: java.lang.Exception -> L78
            goto L15
        L78:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.qf0.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465458d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f465459e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f465460f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f465458d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f465459e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f465460f;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
        r45.qf0 qf0Var = (r45.qf0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qf0Var.f465458d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            qf0Var.f465459e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        qf0Var.f465460f = aVar2.k(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f465458d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "app_icon", str, false);
            eVar.d(jSONObject, "app_name", this.f465459e, false);
            eVar.d(jSONObject, "btn_title", this.f465460f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
