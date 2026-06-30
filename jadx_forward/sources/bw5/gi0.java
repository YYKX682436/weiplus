package bw5;

/* loaded from: classes9.dex */
public class gi0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f109398d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f109399e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f109400f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f109401g = new boolean[5];

    static {
        new bw5.gi0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gi0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.gi0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gi0)) {
            return false;
        }
        bw5.gi0 gi0Var = (bw5.gi0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f109398d), java.lang.Long.valueOf(gi0Var.f109398d)) && n51.f.a(this.f109399e, gi0Var.f109399e) && n51.f.a(this.f109400f, gi0Var.f109400f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.gi0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f109400f;
        java.util.LinkedList linkedList2 = this.f109399e;
        boolean[] zArr = this.f109401g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f109398d);
            }
            fVar.g(3, 1, linkedList2);
            fVar.g(4, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return (zArr[1] ? 0 + b36.f.h(1, this.f109398d) : 0) + b36.f.g(3, 1, linkedList2) + b36.f.g(4, 2, linkedList);
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
            this.f109398d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 3) {
            linkedList2.add(aVar2.k(intValue));
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
        zArr[4] = true;
        return 0;
    }
}
