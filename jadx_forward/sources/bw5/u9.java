package bw5;

/* loaded from: classes4.dex */
public class u9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f115341d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115342e;

    /* renamed from: f, reason: collision with root package name */
    public long f115343f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f115345h;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f115344g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f115346i = new boolean[6];

    static {
        new bw5.u9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.u9)) {
            return false;
        }
        bw5.u9 u9Var = (bw5.u9) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f115341d), java.lang.Boolean.valueOf(u9Var.f115341d)) && n51.f.a(this.f115342e, u9Var.f115342e) && n51.f.a(java.lang.Long.valueOf(this.f115343f), java.lang.Long.valueOf(u9Var.f115343f)) && n51.f.a(this.f115344g, u9Var.f115344g) && n51.f.a(java.lang.Boolean.valueOf(this.f115345h), java.lang.Boolean.valueOf(u9Var.f115345h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.u9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f115344g;
        boolean[] zArr = this.f115346i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f115341d);
            }
            java.lang.String str = this.f115342e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f115343f);
            }
            fVar.g(4, 8, linkedList);
            if (zArr[5]) {
                fVar.a(5, this.f115345h);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f115341d) : 0;
            java.lang.String str2 = this.f115342e;
            if (str2 != null && zArr[2]) {
                a17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                a17 += b36.f.h(3, this.f115343f);
            }
            int g17 = a17 + b36.f.g(4, 8, linkedList);
            return zArr[5] ? g17 + b36.f.a(5, this.f115345h) : g17;
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
            this.f115341d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f115342e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f115343f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f115345h = aVar2.c(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.e9 e9Var = new bw5.e9();
            if (bArr != null && bArr.length > 0) {
                e9Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(e9Var);
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.u9) super.mo11468x92b714fd(bArr);
    }
}
