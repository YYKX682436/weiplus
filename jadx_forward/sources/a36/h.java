package a36;

/* loaded from: classes9.dex */
public class h extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f82678d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f82679e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f82680f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f82681g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof a36.h)) {
            return false;
        }
        a36.h hVar = (a36.h) fVar;
        return n51.f.a(this.f82678d, hVar.f82678d) && n51.f.a(this.f82679e, hVar.f82679e) && n51.f.a(this.f82680f, hVar.f82680f) && n51.f.a(this.f82681g, hVar.f82681g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f82678d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f82679e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f82680f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f82681g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f82678d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f82679e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f82680f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f82681g;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
        a36.h hVar = (a36.h) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hVar.f82678d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            hVar.f82679e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            hVar.f82680f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        hVar.f82681g = aVar2.k(intValue);
        return 0;
    }
}
