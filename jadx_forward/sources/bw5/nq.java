package bw5;

/* loaded from: classes2.dex */
public class nq extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112315d;

    /* renamed from: f, reason: collision with root package name */
    public int f112317f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f112316e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f112318g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f112319h = new boolean[5];

    static {
        new bw5.nq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nq mo11468x92b714fd(byte[] bArr) {
        return (bw5.nq) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nq)) {
            return false;
        }
        bw5.nq nqVar = (bw5.nq) fVar;
        return n51.f.a(this.f112315d, nqVar.f112315d) && n51.f.a(this.f112316e, nqVar.f112316e) && n51.f.a(java.lang.Integer.valueOf(this.f112317f), java.lang.Integer.valueOf(nqVar.f112317f)) && n51.f.a(this.f112318g, nqVar.f112318g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.nq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f112318g;
        java.util.LinkedList linkedList2 = this.f112316e;
        boolean[] zArr = this.f112319h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112315d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, linkedList2);
            if (zArr[3]) {
                fVar.e(3, this.f112317f);
            }
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f112315d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            int g17 = i18 + b36.f.g(2, 1, linkedList2);
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f112317f);
            }
            return g17 + b36.f.g(4, 1, linkedList);
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
        if (intValue == 1) {
            this.f112315d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            linkedList2.add(aVar2.k(intValue));
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f112317f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        linkedList.add(aVar2.k(intValue));
        zArr[4] = true;
        return 0;
    }
}
