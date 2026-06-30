package r45;

/* loaded from: classes8.dex */
public class bp5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452481d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f452482e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.st3 f452483f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bp5)) {
            return false;
        }
        r45.bp5 bp5Var = (r45.bp5) fVar;
        return n51.f.a(this.f452481d, bp5Var.f452481d) && n51.f.a(this.f452482e, bp5Var.f452482e) && n51.f.a(this.f452483f, bp5Var.f452483f);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String r8) {
        /*
            r7 = this;
            if (r8 == 0) goto Laf
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto Lc
            goto Laf
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> Laf
            r0.<init>(r8)     // Catch: java.lang.Exception -> Laf
            java.util.Iterator r8 = r0.keys()     // Catch: java.lang.Exception -> Laf
        L15:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Exception -> Laf
            if (r1 == 0) goto Laf
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Exception -> Laf
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Laf
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> Laf
            r3 = -842048243(0xffffffffcdcf5d0d, float:-4.3487274E8)
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == r3) goto L4c
            r3 = 104993457(0x64212b1, float:3.6501077E-35)
            if (r2 == r3) goto L42
            r3 = 830678078(0x3183243e, float:3.816722E-9)
            if (r2 == r3) goto L38
            goto L56
        L38:
            java.lang.String r2 = "render_strategy_id"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> Laf
            if (r2 == 0) goto L56
            r2 = r4
            goto L57
        L42:
            java.lang.String r2 = "nodes"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> Laf
            if (r2 == 0) goto L56
            r2 = r6
            goto L57
        L4c:
            java.lang.String r2 = "global_attr"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> Laf
            if (r2 == 0) goto L56
            r2 = r5
            goto L57
        L56:
            r2 = -1
        L57:
            if (r2 == 0) goto La5
            if (r2 == r6) goto L77
            if (r2 == r5) goto L5e
            goto L15
        L5e:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> Laf
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> Laf
            if (r2 == 0) goto L15
            r45.st3 r2 = new r45.st3     // Catch: java.lang.Exception -> Laf
            r2.<init>()     // Catch: java.lang.Exception -> Laf
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> Laf
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Laf
            r2.mo75930xb5cb93b2(r1)     // Catch: java.lang.Exception -> Laf
            r7.f452483f = r2     // Catch: java.lang.Exception -> Laf
            goto L15
        L77:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> Laf
            boolean r2 = r1 instanceof org.json.JSONArray     // Catch: java.lang.Exception -> Laf
            if (r2 == 0) goto L15
            org.json.JSONArray r1 = (org.json.JSONArray) r1     // Catch: java.lang.Exception -> Laf
        L81:
            int r2 = r1.length()     // Catch: java.lang.Exception -> Laf
            if (r4 >= r2) goto L15
            java.lang.Object r2 = r1.get(r4)     // Catch: java.lang.Exception -> Laf
            boolean r3 = r2 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> Laf
            if (r3 == 0) goto La2
            java.util.LinkedList r3 = r7.f452482e     // Catch: java.lang.Exception -> Laf
            r45.cp5 r5 = new r45.cp5     // Catch: java.lang.Exception -> Laf
            r5.<init>()     // Catch: java.lang.Exception -> Laf
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: java.lang.Exception -> Laf
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Laf
            r5.mo75930xb5cb93b2(r2)     // Catch: java.lang.Exception -> Laf
            r3.add(r5)     // Catch: java.lang.Exception -> Laf
        La2:
            int r4 = r4 + 1
            goto L81
        La5:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> Laf
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Laf
            r7.f452481d = r1     // Catch: java.lang.Exception -> Laf
            goto L15
        Laf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.bp5.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f452482e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452481d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            r45.st3 st3Var = this.f452483f;
            if (st3Var != null) {
                fVar.i(3, st3Var.mo75928xcd1e8d8());
                this.f452483f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f452481d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, linkedList);
            r45.st3 st3Var2 = this.f452483f;
            return st3Var2 != null ? j17 + b36.f.i(3, st3Var2.mo75928xcd1e8d8()) : j17;
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
        r45.bp5 bp5Var = (r45.bp5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bp5Var.f452481d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                r45.cp5 cp5Var = new r45.cp5();
                if (bArr2 != null && bArr2.length > 0) {
                    cp5Var.mo11468x92b714fd(bArr2);
                }
                bp5Var.f452482e.add(cp5Var);
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j19.get(i19);
            r45.st3 st3Var3 = new r45.st3();
            if (bArr3 != null && bArr3.length > 0) {
                st3Var3.mo11468x92b714fd(bArr3);
            }
            bp5Var.f452483f = st3Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f452481d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "render_strategy_id", str, true);
            eVar.d(jSONObject, "nodes", this.f452482e, true);
            eVar.d(jSONObject, "global_attr", this.f452483f, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
