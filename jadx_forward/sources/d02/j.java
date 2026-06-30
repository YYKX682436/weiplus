package d02;

/* loaded from: classes2.dex */
public class j extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f306855d;

    /* renamed from: e, reason: collision with root package name */
    public long f306856e;

    /* renamed from: f, reason: collision with root package name */
    public d02.m f306857f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f306858g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f306859h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f306860i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof d02.j)) {
            return false;
        }
        d02.j jVar = (d02.j) fVar;
        return n51.f.a(this.f306855d, jVar.f306855d) && n51.f.a(java.lang.Long.valueOf(this.f306856e), java.lang.Long.valueOf(jVar.f306856e)) && n51.f.a(this.f306857f, jVar.f306857f) && n51.f.a(this.f306858g, jVar.f306858g) && n51.f.a(this.f306859h, jVar.f306859h) && n51.f.a(this.f306860i, jVar.f306860i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f306855d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f306856e);
            d02.m mVar = this.f306857f;
            if (mVar != null) {
                fVar.i(3, mVar.mo75928xcd1e8d8());
                this.f306857f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f306858g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f306859h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f306860i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f306855d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.h(2, this.f306856e);
            d02.m mVar2 = this.f306857f;
            if (mVar2 != null) {
                j17 += b36.f.i(3, mVar2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f306858g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f306859h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f306860i;
            return str8 != null ? j17 + b36.f.j(6, str8) : j17;
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
        d02.j jVar = (d02.j) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jVar.f306855d = aVar2.k(intValue);
                return 0;
            case 2:
                jVar.f306856e = aVar2.i(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    d02.m mVar3 = new d02.m();
                    if (bArr != null && bArr.length > 0) {
                        mVar3.mo11468x92b714fd(bArr);
                    }
                    jVar.f306857f = mVar3;
                }
                return 0;
            case 4:
                jVar.f306858g = aVar2.k(intValue);
                return 0;
            case 5:
                jVar.f306859h = aVar2.k(intValue);
                return 0;
            case 6:
                jVar.f306860i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
