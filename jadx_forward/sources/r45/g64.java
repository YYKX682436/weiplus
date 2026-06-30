package r45;

/* loaded from: classes8.dex */
public class g64 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f456450d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f456451e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f456452f;

    /* renamed from: g, reason: collision with root package name */
    public int f456453g;

    /* renamed from: h, reason: collision with root package name */
    public int f456454h;

    /* renamed from: i, reason: collision with root package name */
    public int f456455i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g64)) {
            return false;
        }
        r45.g64 g64Var = (r45.g64) fVar;
        return n51.f.a(this.f76492x92037252, g64Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f456450d), java.lang.Integer.valueOf(g64Var.f456450d)) && n51.f.a(this.f456451e, g64Var.f456451e) && n51.f.a(java.lang.Integer.valueOf(this.f456452f), java.lang.Integer.valueOf(g64Var.f456452f)) && n51.f.a(java.lang.Integer.valueOf(this.f456453g), java.lang.Integer.valueOf(g64Var.f456453g)) && n51.f.a(java.lang.Integer.valueOf(this.f456454h), java.lang.Integer.valueOf(g64Var.f456454h)) && n51.f.a(java.lang.Integer.valueOf(this.f456455i), java.lang.Integer.valueOf(g64Var.f456455i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f456451e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f456450d);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f456452f);
            fVar.e(5, this.f456453g);
            fVar.e(6, this.f456454h);
            fVar.e(7, this.f456455i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f456450d) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f456452f) + b36.f.e(5, this.f456453g) + b36.f.e(6, this.f456454h) + b36.f.e(7, this.f456455i);
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
        r45.g64 g64Var = (r45.g64) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    g64Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                g64Var.f456450d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.b64 b64Var = new r45.b64();
                    if (bArr3 != null && bArr3.length > 0) {
                        b64Var.mo11468x92b714fd(bArr3);
                    }
                    g64Var.f456451e.add(b64Var);
                }
                return 0;
            case 4:
                g64Var.f456452f = aVar2.g(intValue);
                return 0;
            case 5:
                g64Var.f456453g = aVar2.g(intValue);
                return 0;
            case 6:
                g64Var.f456454h = aVar2.g(intValue);
                return 0;
            case 7:
                g64Var.f456455i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
