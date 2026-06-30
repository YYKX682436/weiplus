package r45;

/* loaded from: classes7.dex */
public class r20 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f465992d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465993e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465994f;

    /* renamed from: g, reason: collision with root package name */
    public int f465995g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f465996h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f465997i;

    /* renamed from: m, reason: collision with root package name */
    public int f465998m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r20)) {
            return false;
        }
        r45.r20 r20Var = (r45.r20) fVar;
        return n51.f.a(this.f76492x92037252, r20Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f465992d), java.lang.Integer.valueOf(r20Var.f465992d)) && n51.f.a(this.f465993e, r20Var.f465993e) && n51.f.a(this.f465994f, r20Var.f465994f) && n51.f.a(java.lang.Integer.valueOf(this.f465995g), java.lang.Integer.valueOf(r20Var.f465995g)) && n51.f.a(this.f465996h, r20Var.f465996h) && n51.f.a(java.lang.Integer.valueOf(this.f465997i), java.lang.Integer.valueOf(r20Var.f465997i)) && n51.f.a(java.lang.Integer.valueOf(this.f465998m), java.lang.Integer.valueOf(r20Var.f465998m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f465996h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f465992d);
            java.lang.String str = this.f465993e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f465994f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f465995g);
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f465997i);
            fVar.e(8, this.f465998m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f465992d);
            java.lang.String str3 = this.f465993e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f465994f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            return i18 + b36.f.e(5, this.f465995g) + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f465997i) + b36.f.e(8, this.f465998m);
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
        r45.r20 r20Var = (r45.r20) objArr[1];
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
                    r20Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                r20Var.f465992d = aVar2.g(intValue);
                return 0;
            case 3:
                r20Var.f465993e = aVar2.k(intValue);
                return 0;
            case 4:
                r20Var.f465994f = aVar2.k(intValue);
                return 0;
            case 5:
                r20Var.f465995g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.vm6 vm6Var = new r45.vm6();
                    if (bArr3 != null && bArr3.length > 0) {
                        vm6Var.mo11468x92b714fd(bArr3);
                    }
                    r20Var.f465996h.add(vm6Var);
                }
                return 0;
            case 7:
                r20Var.f465997i = aVar2.g(intValue);
                return 0;
            case 8:
                r20Var.f465998m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
