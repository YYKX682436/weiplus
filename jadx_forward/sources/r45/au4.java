package r45;

/* loaded from: classes2.dex */
public class au4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.rl6 f451795d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f451796e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451797f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451798g;

    /* renamed from: h, reason: collision with root package name */
    public r45.yt5 f451799h;

    /* renamed from: i, reason: collision with root package name */
    public r45.bz3 f451800i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.au4)) {
            return false;
        }
        r45.au4 au4Var = (r45.au4) fVar;
        return n51.f.a(this.f451795d, au4Var.f451795d) && n51.f.a(this.f451796e, au4Var.f451796e) && n51.f.a(this.f451797f, au4Var.f451797f) && n51.f.a(this.f451798g, au4Var.f451798g) && n51.f.a(this.f451799h, au4Var.f451799h) && n51.f.a(this.f451800i, au4Var.f451800i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f451796e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.rl6 rl6Var = this.f451795d;
            if (rl6Var != null) {
                fVar.i(1, rl6Var.mo75928xcd1e8d8());
                this.f451795d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f451797f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f451798g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.yt5 yt5Var = this.f451799h;
            if (yt5Var != null) {
                fVar.i(5, yt5Var.mo75928xcd1e8d8());
                this.f451799h.mo75956x3d5d1f78(fVar);
            }
            r45.bz3 bz3Var = this.f451800i;
            if (bz3Var != null) {
                fVar.i(6, bz3Var.mo75928xcd1e8d8());
                this.f451800i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.rl6 rl6Var2 = this.f451795d;
            int i18 = (rl6Var2 != null ? 0 + b36.f.i(1, rl6Var2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str3 = this.f451797f;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f451798g;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            r45.yt5 yt5Var2 = this.f451799h;
            if (yt5Var2 != null) {
                i18 += b36.f.i(5, yt5Var2.mo75928xcd1e8d8());
            }
            r45.bz3 bz3Var2 = this.f451800i;
            return bz3Var2 != null ? i18 + b36.f.i(6, bz3Var2.mo75928xcd1e8d8()) : i18;
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
        r45.au4 au4Var = (r45.au4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.rl6 rl6Var3 = new r45.rl6();
                    if (bArr2 != null && bArr2.length > 0) {
                        rl6Var3.mo11468x92b714fd(bArr2);
                    }
                    au4Var.f451795d = rl6Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.rl6 rl6Var4 = new r45.rl6();
                    if (bArr3 != null && bArr3.length > 0) {
                        rl6Var4.mo11468x92b714fd(bArr3);
                    }
                    au4Var.f451796e.add(rl6Var4);
                }
                return 0;
            case 3:
                au4Var.f451797f = aVar2.k(intValue);
                return 0;
            case 4:
                au4Var.f451798g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.yt5 yt5Var3 = new r45.yt5();
                    if (bArr4 != null && bArr4.length > 0) {
                        yt5Var3.mo11468x92b714fd(bArr4);
                    }
                    au4Var.f451799h = yt5Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.bz3 bz3Var3 = new r45.bz3();
                    if (bArr5 != null && bArr5.length > 0) {
                        bz3Var3.mo11468x92b714fd(bArr5);
                    }
                    au4Var.f451800i = bz3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
