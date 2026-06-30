package bw5;

/* loaded from: classes2.dex */
public class e0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: g, reason: collision with root package name */
    public static final bw5.e0 f108204g = new bw5.e0();

    /* renamed from: d, reason: collision with root package name */
    public bw5.ev f108205d;

    /* renamed from: e, reason: collision with root package name */
    public long f108206e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f108207f = new boolean[3];

    public bw5.ev b() {
        return this.f108207f[1] ? this.f108205d : new bw5.ev();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e0)) {
            return false;
        }
        bw5.e0 e0Var = (bw5.e0) fVar;
        return n51.f.a(this.f108205d, e0Var.f108205d) && n51.f.a(java.lang.Long.valueOf(this.f108206e), java.lang.Long.valueOf(e0Var.f108206e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.e0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108207f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ev evVar = this.f108205d;
            if (evVar != null && zArr[1]) {
                fVar.i(1, evVar.mo75928xcd1e8d8());
                this.f108205d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f108206e);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ev evVar2 = this.f108205d;
            if (evVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, evVar2.mo75928xcd1e8d8());
            }
            return zArr[2] ? i18 + b36.f.h(2, this.f108206e) : i18;
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
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            this.f108206e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.ev evVar3 = new bw5.ev();
            if (bArr != null && bArr.length > 0) {
                evVar3.mo11468x92b714fd(bArr);
            }
            this.f108205d = evVar3;
        }
        zArr[1] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.e0) super.mo11468x92b714fd(bArr);
    }
}
