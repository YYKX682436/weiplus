package bw5;

/* loaded from: classes2.dex */
public class tn extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f115059d;

    /* renamed from: i, reason: collision with root package name */
    public int f115064i;

    /* renamed from: m, reason: collision with root package name */
    public int f115065m;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f115060e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f115061f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f115062g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f115063h = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f115066n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f115067o = new boolean[9];

    static {
        new bw5.tn();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tn mo11468x92b714fd(byte[] bArr) {
        return (bw5.tn) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tn)) {
            return false;
        }
        bw5.tn tnVar = (bw5.tn) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f115059d), java.lang.Integer.valueOf(tnVar.f115059d)) && n51.f.a(this.f115060e, tnVar.f115060e) && n51.f.a(this.f115061f, tnVar.f115061f) && n51.f.a(this.f115062g, tnVar.f115062g) && n51.f.a(this.f115063h, tnVar.f115063h) && n51.f.a(java.lang.Integer.valueOf(this.f115064i), java.lang.Integer.valueOf(tnVar.f115064i)) && n51.f.a(java.lang.Integer.valueOf(this.f115065m), java.lang.Integer.valueOf(tnVar.f115065m)) && n51.f.a(this.f115066n, tnVar.f115066n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.tn();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f115066n;
        java.util.LinkedList linkedList2 = this.f115063h;
        java.util.LinkedList linkedList3 = this.f115062g;
        java.util.LinkedList linkedList4 = this.f115061f;
        java.util.LinkedList linkedList5 = this.f115060e;
        boolean[] zArr = this.f115067o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f115059d);
            }
            fVar.g(2, 1, linkedList5);
            fVar.g(3, 1, linkedList4);
            fVar.g(4, 1, linkedList3);
            fVar.g(5, 1, linkedList2);
            if (zArr[6]) {
                fVar.e(6, this.f115064i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f115065m);
            }
            fVar.g(8, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? 0 + b36.f.e(1, this.f115059d) : 0) + b36.f.g(2, 1, linkedList5) + b36.f.g(3, 1, linkedList4) + b36.f.g(4, 1, linkedList3) + b36.f.g(5, 1, linkedList2);
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f115064i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f115065m);
            }
            return e17 + b36.f.g(8, 2, linkedList);
        }
        if (i17 == 2) {
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
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
        switch (intValue) {
            case 1:
                this.f115059d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                linkedList5.add(aVar2.k(intValue));
                zArr[2] = true;
                return 0;
            case 3:
                linkedList4.add(aVar2.k(intValue));
                zArr[3] = true;
                return 0;
            case 4:
                linkedList3.add(aVar2.k(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                linkedList2.add(aVar2.k(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                this.f115064i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115065m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
