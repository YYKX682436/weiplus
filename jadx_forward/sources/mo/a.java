package mo;

/* loaded from: classes11.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f411772d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f411773e;

    /* renamed from: f, reason: collision with root package name */
    public int f411774f;

    /* renamed from: g, reason: collision with root package name */
    public int f411775g;

    /* renamed from: h, reason: collision with root package name */
    public int f411776h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f411777i;

    /* renamed from: m, reason: collision with root package name */
    public int f411778m;

    /* renamed from: n, reason: collision with root package name */
    public int f411779n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof mo.a)) {
            return false;
        }
        mo.a aVar = (mo.a) fVar;
        return n51.f.a(this.f411772d, aVar.f411772d) && n51.f.a(java.lang.Integer.valueOf(this.f411773e), java.lang.Integer.valueOf(aVar.f411773e)) && n51.f.a(java.lang.Integer.valueOf(this.f411774f), java.lang.Integer.valueOf(aVar.f411774f)) && n51.f.a(java.lang.Integer.valueOf(this.f411775g), java.lang.Integer.valueOf(aVar.f411775g)) && n51.f.a(java.lang.Integer.valueOf(this.f411776h), java.lang.Integer.valueOf(aVar.f411776h)) && n51.f.a(this.f411777i, aVar.f411777i) && n51.f.a(java.lang.Integer.valueOf(this.f411778m), java.lang.Integer.valueOf(aVar.f411778m)) && n51.f.a(java.lang.Integer.valueOf(this.f411779n), java.lang.Integer.valueOf(aVar.f411779n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f411772d);
            fVar.e(2, this.f411773e);
            fVar.e(3, this.f411774f);
            fVar.e(4, this.f411775g);
            fVar.e(5, this.f411776h);
            java.lang.String str = this.f411777i;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f411778m);
            fVar.e(8, this.f411779n);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f411772d) + 0 + b36.f.e(2, this.f411773e) + b36.f.e(3, this.f411774f) + b36.f.e(4, this.f411775g) + b36.f.e(5, this.f411776h);
            java.lang.String str2 = this.f411777i;
            if (str2 != null) {
                g17 += b36.f.j(6, str2);
            }
            return g17 + b36.f.e(7, this.f411778m) + b36.f.e(8, this.f411779n);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f411772d.clear();
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
        mo.a aVar3 = (mo.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    mo.b bVar = new mo.b();
                    if (bArr2 != null && bArr2.length > 0) {
                        bVar.mo11468x92b714fd(bArr2);
                    }
                    aVar3.f411772d.add(bVar);
                }
                return 0;
            case 2:
                aVar3.f411773e = aVar2.g(intValue);
                return 0;
            case 3:
                aVar3.f411774f = aVar2.g(intValue);
                return 0;
            case 4:
                aVar3.f411775g = aVar2.g(intValue);
                return 0;
            case 5:
                aVar3.f411776h = aVar2.g(intValue);
                return 0;
            case 6:
                aVar3.f411777i = aVar2.k(intValue);
                return 0;
            case 7:
                aVar3.f411778m = aVar2.g(intValue);
                return 0;
            case 8:
                aVar3.f411779n = aVar2.g(intValue);
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
            java.util.LinkedList linkedList = this.f411772d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "list", linkedList, false);
            eVar.d(jSONObject, "flag", java.lang.Integer.valueOf(this.f411773e), false);
            eVar.d(jSONObject, "type", java.lang.Integer.valueOf(this.f411774f), false);
            eVar.d(jSONObject, "status", java.lang.Integer.valueOf(this.f411775g), false);
            eVar.d(jSONObject, "maxCount", java.lang.Integer.valueOf(this.f411776h), false);
            eVar.d(jSONObject, "upgrader", this.f411777i, false);
            eVar.d(jSONObject, "oldVer", java.lang.Integer.valueOf(this.f411778m), false);
            eVar.d(jSONObject, "newVer", java.lang.Integer.valueOf(this.f411779n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
