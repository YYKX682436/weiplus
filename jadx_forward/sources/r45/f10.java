package r45;

/* loaded from: classes4.dex */
public class f10 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.qd4 f455458d;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f10)) {
            return false;
        }
        r45.f10 f10Var = (r45.f10) fVar;
        return n51.f.a(this.f76492x92037252, f10Var.f76492x92037252) && n51.f.a(this.f455458d, f10Var.f455458d);
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
            if (r6 == 0) goto L80
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lc
            goto L80
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L80
            r0.<init>(r6)     // Catch: java.lang.Exception -> L80
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L80
        L15:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L80
            if (r1 == 0) goto L80
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L80
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L80
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L80
            r3 = -1845267886(0xffffffff92037252, float:-4.147722E-28)
            r4 = 1
            if (r2 == r3) goto L3b
            r3 = -388918877(0xffffffffe8d191a3, float:-7.917289E24)
            if (r2 == r3) goto L31
            goto L45
        L31:
            java.lang.String r2 = "NotifyPkg"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L80
            if (r2 == 0) goto L45
            r2 = r4
            goto L46
        L3b:
            java.lang.String r2 = "BaseResponse"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L80
            if (r2 == 0) goto L45
            r2 = 0
            goto L46
        L45:
            r2 = -1
        L46:
            if (r2 == 0) goto L64
            if (r2 == r4) goto L4b
            goto L15
        L4b:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L80
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L80
            if (r2 == 0) goto L15
            r45.qd4 r2 = new r45.qd4     // Catch: java.lang.Exception -> L80
            r2.<init>()     // Catch: java.lang.Exception -> L80
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L80
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L80
            r2.mo75930xb5cb93b2(r1)     // Catch: java.lang.Exception -> L80
            r5.f455458d = r2     // Catch: java.lang.Exception -> L80
            goto L15
        L64:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L80
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L80
            if (r2 == 0) goto L15
            r45.ie r2 = new r45.ie     // Catch: java.lang.Exception -> L80
            r2.<init>()     // Catch: java.lang.Exception -> L80
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L80
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L80
            com.tencent.mm.protobuf.f r1 = r2.mo75930xb5cb93b2(r1)     // Catch: java.lang.Exception -> L80
            r45.ie r1 = (r45.ie) r1     // Catch: java.lang.Exception -> L80
            r5.f76492x92037252 = r1     // Catch: java.lang.Exception -> L80
            goto L15
        L80:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.f10.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.qd4 qd4Var = this.f455458d;
            if (qd4Var != null) {
                fVar.i(3, qd4Var.mo75928xcd1e8d8());
                this.f455458d.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.qd4 qd4Var2 = this.f455458d;
            return qd4Var2 != null ? i18 + b36.f.i(3, qd4Var2.mo75928xcd1e8d8()) : i18;
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
        r45.f10 f10Var = (r45.f10) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                f10Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.qd4 qd4Var3 = new r45.qd4();
            if (bArr2 != null && bArr2.length > 0) {
                qd4Var3.mo11468x92b714fd(bArr2);
            }
            f10Var.f455458d = qd4Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.f76492x92037252;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "NotifyPkg", this.f455458d, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
