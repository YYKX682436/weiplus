package r45;

/* loaded from: classes9.dex */
public class xe extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f471534d;

    /* renamed from: e, reason: collision with root package name */
    public int f471535e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f471536f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f471537g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471538h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471539i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f471540m;

    /* renamed from: n, reason: collision with root package name */
    public int f471541n;

    static {
        new r45.xe();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xe)) {
            return false;
        }
        r45.xe xeVar = (r45.xe) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f471534d), java.lang.Integer.valueOf(xeVar.f471534d)) && n51.f.a(java.lang.Integer.valueOf(this.f471535e), java.lang.Integer.valueOf(xeVar.f471535e)) && n51.f.a(this.f471536f, xeVar.f471536f) && n51.f.a(java.lang.Integer.valueOf(this.f471537g), java.lang.Integer.valueOf(xeVar.f471537g)) && n51.f.a(this.f471538h, xeVar.f471538h) && n51.f.a(this.f471539i, xeVar.f471539i) && n51.f.a(java.lang.Boolean.valueOf(this.f471540m), java.lang.Boolean.valueOf(xeVar.f471540m)) && n51.f.a(java.lang.Integer.valueOf(this.f471541n), java.lang.Integer.valueOf(xeVar.f471541n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.xe();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f471534d);
            fVar.e(2, this.f471535e);
            fVar.g(3, 1, this.f471536f);
            fVar.e(4, this.f471537g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f471538h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f471539i;
            if (gVar2 != null) {
                fVar.b(6, gVar2);
            }
            fVar.a(7, this.f471540m);
            fVar.e(8, this.f471541n);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f471534d) + 0 + b36.f.e(2, this.f471535e) + b36.f.g(3, 1, this.f471536f) + b36.f.e(4, this.f471537g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f471538h;
            if (gVar3 != null) {
                e17 += b36.f.b(5, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f471539i;
            if (gVar4 != null) {
                e17 += b36.f.b(6, gVar4);
            }
            return e17 + b36.f.a(7, this.f471540m) + b36.f.e(8, this.f471541n);
        }
        if (i17 == 2) {
            this.f471536f.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f471534d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f471535e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f471536f.add(aVar2.k(intValue));
                return 0;
            case 4:
                this.f471537g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f471538h = aVar2.d(intValue);
                return 0;
            case 6:
                this.f471539i = aVar2.d(intValue);
                return 0;
            case 7:
                this.f471540m = aVar2.c(intValue);
                return 0;
            case 8:
                this.f471541n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.xe) super.mo11468x92b714fd(bArr);
    }
}
