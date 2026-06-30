package r45;

/* loaded from: classes9.dex */
public class e16 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454442d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f454443e = false;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454444f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f454445g = -1;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454446h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f454447i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f454448m = false;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e16)) {
            return false;
        }
        r45.e16 e16Var = (r45.e16) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454442d), java.lang.Integer.valueOf(e16Var.f454442d)) && n51.f.a(java.lang.Boolean.valueOf(this.f454443e), java.lang.Boolean.valueOf(e16Var.f454443e)) && n51.f.a(this.f454444f, e16Var.f454444f) && n51.f.a(java.lang.Long.valueOf(this.f454445g), java.lang.Long.valueOf(e16Var.f454445g)) && n51.f.a(this.f454446h, e16Var.f454446h) && n51.f.a(this.f454447i, e16Var.f454447i) && n51.f.a(java.lang.Boolean.valueOf(this.f454448m), java.lang.Boolean.valueOf(e16Var.f454448m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f454447i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454442d);
            fVar.a(2, this.f454443e);
            java.lang.String str = this.f454444f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f454445g);
            java.lang.String str2 = this.f454446h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.g(6, 8, linkedList);
            fVar.a(7, this.f454448m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f454442d) + 0 + b36.f.a(2, this.f454443e);
            java.lang.String str3 = this.f454444f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            int h17 = e17 + b36.f.h(4, this.f454445g);
            java.lang.String str4 = this.f454446h;
            if (str4 != null) {
                h17 += b36.f.j(5, str4);
            }
            return h17 + b36.f.g(6, 8, linkedList) + b36.f.a(7, this.f454448m);
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
        r45.e16 e16Var = (r45.e16) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                e16Var.f454442d = aVar2.g(intValue);
                return 0;
            case 2:
                e16Var.f454443e = aVar2.c(intValue);
                return 0;
            case 3:
                e16Var.f454444f = aVar2.k(intValue);
                return 0;
            case 4:
                e16Var.f454445g = aVar2.i(intValue);
                return 0;
            case 5:
                e16Var.f454446h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.jw3 jw3Var = new r45.jw3();
                    if (bArr2 != null && bArr2.length > 0) {
                        jw3Var.mo11468x92b714fd(bArr2);
                    }
                    e16Var.f454447i.add(jw3Var);
                }
                return 0;
            case 7:
                e16Var.f454448m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
