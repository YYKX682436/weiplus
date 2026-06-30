package r45;

/* loaded from: classes8.dex */
public class dl6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f454089d;

    /* renamed from: e, reason: collision with root package name */
    public long f454090e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dl6)) {
            return false;
        }
        r45.dl6 dl6Var = (r45.dl6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f454089d), java.lang.Long.valueOf(dl6Var.f454089d)) && n51.f.a(java.lang.Long.valueOf(this.f454090e), java.lang.Long.valueOf(dl6Var.f454090e));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[SYNTHETIC] */
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
            if (r6 == 0) goto L58
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lb
            goto L58
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L58
            r0.<init>(r6)     // Catch: java.lang.Exception -> L58
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L58
        L14:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L58
            if (r1 == 0) goto L58
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L58
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L58
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L58
            r3 = 129603033(0x7b995d9, float:2.7923779E-34)
            r4 = 1
            if (r2 == r3) goto L3a
            r3 = 1410872995(0x541836a3, float:2.6150067E12)
            if (r2 == r3) goto L30
            goto L44
        L30:
            java.lang.String r2 = "fragment_duration"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L58
            if (r2 == 0) goto L44
            r2 = 0
            goto L45
        L3a:
            java.lang.String r2 = "fragment_start_time"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L58
            if (r2 == 0) goto L44
            r2 = r4
            goto L45
        L44:
            r2 = -1
        L45:
            if (r2 == 0) goto L51
            if (r2 == r4) goto L4a
            goto L14
        L4a:
            long r1 = r0.optLong(r1)     // Catch: java.lang.Exception -> L58
            r5.f454090e = r1     // Catch: java.lang.Exception -> L58
            goto L14
        L51:
            long r1 = r0.optLong(r1)     // Catch: java.lang.Exception -> L58
            r5.f454089d = r1     // Catch: java.lang.Exception -> L58
            goto L14
        L58:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.dl6.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f454089d);
            fVar.h(2, this.f454090e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f454089d) + 0 + b36.f.h(2, this.f454090e);
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
        r45.dl6 dl6Var = (r45.dl6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dl6Var.f454089d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        dl6Var.f454090e = aVar2.i(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f454089d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "fragment_duration", valueOf, false);
            eVar.d(jSONObject, "fragment_start_time", java.lang.Long.valueOf(this.f454090e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
