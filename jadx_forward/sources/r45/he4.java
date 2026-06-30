package r45;

/* loaded from: classes7.dex */
public class he4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457626d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457627e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457628f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.he4)) {
            return false;
        }
        r45.he4 he4Var = (r45.he4) fVar;
        return n51.f.a(this.f457626d, he4Var.f457626d) && n51.f.a(this.f457627e, he4Var.f457627e) && n51.f.a(this.f457628f, he4Var.f457628f);
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
            r3 = 500921548(0x1ddb74cc, float:5.8089582E-21)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L4b
            r3 = 618145566(0x24d8271e, float:9.3741335E-17)
            if (r2 == r3) goto L41
            r3 = 1088014131(0x40d9c733, float:6.8055663)
            if (r2 == r3) goto L37
            goto L55
        L37:
            java.lang.String r2 = "clip_in_md5"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L78
            if (r2 == 0) goto L55
            r2 = r5
            goto L56
        L41:
            java.lang.String r2 = "clip_out_md5"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L78
            if (r2 == 0) goto L55
            r2 = r4
            goto L56
        L4b:
            java.lang.String r2 = "cam_result_md5"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L78
            if (r2 == 0) goto L55
            r2 = 0
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
            r6.f457628f = r1     // Catch: java.lang.Exception -> L78
            goto L15
        L66:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L78
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L78
            r6.f457627e = r1     // Catch: java.lang.Exception -> L78
            goto L15
        L6f:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L78
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L78
            r6.f457626d = r1     // Catch: java.lang.Exception -> L78
            goto L15
        L78:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.he4.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f457626d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f457627e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f457628f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f457626d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f457627e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f457628f;
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
        r45.he4 he4Var = (r45.he4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            he4Var.f457626d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            he4Var.f457627e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        he4Var.f457628f = aVar2.k(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f457626d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "cam_result_md5", str, false);
            eVar.d(jSONObject, "clip_in_md5", this.f457627e, false);
            eVar.d(jSONObject, "clip_out_md5", this.f457628f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
