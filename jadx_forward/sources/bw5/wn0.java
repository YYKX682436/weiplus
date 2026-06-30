package bw5;

/* loaded from: classes9.dex */
public class wn0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f116327d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f116328e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f116329f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f116330g = new boolean[4];

    static {
        new bw5.wn0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wn0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.wn0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wn0)) {
            return false;
        }
        bw5.wn0 wn0Var = (bw5.wn0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f116327d), java.lang.Integer.valueOf(wn0Var.f116327d)) && n51.f.a(this.f116328e, wn0Var.f116328e) && n51.f.a(this.f116329f, wn0Var.f116329f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.wn0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f116329f;
        java.util.LinkedList linkedList2 = this.f116328e;
        boolean[] zArr = this.f116330g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f116327d);
            }
            fVar.g(2, 2, linkedList2);
            fVar.g(3, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return (zArr[1] ? 0 + b36.f.e(1, this.f116327d) : 0) + b36.f.g(2, 2, linkedList2) + b36.f.g(3, 1, linkedList);
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
            this.f116327d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            linkedList2.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        linkedList.add(aVar2.k(intValue));
        zArr[3] = true;
        return 0;
    }
}
