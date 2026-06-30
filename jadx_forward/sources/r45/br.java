package r45;

/* loaded from: classes8.dex */
public class br extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f452531d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f452532e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f452533f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452534g;

    /* renamed from: h, reason: collision with root package name */
    public int f452535h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.br)) {
            return false;
        }
        r45.br brVar = (r45.br) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f452531d), java.lang.Long.valueOf(brVar.f452531d)) && n51.f.a(java.lang.Boolean.valueOf(this.f452532e), java.lang.Boolean.valueOf(brVar.f452532e)) && n51.f.a(java.lang.Boolean.valueOf(this.f452533f), java.lang.Boolean.valueOf(brVar.f452533f)) && n51.f.a(this.f452534g, brVar.f452534g) && n51.f.a(java.lang.Integer.valueOf(this.f452535h), java.lang.Integer.valueOf(brVar.f452535h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f452531d);
            fVar.a(2, this.f452532e);
            fVar.a(3, this.f452533f);
            java.lang.String str = this.f452534g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f452535h);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f452531d) + 0 + b36.f.a(2, this.f452532e) + b36.f.a(3, this.f452533f);
            java.lang.String str2 = this.f452534g;
            if (str2 != null) {
                h17 += b36.f.j(4, str2);
            }
            return h17 + b36.f.e(5, this.f452535h);
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
        r45.br brVar = (r45.br) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            brVar.f452531d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            brVar.f452532e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            brVar.f452533f = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 4) {
            brVar.f452534g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        brVar.f452535h = aVar2.g(intValue);
        return 0;
    }
}
