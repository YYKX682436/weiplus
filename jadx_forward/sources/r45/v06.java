package r45;

/* loaded from: classes11.dex */
public class v06 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: h, reason: collision with root package name */
    public r45.w06 f469322h;

    /* renamed from: d, reason: collision with root package name */
    public boolean f469318d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f469319e = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f469320f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f469321g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f469323i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v06)) {
            return false;
        }
        r45.v06 v06Var = (r45.v06) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f469318d), java.lang.Boolean.valueOf(v06Var.f469318d)) && n51.f.a(java.lang.Boolean.valueOf(this.f469319e), java.lang.Boolean.valueOf(v06Var.f469319e)) && n51.f.a(this.f469320f, v06Var.f469320f) && n51.f.a(this.f469321g, v06Var.f469321g) && n51.f.a(this.f469322h, v06Var.f469322h) && n51.f.a(this.f469323i, v06Var.f469323i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469323i;
        java.util.LinkedList linkedList2 = this.f469321g;
        java.util.LinkedList linkedList3 = this.f469320f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f469318d);
            fVar.a(2, this.f469319e);
            fVar.g(3, 8, linkedList3);
            fVar.g(4, 8, linkedList2);
            r45.w06 w06Var = this.f469322h;
            if (w06Var != null) {
                fVar.i(5, w06Var.mo75928xcd1e8d8());
                this.f469322h.mo75956x3d5d1f78(fVar);
            }
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f469318d) + 0 + b36.f.a(2, this.f469319e) + b36.f.g(3, 8, linkedList3) + b36.f.g(4, 8, linkedList2);
            r45.w06 w06Var2 = this.f469322h;
            if (w06Var2 != null) {
                a17 += b36.f.i(5, w06Var2.mo75928xcd1e8d8());
            }
            return a17 + b36.f.g(6, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
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
        r45.v06 v06Var = (r45.v06) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                v06Var.f469318d = aVar2.c(intValue);
                return 0;
            case 2:
                v06Var.f469319e = aVar2.c(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.x06 x06Var = new r45.x06();
                    if (bArr2 != null && bArr2.length > 0) {
                        x06Var.mo11468x92b714fd(bArr2);
                    }
                    v06Var.f469320f.add(x06Var);
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.u06 u06Var = new r45.u06();
                    if (bArr3 != null && bArr3.length > 0) {
                        u06Var.mo11468x92b714fd(bArr3);
                    }
                    v06Var.f469321g.add(u06Var);
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.w06 w06Var3 = new r45.w06();
                    if (bArr4 != null && bArr4.length > 0) {
                        w06Var3.mo11468x92b714fd(bArr4);
                    }
                    v06Var.f469322h = w06Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.z06 z06Var = new r45.z06();
                    if (bArr5 != null && bArr5.length > 0) {
                        z06Var.mo11468x92b714fd(bArr5);
                    }
                    v06Var.f469323i.add(z06Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
