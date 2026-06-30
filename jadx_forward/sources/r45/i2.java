package r45;

/* loaded from: classes4.dex */
public class i2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.h2 f458205d;

    /* renamed from: e, reason: collision with root package name */
    public r45.d2 f458206e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i2)) {
            return false;
        }
        r45.i2 i2Var = (r45.i2) fVar;
        return n51.f.a(this.f458205d, i2Var.f458205d) && n51.f.a(this.f458206e, i2Var.f458206e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L7f
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lc
            goto L7f
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L7f
            r0.<init>(r6)     // Catch: java.lang.Exception -> L7f
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L7f
        L15:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L7f
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L7f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L7f
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L7f
            r3 = -1421285633(0xffffffffab48e6ff, float:-7.1374845E-13)
            r4 = 1
            if (r2 == r3) goto L3c
            r3 = 1549205500(0x5c56fffc, float:2.4206841E17)
            if (r2 == r3) goto L31
            goto L47
        L31:
            java.lang.String r2 = "userRecord"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L7f
            if (r2 == 0) goto L47
            r2 = 0
            goto L48
        L3c:
            java.lang.String r2 = "validTip"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L7f
            if (r2 == 0) goto L47
            r2 = r4
            goto L48
        L47:
            r2 = -1
        L48:
            if (r2 == 0) goto L66
            if (r2 == r4) goto L4d
            goto L15
        L4d:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L7f
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L7f
            if (r2 == 0) goto L15
            r45.d2 r2 = new r45.d2     // Catch: java.lang.Exception -> L7f
            r2.<init>()     // Catch: java.lang.Exception -> L7f
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L7f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L7f
            r2.mo75930xb5cb93b2(r1)     // Catch: java.lang.Exception -> L7f
            r5.f458206e = r2     // Catch: java.lang.Exception -> L7f
            goto L15
        L66:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L7f
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L7f
            if (r2 == 0) goto L15
            r45.h2 r2 = new r45.h2     // Catch: java.lang.Exception -> L7f
            r2.<init>()     // Catch: java.lang.Exception -> L7f
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L7f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L7f
            r2.mo75930xb5cb93b2(r1)     // Catch: java.lang.Exception -> L7f
            r5.f458205d = r2     // Catch: java.lang.Exception -> L7f
            goto L15
        L7f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.i2.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.h2 h2Var = this.f458205d;
            if (h2Var != null) {
                fVar.i(1, h2Var.mo75928xcd1e8d8());
                this.f458205d.mo75956x3d5d1f78(fVar);
            }
            r45.d2 d2Var = this.f458206e;
            if (d2Var != null) {
                fVar.i(2, d2Var.mo75928xcd1e8d8());
                this.f458206e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.h2 h2Var2 = this.f458205d;
            int i18 = h2Var2 != null ? 0 + b36.f.i(1, h2Var2.mo75928xcd1e8d8()) : 0;
            r45.d2 d2Var2 = this.f458206e;
            return d2Var2 != null ? i18 + b36.f.i(2, d2Var2.mo75928xcd1e8d8()) : i18;
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
        r45.i2 i2Var = (r45.i2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.h2 h2Var3 = new r45.h2();
                if (bArr != null && bArr.length > 0) {
                    h2Var3.mo11468x92b714fd(bArr);
                }
                i2Var.f458205d = h2Var3;
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
            r45.d2 d2Var3 = new r45.d2();
            if (bArr2 != null && bArr2.length > 0) {
                d2Var3.mo11468x92b714fd(bArr2);
            }
            i2Var.f458206e = d2Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.h2 h2Var = this.f458205d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "userRecord", h2Var, false);
            eVar.d(jSONObject, "validTip", this.f458206e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
