package r45;

/* loaded from: classes2.dex */
public class v80 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469514d;

    /* renamed from: e, reason: collision with root package name */
    public r45.eh6 f469515e;

    /* renamed from: f, reason: collision with root package name */
    public int f469516f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v80)) {
            return false;
        }
        r45.v80 v80Var = (r45.v80) fVar;
        return n51.f.a(this.f469514d, v80Var.f469514d) && n51.f.a(this.f469515e, v80Var.f469515e) && n51.f.a(java.lang.Integer.valueOf(this.f469516f), java.lang.Integer.valueOf(v80Var.f469516f));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0083 A[SYNTHETIC] */
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
            if (r7 == 0) goto L8c
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lc
            goto L8c
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8c
            r0.<init>(r7)     // Catch: java.lang.Exception -> L8c
            java.util.Iterator r7 = r0.keys()     // Catch: java.lang.Exception -> L8c
        L15:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> L8c
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L8c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L8c
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L8c
            r3 = -530086375(0xffffffffe0678619, float:-6.6732197E19)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L4b
            r3 = 110371416(0x6942258, float:5.5721876E-35)
            if (r2 == r3) goto L41
            r3 = 1139504965(0x43eb7745, float:470.9318)
            if (r2 == r3) goto L37
            goto L55
        L37:
            java.lang.String r2 = "redDotControl"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L8c
            if (r2 == 0) goto L55
            r2 = r4
            goto L56
        L41:
            java.lang.String r2 = "title"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L8c
            if (r2 == 0) goto L55
            r2 = 0
            goto L56
        L4b:
            java.lang.String r2 = "subContent"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L8c
            if (r2 == 0) goto L55
            r2 = r5
            goto L56
        L55:
            r2 = -1
        L56:
            if (r2 == 0) goto L83
            if (r2 == r5) goto L6a
            if (r2 == r4) goto L5d
            goto L15
        L5d:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L8c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L8c
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L8c
            r6.f469516f = r1     // Catch: java.lang.Exception -> L8c
            goto L15
        L6a:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L8c
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L8c
            if (r2 == 0) goto L15
            r45.eh6 r2 = new r45.eh6     // Catch: java.lang.Exception -> L8c
            r2.<init>()     // Catch: java.lang.Exception -> L8c
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L8c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L8c
            r2.mo75930xb5cb93b2(r1)     // Catch: java.lang.Exception -> L8c
            r6.f469515e = r2     // Catch: java.lang.Exception -> L8c
            goto L15
        L83:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L8c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L8c
            r6.f469514d = r1     // Catch: java.lang.Exception -> L8c
            goto L15
        L8c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.v80.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469514d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.eh6 eh6Var = this.f469515e;
            if (eh6Var != null) {
                fVar.i(2, eh6Var.mo75928xcd1e8d8());
                this.f469515e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f469516f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f469514d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.eh6 eh6Var2 = this.f469515e;
            if (eh6Var2 != null) {
                j17 += b36.f.i(2, eh6Var2.mo75928xcd1e8d8());
            }
            return j17 + b36.f.e(3, this.f469516f);
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
        r45.v80 v80Var = (r45.v80) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            v80Var.f469514d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            v80Var.f469516f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.eh6 eh6Var3 = new r45.eh6();
            if (bArr != null && bArr.length > 0) {
                eh6Var3.mo11468x92b714fd(bArr);
            }
            v80Var.f469515e = eh6Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f469514d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str, true);
            eVar.d(jSONObject, "subContent", this.f469515e, true);
            eVar.d(jSONObject, "redDotControl", java.lang.Integer.valueOf(this.f469516f), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
