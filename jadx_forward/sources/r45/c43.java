package r45;

/* loaded from: classes4.dex */
public class c43 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452799d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452800e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c43)) {
            return false;
        }
        r45.c43 c43Var = (r45.c43) fVar;
        return n51.f.a(this.f452799d, c43Var.f452799d) && n51.f.a(this.f452800e, c43Var.f452800e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[SYNTHETIC] */
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
            if (r6 == 0) goto L5c
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lb
            goto L5c
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L5c
            r0.<init>(r6)     // Catch: java.lang.Exception -> L5c
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L5c
        L14:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L5c
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L5c
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L5c
            r3 = 1289199314(0x4cd79ed2, float:1.1304718E8)
            r4 = 1
            if (r2 == r3) goto L3a
            r3 = 1318089018(0x4e90713a, float:1.2116698E9)
            if (r2 == r3) goto L30
            goto L44
        L30:
            java.lang.String r2 = "color_light"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L5c
            if (r2 == 0) goto L44
            r2 = 0
            goto L45
        L3a:
            java.lang.String r2 = "color_dark"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L5c
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
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L5c
            r5.f452800e = r1     // Catch: java.lang.Exception -> L5c
            goto L14
        L53:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L5c
            r5.f452799d = r1     // Catch: java.lang.Exception -> L5c
            goto L14
        L5c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.c43.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452799d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f452800e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f452799d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f452800e;
            return str4 != null ? j17 + b36.f.j(2, str4) : j17;
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
        r45.c43 c43Var = (r45.c43) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c43Var.f452799d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        c43Var.f452800e = aVar2.k(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f452799d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "color_light", str, false);
            eVar.d(jSONObject, "color_dark", this.f452800e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
