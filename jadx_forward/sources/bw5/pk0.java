package bw5;

/* loaded from: classes4.dex */
public class pk0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f113241d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113242e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f113243f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f113244g = new boolean[4];

    static {
        new bw5.pk0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pk0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.pk0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pk0)) {
            return false;
        }
        bw5.pk0 pk0Var = (bw5.pk0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f113241d), java.lang.Long.valueOf(pk0Var.f113241d)) && n51.f.a(this.f113242e, pk0Var.f113242e) && n51.f.a(this.f113243f, pk0Var.f113243f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.pk0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113244g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f113241d);
            }
            java.lang.String str = this.f113242e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, this.f113243f);
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f113241d) : 0;
            java.lang.String str2 = this.f113242e;
            if (str2 != null && zArr[2]) {
                h17 += b36.f.j(2, str2);
            }
            return h17 + b36.f.g(3, 8, this.f113243f);
        }
        if (i17 == 2) {
            this.f113243f.clear();
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
            this.f113241d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f113242e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.ok0 ok0Var = new bw5.ok0();
            if (bArr != null && bArr.length > 0) {
                ok0Var.mo11468x92b714fd(bArr);
            }
            this.f113243f.add(ok0Var);
        }
        zArr[3] = true;
        return 0;
    }
}
