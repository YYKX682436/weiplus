package bw5;

/* loaded from: classes2.dex */
public class at extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f106961d;

    /* renamed from: e, reason: collision with root package name */
    public int f106962e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f106964g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.st f106965h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f106963f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f106966i = new boolean[51];

    static {
        new bw5.at();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.at mo11468x92b714fd(byte[] bArr) {
        return (bw5.at) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.at)) {
            return false;
        }
        bw5.at atVar = (bw5.at) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f106961d), java.lang.Integer.valueOf(atVar.f106961d)) && n51.f.a(java.lang.Integer.valueOf(this.f106962e), java.lang.Integer.valueOf(atVar.f106962e)) && n51.f.a(this.f106963f, atVar.f106963f) && n51.f.a(this.f106964g, atVar.f106964g) && n51.f.a(this.f106965h, atVar.f106965h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.at();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f106963f;
        boolean[] zArr = this.f106966i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f106961d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f106962e);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f106964g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            bw5.st stVar = this.f106965h;
            if (stVar != null && zArr[50]) {
                fVar.i(50, stVar.mo75928xcd1e8d8());
                this.f106965h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f106961d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f106962e);
            }
            int g17 = e17 + b36.f.g(3, 8, linkedList);
            java.lang.String str2 = this.f106964g;
            if (str2 != null && zArr[4]) {
                g17 += b36.f.j(4, str2);
            }
            bw5.st stVar2 = this.f106965h;
            return (stVar2 == null || !zArr[50]) ? g17 : g17 + b36.f.i(50, stVar2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f106961d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f106962e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.h3 h3Var = new bw5.h3();
                if (bArr != null && bArr.length > 0) {
                    h3Var.mo11468x92b714fd(bArr);
                }
                linkedList.add(h3Var);
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f106964g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 50) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.st stVar3 = new bw5.st();
            if (bArr2 != null && bArr2.length > 0) {
                stVar3.mo11468x92b714fd(bArr2);
            }
            this.f106965h = stVar3;
        }
        zArr[50] = true;
        return 0;
    }
}
