package r45;

/* loaded from: classes2.dex */
public class xm5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f471775d;

    /* renamed from: e, reason: collision with root package name */
    public int f471776e;

    /* renamed from: f, reason: collision with root package name */
    public int f471777f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xm5)) {
            return false;
        }
        r45.xm5 xm5Var = (r45.xm5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f471775d), java.lang.Integer.valueOf(xm5Var.f471775d)) && n51.f.a(java.lang.Integer.valueOf(this.f471776e), java.lang.Integer.valueOf(xm5Var.f471776e)) && n51.f.a(java.lang.Integer.valueOf(this.f471777f), java.lang.Integer.valueOf(xm5Var.f471777f));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0077 A[SYNTHETIC] */
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
            if (r7 == 0) goto L84
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lc
            goto L84
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L84
            r0.<init>(r7)     // Catch: java.lang.Exception -> L84
            java.util.Iterator r7 = r0.keys()     // Catch: java.lang.Exception -> L84
        L15:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> L84
            if (r1 == 0) goto L84
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L84
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L84
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L84
            r3 = -175850537(0xfffffffff584bbd7, float:-3.3652003E32)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L4b
            r3 = 747804969(0x2c929929, float:4.1665738E-12)
            if (r2 == r3) goto L41
            r3 = 1635238684(0x6177c31c, float:2.856503E20)
            if (r2 == r3) goto L37
            goto L55
        L37:
            java.lang.String r2 = "thumbnail_position"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L84
            if (r2 == 0) goto L55
            r2 = r5
            goto L56
        L41:
            java.lang.String r2 = "position"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L84
            if (r2 == 0) goto L55
            r2 = r4
            goto L56
        L4b:
            java.lang.String r2 = "original_position"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L84
            if (r2 == 0) goto L55
            r2 = 0
            goto L56
        L55:
            r2 = -1
        L56:
            if (r2 == 0) goto L77
            if (r2 == r5) goto L6a
            if (r2 == r4) goto L5d
            goto L15
        L5d:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L84
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L84
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L84
            r6.f471777f = r1     // Catch: java.lang.Exception -> L84
            goto L15
        L6a:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L84
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L84
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L84
            r6.f471776e = r1     // Catch: java.lang.Exception -> L84
            goto L15
        L77:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L84
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L84
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L84
            r6.f471775d = r1     // Catch: java.lang.Exception -> L84
            goto L15
        L84:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.xm5.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f471775d);
            fVar.e(2, this.f471776e);
            fVar.e(3, this.f471777f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f471775d) + 0 + b36.f.e(2, this.f471776e) + b36.f.e(3, this.f471777f);
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
        r45.xm5 xm5Var = (r45.xm5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xm5Var.f471775d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            xm5Var.f471776e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        xm5Var.f471777f = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f471775d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "original_position", valueOf, true);
            eVar.d(jSONObject, "thumbnail_position", java.lang.Integer.valueOf(this.f471776e), true);
            eVar.d(jSONObject, "position", java.lang.Integer.valueOf(this.f471777f), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
