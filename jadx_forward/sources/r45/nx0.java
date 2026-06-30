package r45;

/* loaded from: classes2.dex */
public class nx0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f463252d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463253e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nx0)) {
            return false;
        }
        r45.nx0 nx0Var = (r45.nx0) fVar;
        return n51.f.a(this.f76492x92037252, nx0Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f463252d), java.lang.Integer.valueOf(nx0Var.f463252d)) && n51.f.a(this.f463253e, nx0Var.f463253e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L8f
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lc
            goto L8f
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8f
            r0.<init>(r7)     // Catch: java.lang.Exception -> L8f
            java.util.Iterator r7 = r0.keys()     // Catch: java.lang.Exception -> L8f
        L15:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> L8f
            if (r1 == 0) goto L8f
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L8f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L8f
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L8f
            r3 = -1845267886(0xffffffff92037252, float:-4.147722E-28)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L4b
            r3 = -424444396(0xffffffffe6b37e14, float:-4.2381467E23)
            if (r2 == r3) goto L41
            r3 = 339112800(0x14367360, float:9.2114055E-27)
            if (r2 == r3) goto L37
            goto L55
        L37:
            java.lang.String r2 = "user_flag"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L8f
            if (r2 == 0) goto L55
            r2 = r5
            goto L56
        L41:
            java.lang.String r2 = "spam_jump_url"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L8f
            if (r2 == 0) goto L55
            r2 = r4
            goto L56
        L4b:
            java.lang.String r2 = "BaseResponse"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L8f
            if (r2 == 0) goto L55
            r2 = 0
            goto L56
        L55:
            r2 = -1
        L56:
            if (r2 == 0) goto L73
            if (r2 == r5) goto L66
            if (r2 == r4) goto L5d
            goto L15
        L5d:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L8f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L8f
            r6.f463253e = r1     // Catch: java.lang.Exception -> L8f
            goto L15
        L66:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L8f
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L8f
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L8f
            r6.f463252d = r1     // Catch: java.lang.Exception -> L8f
            goto L15
        L73:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L8f
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L8f
            if (r2 == 0) goto L15
            r45.ie r2 = new r45.ie     // Catch: java.lang.Exception -> L8f
            r2.<init>()     // Catch: java.lang.Exception -> L8f
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L8f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L8f
            com.tencent.mm.protobuf.f r1 = r2.mo75930xb5cb93b2(r1)     // Catch: java.lang.Exception -> L8f
            r45.ie r1 = (r45.ie) r1     // Catch: java.lang.Exception -> L8f
            r6.f76492x92037252 = r1     // Catch: java.lang.Exception -> L8f
            goto L15
        L8f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.nx0.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
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
            fVar.e(2, this.f463252d);
            java.lang.String str = this.f463253e;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f463252d);
            java.lang.String str2 = this.f463253e;
            return str2 != null ? i18 + b36.f.j(3, str2) : i18;
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
        r45.nx0 nx0Var = (r45.nx0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                nx0Var.f463252d = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            nx0Var.f463253e = aVar2.k(intValue);
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
            nx0Var.f76492x92037252 = ieVar3;
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
            eVar.d(jSONObject, "user_flag", java.lang.Integer.valueOf(this.f463252d), true);
            eVar.d(jSONObject, "spam_jump_url", this.f463253e, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
