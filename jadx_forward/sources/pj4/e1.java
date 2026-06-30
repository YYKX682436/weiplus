package pj4;

/* loaded from: classes4.dex */
public class e1 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public pj4.p1 f436564d;

    /* renamed from: e, reason: collision with root package name */
    public pj4.x0 f436565e;

    /* renamed from: f, reason: collision with root package name */
    public pj4.k0 f436566f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f436567g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.e1)) {
            return false;
        }
        pj4.e1 e1Var = (pj4.e1) fVar;
        return n51.f.a(this.f76492x92037252, e1Var.f76492x92037252) && n51.f.a(this.f436564d, e1Var.f436564d) && n51.f.a(this.f436565e, e1Var.f436565e) && n51.f.a(this.f436566f, e1Var.f436566f) && n51.f.a(this.f436567g, e1Var.f436567g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f436567g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            pj4.p1 p1Var = this.f436564d;
            if (p1Var != null) {
                fVar.i(2, p1Var.mo75928xcd1e8d8());
                this.f436564d.mo75956x3d5d1f78(fVar);
            }
            pj4.x0 x0Var = this.f436565e;
            if (x0Var != null) {
                fVar.i(3, x0Var.mo75928xcd1e8d8());
                this.f436565e.mo75956x3d5d1f78(fVar);
            }
            pj4.k0 k0Var = this.f436566f;
            if (k0Var != null) {
                fVar.i(4, k0Var.mo75928xcd1e8d8());
                this.f436566f.mo75956x3d5d1f78(fVar);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            pj4.p1 p1Var2 = this.f436564d;
            if (p1Var2 != null) {
                i18 += b36.f.i(2, p1Var2.mo75928xcd1e8d8());
            }
            pj4.x0 x0Var2 = this.f436565e;
            if (x0Var2 != null) {
                i18 += b36.f.i(3, x0Var2.mo75928xcd1e8d8());
            }
            pj4.k0 k0Var2 = this.f436566f;
            if (k0Var2 != null) {
                i18 += b36.f.i(4, k0Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.g(5, 8, linkedList);
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
        pj4.e1 e1Var = (pj4.e1) objArr[1];
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
                e1Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                pj4.p1 p1Var3 = new pj4.p1();
                if (bArr3 != null && bArr3.length > 0) {
                    p1Var3.mo11468x92b714fd(bArr3);
                }
                e1Var.f436564d = p1Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr4 = (byte[]) j19.get(i28);
                pj4.x0 x0Var3 = new pj4.x0();
                if (bArr4 != null && bArr4.length > 0) {
                    x0Var3.mo11468x92b714fd(bArr4);
                }
                e1Var.f436565e = x0Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr5 = (byte[]) j27.get(i29);
                pj4.k0 k0Var3 = new pj4.k0();
                if (bArr5 != null && bArr5.length > 0) {
                    k0Var3.mo11468x92b714fd(bArr5);
                }
                e1Var.f436566f = k0Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i37 = 0; i37 < size5; i37++) {
            byte[] bArr6 = (byte[]) j28.get(i37);
            pj4.p1 p1Var4 = new pj4.p1();
            if (bArr6 != null && bArr6.length > 0) {
                p1Var4.mo11468x92b714fd(bArr6);
            }
            e1Var.f436567g.add(p1Var4);
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
            eVar.d(jSONObject, "icon_config", this.f436564d, false);
            eVar.d(jSONObject, "cover_agenda", this.f436565e, false);
            eVar.d(jSONObject, "key_value_config", this.f436566f, false);
            eVar.d(jSONObject, "icon_configs", this.f436567g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
