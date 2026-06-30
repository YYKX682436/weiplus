package r45;

/* loaded from: classes2.dex */
public class xp extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f471831d;

    /* renamed from: e, reason: collision with root package name */
    public r45.pp f471832e;

    /* renamed from: f, reason: collision with root package name */
    public r45.op f471833f;

    /* renamed from: g, reason: collision with root package name */
    public long f471834g;

    /* renamed from: h, reason: collision with root package name */
    public r45.vp f471835h;

    /* renamed from: i, reason: collision with root package name */
    public r45.zp f471836i;

    /* renamed from: m, reason: collision with root package name */
    public r45.up f471837m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xp)) {
            return false;
        }
        r45.xp xpVar = (r45.xp) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f471831d), java.lang.Integer.valueOf(xpVar.f471831d)) && n51.f.a(this.f471832e, xpVar.f471832e) && n51.f.a(this.f471833f, xpVar.f471833f) && n51.f.a(java.lang.Long.valueOf(this.f471834g), java.lang.Long.valueOf(xpVar.f471834g)) && n51.f.a(this.f471835h, xpVar.f471835h) && n51.f.a(this.f471836i, xpVar.f471836i) && n51.f.a(this.f471837m, xpVar.f471837m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f471831d);
            r45.pp ppVar = this.f471832e;
            if (ppVar != null) {
                fVar.i(2, ppVar.mo75928xcd1e8d8());
                this.f471832e.mo75956x3d5d1f78(fVar);
            }
            r45.op opVar = this.f471833f;
            if (opVar != null) {
                fVar.i(3, opVar.mo75928xcd1e8d8());
                this.f471833f.mo75956x3d5d1f78(fVar);
            }
            fVar.h(4, this.f471834g);
            r45.vp vpVar = this.f471835h;
            if (vpVar != null) {
                fVar.i(5, vpVar.mo75928xcd1e8d8());
                this.f471835h.mo75956x3d5d1f78(fVar);
            }
            r45.zp zpVar = this.f471836i;
            if (zpVar != null) {
                fVar.i(6, zpVar.mo75928xcd1e8d8());
                this.f471836i.mo75956x3d5d1f78(fVar);
            }
            r45.up upVar = this.f471837m;
            if (upVar != null) {
                fVar.i(7, upVar.mo75928xcd1e8d8());
                this.f471837m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f471831d) + 0;
            r45.pp ppVar2 = this.f471832e;
            if (ppVar2 != null) {
                e17 += b36.f.i(2, ppVar2.mo75928xcd1e8d8());
            }
            r45.op opVar2 = this.f471833f;
            if (opVar2 != null) {
                e17 += b36.f.i(3, opVar2.mo75928xcd1e8d8());
            }
            int h17 = e17 + b36.f.h(4, this.f471834g);
            r45.vp vpVar2 = this.f471835h;
            if (vpVar2 != null) {
                h17 += b36.f.i(5, vpVar2.mo75928xcd1e8d8());
            }
            r45.zp zpVar2 = this.f471836i;
            if (zpVar2 != null) {
                h17 += b36.f.i(6, zpVar2.mo75928xcd1e8d8());
            }
            r45.up upVar2 = this.f471837m;
            return upVar2 != null ? h17 + b36.f.i(7, upVar2.mo75928xcd1e8d8()) : h17;
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
        r45.xp xpVar = (r45.xp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xpVar.f471831d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.pp ppVar3 = new r45.pp();
                    if (bArr != null && bArr.length > 0) {
                        ppVar3.mo11468x92b714fd(bArr);
                    }
                    xpVar.f471832e = ppVar3;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.op opVar3 = new r45.op();
                    if (bArr2 != null && bArr2.length > 0) {
                        opVar3.mo11468x92b714fd(bArr2);
                    }
                    xpVar.f471833f = opVar3;
                }
                return 0;
            case 4:
                xpVar.f471834g = aVar2.i(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.vp vpVar3 = new r45.vp();
                    if (bArr3 != null && bArr3.length > 0) {
                        vpVar3.mo11468x92b714fd(bArr3);
                    }
                    xpVar.f471835h = vpVar3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.zp zpVar3 = new r45.zp();
                    if (bArr4 != null && bArr4.length > 0) {
                        zpVar3.mo11468x92b714fd(bArr4);
                    }
                    xpVar.f471836i = zpVar3;
                }
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    r45.up upVar3 = new r45.up();
                    if (bArr5 != null && bArr5.length > 0) {
                        upVar3.mo11468x92b714fd(bArr5);
                    }
                    xpVar.f471837m = upVar3;
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f471831d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Type", valueOf, false);
            eVar.d(jSONObject, "ContactItem", this.f471832e, false);
            eVar.d(jSONObject, "CommonItem", this.f471833f, false);
            eVar.d(jSONObject, "DocID", java.lang.Long.valueOf(this.f471834g), false);
            eVar.d(jSONObject, "ProductItem", this.f471835h, false);
            eVar.d(jSONObject, "SnsItem", this.f471836i, false);
            eVar.d(jSONObject, "POIItem", this.f471837m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
