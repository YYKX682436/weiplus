package bw5;

/* loaded from: classes2.dex */
public class p30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112982d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f112984f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f112985g;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f112983e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f112986h = new boolean[5];

    static {
        new bw5.p30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.p30 mo11468x92b714fd(byte[] bArr) {
        return (bw5.p30) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p30)) {
            return false;
        }
        bw5.p30 p30Var = (bw5.p30) fVar;
        return n51.f.a(this.f112982d, p30Var.f112982d) && n51.f.a(this.f112983e, p30Var.f112983e) && n51.f.a(java.lang.Boolean.valueOf(this.f112984f), java.lang.Boolean.valueOf(p30Var.f112984f)) && n51.f.a(java.lang.Boolean.valueOf(this.f112985g), java.lang.Boolean.valueOf(p30Var.f112985g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.p30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f112983e;
        boolean[] zArr = this.f112986h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112982d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.a(3, this.f112984f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f112985g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f112982d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                g17 += b36.f.a(3, this.f112984f);
            }
            return zArr[4] ? g17 + b36.f.a(4, this.f112985g) : g17;
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
            this.f112982d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f112984f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f112985g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.o30 o30Var = new bw5.o30();
            if (bArr != null && bArr.length > 0) {
                o30Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(o30Var);
        }
        zArr[2] = true;
        return 0;
    }
}
