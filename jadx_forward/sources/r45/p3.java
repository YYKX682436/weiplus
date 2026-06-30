package r45;

/* loaded from: classes4.dex */
public class p3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.x2 f464226d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f464227e = new java.util.LinkedList();

    public com.p314xaae8f345.mm.p944x882e457a.i b() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 28779;
        lVar.f152199c = "/cgi-bin/mmoc-bin/ad/addatareport_for_flod";
        lVar.f152197a = this;
        lVar.f152198b = new r45.q3();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
        iVar.p(a17);
        return iVar;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p3)) {
            return false;
        }
        r45.p3 p3Var = (r45.p3) fVar;
        return n51.f.a(this.f76494x2de60e5e, p3Var.f76494x2de60e5e) && n51.f.a(this.f464226d, p3Var.f464226d) && n51.f.a(this.f464227e, p3Var.f464227e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String r8) {
        /*
            r7 = this;
            if (r8 == 0) goto Lc3
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto Lc
            goto Lc3
        Lc:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lc3
            r0.<init>(r8)     // Catch: java.lang.Exception -> Lc3
            java.util.Iterator r8 = r0.keys()     // Catch: java.lang.Exception -> Lc3
        L15:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Exception -> Lc3
            if (r1 == 0) goto Lc3
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Exception -> Lc3
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lc3
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> Lc3
            r3 = -778396079(0xffffffffd19a9e51, float:-8.301013E10)
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == r3) goto L4c
            r3 = 322049708(0x133216ac, float:2.2477937E-27)
            if (r2 == r3) goto L42
            r3 = 770051678(0x2de60e5e, float:2.6154353E-11)
            if (r2 == r3) goto L38
            goto L56
        L38:
            java.lang.String r2 = "BaseRequest"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> Lc3
            if (r2 == 0) goto L56
            r2 = r4
            goto L57
        L42:
            java.lang.String r2 = "ad_data_report_req"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> Lc3
            if (r2 == 0) goto L56
            r2 = r6
            goto L57
        L4c:
            java.lang.String r2 = "ad_data_report_req_list"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> Lc3
            if (r2 == 0) goto L56
            r2 = r5
            goto L57
        L56:
            r2 = -1
        L57:
            if (r2 == 0) goto La6
            if (r2 == r6) goto L8c
            if (r2 == r5) goto L5e
            goto L15
        L5e:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> Lc3
            boolean r2 = r1 instanceof org.json.JSONArray     // Catch: java.lang.Exception -> Lc3
            if (r2 == 0) goto L15
            org.json.JSONArray r1 = (org.json.JSONArray) r1     // Catch: java.lang.Exception -> Lc3
        L68:
            int r2 = r1.length()     // Catch: java.lang.Exception -> Lc3
            if (r4 >= r2) goto L15
            java.lang.Object r2 = r1.get(r4)     // Catch: java.lang.Exception -> Lc3
            boolean r3 = r2 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> Lc3
            if (r3 == 0) goto L89
            java.util.LinkedList r3 = r7.f464227e     // Catch: java.lang.Exception -> Lc3
            r45.x2 r5 = new r45.x2     // Catch: java.lang.Exception -> Lc3
            r5.<init>()     // Catch: java.lang.Exception -> Lc3
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: java.lang.Exception -> Lc3
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lc3
            r5.mo75930xb5cb93b2(r2)     // Catch: java.lang.Exception -> Lc3
            r3.add(r5)     // Catch: java.lang.Exception -> Lc3
        L89:
            int r4 = r4 + 1
            goto L68
        L8c:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> Lc3
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> Lc3
            if (r2 == 0) goto L15
            r45.x2 r2 = new r45.x2     // Catch: java.lang.Exception -> Lc3
            r2.<init>()     // Catch: java.lang.Exception -> Lc3
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> Lc3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lc3
            r2.mo75930xb5cb93b2(r1)     // Catch: java.lang.Exception -> Lc3
            r7.f464226d = r2     // Catch: java.lang.Exception -> Lc3
            goto L15
        La6:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> Lc3
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> Lc3
            if (r2 == 0) goto L15
            r45.he r2 = new r45.he     // Catch: java.lang.Exception -> Lc3
            r2.<init>()     // Catch: java.lang.Exception -> Lc3
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> Lc3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lc3
            com.tencent.mm.protobuf.f r1 = r2.mo75930xb5cb93b2(r1)     // Catch: java.lang.Exception -> Lc3
            r45.he r1 = (r45.he) r1     // Catch: java.lang.Exception -> Lc3
            r7.f76494x2de60e5e = r1     // Catch: java.lang.Exception -> Lc3
            goto L15
        Lc3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.p3.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f464227e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            r45.x2 x2Var = this.f464226d;
            if (x2Var != null) {
                fVar.i(2, x2Var.mo75928xcd1e8d8());
                this.f464226d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.x2 x2Var2 = this.f464226d;
            if (x2Var2 != null) {
                i18 += b36.f.i(2, x2Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.g(3, 8, linkedList);
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
        r45.p3 p3Var = (r45.p3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                p3Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.x2 x2Var3 = new r45.x2();
                if (bArr3 != null && bArr3.length > 0) {
                    x2Var3.mo11468x92b714fd(bArr3);
                }
                p3Var.f464226d = x2Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.x2 x2Var4 = new r45.x2();
            if (bArr4 != null && bArr4.length > 0) {
                x2Var4.mo11468x92b714fd(bArr4);
            }
            p3Var.f464227e.add(x2Var4);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.f76494x2de60e5e;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "ad_data_report_req", this.f464226d, false);
            eVar.d(jSONObject, "ad_data_report_req_list", this.f464227e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
