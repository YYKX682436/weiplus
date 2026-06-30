package r45;

/* loaded from: classes4.dex */
public class am0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f451650d;

    /* renamed from: e, reason: collision with root package name */
    public int f451651e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.am0)) {
            return false;
        }
        r45.am0 am0Var = (r45.am0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f451650d), java.lang.Integer.valueOf(am0Var.f451650d)) && n51.f.a(java.lang.Integer.valueOf(this.f451651e), java.lang.Integer.valueOf(am0Var.f451651e));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L65
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lb
            goto L65
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L65
            r0.<init>(r6)     // Catch: java.lang.Exception -> L65
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L65
        L14:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L65
            if (r1 == 0) goto L65
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L65
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L65
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L65
            r3 = 1011823019(0x3c4f31ab, float:0.012646119)
            r4 = 1
            if (r2 == r3) goto L3b
            r3 = 1150420927(0x449207bf, float:1168.2421)
            if (r2 == r3) goto L30
            goto L45
        L30:
            java.lang.String r2 = "request_url"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L65
            if (r2 == 0) goto L45
            r2 = 0
            goto L46
        L3b:
            java.lang.String r2 = "get_mobile"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L65
            if (r2 == 0) goto L45
            r2 = r4
            goto L46
        L45:
            r2 = -1
        L46:
            if (r2 == 0) goto L58
            if (r2 == r4) goto L4b
            goto L14
        L4b:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L65
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L65
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L65
            r5.f451651e = r1     // Catch: java.lang.Exception -> L65
            goto L14
        L58:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L65
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L65
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L65
            r5.f451650d = r1     // Catch: java.lang.Exception -> L65
            goto L14
        L65:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.am0.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f451650d);
            fVar.e(2, this.f451651e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f451650d) + 0 + b36.f.e(2, this.f451651e);
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
        r45.am0 am0Var = (r45.am0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            am0Var.f451650d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        am0Var.f451651e = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f451650d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "request_url", valueOf, false);
            eVar.d(jSONObject, "get_mobile", java.lang.Integer.valueOf(this.f451651e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
