package r45;

/* loaded from: classes4.dex */
public class hf6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f457653d;

    /* renamed from: e, reason: collision with root package name */
    public int f457654e;

    /* renamed from: f, reason: collision with root package name */
    public r45.if6 f457655f;

    /* renamed from: g, reason: collision with root package name */
    public r45.if6 f457656g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hf6)) {
            return false;
        }
        r45.hf6 hf6Var = (r45.hf6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f457653d), java.lang.Long.valueOf(hf6Var.f457653d)) && n51.f.a(java.lang.Integer.valueOf(this.f457654e), java.lang.Integer.valueOf(hf6Var.f457654e)) && n51.f.a(this.f457655f, hf6Var.f457655f) && n51.f.a(this.f457656g, hf6Var.f457656g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f457653d);
            fVar.e(2, this.f457654e);
            r45.if6 if6Var = this.f457655f;
            if (if6Var != null) {
                fVar.i(3, if6Var.mo75928xcd1e8d8());
                this.f457655f.mo75956x3d5d1f78(fVar);
            }
            r45.if6 if6Var2 = this.f457656g;
            if (if6Var2 != null) {
                fVar.i(4, if6Var2.mo75928xcd1e8d8());
                this.f457656g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f457653d) + 0 + b36.f.e(2, this.f457654e);
            r45.if6 if6Var3 = this.f457655f;
            if (if6Var3 != null) {
                h17 += b36.f.i(3, if6Var3.mo75928xcd1e8d8());
            }
            r45.if6 if6Var4 = this.f457656g;
            return if6Var4 != null ? h17 + b36.f.i(4, if6Var4.mo75928xcd1e8d8()) : h17;
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
        r45.hf6 hf6Var = (r45.hf6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hf6Var.f457653d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            hf6Var.f457654e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.if6 if6Var5 = new r45.if6();
                if (bArr != null && bArr.length > 0) {
                    if6Var5.mo11468x92b714fd(bArr);
                }
                hf6Var.f457655f = if6Var5;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.if6 if6Var6 = new r45.if6();
            if (bArr2 != null && bArr2.length > 0) {
                if6Var6.mo11468x92b714fd(bArr2);
            }
            hf6Var.f457656g = if6Var6;
        }
        return 0;
    }
}
