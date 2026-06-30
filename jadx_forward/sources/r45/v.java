package r45;

/* loaded from: classes8.dex */
public class v extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f469304d = 268513600;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469305e = "请求不成功，请稍候再试";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469306f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469307g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469308h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469309i;

    /* renamed from: m, reason: collision with root package name */
    public r45.a f469310m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f469311n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v)) {
            return false;
        }
        r45.v vVar = (r45.v) fVar;
        return n51.f.a(this.f76492x92037252, vVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f469304d), java.lang.Integer.valueOf(vVar.f469304d)) && n51.f.a(this.f469305e, vVar.f469305e) && n51.f.a(this.f469306f, vVar.f469306f) && n51.f.a(this.f469307g, vVar.f469307g) && n51.f.a(this.f469308h, vVar.f469308h) && n51.f.a(this.f469309i, vVar.f469309i) && n51.f.a(this.f469310m, vVar.f469310m) && n51.f.a(this.f469311n, vVar.f469311n);
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
            fVar.e(2, this.f469304d);
            java.lang.String str = this.f469305e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f469306f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f469307g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f469308h;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f469309i;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            r45.a aVar = this.f469310m;
            if (aVar != null) {
                fVar.i(9, aVar.mo75928xcd1e8d8());
                this.f469310m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str6 = this.f469311n;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f469304d);
            java.lang.String str7 = this.f469305e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f469306f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f469307g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f469308h;
            if (str10 != null) {
                i18 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f469309i;
            if (str11 != null) {
                i18 += b36.f.j(8, str11);
            }
            r45.a aVar2 = this.f469310m;
            if (aVar2 != null) {
                i18 += b36.f.i(9, aVar2.mo75928xcd1e8d8());
            }
            java.lang.String str12 = this.f469311n;
            return str12 != null ? i18 + b36.f.j(10, str12) : i18;
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3)) {
                if (!super.mo75949x4476b383(aVar3, this, m75958x5767edba)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        r45.v vVar = (r45.v) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    vVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                vVar.f469304d = aVar4.g(intValue);
                return 0;
            case 3:
                vVar.f469305e = aVar4.k(intValue);
                return 0;
            case 4:
                vVar.f469306f = aVar4.k(intValue);
                return 0;
            case 5:
                vVar.f469307g = aVar4.k(intValue);
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                vVar.f469308h = aVar4.k(intValue);
                return 0;
            case 8:
                vVar.f469309i = aVar4.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.a aVar5 = new r45.a();
                    if (bArr2 != null && bArr2.length > 0) {
                        aVar5.mo11468x92b714fd(bArr2);
                    }
                    vVar.f469310m = aVar5;
                }
                return 0;
            case 10:
                vVar.f469311n = aVar4.k(intValue);
                return 0;
        }
    }
}
