package bw5;

/* loaded from: classes2.dex */
public class c70 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f107493d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107494e;

    /* renamed from: f, reason: collision with root package name */
    public int f107495f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f107496g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f107497h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f107498i = new boolean[6];

    static {
        new bw5.c70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.c70 mo11468x92b714fd(byte[] bArr) {
        return (bw5.c70) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c70)) {
            return false;
        }
        bw5.c70 c70Var = (bw5.c70) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f107493d), java.lang.Integer.valueOf(c70Var.f107493d)) && n51.f.a(this.f107494e, c70Var.f107494e) && n51.f.a(java.lang.Integer.valueOf(this.f107495f), java.lang.Integer.valueOf(c70Var.f107495f)) && n51.f.a(this.f107496g, c70Var.f107496g) && n51.f.a(this.f107497h, c70Var.f107497h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.c70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f107497h;
        boolean[] zArr = this.f107498i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f107493d);
            }
            java.lang.String str = this.f107494e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f107495f);
            }
            java.lang.String str2 = this.f107496g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            fVar.g(5, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f107493d) : 0;
            java.lang.String str3 = this.f107494e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f107495f);
            }
            java.lang.String str4 = this.f107496g;
            if (str4 != null && zArr[4]) {
                e17 += b36.f.j(4, str4);
            }
            return e17 + b36.f.g(5, 1, linkedList);
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
            this.f107493d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f107494e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f107495f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f107496g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        linkedList.add(aVar2.k(intValue));
        zArr[5] = true;
        return 0;
    }
}
