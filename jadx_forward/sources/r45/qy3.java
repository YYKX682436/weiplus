package r45;

/* loaded from: classes8.dex */
public class qy3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465884d;

    /* renamed from: e, reason: collision with root package name */
    public r45.xy3 f465885e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qy3)) {
            return false;
        }
        r45.qy3 qy3Var = (r45.qy3) fVar;
        return n51.f.a(this.f465884d, qy3Var.f465884d) && n51.f.a(this.f465885e, qy3Var.f465885e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[SYNTHETIC] */
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
            if (r6 == 0) goto L6c
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lb
            goto L6c
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6c
            r0.<init>(r6)     // Catch: java.lang.Exception -> L6c
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L6c
        L14:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L6c
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L6c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L6c
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L6c
            r3 = -1545796299(0xffffffffa3dd0535, float:-2.3963073E-17)
            r4 = 1
            if (r2 == r3) goto L3a
            r3 = -737588055(0xffffffffd4094ca9, float:-2.3587867E12)
            if (r2 == r3) goto L30
            goto L44
        L30:
            java.lang.String r2 = "icon_url"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L6c
            if (r2 == 0) goto L44
            r2 = r4
            goto L45
        L3a:
            java.lang.String r2 = "icon_image_key"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L6c
            if (r2 == 0) goto L44
            r2 = 0
            goto L45
        L44:
            r2 = -1
        L45:
            if (r2 == 0) goto L63
            if (r2 == r4) goto L4a
            goto L14
        L4a:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L6c
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L6c
            if (r2 == 0) goto L14
            r45.xy3 r2 = new r45.xy3     // Catch: java.lang.Exception -> L6c
            r2.<init>()     // Catch: java.lang.Exception -> L6c
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L6c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L6c
            r2.mo75930xb5cb93b2(r1)     // Catch: java.lang.Exception -> L6c
            r5.f465885e = r2     // Catch: java.lang.Exception -> L6c
            goto L14
        L63:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L6c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L6c
            r5.f465884d = r1     // Catch: java.lang.Exception -> L6c
            goto L14
        L6c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.qy3.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465884d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.xy3 xy3Var = this.f465885e;
            if (xy3Var != null) {
                fVar.i(2, xy3Var.mo75928xcd1e8d8());
                this.f465885e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f465884d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.xy3 xy3Var2 = this.f465885e;
            return xy3Var2 != null ? j17 + b36.f.i(2, xy3Var2.mo75928xcd1e8d8()) : j17;
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
        r45.qy3 qy3Var = (r45.qy3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qy3Var.f465884d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.xy3 xy3Var3 = new r45.xy3();
            if (bArr != null && bArr.length > 0) {
                xy3Var3.mo11468x92b714fd(bArr);
            }
            qy3Var.f465885e = xy3Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f465884d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "icon_image_key", str, true);
            eVar.d(jSONObject, "icon_url", this.f465885e, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
