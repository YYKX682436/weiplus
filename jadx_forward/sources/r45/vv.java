package r45;

/* loaded from: classes8.dex */
public class vv extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f470126d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470127e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470128f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470129g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f470130h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f470131i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vv)) {
            return false;
        }
        r45.vv vvVar = (r45.vv) fVar;
        return n51.f.a(this.f76492x92037252, vvVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f470126d), java.lang.Integer.valueOf(vvVar.f470126d)) && n51.f.a(this.f470127e, vvVar.f470127e) && n51.f.a(this.f470128f, vvVar.f470128f) && n51.f.a(this.f470129g, vvVar.f470129g) && n51.f.a(this.f470130h, vvVar.f470130h) && n51.f.a(java.lang.Integer.valueOf(this.f470131i), java.lang.Integer.valueOf(vvVar.f470131i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470130h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f470126d);
            java.lang.String str = this.f470127e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f470128f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f470129g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f470131i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f470126d);
            java.lang.String str4 = this.f470127e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f470128f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f470129g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            return i18 + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f470131i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.vv vvVar = (r45.vv) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    vvVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                vvVar.f470126d = aVar2.g(intValue);
                return 0;
            case 3:
                vvVar.f470127e = aVar2.k(intValue);
                return 0;
            case 4:
                vvVar.f470128f = aVar2.k(intValue);
                return 0;
            case 5:
                vvVar.f470129g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.sn0 sn0Var = new r45.sn0();
                    if (bArr3 != null && bArr3.length > 0) {
                        sn0Var.mo11468x92b714fd(bArr3);
                    }
                    vvVar.f470130h.add(sn0Var);
                }
                return 0;
            case 7:
                vvVar.f470131i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
