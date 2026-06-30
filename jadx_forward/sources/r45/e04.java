package r45;

/* loaded from: classes4.dex */
public class e04 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454423d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454424e;

    /* renamed from: f, reason: collision with root package name */
    public int f454425f;

    /* renamed from: g, reason: collision with root package name */
    public int f454426g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454427h;

    /* renamed from: i, reason: collision with root package name */
    public long f454428i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e04)) {
            return false;
        }
        r45.e04 e04Var = (r45.e04) fVar;
        return n51.f.a(this.f454423d, e04Var.f454423d) && n51.f.a(this.f454424e, e04Var.f454424e) && n51.f.a(java.lang.Integer.valueOf(this.f454425f), java.lang.Integer.valueOf(e04Var.f454425f)) && n51.f.a(java.lang.Integer.valueOf(this.f454426g), java.lang.Integer.valueOf(e04Var.f454426g)) && n51.f.a(this.f454427h, e04Var.f454427h) && n51.f.a(java.lang.Long.valueOf(this.f454428i), java.lang.Long.valueOf(e04Var.f454428i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454423d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f454424e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f454425f);
            fVar.e(4, this.f454426g);
            java.lang.String str3 = this.f454427h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.h(99, this.f454428i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f454423d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f454424e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f454425f) + b36.f.e(4, this.f454426g);
            java.lang.String str6 = this.f454427h;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            return e17 + b36.f.h(99, this.f454428i);
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
        r45.e04 e04Var = (r45.e04) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e04Var.f454423d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            e04Var.f454424e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            e04Var.f454425f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            e04Var.f454426g = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            e04Var.f454427h = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 99) {
            return -1;
        }
        e04Var.f454428i = aVar2.i(intValue);
        return 0;
    }
}
