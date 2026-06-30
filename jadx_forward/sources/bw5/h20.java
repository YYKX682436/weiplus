package bw5;

/* loaded from: classes14.dex */
public class h20 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.i20 f109587d;

    /* renamed from: e, reason: collision with root package name */
    public long f109588e;

    /* renamed from: f, reason: collision with root package name */
    public float f109589f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f109590g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f109591h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f109592i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.g20 f109593m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f109594n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f109595o = new boolean[9];

    static {
        new bw5.h20();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.h20 mo11468x92b714fd(byte[] bArr) {
        return (bw5.h20) super.mo11468x92b714fd(bArr);
    }

    public bw5.h20 c(bw5.i20 i20Var) {
        this.f109587d = i20Var;
        this.f109595o[1] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.h20)) {
            return false;
        }
        bw5.h20 h20Var = (bw5.h20) fVar;
        return n51.f.a(this.f109587d, h20Var.f109587d) && n51.f.a(java.lang.Long.valueOf(this.f109588e), java.lang.Long.valueOf(h20Var.f109588e)) && n51.f.a(java.lang.Float.valueOf(this.f109589f), java.lang.Float.valueOf(h20Var.f109589f)) && n51.f.a(java.lang.Boolean.valueOf(this.f109590g), java.lang.Boolean.valueOf(h20Var.f109590g)) && n51.f.a(this.f109591h, h20Var.f109591h) && n51.f.a(this.f109592i, h20Var.f109592i) && n51.f.a(this.f109593m, h20Var.f109593m) && n51.f.a(this.f109594n, h20Var.f109594n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.h20();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.i20 i20Var;
        int i18 = 0;
        boolean[] zArr = this.f109595o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.i20 i20Var2 = this.f109587d;
            if (i20Var2 != null && zArr[1]) {
                fVar.e(1, i20Var2.f109976d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f109588e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f109589f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f109590g);
            }
            java.lang.String str = this.f109591h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f109592i;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            bw5.g20 g20Var = this.f109593m;
            if (g20Var != null && zArr[7]) {
                fVar.i(7, g20Var.mo75928xcd1e8d8());
                this.f109593m.mo75956x3d5d1f78(fVar);
            }
            fVar.g(8, 8, this.f109594n);
            return 0;
        }
        if (i17 == 1) {
            bw5.i20 i20Var3 = this.f109587d;
            if (i20Var3 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, i20Var3.f109976d);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f109588e);
            }
            if (zArr[3]) {
                i18 += b36.f.d(3, this.f109589f);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f109590g);
            }
            java.lang.String str2 = this.f109591h;
            if (str2 != null && zArr[5]) {
                i18 += b36.f.j(5, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f109592i;
            if (gVar2 != null && zArr[6]) {
                i18 += b36.f.b(6, gVar2);
            }
            bw5.g20 g20Var2 = this.f109593m;
            if (g20Var2 != null && zArr[7]) {
                i18 += b36.f.i(7, g20Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.g(8, 8, this.f109594n);
        }
        if (i17 == 2) {
            this.f109594n.clear();
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
                switch (aVar2.g(intValue)) {
                    case 0:
                        i20Var = bw5.i20.nullType;
                        break;
                    case 1:
                        i20Var = bw5.i20.intType;
                        break;
                    case 2:
                        i20Var = bw5.i20.floatType;
                        break;
                    case 3:
                        i20Var = bw5.i20.boolType;
                        break;
                    case 4:
                        i20Var = bw5.i20.stringType;
                        break;
                    case 5:
                        i20Var = bw5.i20.bytesType;
                        break;
                    case 6:
                        i20Var = bw5.i20.mapType;
                        break;
                    case 7:
                        i20Var = bw5.i20.listType;
                        break;
                    default:
                        i20Var = null;
                        break;
                }
                this.f109587d = i20Var;
                zArr[1] = true;
                return 0;
            case 2:
                this.f109588e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109589f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109590g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109591h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109592i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.g20 g20Var3 = new bw5.g20();
                    if (bArr != null && bArr.length > 0) {
                        g20Var3.mo11468x92b714fd(bArr);
                    }
                    this.f109593m = g20Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.h20 h20Var = new bw5.h20();
                    if (bArr2 != null && bArr2.length > 0) {
                        h20Var.mo11468x92b714fd(bArr2);
                    }
                    this.f109594n.add(h20Var);
                }
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
