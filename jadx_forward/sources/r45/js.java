package r45;

/* loaded from: classes8.dex */
public class js extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f459610d;

    /* renamed from: e, reason: collision with root package name */
    public int f459611e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f459612f;

    /* renamed from: g, reason: collision with root package name */
    public int f459613g;

    /* renamed from: h, reason: collision with root package name */
    public int f459614h;

    /* renamed from: i, reason: collision with root package name */
    public int f459615i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.js)) {
            return false;
        }
        r45.js jsVar = (r45.js) fVar;
        return n51.f.a(this.f76494x2de60e5e, jsVar.f76494x2de60e5e) && n51.f.a(this.f459610d, jsVar.f459610d) && n51.f.a(java.lang.Integer.valueOf(this.f459611e), java.lang.Integer.valueOf(jsVar.f459611e)) && n51.f.a(this.f459612f, jsVar.f459612f) && n51.f.a(java.lang.Integer.valueOf(this.f459613g), java.lang.Integer.valueOf(jsVar.f459613g)) && n51.f.a(java.lang.Integer.valueOf(this.f459614h), java.lang.Integer.valueOf(jsVar.f459614h)) && n51.f.a(java.lang.Integer.valueOf(this.f459615i), java.lang.Integer.valueOf(jsVar.f459615i));
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
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f459610d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f459611e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f459612f;
            if (gVar2 != null) {
                fVar.b(4, gVar2);
            }
            fVar.e(5, this.f459613g);
            fVar.e(6, this.f459614h);
            fVar.e(7, this.f459615i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f459610d;
            if (gVar3 != null) {
                i18 += b36.f.b(2, gVar3);
            }
            int e17 = i18 + b36.f.e(3, this.f459611e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f459612f;
            if (gVar4 != null) {
                e17 += b36.f.b(4, gVar4);
            }
            return e17 + b36.f.e(5, this.f459613g) + b36.f.e(6, this.f459614h) + b36.f.e(7, this.f459615i);
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
        r45.js jsVar = (r45.js) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    jsVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                jsVar.f459610d = aVar2.d(intValue);
                return 0;
            case 3:
                jsVar.f459611e = aVar2.g(intValue);
                return 0;
            case 4:
                jsVar.f459612f = aVar2.d(intValue);
                return 0;
            case 5:
                jsVar.f459613g = aVar2.g(intValue);
                return 0;
            case 6:
                jsVar.f459614h = aVar2.g(intValue);
                return 0;
            case 7:
                jsVar.f459615i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
