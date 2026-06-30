package r45;

/* loaded from: classes4.dex */
public class h03 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457240d;

    /* renamed from: e, reason: collision with root package name */
    public long f457241e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h03)) {
            return false;
        }
        r45.h03 h03Var = (r45.h03) fVar;
        return n51.f.a(this.f457240d, h03Var.f457240d) && n51.f.a(java.lang.Long.valueOf(this.f457241e), java.lang.Long.valueOf(h03Var.f457241e));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L5b
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lb
            goto L5b
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L5b
            r0.<init>(r6)     // Catch: java.lang.Exception -> L5b
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L5b
        L14:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L5b
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L5b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L5b
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L5b
            r3 = -1636715928(0xffffffff9e71b268, float:-1.2795327E-20)
            r4 = 1
            if (r2 == r3) goto L3b
            r3 = 3433509(0x346425, float:4.811371E-39)
            if (r2 == r3) goto L30
            goto L45
        L30:
            java.lang.String r2 = "path"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L5b
            if (r2 == 0) goto L45
            r2 = 0
            goto L46
        L3b:
            java.lang.String r2 = "expose_time"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L5b
            if (r2 == 0) goto L45
            r2 = r4
            goto L46
        L45:
            r2 = -1
        L46:
            if (r2 == 0) goto L52
            if (r2 == r4) goto L4b
            goto L14
        L4b:
            long r1 = r0.optLong(r1)     // Catch: java.lang.Exception -> L5b
            r5.f457241e = r1     // Catch: java.lang.Exception -> L5b
            goto L14
        L52:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L5b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L5b
            r5.f457240d = r1     // Catch: java.lang.Exception -> L5b
            goto L14
        L5b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.h03.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f457240d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f457241e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f457240d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f457241e);
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
        r45.h03 h03Var = (r45.h03) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h03Var.f457240d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        h03Var.f457241e = aVar2.i(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f457240d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str, true);
            eVar.d(jSONObject, "expose_time", java.lang.Long.valueOf(this.f457241e), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
