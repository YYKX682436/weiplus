package r45;

/* loaded from: classes4.dex */
public class iu5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f458874d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f458875e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f458876f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f458877g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f458878h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f458879i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.iu5)) {
            return false;
        }
        r45.iu5 iu5Var = (r45.iu5) fVar;
        return n51.f.a(this.f458874d, iu5Var.f458874d) && n51.f.a(java.lang.Boolean.valueOf(this.f458875e), java.lang.Boolean.valueOf(iu5Var.f458875e)) && n51.f.a(java.lang.Boolean.valueOf(this.f458876f), java.lang.Boolean.valueOf(iu5Var.f458876f)) && n51.f.a(java.lang.Boolean.valueOf(this.f458877g), java.lang.Boolean.valueOf(iu5Var.f458877g)) && n51.f.a(java.lang.Boolean.valueOf(this.f458878h), java.lang.Boolean.valueOf(iu5Var.f458878h)) && n51.f.a(java.lang.Boolean.valueOf(this.f458879i), java.lang.Boolean.valueOf(iu5Var.f458879i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f458874d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.a(2, this.f458875e);
            fVar.a(3, this.f458876f);
            fVar.a(4, this.f458877g);
            fVar.a(5, this.f458878h);
            fVar.a(6, this.f458879i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList) + 0 + b36.f.a(2, this.f458875e) + b36.f.a(3, this.f458876f) + b36.f.a(4, this.f458877g) + b36.f.a(5, this.f458878h) + b36.f.a(6, this.f458879i);
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
        r45.iu5 iu5Var = (r45.iu5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.nd4 nd4Var = new r45.nd4();
                    if (bArr2 != null && bArr2.length > 0) {
                        nd4Var.mo11468x92b714fd(bArr2);
                    }
                    iu5Var.f458874d.add(nd4Var);
                }
                return 0;
            case 2:
                iu5Var.f458875e = aVar2.c(intValue);
                return 0;
            case 3:
                iu5Var.f458876f = aVar2.c(intValue);
                return 0;
            case 4:
                iu5Var.f458877g = aVar2.c(intValue);
                return 0;
            case 5:
                iu5Var.f458878h = aVar2.c(intValue);
                return 0;
            case 6:
                iu5Var.f458879i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
