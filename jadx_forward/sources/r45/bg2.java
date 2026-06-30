package r45;

/* loaded from: classes2.dex */
public class bg2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f452274d;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof r45.bg2) && n51.f.a(java.lang.Long.valueOf(this.f452274d), java.lang.Long.valueOf(((r45.bg2) fVar).f452274d));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L3f
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto Lb
            goto L3f
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3f
            r0.<init>(r5)     // Catch: java.lang.Exception -> L3f
            java.util.Iterator r5 = r0.keys()     // Catch: java.lang.Exception -> L3f
        L14:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Exception -> L3f
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Exception -> L3f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L3f
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L3f
            r3 = -1340842428(0xffffffffb0145e44, float:-5.3976046E-10)
            if (r2 == r3) goto L2a
            goto L34
        L2a:
            java.lang.String r2 = "member_cnt"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L3f
            if (r2 == 0) goto L34
            r2 = 0
            goto L35
        L34:
            r2 = -1
        L35:
            if (r2 == 0) goto L38
            goto L14
        L38:
            long r1 = r0.optLong(r1)     // Catch: java.lang.Exception -> L3f
            r4.f452274d = r1     // Catch: java.lang.Exception -> L3f
            goto L14
        L3f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.bg2.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).h(1, this.f452274d);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f452274d) + 0;
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
        r45.bg2 bg2Var = (r45.bg2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        bg2Var.f452274d = aVar2.i(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.f416647a.d(jSONObject, "member_cnt", java.lang.Long.valueOf(this.f452274d), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
