package bw5;

/* loaded from: classes11.dex */
public class t0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f114735d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f114736e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f114737f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f114738g = new java.util.LinkedList();

    static {
        new bw5.t0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.t0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.t0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t0)) {
            return false;
        }
        bw5.t0 t0Var = (bw5.t0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f114735d), java.lang.Long.valueOf(t0Var.f114735d)) && n51.f.a(this.f114736e, t0Var.f114736e) && n51.f.a(this.f114737f, t0Var.f114737f) && n51.f.a(this.f114738g, t0Var.f114738g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.t0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f114738g;
        java.util.LinkedList linkedList2 = this.f114737f;
        java.util.LinkedList linkedList3 = this.f114736e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f114735d);
            fVar.g(2, 1, linkedList3);
            fVar.g(3, 2, linkedList2);
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f114735d) + 0 + b36.f.g(2, 1, linkedList3) + b36.f.g(3, 2, linkedList2) + b36.f.g(4, 1, linkedList);
        }
        if (i17 == 2) {
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
        if (intValue == 1) {
            this.f114735d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            linkedList3.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            linkedList2.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        linkedList.add(aVar2.k(intValue));
        return 0;
    }
}
