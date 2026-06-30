package bw5;

/* loaded from: classes2.dex */
public class aa0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f106643d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f106645f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f106646g;

    /* renamed from: h, reason: collision with root package name */
    public int f106647h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f106644e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f106648i = new boolean[6];

    static {
        new bw5.aa0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.aa0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.aa0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.aa0)) {
            return false;
        }
        bw5.aa0 aa0Var = (bw5.aa0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f106643d), java.lang.Boolean.valueOf(aa0Var.f106643d)) && n51.f.a(this.f106644e, aa0Var.f106644e) && n51.f.a(this.f106645f, aa0Var.f106645f) && n51.f.a(this.f106646g, aa0Var.f106646g) && n51.f.a(java.lang.Integer.valueOf(this.f106647h), java.lang.Integer.valueOf(aa0Var.f106647h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.aa0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f106644e;
        boolean[] zArr = this.f106648i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f106643d);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f106645f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f106646g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f106647h);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = (zArr[1] ? 0 + b36.f.a(1, this.f106643d) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str3 = this.f106645f;
            if (str3 != null && zArr[3]) {
                a17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f106646g;
            if (str4 != null && zArr[4]) {
                a17 += b36.f.j(4, str4);
            }
            return zArr[5] ? a17 + b36.f.e(5, this.f106647h) : a17;
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
            this.f106643d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f106645f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue == 4) {
                this.f106646g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f106647h = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.mc0 mc0Var = new bw5.mc0();
            if (bArr != null && bArr.length > 0) {
                mc0Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(mc0Var);
        }
        zArr[2] = true;
        return 0;
    }
}
