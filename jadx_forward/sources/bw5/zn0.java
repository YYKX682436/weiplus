package bw5;

/* loaded from: classes2.dex */
public class zn0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public int f117601e;

    /* renamed from: f, reason: collision with root package name */
    public int f117602f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f117600d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f117603g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f117604h = new boolean[5];

    static {
        new bw5.zn0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zn0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.zn0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zn0)) {
            return false;
        }
        bw5.zn0 zn0Var = (bw5.zn0) fVar;
        return n51.f.a(this.f117600d, zn0Var.f117600d) && n51.f.a(java.lang.Integer.valueOf(this.f117601e), java.lang.Integer.valueOf(zn0Var.f117601e)) && n51.f.a(java.lang.Integer.valueOf(this.f117602f), java.lang.Integer.valueOf(zn0Var.f117602f)) && n51.f.a(this.f117603g, zn0Var.f117603g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.zn0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f117603g;
        java.util.LinkedList linkedList2 = this.f117600d;
        boolean[] zArr = this.f117604h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            if (zArr[2]) {
                fVar.e(2, this.f117601e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f117602f);
            }
            fVar.g(4, 3, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0;
            if (zArr[2]) {
                g17 += b36.f.e(2, this.f117601e);
            }
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f117602f);
            }
            return g17 + b36.f.g(4, 3, linkedList);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f117601e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f117602f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            linkedList.add(java.lang.Long.valueOf(aVar2.i(intValue)));
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.yr yrVar = new bw5.yr();
            if (bArr != null && bArr.length > 0) {
                yrVar.mo11468x92b714fd(bArr);
            }
            linkedList2.add(yrVar);
        }
        zArr[1] = true;
        return 0;
    }
}
