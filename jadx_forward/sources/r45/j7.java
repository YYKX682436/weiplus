package r45;

/* loaded from: classes8.dex */
public class j7 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459150d;

    /* renamed from: e, reason: collision with root package name */
    public int f459151e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f459152f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j7)) {
            return false;
        }
        r45.j7 j7Var = (r45.j7) fVar;
        return n51.f.a(this.f76494x2de60e5e, j7Var.f76494x2de60e5e) && n51.f.a(this.f459150d, j7Var.f459150d) && n51.f.a(java.lang.Integer.valueOf(this.f459151e), java.lang.Integer.valueOf(j7Var.f459151e)) && n51.f.a(this.f459152f, j7Var.f459152f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f459150d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f459151e);
            fVar.g(4, 8, this.f459152f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f459150d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f459151e) + b36.f.g(4, 8, this.f459152f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f459152f.clear();
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
        r45.j7 j7Var = (r45.j7) objArr[1];
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
                j7Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            j7Var.f459150d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            j7Var.f459151e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.az azVar = new r45.az();
            if (bArr3 != null && bArr3.length > 0) {
                azVar.mo11468x92b714fd(bArr3);
            }
            j7Var.f459152f.add(azVar);
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
            eVar.d(jSONObject, "ChatRoomName", this.f459150d, false);
            eVar.d(jSONObject, "WatchMemberCount", java.lang.Integer.valueOf(this.f459151e), false);
            eVar.d(jSONObject, "WatchMembers", this.f459152f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
