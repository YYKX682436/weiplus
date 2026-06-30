package r45;

/* loaded from: classes12.dex */
public class r27 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f466022d;

    /* renamed from: e, reason: collision with root package name */
    public long f466023e;

    /* renamed from: f, reason: collision with root package name */
    public int f466024f;

    /* renamed from: g, reason: collision with root package name */
    public int f466025g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f466026h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f466027i;

    /* renamed from: m, reason: collision with root package name */
    public int f466028m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r27)) {
            return false;
        }
        r45.r27 r27Var = (r45.r27) fVar;
        return n51.f.a(this.f76492x92037252, r27Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f466022d), java.lang.Integer.valueOf(r27Var.f466022d)) && n51.f.a(java.lang.Long.valueOf(this.f466023e), java.lang.Long.valueOf(r27Var.f466023e)) && n51.f.a(java.lang.Integer.valueOf(this.f466024f), java.lang.Integer.valueOf(r27Var.f466024f)) && n51.f.a(java.lang.Integer.valueOf(this.f466025g), java.lang.Integer.valueOf(r27Var.f466025g)) && n51.f.a(this.f466026h, r27Var.f466026h) && n51.f.a(this.f466027i, r27Var.f466027i) && n51.f.a(java.lang.Integer.valueOf(this.f466028m), java.lang.Integer.valueOf(r27Var.f466028m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f466026h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f466022d);
            fVar.h(3, this.f466023e);
            fVar.e(4, this.f466024f);
            fVar.e(6, this.f466025g);
            fVar.g(7, 8, linkedList);
            java.lang.String str = this.f466027i;
            if (str != null) {
                fVar.j(8, str);
            }
            fVar.e(9, this.f466028m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f466022d) + b36.f.h(3, this.f466023e) + b36.f.e(4, this.f466024f) + b36.f.e(6, this.f466025g) + b36.f.g(7, 8, linkedList);
            java.lang.String str2 = this.f466027i;
            if (str2 != null) {
                i18 += b36.f.j(8, str2);
            }
            return i18 + b36.f.e(9, this.f466028m);
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
        r45.r27 r27Var = (r45.r27) objArr[1];
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
                    r27Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                r27Var.f466022d = aVar2.g(intValue);
                return 0;
            case 3:
                r27Var.f466023e = aVar2.i(intValue);
                return 0;
            case 4:
                r27Var.f466024f = aVar2.g(intValue);
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                r27Var.f466025g = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.v37 v37Var = new r45.v37();
                    if (bArr3 != null && bArr3.length > 0) {
                        v37Var.mo11468x92b714fd(bArr3);
                    }
                    r27Var.f466026h.add(v37Var);
                }
                return 0;
            case 8:
                r27Var.f466027i = aVar2.k(intValue);
                return 0;
            case 9:
                r27Var.f466028m = aVar2.g(intValue);
                return 0;
        }
    }
}
