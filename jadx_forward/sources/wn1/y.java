package wn1;

/* loaded from: classes11.dex */
public class y extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f529043d;

    /* renamed from: e, reason: collision with root package name */
    public long f529044e;

    /* renamed from: f, reason: collision with root package name */
    public long f529045f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f529046g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.y)) {
            return false;
        }
        wn1.y yVar = (wn1.y) fVar;
        return n51.f.a(this.f529043d, yVar.f529043d) && n51.f.a(java.lang.Long.valueOf(this.f529044e), java.lang.Long.valueOf(yVar.f529044e)) && n51.f.a(java.lang.Long.valueOf(this.f529045f), java.lang.Long.valueOf(yVar.f529045f)) && n51.f.a(this.f529046g, yVar.f529046g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f529043d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f529044e);
            fVar.h(3, this.f529045f);
            java.lang.String str2 = this.f529046g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f529043d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f529044e) + b36.f.h(3, this.f529045f);
            java.lang.String str4 = this.f529046g;
            return str4 != null ? j17 + b36.f.j(4, str4) : j17;
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
        wn1.y yVar = (wn1.y) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yVar.f529043d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            yVar.f529044e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            yVar.f529045f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        yVar.f529046g = aVar2.k(intValue);
        return 0;
    }
}
