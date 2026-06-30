package r45;

/* loaded from: classes4.dex */
public class dc7 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.jw6 f453847d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f453848e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.uf7 f453849f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dc7)) {
            return false;
        }
        r45.dc7 dc7Var = (r45.dc7) fVar;
        return n51.f.a(this.f76492x92037252, dc7Var.f76492x92037252) && n51.f.a(this.f453847d, dc7Var.f453847d) && n51.f.a(this.f453848e, dc7Var.f453848e) && n51.f.a(this.f453849f, dc7Var.f453849f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f453848e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.jw6 jw6Var = this.f453847d;
            if (jw6Var != null) {
                fVar.i(2, jw6Var.mo75928xcd1e8d8());
                this.f453847d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            r45.uf7 uf7Var = this.f453849f;
            if (uf7Var != null) {
                fVar.i(4, uf7Var.mo75928xcd1e8d8());
                this.f453849f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.jw6 jw6Var2 = this.f453847d;
            if (jw6Var2 != null) {
                i18 += b36.f.i(2, jw6Var2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            r45.uf7 uf7Var2 = this.f453849f;
            return uf7Var2 != null ? g17 + b36.f.i(4, uf7Var2.mo75928xcd1e8d8()) : g17;
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
        r45.dc7 dc7Var = (r45.dc7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr2);
                }
                dc7Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.jw6 jw6Var3 = new r45.jw6();
                if (bArr3 != null && bArr3.length > 0) {
                    jw6Var3.mo11468x92b714fd(bArr3);
                }
                dc7Var.f453847d = jw6Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr4 = (byte[]) j19.get(i28);
                r45.vb vbVar = new r45.vb();
                if (bArr4 != null && bArr4.length > 0) {
                    vbVar.mo11468x92b714fd(bArr4);
                }
                dc7Var.f453848e.add(vbVar);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr5 = (byte[]) j27.get(i29);
            r45.uf7 uf7Var3 = new r45.uf7();
            if (bArr5 != null && bArr5.length > 0) {
                uf7Var3.mo11468x92b714fd(bArr5);
            }
            dc7Var.f453849f = uf7Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.f76492x92037252;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "userMgrBaseResp", this.f453847d, false);
            eVar.d(jSONObject, "authItem", this.f453848e, false);
            eVar.d(jSONObject, "use_user_info", this.f453849f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
