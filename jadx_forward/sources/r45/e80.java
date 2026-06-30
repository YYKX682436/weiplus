package r45;

/* loaded from: classes4.dex */
public class e80 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454625d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454626e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454627f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e80)) {
            return false;
        }
        r45.e80 e80Var = (r45.e80) fVar;
        return n51.f.a(this.f454625d, e80Var.f454625d) && n51.f.a(this.f454626e, e80Var.f454626e) && n51.f.a(this.f454627f, e80Var.f454627f);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L79
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lc
            goto L79
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L79
            r0.<init>(r7)     // Catch: java.lang.Exception -> L79
            java.util.Iterator r7 = r0.keys()     // Catch: java.lang.Exception -> L79
        L15:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> L79
            if (r1 == 0) goto L79
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L79
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L79
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L79
            r3 = -562267606(0xffffffffde7c7a2a, float:-4.548225E18)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L4c
            r3 = 3079825(0x2efe91, float:4.315754E-39)
            if (r2 == r3) goto L42
            r3 = 110371416(0x6942258, float:5.5721876E-35)
            if (r2 == r3) goto L37
            goto L56
        L37:
            java.lang.String r2 = "title"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L79
            if (r2 == 0) goto L56
            r2 = 0
            goto L57
        L42:
            java.lang.String r2 = "desc"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L79
            if (r2 == 0) goto L56
            r2 = r5
            goto L57
        L4c:
            java.lang.String r2 = "confirm_button_title"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L79
            if (r2 == 0) goto L56
            r2 = r4
            goto L57
        L56:
            r2 = -1
        L57:
            if (r2 == 0) goto L70
            if (r2 == r5) goto L67
            if (r2 == r4) goto L5e
            goto L15
        L5e:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L79
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L79
            r6.f454627f = r1     // Catch: java.lang.Exception -> L79
            goto L15
        L67:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L79
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L79
            r6.f454626e = r1     // Catch: java.lang.Exception -> L79
            goto L15
        L70:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L79
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L79
            r6.f454625d = r1     // Catch: java.lang.Exception -> L79
            goto L15
        L79:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.e80.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454625d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f454626e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f454627f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f454625d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f454626e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f454627f;
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
        r45.e80 e80Var = (r45.e80) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e80Var.f454625d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            e80Var.f454626e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        e80Var.f454627f = aVar2.k(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f454625d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str, false);
            eVar.d(jSONObject, "desc", this.f454626e, false);
            eVar.d(jSONObject, "confirm_button_title", this.f454627f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
