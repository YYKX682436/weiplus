package bw5;

/* loaded from: classes2.dex */
public class pi0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f113197d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f113198e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f113199f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f113201h;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f113200g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f113202i = new boolean[6];

    static {
        new bw5.pi0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pi0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.pi0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pi0)) {
            return false;
        }
        bw5.pi0 pi0Var = (bw5.pi0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f113197d), java.lang.Boolean.valueOf(pi0Var.f113197d)) && n51.f.a(java.lang.Boolean.valueOf(this.f113198e), java.lang.Boolean.valueOf(pi0Var.f113198e)) && n51.f.a(java.lang.Boolean.valueOf(this.f113199f), java.lang.Boolean.valueOf(pi0Var.f113199f)) && n51.f.a(this.f113200g, pi0Var.f113200g) && n51.f.a(java.lang.Boolean.valueOf(this.f113201h), java.lang.Boolean.valueOf(pi0Var.f113201h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.pi0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f113200g;
        boolean[] zArr = this.f113202i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f113197d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f113198e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f113199f);
            }
            fVar.g(4, 2, linkedList);
            if (zArr[5]) {
                fVar.a(5, this.f113201h);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f113197d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f113198e);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f113199f);
            }
            int g17 = a17 + b36.f.g(4, 2, linkedList);
            return zArr[5] ? g17 + b36.f.a(5, this.f113201h) : g17;
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
        if (intValue == 1) {
            this.f113197d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f113198e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f113199f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f113201h = aVar2.c(intValue);
        zArr[5] = true;
        return 0;
    }
}
