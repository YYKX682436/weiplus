package r45;

/* loaded from: classes8.dex */
public class oc3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463677d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463678e;

    /* renamed from: f, reason: collision with root package name */
    public r45.yu f463679f;

    /* renamed from: g, reason: collision with root package name */
    public int f463680g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ay5 f463681h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oc3)) {
            return false;
        }
        r45.oc3 oc3Var = (r45.oc3) fVar;
        return n51.f.a(this.f76492x92037252, oc3Var.f76492x92037252) && n51.f.a(this.f463677d, oc3Var.f463677d) && n51.f.a(this.f463678e, oc3Var.f463678e) && n51.f.a(this.f463679f, oc3Var.f463679f) && n51.f.a(java.lang.Integer.valueOf(this.f463680g), java.lang.Integer.valueOf(oc3Var.f463680g)) && n51.f.a(this.f463681h, oc3Var.f463681h);
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
            java.lang.String str = this.f463677d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f463678e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.yu yuVar = this.f463679f;
            if (yuVar != null) {
                fVar.i(4, yuVar.mo75928xcd1e8d8());
                this.f463679f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f463680g);
            r45.ay5 ay5Var = this.f463681h;
            if (ay5Var != null) {
                fVar.i(6, ay5Var.mo75928xcd1e8d8());
                this.f463681h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f463677d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f463678e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            r45.yu yuVar2 = this.f463679f;
            if (yuVar2 != null) {
                i18 += b36.f.i(4, yuVar2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(5, this.f463680g);
            r45.ay5 ay5Var2 = this.f463681h;
            return ay5Var2 != null ? e17 + b36.f.i(6, ay5Var2.mo75928xcd1e8d8()) : e17;
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
        r45.oc3 oc3Var = (r45.oc3) objArr[1];
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
                    oc3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                oc3Var.f463677d = aVar2.k(intValue);
                return 0;
            case 3:
                oc3Var.f463678e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.yu yuVar3 = new r45.yu();
                    if (bArr2 != null && bArr2.length > 0) {
                        yuVar3.mo11468x92b714fd(bArr2);
                    }
                    oc3Var.f463679f = yuVar3;
                }
                return 0;
            case 5:
                oc3Var.f463680g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ay5 ay5Var3 = new r45.ay5();
                    if (bArr3 != null && bArr3.length > 0) {
                        ay5Var3.mo11468x92b714fd(bArr3);
                    }
                    oc3Var.f463681h = ay5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
