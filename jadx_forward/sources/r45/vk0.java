package r45;

/* loaded from: classes8.dex */
public class vk0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f469845d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f469846e;

    /* renamed from: f, reason: collision with root package name */
    public r45.l05 f469847f;

    /* renamed from: g, reason: collision with root package name */
    public int f469848g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vk0)) {
            return false;
        }
        r45.vk0 vk0Var = (r45.vk0) fVar;
        return n51.f.a(this.f469845d, vk0Var.f469845d) && n51.f.a(this.f469846e, vk0Var.f469846e) && n51.f.a(this.f469847f, vk0Var.f469847f) && n51.f.a(java.lang.Integer.valueOf(this.f469848g), java.lang.Integer.valueOf(vk0Var.f469848g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f469845d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f469846e;
            if (gVar2 != null) {
                fVar.b(2, gVar2);
            }
            r45.l05 l05Var = this.f469847f;
            if (l05Var != null) {
                fVar.i(3, l05Var.mo75928xcd1e8d8());
                this.f469847f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f469848g);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f469845d;
            int b17 = gVar3 != null ? 0 + b36.f.b(1, gVar3) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f469846e;
            if (gVar4 != null) {
                b17 += b36.f.b(2, gVar4);
            }
            r45.l05 l05Var2 = this.f469847f;
            if (l05Var2 != null) {
                b17 += b36.f.i(3, l05Var2.mo75928xcd1e8d8());
            }
            return b17 + b36.f.e(4, this.f469848g);
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
        r45.vk0 vk0Var = (r45.vk0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vk0Var.f469845d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            vk0Var.f469846e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            vk0Var.f469848g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.l05 l05Var3 = new r45.l05();
            if (bArr != null && bArr.length > 0) {
                l05Var3.mo11468x92b714fd(bArr);
            }
            vk0Var.f469847f = l05Var3;
        }
        return 0;
    }
}
