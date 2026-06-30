package p33;

/* loaded from: classes2.dex */
public class h extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f433112d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f433113e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f433114f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f433115g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f433116h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f433117i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p33.h)) {
            return false;
        }
        p33.h hVar = (p33.h) fVar;
        return n51.f.a(this.f76492x92037252, hVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f433112d), java.lang.Integer.valueOf(hVar.f433112d)) && n51.f.a(this.f433113e, hVar.f433113e) && n51.f.a(this.f433114f, hVar.f433114f) && n51.f.a(java.lang.Boolean.valueOf(this.f433115g), java.lang.Boolean.valueOf(hVar.f433115g)) && n51.f.a(java.lang.Integer.valueOf(this.f433116h), java.lang.Integer.valueOf(hVar.f433116h)) && n51.f.a(this.f433117i, hVar.f433117i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f433112d);
            java.lang.String str = this.f433113e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f433114f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.a(5, this.f433115g);
            fVar.e(6, this.f433116h);
            java.lang.String str3 = this.f433117i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f433112d);
            java.lang.String str4 = this.f433113e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f433114f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            int a17 = i18 + b36.f.a(5, this.f433115g) + b36.f.e(6, this.f433116h);
            java.lang.String str6 = this.f433117i;
            return str6 != null ? a17 + b36.f.j(7, str6) : a17;
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
        p33.h hVar = (p33.h) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    hVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                hVar.f433112d = aVar2.g(intValue);
                return 0;
            case 3:
                hVar.f433113e = aVar2.k(intValue);
                return 0;
            case 4:
                hVar.f433114f = aVar2.k(intValue);
                return 0;
            case 5:
                hVar.f433115g = aVar2.c(intValue);
                return 0;
            case 6:
                hVar.f433116h = aVar2.g(intValue);
                return 0;
            case 7:
                hVar.f433117i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
