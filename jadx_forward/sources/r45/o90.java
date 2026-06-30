package r45;

/* loaded from: classes8.dex */
public class o90 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463576d;

    /* renamed from: e, reason: collision with root package name */
    public r45.wf5 f463577e;

    /* renamed from: f, reason: collision with root package name */
    public r45.wf5 f463578f;

    /* renamed from: g, reason: collision with root package name */
    public int f463579g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f463580h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o90)) {
            return false;
        }
        r45.o90 o90Var = (r45.o90) fVar;
        return n51.f.a(this.f463576d, o90Var.f463576d) && n51.f.a(this.f463577e, o90Var.f463577e) && n51.f.a(this.f463578f, o90Var.f463578f) && n51.f.a(java.lang.Integer.valueOf(this.f463579g), java.lang.Integer.valueOf(o90Var.f463579g)) && n51.f.a(this.f463580h, o90Var.f463580h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f463580h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463576d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.wf5 wf5Var = this.f463577e;
            if (wf5Var != null) {
                fVar.i(2, wf5Var.mo75928xcd1e8d8());
                this.f463577e.mo75956x3d5d1f78(fVar);
            }
            r45.wf5 wf5Var2 = this.f463578f;
            if (wf5Var2 != null) {
                fVar.i(3, wf5Var2.mo75928xcd1e8d8());
                this.f463578f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f463579g);
            fVar.g(5, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f463576d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.wf5 wf5Var3 = this.f463577e;
            if (wf5Var3 != null) {
                j17 += b36.f.i(2, wf5Var3.mo75928xcd1e8d8());
            }
            r45.wf5 wf5Var4 = this.f463578f;
            if (wf5Var4 != null) {
                j17 += b36.f.i(3, wf5Var4.mo75928xcd1e8d8());
            }
            return j17 + b36.f.e(4, this.f463579g) + b36.f.g(5, 1, linkedList);
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
        r45.o90 o90Var = (r45.o90) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o90Var.f463576d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                r45.wf5 wf5Var5 = new r45.wf5();
                if (bArr2 != null && bArr2.length > 0) {
                    wf5Var5.mo11468x92b714fd(bArr2);
                }
                o90Var.f463577e = wf5Var5;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                o90Var.f463579g = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            o90Var.f463580h.add(aVar2.k(intValue));
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j19.get(i19);
            r45.wf5 wf5Var6 = new r45.wf5();
            if (bArr3 != null && bArr3.length > 0) {
                wf5Var6.mo11468x92b714fd(bArr3);
            }
            o90Var.f463578f = wf5Var6;
        }
        return 0;
    }
}
