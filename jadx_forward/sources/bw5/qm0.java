package bw5;

/* loaded from: classes2.dex */
public class qm0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final bw5.qm0 f113720i = new bw5.qm0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f113721d;

    /* renamed from: e, reason: collision with root package name */
    public int f113722e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113723f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f113724g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f113725h = new boolean[5];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qm0)) {
            return false;
        }
        bw5.qm0 qm0Var = (bw5.qm0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f113721d), java.lang.Boolean.valueOf(qm0Var.f113721d)) && n51.f.a(java.lang.Integer.valueOf(this.f113722e), java.lang.Integer.valueOf(qm0Var.f113722e)) && n51.f.a(this.f113723f, qm0Var.f113723f) && n51.f.a(this.f113724g, qm0Var.f113724g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qm0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f113724g;
        boolean[] zArr = this.f113725h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f113721d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f113722e);
            }
            java.lang.String str = this.f113723f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f113721d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f113722e);
            }
            java.lang.String str2 = this.f113723f;
            if (str2 != null && zArr[3]) {
                a17 += b36.f.j(3, str2);
            }
            return a17 + b36.f.g(4, 8, linkedList);
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
            this.f113721d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f113722e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f113723f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.jm0 jm0Var = new bw5.jm0();
            if (bArr != null && bArr.length > 0) {
                jm0Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(jm0Var);
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.qm0) super.mo11468x92b714fd(bArr);
    }
}
