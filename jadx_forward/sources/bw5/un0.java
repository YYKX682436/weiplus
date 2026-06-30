package bw5;

/* loaded from: classes2.dex */
public class un0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final bw5.un0 f115532i = new bw5.un0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f115533d;

    /* renamed from: e, reason: collision with root package name */
    public int f115534e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115535f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f115536g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f115537h = new boolean[5];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.un0)) {
            return false;
        }
        bw5.un0 un0Var = (bw5.un0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f115533d), java.lang.Boolean.valueOf(un0Var.f115533d)) && n51.f.a(java.lang.Integer.valueOf(this.f115534e), java.lang.Integer.valueOf(un0Var.f115534e)) && n51.f.a(this.f115535f, un0Var.f115535f) && n51.f.a(this.f115536g, un0Var.f115536g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.un0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f115536g;
        boolean[] zArr = this.f115537h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f115533d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f115534e);
            }
            java.lang.String str = this.f115535f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f115533d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f115534e);
            }
            java.lang.String str2 = this.f115535f;
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
            this.f115533d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f115534e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f115535f = aVar2.k(intValue);
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
            bw5.sn0 sn0Var = new bw5.sn0();
            if (bArr != null && bArr.length > 0) {
                sn0Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(sn0Var);
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.un0) super.mo11468x92b714fd(bArr);
    }
}
