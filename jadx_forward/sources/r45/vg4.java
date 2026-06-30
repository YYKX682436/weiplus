package r45;

/* loaded from: classes4.dex */
public class vg4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f469734d;

    /* renamed from: e, reason: collision with root package name */
    public int f469735e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f469736f;

    /* renamed from: g, reason: collision with root package name */
    public float f469737g;

    /* renamed from: h, reason: collision with root package name */
    public float f469738h;

    /* renamed from: m, reason: collision with root package name */
    public long f469740m;

    /* renamed from: n, reason: collision with root package name */
    public long f469741n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f469742o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f469744q;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f469739i = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f469743p = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vg4)) {
            return false;
        }
        r45.vg4 vg4Var = (r45.vg4) fVar;
        return n51.f.a(this.f76494x2de60e5e, vg4Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f469734d), java.lang.Integer.valueOf(vg4Var.f469734d)) && n51.f.a(java.lang.Integer.valueOf(this.f469735e), java.lang.Integer.valueOf(vg4Var.f469735e)) && n51.f.a(this.f469736f, vg4Var.f469736f) && n51.f.a(java.lang.Float.valueOf(this.f469737g), java.lang.Float.valueOf(vg4Var.f469737g)) && n51.f.a(java.lang.Float.valueOf(this.f469738h), java.lang.Float.valueOf(vg4Var.f469738h)) && n51.f.a(this.f469739i, vg4Var.f469739i) && n51.f.a(java.lang.Long.valueOf(this.f469740m), java.lang.Long.valueOf(vg4Var.f469740m)) && n51.f.a(java.lang.Long.valueOf(this.f469741n), java.lang.Long.valueOf(vg4Var.f469741n)) && n51.f.a(this.f469742o, vg4Var.f469742o) && n51.f.a(this.f469743p, vg4Var.f469743p) && n51.f.a(this.f469744q, vg4Var.f469744q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469743p;
        java.util.LinkedList linkedList2 = this.f469739i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f469734d);
            fVar.e(3, this.f469735e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f469736f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.d(5, this.f469737g);
            fVar.d(6, this.f469738h);
            fVar.g(7, 6, linkedList2);
            fVar.h(8, this.f469740m);
            fVar.h(9, this.f469741n);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f469742o;
            if (gVar2 != null) {
                fVar.b(10, gVar2);
            }
            fVar.g(11, 1, linkedList);
            java.lang.String str = this.f469744q;
            if (str != null) {
                fVar.j(12, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f469734d) + b36.f.e(3, this.f469735e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f469736f;
            if (gVar3 != null) {
                i18 += b36.f.b(4, gVar3);
            }
            int d17 = i18 + b36.f.d(5, this.f469737g) + b36.f.d(6, this.f469738h) + b36.f.g(7, 6, linkedList2) + b36.f.h(8, this.f469740m) + b36.f.h(9, this.f469741n);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f469742o;
            if (gVar4 != null) {
                d17 += b36.f.b(10, gVar4);
            }
            int g17 = d17 + b36.f.g(11, 1, linkedList);
            java.lang.String str2 = this.f469744q;
            return str2 != null ? g17 + b36.f.j(12, str2) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.vg4 vg4Var = (r45.vg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    vg4Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                vg4Var.f469734d = aVar2.g(intValue);
                return 0;
            case 3:
                vg4Var.f469735e = aVar2.g(intValue);
                return 0;
            case 4:
                vg4Var.f469736f = aVar2.d(intValue);
                return 0;
            case 5:
                vg4Var.f469737g = aVar2.f(intValue);
                return 0;
            case 6:
                vg4Var.f469738h = aVar2.f(intValue);
                return 0;
            case 7:
                vg4Var.f469739i.add(aVar2.d(intValue));
                return 0;
            case 8:
                vg4Var.f469740m = aVar2.i(intValue);
                return 0;
            case 9:
                vg4Var.f469741n = aVar2.i(intValue);
                return 0;
            case 10:
                vg4Var.f469742o = aVar2.d(intValue);
                return 0;
            case 11:
                vg4Var.f469743p.add(aVar2.k(intValue));
                return 0;
            case 12:
                vg4Var.f469744q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
