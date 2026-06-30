package bw5;

/* loaded from: classes8.dex */
public class u5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f115268d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115269e;

    /* renamed from: f, reason: collision with root package name */
    public int f115270f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.b30 f115271g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f115272h = new boolean[5];

    static {
        new bw5.u5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.u5 mo11468x92b714fd(byte[] bArr) {
        return (bw5.u5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.u5)) {
            return false;
        }
        bw5.u5 u5Var = (bw5.u5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f115268d), java.lang.Long.valueOf(u5Var.f115268d)) && n51.f.a(this.f115269e, u5Var.f115269e) && n51.f.a(java.lang.Integer.valueOf(this.f115270f), java.lang.Integer.valueOf(u5Var.f115270f)) && n51.f.a(this.f115271g, u5Var.f115271g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.u5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115272h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f115268d);
            }
            java.lang.String str = this.f115269e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f115270f);
            }
            bw5.b30 b30Var = this.f115271g;
            if (b30Var != null && zArr[4]) {
                fVar.i(4, b30Var.mo75928xcd1e8d8());
                this.f115271g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f115268d) : 0;
            java.lang.String str2 = this.f115269e;
            if (str2 != null && zArr[2]) {
                h17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f115270f);
            }
            bw5.b30 b30Var2 = this.f115271g;
            return (b30Var2 == null || !zArr[4]) ? h17 : h17 + b36.f.i(4, b30Var2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
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
            this.f115268d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f115269e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f115270f = aVar2.g(intValue);
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
            bw5.b30 b30Var3 = new bw5.b30();
            if (bArr != null && bArr.length > 0) {
                b30Var3.mo11468x92b714fd(bArr);
            }
            this.f115271g = b30Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
