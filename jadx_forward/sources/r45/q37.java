package r45;

/* loaded from: classes14.dex */
public class q37 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f465170d;

    /* renamed from: e, reason: collision with root package name */
    public int f465171e;

    /* renamed from: f, reason: collision with root package name */
    public int f465172f;

    /* renamed from: g, reason: collision with root package name */
    public int f465173g;

    /* renamed from: h, reason: collision with root package name */
    public int f465174h;

    /* renamed from: i, reason: collision with root package name */
    public int f465175i;

    /* renamed from: m, reason: collision with root package name */
    public int f465176m;

    /* renamed from: o, reason: collision with root package name */
    public int f465178o;

    /* renamed from: p, reason: collision with root package name */
    public int f465179p;

    /* renamed from: r, reason: collision with root package name */
    public int f465181r;

    /* renamed from: s, reason: collision with root package name */
    public int f465182s;

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f465177n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f465180q = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q37)) {
            return false;
        }
        r45.q37 q37Var = (r45.q37) fVar;
        return n51.f.a(this.f76494x2de60e5e, q37Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f465170d), java.lang.Integer.valueOf(q37Var.f465170d)) && n51.f.a(java.lang.Integer.valueOf(this.f465171e), java.lang.Integer.valueOf(q37Var.f465171e)) && n51.f.a(java.lang.Integer.valueOf(this.f465172f), java.lang.Integer.valueOf(q37Var.f465172f)) && n51.f.a(java.lang.Integer.valueOf(this.f465173g), java.lang.Integer.valueOf(q37Var.f465173g)) && n51.f.a(java.lang.Integer.valueOf(this.f465174h), java.lang.Integer.valueOf(q37Var.f465174h)) && n51.f.a(java.lang.Integer.valueOf(this.f465175i), java.lang.Integer.valueOf(q37Var.f465175i)) && n51.f.a(java.lang.Integer.valueOf(this.f465176m), java.lang.Integer.valueOf(q37Var.f465176m)) && n51.f.a(this.f465177n, q37Var.f465177n) && n51.f.a(java.lang.Integer.valueOf(this.f465178o), java.lang.Integer.valueOf(q37Var.f465178o)) && n51.f.a(java.lang.Integer.valueOf(this.f465179p), java.lang.Integer.valueOf(q37Var.f465179p)) && n51.f.a(this.f465180q, q37Var.f465180q) && n51.f.a(java.lang.Integer.valueOf(this.f465181r), java.lang.Integer.valueOf(q37Var.f465181r)) && n51.f.a(java.lang.Integer.valueOf(this.f465182s), java.lang.Integer.valueOf(q37Var.f465182s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f465170d);
            fVar.e(3, this.f465171e);
            fVar.e(4, this.f465172f);
            fVar.e(5, this.f465173g);
            fVar.e(6, this.f465174h);
            fVar.e(7, this.f465175i);
            fVar.e(8, this.f465176m);
            fVar.k(9, 2, this.f465177n);
            fVar.e(10, this.f465178o);
            fVar.e(11, this.f465179p);
            fVar.k(12, 2, this.f465180q);
            fVar.e(13, this.f465181r);
            fVar.e(14, this.f465182s);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f465170d) + b36.f.e(3, this.f465171e) + b36.f.e(4, this.f465172f) + b36.f.e(5, this.f465173g) + b36.f.e(6, this.f465174h) + b36.f.e(7, this.f465175i) + b36.f.e(8, this.f465176m) + b36.f.k(9, 2, this.f465177n) + b36.f.e(10, this.f465178o) + b36.f.e(11, this.f465179p) + b36.f.k(12, 2, this.f465180q) + b36.f.e(13, this.f465181r) + b36.f.e(14, this.f465182s);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f465177n.clear();
            this.f465180q.clear();
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
        r45.q37 q37Var = (r45.q37) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    q37Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                q37Var.f465170d = aVar2.g(intValue);
                return 0;
            case 3:
                q37Var.f465171e = aVar2.g(intValue);
                return 0;
            case 4:
                q37Var.f465172f = aVar2.g(intValue);
                return 0;
            case 5:
                q37Var.f465173g = aVar2.g(intValue);
                return 0;
            case 6:
                q37Var.f465174h = aVar2.g(intValue);
                return 0;
            case 7:
                q37Var.f465175i = aVar2.g(intValue);
                return 0;
            case 8:
                q37Var.f465176m = aVar2.g(intValue);
                return 0;
            case 9:
                byte[] bArr3 = aVar2.d(intValue).f273689a;
                d36.b unknownTagHandler = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr3, 0, bArr3.length);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (aVar3.f329129c < aVar3.f329128b) {
                    linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
                }
                q37Var.f465177n = linkedList;
                return 0;
            case 10:
                q37Var.f465178o = aVar2.g(intValue);
                return 0;
            case 11:
                q37Var.f465179p = aVar2.g(intValue);
                return 0;
            case 12:
                byte[] bArr4 = aVar2.d(intValue).f273689a;
                d36.b unknownTagHandler2 = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler2, "unknownTagHandler");
                e36.a aVar4 = new e36.a(bArr4, 0, bArr4.length);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                while (aVar4.f329129c < aVar4.f329128b) {
                    linkedList2.add(java.lang.Integer.valueOf(aVar4.f()));
                }
                q37Var.f465180q = linkedList2;
                return 0;
            case 13:
                q37Var.f465181r = aVar2.g(intValue);
                return 0;
            case 14:
                q37Var.f465182s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
