package s45;

/* loaded from: classes8.dex */
public class e extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f484508d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f484509e;

    /* renamed from: f, reason: collision with root package name */
    public s45.g f484510f;

    /* renamed from: g, reason: collision with root package name */
    public int f484511g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof s45.e)) {
            return false;
        }
        s45.e eVar = (s45.e) fVar;
        return n51.f.a(this.f76494x2de60e5e, eVar.f76494x2de60e5e) && n51.f.a(this.f484508d, eVar.f484508d) && n51.f.a(java.lang.Integer.valueOf(this.f484509e), java.lang.Integer.valueOf(eVar.f484509e)) && n51.f.a(this.f484510f, eVar.f484510f) && n51.f.a(java.lang.Integer.valueOf(this.f484511g), java.lang.Integer.valueOf(eVar.f484511g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f484508d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 1, linkedList);
            fVar.e(3, this.f484509e);
            s45.g gVar = this.f484510f;
            if (gVar != null) {
                fVar.i(4, gVar.mo75928xcd1e8d8());
                this.f484510f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f484511g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 1, linkedList) + b36.f.e(3, this.f484509e);
            s45.g gVar2 = this.f484510f;
            if (gVar2 != null) {
                i18 += b36.f.i(4, gVar2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(5, this.f484511g);
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
        s45.e eVar = (s45.e) objArr[1];
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
                eVar.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            eVar.f484508d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            eVar.f484509e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            eVar.f484511g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            s45.g gVar3 = new s45.g();
            if (bArr3 != null && bArr3.length > 0) {
                gVar3.mo11468x92b714fd(bArr3);
            }
            eVar.f484510f = gVar3;
        }
        return 0;
    }
}
