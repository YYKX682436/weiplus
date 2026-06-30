package r45;

/* loaded from: classes10.dex */
public class d15 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.fw5 f453524d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453525e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d15)) {
            return false;
        }
        r45.d15 d15Var = (r45.d15) fVar;
        return n51.f.a(this.f453524d, d15Var.f453524d) && n51.f.a(this.f453525e, d15Var.f453525e);
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
            r3 = -172978165(0xfffffffff5b0900b, float:-4.4763954E32)
            r4 = 1
            if (r2 == r3) goto L3a
            r3 = 951530927(0x38b735af, float:8.736119E-5)
            if (r2 == r3) goto L30
            goto L44
        L30:
            java.lang.String r2 = "context"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L6c
            if (r2 == 0) goto L44
            r2 = 0
            goto L45
        L3a:
            java.lang.String r2 = "room_url"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L6c
            if (r2 == 0) goto L44
            r2 = r4
            goto L45
        L44:
            r2 = -1
        L45:
            if (r2 == 0) goto L53
            if (r2 == r4) goto L4a
            goto L14
        L4a:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L6c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L6c
            r5.f453525e = r1     // Catch: java.lang.Exception -> L6c
            goto L14
        L53:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L6c
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L6c
            if (r2 == 0) goto L14
            r45.fw5 r2 = new r45.fw5     // Catch: java.lang.Exception -> L6c
            r2.<init>()     // Catch: java.lang.Exception -> L6c
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L6c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L6c
            r2.mo75930xb5cb93b2(r1)     // Catch: java.lang.Exception -> L6c
            r5.f453524d = r2     // Catch: java.lang.Exception -> L6c
            goto L14
        L6c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.d15.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.fw5 fw5Var = this.f453524d;
            if (fw5Var != null) {
                fVar.i(1, fw5Var.mo75928xcd1e8d8());
                this.f453524d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f453525e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.fw5 fw5Var2 = this.f453524d;
            int i18 = fw5Var2 != null ? 0 + b36.f.i(1, fw5Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f453525e;
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
        r45.d15 d15Var = (r45.d15) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            d15Var.f453525e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.fw5 fw5Var3 = new r45.fw5();
            if (bArr != null && bArr.length > 0) {
                fw5Var3.mo11468x92b714fd(bArr);
            }
            d15Var.f453524d = fw5Var3;
        }
        return 0;
    }
}
