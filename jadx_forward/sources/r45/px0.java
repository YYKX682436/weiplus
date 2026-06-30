package r45;

/* loaded from: classes2.dex */
public class px0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464984d;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.px0)) {
            return false;
        }
        r45.px0 px0Var = (r45.px0) fVar;
        return n51.f.a(this.f76492x92037252, px0Var.f76492x92037252) && n51.f.a(this.f464984d, px0Var.f464984d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L6f
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lb
            goto L6f
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6f
            r0.<init>(r6)     // Catch: java.lang.Exception -> L6f
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L6f
        L14:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L6f
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L6f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L6f
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L6f
            r3 = -1845267886(0xffffffff92037252, float:-4.147722E-28)
            r4 = 1
            if (r2 == r3) goto L3a
            r3 = -161305484(0xfffffffff662ac74, float:-1.1493719E33)
            if (r2 == r3) goto L30
            goto L44
        L30:
            java.lang.String r2 = "encrypted_url"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L6f
            if (r2 == 0) goto L44
            r2 = r4
            goto L45
        L3a:
            java.lang.String r2 = "BaseResponse"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L6f
            if (r2 == 0) goto L44
            r2 = 0
            goto L45
        L44:
            r2 = -1
        L45:
            if (r2 == 0) goto L53
            if (r2 == r4) goto L4a
            goto L14
        L4a:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L6f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L6f
            r5.f464984d = r1     // Catch: java.lang.Exception -> L6f
            goto L14
        L53:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L6f
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L6f
            if (r2 == 0) goto L14
            r45.ie r2 = new r45.ie     // Catch: java.lang.Exception -> L6f
            r2.<init>()     // Catch: java.lang.Exception -> L6f
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L6f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L6f
            com.tencent.mm.protobuf.f r1 = r2.mo75930xb5cb93b2(r1)     // Catch: java.lang.Exception -> L6f
            r45.ie r1 = (r45.ie) r1     // Catch: java.lang.Exception -> L6f
            r5.f76492x92037252 = r1     // Catch: java.lang.Exception -> L6f
            goto L14
        L6f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.px0.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
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
            java.lang.String str = this.f464984d;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f464984d;
            return str2 != null ? i18 + b36.f.j(2, str2) : i18;
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
        r45.px0 px0Var = (r45.px0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            px0Var.f464984d = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.mo11468x92b714fd(bArr);
            }
            px0Var.f76492x92037252 = ieVar3;
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
            eVar.d(jSONObject, "BaseResponse", ieVar, true);
            eVar.d(jSONObject, "encrypted_url", this.f464984d, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
