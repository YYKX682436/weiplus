package s45;

/* loaded from: classes4.dex */
public class b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f484499d;

    /* renamed from: e, reason: collision with root package name */
    public int f484500e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f484501f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f484502g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f484503h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f484504i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof s45.b)) {
            return false;
        }
        s45.b bVar = (s45.b) fVar;
        return n51.f.a(this.f484499d, bVar.f484499d) && n51.f.a(java.lang.Integer.valueOf(this.f484500e), java.lang.Integer.valueOf(bVar.f484500e)) && n51.f.a(this.f484501f, bVar.f484501f) && n51.f.a(java.lang.Boolean.valueOf(this.f484502g), java.lang.Boolean.valueOf(bVar.f484502g)) && n51.f.a(java.lang.Boolean.valueOf(this.f484503h), java.lang.Boolean.valueOf(bVar.f484503h)) && n51.f.a(java.lang.Boolean.valueOf(this.f484504i), java.lang.Boolean.valueOf(bVar.f484504i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f484499d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f484500e);
            java.lang.String str2 = this.f484501f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(5, this.f484502g);
            fVar.a(11, this.f484503h);
            fVar.a(12, this.f484504i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f484499d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f484500e);
            java.lang.String str4 = this.f484501f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.a(5, this.f484502g) + b36.f.a(11, this.f484503h) + b36.f.a(12, this.f484504i);
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
        s45.b bVar = (s45.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bVar.f484499d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            bVar.f484500e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            bVar.f484501f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 5) {
            bVar.f484502g = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 11) {
            bVar.f484503h = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 12) {
            return -1;
        }
        bVar.f484504i = aVar2.c(intValue);
        return 0;
    }
}
