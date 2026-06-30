package bw5;

/* loaded from: classes11.dex */
public class w0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: f, reason: collision with root package name */
    public static final bw5.w0 f116078f = new bw5.w0();

    /* renamed from: d, reason: collision with root package name */
    public bw5.v0 f116079d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f116080e = new java.util.LinkedList();

    public java.util.LinkedList b() {
        return this.f116080e;
    }

    public bw5.v0 c() {
        return this.f116079d;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.w0)) {
            return false;
        }
        bw5.w0 w0Var = (bw5.w0) fVar;
        return n51.f.a(this.f116079d, w0Var.f116079d) && n51.f.a(this.f116080e, w0Var.f116080e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.w0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f116080e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.v0 v0Var = this.f116079d;
            if (v0Var != null) {
                fVar.i(1, v0Var.mo75928xcd1e8d8());
                this.f116079d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.v0 v0Var2 = this.f116079d;
            return (v0Var2 != null ? 0 + b36.f.i(1, v0Var2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList);
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
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.v0 v0Var3 = new bw5.v0();
                if (bArr != null && bArr.length > 0) {
                    v0Var3.mo11468x92b714fd(bArr);
                }
                this.f116079d = v0Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.t0 t0Var = new bw5.t0();
            if (bArr2 != null && bArr2.length > 0) {
                t0Var.mo11468x92b714fd(bArr2);
            }
            linkedList.add(t0Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.w0) super.mo11468x92b714fd(bArr);
    }
}
