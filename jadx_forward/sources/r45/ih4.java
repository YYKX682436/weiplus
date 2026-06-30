package r45;

/* loaded from: classes7.dex */
public class ih4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f458578d;

    /* renamed from: e, reason: collision with root package name */
    public float f458579e;

    /* renamed from: f, reason: collision with root package name */
    public float f458580f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f458581g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public long f458582h;

    /* renamed from: i, reason: collision with root package name */
    public long f458583i;

    /* renamed from: m, reason: collision with root package name */
    public long f458584m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f458585n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ih4)) {
            return false;
        }
        r45.ih4 ih4Var = (r45.ih4) fVar;
        return n51.f.a(this.f76494x2de60e5e, ih4Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f458578d), java.lang.Integer.valueOf(ih4Var.f458578d)) && n51.f.a(java.lang.Float.valueOf(this.f458579e), java.lang.Float.valueOf(ih4Var.f458579e)) && n51.f.a(java.lang.Float.valueOf(this.f458580f), java.lang.Float.valueOf(ih4Var.f458580f)) && n51.f.a(this.f458581g, ih4Var.f458581g) && n51.f.a(java.lang.Long.valueOf(this.f458582h), java.lang.Long.valueOf(ih4Var.f458582h)) && n51.f.a(java.lang.Long.valueOf(this.f458583i), java.lang.Long.valueOf(ih4Var.f458583i)) && n51.f.a(java.lang.Long.valueOf(this.f458584m), java.lang.Long.valueOf(ih4Var.f458584m)) && n51.f.a(this.f458585n, ih4Var.f458585n);
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
            fVar.e(2, this.f458578d);
            fVar.d(3, this.f458579e);
            fVar.d(4, this.f458580f);
            fVar.g(5, 6, this.f458581g);
            fVar.h(6, this.f458582h);
            fVar.h(7, this.f458583i);
            fVar.h(8, this.f458584m);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f458585n;
            if (gVar != null) {
                fVar.b(9, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f458578d) + b36.f.d(3, this.f458579e) + b36.f.d(4, this.f458580f) + b36.f.g(5, 6, this.f458581g) + b36.f.h(6, this.f458582h) + b36.f.h(7, this.f458583i) + b36.f.h(8, this.f458584m);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f458585n;
            return gVar2 != null ? i18 + b36.f.b(9, gVar2) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f458581g.clear();
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
        r45.ih4 ih4Var = (r45.ih4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    ih4Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                ih4Var.f458578d = aVar2.g(intValue);
                return 0;
            case 3:
                ih4Var.f458579e = aVar2.f(intValue);
                return 0;
            case 4:
                ih4Var.f458580f = aVar2.f(intValue);
                return 0;
            case 5:
                ih4Var.f458581g.add(aVar2.d(intValue));
                return 0;
            case 6:
                ih4Var.f458582h = aVar2.i(intValue);
                return 0;
            case 7:
                ih4Var.f458583i = aVar2.i(intValue);
                return 0;
            case 8:
                ih4Var.f458584m = aVar2.i(intValue);
                return 0;
            case 9:
                ih4Var.f458585n = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
