package r45;

/* loaded from: classes2.dex */
public class tk0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f468047d;

    /* renamed from: e, reason: collision with root package name */
    public int f468048e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f468049f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tk0)) {
            return false;
        }
        r45.tk0 tk0Var = (r45.tk0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f468047d), java.lang.Long.valueOf(tk0Var.f468047d)) && n51.f.a(java.lang.Integer.valueOf(this.f468048e), java.lang.Integer.valueOf(tk0Var.f468048e)) && n51.f.a(this.f468049f, tk0Var.f468049f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f468047d);
            fVar.e(2, this.f468048e);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f468049f;
            if (c19792x256d2725 != null) {
                fVar.i(3, c19792x256d2725.mo75928xcd1e8d8());
                this.f468049f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f468047d) + 0 + b36.f.e(2, this.f468048e);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = this.f468049f;
            return c19792x256d27252 != null ? h17 + b36.f.i(3, c19792x256d27252.mo75928xcd1e8d8()) : h17;
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
        r45.tk0 tk0Var = (r45.tk0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tk0Var.f468047d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            tk0Var.f468048e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
            if (bArr != null && bArr.length > 0) {
                c19792x256d27253.mo11468x92b714fd(bArr);
            }
            tk0Var.f468049f = c19792x256d27253;
        }
        return 0;
    }
}
