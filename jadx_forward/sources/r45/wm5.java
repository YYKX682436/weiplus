package r45;

/* loaded from: classes8.dex */
public class wm5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f470823d;

    /* renamed from: e, reason: collision with root package name */
    public r45.xy3 f470824e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wm5)) {
            return false;
        }
        r45.wm5 wm5Var = (r45.wm5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f470823d), java.lang.Integer.valueOf(wm5Var.f470823d)) && n51.f.a(this.f470824e, wm5Var.f470824e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0064 A[SYNTHETIC] */
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
            if (r6 == 0) goto L71
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lb
            goto L71
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L71
            r0.<init>(r6)     // Catch: java.lang.Exception -> L71
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L71
        L14:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L71
            if (r1 == 0) goto L71
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L71
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L71
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L71
            r3 = -877823861(0xffffffffcbad788b, float:-2.2737174E7)
            r4 = 1
            if (r2 == r3) goto L3b
            r3 = 885259178(0x34c3fbaa, float:3.650469E-7)
            if (r2 == r3) goto L30
            goto L45
        L30:
            java.lang.String r2 = "static_icon"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L71
            if (r2 == 0) goto L45
            r2 = 0
            goto L46
        L3b:
            java.lang.String r2 = "image_url"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L71
            if (r2 == 0) goto L45
            r2 = r4
            goto L46
        L45:
            r2 = -1
        L46:
            if (r2 == 0) goto L64
            if (r2 == r4) goto L4b
            goto L14
        L4b:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L71
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L71
            if (r2 == 0) goto L14
            r45.xy3 r2 = new r45.xy3     // Catch: java.lang.Exception -> L71
            r2.<init>()     // Catch: java.lang.Exception -> L71
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L71
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L71
            r2.mo75930xb5cb93b2(r1)     // Catch: java.lang.Exception -> L71
            r5.f470824e = r2     // Catch: java.lang.Exception -> L71
            goto L14
        L64:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L71
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L71
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L71
            r5.f470823d = r1     // Catch: java.lang.Exception -> L71
            goto L14
        L71:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.wm5.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f470823d);
            r45.xy3 xy3Var = this.f470824e;
            if (xy3Var != null) {
                fVar.i(2, xy3Var.mo75928xcd1e8d8());
                this.f470824e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f470823d) + 0;
            r45.xy3 xy3Var2 = this.f470824e;
            return xy3Var2 != null ? e17 + b36.f.i(2, xy3Var2.mo75928xcd1e8d8()) : e17;
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
        r45.wm5 wm5Var = (r45.wm5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wm5Var.f470823d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.xy3 xy3Var3 = new r45.xy3();
            if (bArr != null && bArr.length > 0) {
                xy3Var3.mo11468x92b714fd(bArr);
            }
            wm5Var.f470824e = xy3Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f470823d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "static_icon", valueOf, true);
            eVar.d(jSONObject, "image_url", this.f470824e, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
