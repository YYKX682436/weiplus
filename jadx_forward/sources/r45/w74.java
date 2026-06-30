package r45;

/* loaded from: classes8.dex */
public class w74 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f470477d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ua4 f470478e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w74)) {
            return false;
        }
        r45.w74 w74Var = (r45.w74) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f470477d), java.lang.Long.valueOf(w74Var.f470477d)) && n51.f.a(this.f470478e, w74Var.f470478e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f470477d);
            r45.ua4 ua4Var = this.f470478e;
            if (ua4Var != null) {
                fVar.i(2, ua4Var.mo75928xcd1e8d8());
                this.f470478e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f470477d) + 0;
            r45.ua4 ua4Var2 = this.f470478e;
            return ua4Var2 != null ? h17 + b36.f.i(2, ua4Var2.mo75928xcd1e8d8()) : h17;
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
        r45.w74 w74Var = (r45.w74) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            w74Var.f470477d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.ua4 ua4Var3 = new r45.ua4();
            if (bArr != null && bArr.length > 0) {
                ua4Var3.mo11468x92b714fd(bArr);
            }
            w74Var.f470478e = ua4Var3;
        }
        return 0;
    }
}
