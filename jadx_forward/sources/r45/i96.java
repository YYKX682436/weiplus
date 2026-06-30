package r45;

/* loaded from: classes2.dex */
public class i96 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.d96 f458385d;

    /* renamed from: e, reason: collision with root package name */
    public r45.fb6 f458386e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i96)) {
            return false;
        }
        r45.i96 i96Var = (r45.i96) fVar;
        return n51.f.a(this.f458385d, i96Var.f458385d) && n51.f.a(this.f458386e, i96Var.f458386e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L7d
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lc
            goto L7d
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L7d
            r0.<init>(r6)     // Catch: java.lang.Exception -> L7d
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L7d
        L15:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L7d
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L7d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L7d
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L7d
            r3 = -1618174478(0xffffffff9f8c9df2, float:-5.9553605E-20)
            r4 = 1
            if (r2 == r3) goto L3b
            r3 = -1443097326(0xffffffffa9fc1512, float:-1.1194703E-13)
            if (r2 == r3) goto L31
            goto L45
        L31:
            java.lang.String r2 = "image_info"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L7d
            if (r2 == 0) goto L45
            r2 = 0
            goto L46
        L3b:
            java.lang.String r2 = "video_info"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L7d
            if (r2 == 0) goto L45
            r2 = r4
            goto L46
        L45:
            r2 = -1
        L46:
            if (r2 == 0) goto L64
            if (r2 == r4) goto L4b
            goto L15
        L4b:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L7d
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L7d
            if (r2 == 0) goto L15
            r45.fb6 r2 = new r45.fb6     // Catch: java.lang.Exception -> L7d
            r2.<init>()     // Catch: java.lang.Exception -> L7d
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L7d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L7d
            r2.mo75930xb5cb93b2(r1)     // Catch: java.lang.Exception -> L7d
            r5.f458386e = r2     // Catch: java.lang.Exception -> L7d
            goto L15
        L64:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L7d
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L7d
            if (r2 == 0) goto L15
            r45.d96 r2 = new r45.d96     // Catch: java.lang.Exception -> L7d
            r2.<init>()     // Catch: java.lang.Exception -> L7d
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L7d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L7d
            r2.mo75930xb5cb93b2(r1)     // Catch: java.lang.Exception -> L7d
            r5.f458385d = r2     // Catch: java.lang.Exception -> L7d
            goto L15
        L7d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.i96.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.d96 d96Var = this.f458385d;
            if (d96Var != null) {
                fVar.i(1, d96Var.mo75928xcd1e8d8());
                this.f458385d.mo75956x3d5d1f78(fVar);
            }
            r45.fb6 fb6Var = this.f458386e;
            if (fb6Var != null) {
                fVar.i(2, fb6Var.mo75928xcd1e8d8());
                this.f458386e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.d96 d96Var2 = this.f458385d;
            int i18 = d96Var2 != null ? 0 + b36.f.i(1, d96Var2.mo75928xcd1e8d8()) : 0;
            r45.fb6 fb6Var2 = this.f458386e;
            return fb6Var2 != null ? i18 + b36.f.i(2, fb6Var2.mo75928xcd1e8d8()) : i18;
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
        r45.i96 i96Var = (r45.i96) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.d96 d96Var3 = new r45.d96();
                if (bArr != null && bArr.length > 0) {
                    d96Var3.mo11468x92b714fd(bArr);
                }
                i96Var.f458385d = d96Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.fb6 fb6Var3 = new r45.fb6();
            if (bArr2 != null && bArr2.length > 0) {
                fb6Var3.mo11468x92b714fd(bArr2);
            }
            i96Var.f458386e = fb6Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.d96 d96Var = this.f458385d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "image_info", d96Var, false);
            eVar.d(jSONObject, "video_info", this.f458386e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
