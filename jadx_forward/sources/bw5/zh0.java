package bw5;

/* loaded from: classes8.dex */
public class zh0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.yh0 f117532d;

    /* renamed from: e, reason: collision with root package name */
    public int f117533e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f117534f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f117535g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f117536h = new boolean[7];

    static {
        new bw5.zh0();
    }

    public bw5.yh0 b() {
        return this.f117536h[3] ? this.f117532d : new bw5.yh0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.zh0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.zh0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zh0)) {
            return false;
        }
        bw5.zh0 zh0Var = (bw5.zh0) fVar;
        return n51.f.a(this.f117532d, zh0Var.f117532d) && n51.f.a(java.lang.Integer.valueOf(this.f117533e), java.lang.Integer.valueOf(zh0Var.f117533e)) && n51.f.a(this.f117534f, zh0Var.f117534f) && n51.f.a(this.f117535g, zh0Var.f117535g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.zh0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f117535g;
        boolean[] zArr = this.f117536h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.yh0 yh0Var = this.f117532d;
            if (yh0Var != null && zArr[3]) {
                fVar.i(3, yh0Var.mo75928xcd1e8d8());
                this.f117532d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f117533e);
            }
            java.lang.String str = this.f117534f;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            fVar.g(6, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.yh0 yh0Var2 = this.f117532d;
            if (yh0Var2 != null && zArr[3]) {
                i18 = 0 + b36.f.i(3, yh0Var2.mo75928xcd1e8d8());
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f117533e);
            }
            java.lang.String str2 = this.f117534f;
            if (str2 != null && zArr[5]) {
                i18 += b36.f.j(5, str2);
            }
            return i18 + b36.f.g(6, 1, linkedList);
        }
        if (i17 == 2) {
            linkedList.clear();
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
        if (intValue != 3) {
            if (intValue == 4) {
                this.f117533e = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue == 5) {
                this.f117534f = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            }
            if (intValue != 6) {
                return -1;
            }
            linkedList.add(aVar2.k(intValue));
            zArr[6] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.yh0 yh0Var3 = new bw5.yh0();
            if (bArr != null && bArr.length > 0) {
                yh0Var3.mo11468x92b714fd(bArr);
            }
            this.f117532d = yh0Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
