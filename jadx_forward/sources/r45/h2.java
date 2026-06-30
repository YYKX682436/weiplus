package r45;

/* loaded from: classes4.dex */
public class h2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f457303d = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof r45.h2) && n51.f.a(this.f457303d, ((r45.h2) fVar).f457303d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L68
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lb
            goto L68
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L68
            r0.<init>(r7)     // Catch: java.lang.Exception -> L68
            java.util.Iterator r7 = r0.keys()     // Catch: java.lang.Exception -> L68
        L14:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> L68
            if (r1 == 0) goto L68
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L68
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L68
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L68
            r3 = -1068799382(0xffffffffc04b6a6a, float:-3.17837)
            r4 = 0
            if (r2 == r3) goto L2b
            goto L36
        L2b:
            java.lang.String r2 = "models"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L68
            if (r2 == 0) goto L36
            r2 = r4
            goto L37
        L36:
            r2 = -1
        L37:
            if (r2 == 0) goto L3a
            goto L14
        L3a:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L68
            boolean r2 = r1 instanceof org.json.JSONArray     // Catch: java.lang.Exception -> L68
            if (r2 == 0) goto L14
            org.json.JSONArray r1 = (org.json.JSONArray) r1     // Catch: java.lang.Exception -> L68
        L44:
            int r2 = r1.length()     // Catch: java.lang.Exception -> L68
            if (r4 >= r2) goto L14
            java.lang.Object r2 = r1.get(r4)     // Catch: java.lang.Exception -> L68
            boolean r3 = r2 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L68
            if (r3 == 0) goto L65
            java.util.LinkedList r3 = r6.f457303d     // Catch: java.lang.Exception -> L68
            r45.g2 r5 = new r45.g2     // Catch: java.lang.Exception -> L68
            r5.<init>()     // Catch: java.lang.Exception -> L68
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: java.lang.Exception -> L68
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L68
            r5.mo75930xb5cb93b2(r2)     // Catch: java.lang.Exception -> L68
            r3.add(r5)     // Catch: java.lang.Exception -> L68
        L65:
            int r4 = r4 + 1
            goto L44
        L68:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.h2.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f457303d;
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList) + 0;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.h2 h2Var = (r45.h2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.g2 g2Var = new r45.g2();
            if (bArr2 != null && bArr2.length > 0) {
                g2Var.mo11468x92b714fd(bArr2);
            }
            h2Var.f457303d.add(g2Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.f416647a.d(jSONObject, "models", this.f457303d, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
