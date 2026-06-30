package r45;

/* loaded from: classes4.dex */
public class py extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f465003d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465004e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.py)) {
            return false;
        }
        r45.py pyVar = (r45.py) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f465003d), java.lang.Integer.valueOf(pyVar.f465003d)) && n51.f.a(this.f465004e, pyVar.f465004e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L60
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lb
            goto L60
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L60
            r0.<init>(r6)     // Catch: java.lang.Exception -> L60
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L60
        L14:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L60
            if (r1 == 0) goto L60
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L60
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L60
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L60
            r3 = 3076010(0x2eefaa, float:4.310408E-39)
            r4 = 1
            if (r2 == r3) goto L3a
            r3 = 738950403(0x2c0b7d03, float:1.9822483E-12)
            if (r2 == r3) goto L30
            goto L44
        L30:
            java.lang.String r2 = "channel"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L60
            if (r2 == 0) goto L44
            r2 = 0
            goto L45
        L3a:
            java.lang.String r2 = "data"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L60
            if (r2 == 0) goto L44
            r2 = r4
            goto L45
        L44:
            r2 = -1
        L45:
            if (r2 == 0) goto L53
            if (r2 == r4) goto L4a
            goto L14
        L4a:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L60
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L60
            r5.f465004e = r1     // Catch: java.lang.Exception -> L60
            goto L14
        L53:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L60
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L60
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L60
            r5.f465003d = r1     // Catch: java.lang.Exception -> L60
            goto L14
        L60:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.py.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f465003d);
            java.lang.String str = this.f465004e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f465003d) + 0;
            java.lang.String str2 = this.f465004e;
            return str2 != null ? e17 + b36.f.j(2, str2) : e17;
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
        r45.py pyVar = (r45.py) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            pyVar.f465003d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        pyVar.f465004e = aVar2.k(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f465003d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "channel", valueOf, false);
            eVar.d(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, this.f465004e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
