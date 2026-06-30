package bw5;

/* loaded from: classes2.dex */
public class l3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f111150d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f111151e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f111152f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f111153g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f111154h = new boolean[5];

    static {
        new bw5.l3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.l3 mo11468x92b714fd(byte[] bArr) {
        return (bw5.l3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l3)) {
            return false;
        }
        bw5.l3 l3Var = (bw5.l3) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f111150d), java.lang.Boolean.valueOf(l3Var.f111150d)) && n51.f.a(this.f111151e, l3Var.f111151e) && n51.f.a(this.f111152f, l3Var.f111152f) && n51.f.a(this.f111153g, l3Var.f111153g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.l3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f111153g;
        java.util.LinkedList linkedList2 = this.f111152f;
        java.util.LinkedList linkedList3 = this.f111151e;
        boolean[] zArr = this.f111154h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f111150d);
            }
            fVar.g(2, 2, linkedList3);
            fVar.g(3, 2, linkedList2);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return (zArr[1] ? 0 + b36.f.a(1, this.f111150d) : 0) + b36.f.g(2, 2, linkedList3) + b36.f.g(3, 2, linkedList2) + b36.f.g(4, 8, linkedList);
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
            this.f111150d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            linkedList3.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            linkedList2.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.k3 k3Var = new bw5.k3();
            if (bArr != null && bArr.length > 0) {
                k3Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(k3Var);
        }
        zArr[4] = true;
        return 0;
    }
}
