package bw5;

/* loaded from: classes2.dex */
public class ek0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: g, reason: collision with root package name */
    public static final bw5.ek0 f108475g = new bw5.ek0();

    /* renamed from: d, reason: collision with root package name */
    public bw5.jk0 f108476d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f108477e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f108478f = new boolean[3];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ek0)) {
            return false;
        }
        bw5.ek0 ek0Var = (bw5.ek0) fVar;
        return n51.f.a(this.f108476d, ek0Var.f108476d) && n51.f.a(this.f108477e, ek0Var.f108477e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ek0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108478f;
        java.util.LinkedList linkedList = this.f108477e;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.jk0 jk0Var = this.f108476d;
            if (jk0Var != null && zArr[1]) {
                fVar.i(1, jk0Var.mo75928xcd1e8d8());
                this.f108476d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.jk0 jk0Var2 = this.f108476d;
            if (jk0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, jk0Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.g(2, 8, linkedList);
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.jk0 jk0Var3 = new bw5.jk0();
                if (bArr != null && bArr.length > 0) {
                    jk0Var3.mo11468x92b714fd(bArr);
                }
                this.f108476d = jk0Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.dk0 dk0Var = new bw5.dk0();
            if (bArr2 != null && bArr2.length > 0) {
                dk0Var.mo11468x92b714fd(bArr2);
            }
            linkedList.add(dk0Var);
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.ek0) super.mo11468x92b714fd(bArr);
    }
}
