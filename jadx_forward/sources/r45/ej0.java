package r45;

/* loaded from: classes8.dex */
public class ej0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f455097d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f455098e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f455099f;

    /* renamed from: g, reason: collision with root package name */
    public int f455100g;

    /* renamed from: h, reason: collision with root package name */
    public int f455101h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f455102i;

    static {
        new r45.ej0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ej0)) {
            return false;
        }
        r45.ej0 ej0Var = (r45.ej0) fVar;
        return n51.f.a(this.f455097d, ej0Var.f455097d) && n51.f.a(java.lang.Integer.valueOf(this.f455098e), java.lang.Integer.valueOf(ej0Var.f455098e)) && n51.f.a(java.lang.Boolean.valueOf(this.f455099f), java.lang.Boolean.valueOf(ej0Var.f455099f)) && n51.f.a(java.lang.Integer.valueOf(this.f455100g), java.lang.Integer.valueOf(ej0Var.f455100g)) && n51.f.a(java.lang.Integer.valueOf(this.f455101h), java.lang.Integer.valueOf(ej0Var.f455101h)) && n51.f.a(java.lang.Boolean.valueOf(this.f455102i), java.lang.Boolean.valueOf(ej0Var.f455102i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.ej0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f455097d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.e(2, this.f455098e);
            fVar.a(3, this.f455099f);
            fVar.e(4, this.f455100g);
            fVar.e(5, this.f455101h);
            fVar.a(6, this.f455102i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList) + 0 + b36.f.e(2, this.f455098e) + b36.f.a(3, this.f455099f) + b36.f.e(4, this.f455100g) + b36.f.e(5, this.f455101h) + b36.f.a(6, this.f455102i);
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
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.vt6 vt6Var = new r45.vt6();
                    if (bArr != null && bArr.length > 0) {
                        vt6Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(vt6Var);
                }
                return 0;
            case 2:
                this.f455098e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f455099f = aVar2.c(intValue);
                return 0;
            case 4:
                this.f455100g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f455101h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f455102i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.ej0) super.mo11468x92b714fd(bArr);
    }
}
