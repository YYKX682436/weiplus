package r45;

/* loaded from: classes11.dex */
public class sl extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public int f467354e;

    /* renamed from: g, reason: collision with root package name */
    public int f467356g;

    /* renamed from: h, reason: collision with root package name */
    public int f467357h;

    /* renamed from: m, reason: collision with root package name */
    public int f467359m;

    /* renamed from: n, reason: collision with root package name */
    public int f467360n;

    /* renamed from: o, reason: collision with root package name */
    public int f467361o;

    /* renamed from: p, reason: collision with root package name */
    public int f467362p;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f467353d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f467355f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f467358i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sl)) {
            return false;
        }
        r45.sl slVar = (r45.sl) fVar;
        return n51.f.a(this.f467353d, slVar.f467353d) && n51.f.a(java.lang.Integer.valueOf(this.f467354e), java.lang.Integer.valueOf(slVar.f467354e)) && n51.f.a(this.f467355f, slVar.f467355f) && n51.f.a(java.lang.Integer.valueOf(this.f467356g), java.lang.Integer.valueOf(slVar.f467356g)) && n51.f.a(java.lang.Integer.valueOf(this.f467357h), java.lang.Integer.valueOf(slVar.f467357h)) && n51.f.a(this.f467358i, slVar.f467358i) && n51.f.a(java.lang.Integer.valueOf(this.f467359m), java.lang.Integer.valueOf(slVar.f467359m)) && n51.f.a(java.lang.Integer.valueOf(this.f467360n), java.lang.Integer.valueOf(slVar.f467360n)) && n51.f.a(java.lang.Integer.valueOf(this.f467361o), java.lang.Integer.valueOf(slVar.f467361o)) && n51.f.a(java.lang.Integer.valueOf(this.f467362p), java.lang.Integer.valueOf(slVar.f467362p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467358i;
        java.util.LinkedList linkedList2 = this.f467355f;
        java.util.LinkedList linkedList3 = this.f467353d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList3);
            fVar.e(2, this.f467354e);
            fVar.g(3, 8, linkedList2);
            fVar.e(4, this.f467356g);
            fVar.e(5, this.f467357h);
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f467359m);
            fVar.e(8, this.f467360n);
            fVar.e(9, this.f467361o);
            fVar.e(10, this.f467362p);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList3) + 0 + b36.f.e(2, this.f467354e) + b36.f.g(3, 8, linkedList2) + b36.f.e(4, this.f467356g) + b36.f.e(5, this.f467357h) + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f467359m) + b36.f.e(8, this.f467360n) + b36.f.e(9, this.f467361o) + b36.f.e(10, this.f467362p);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
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
        r45.sl slVar = (r45.sl) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.kv kvVar = new r45.kv();
                    if (bArr2 != null && bArr2.length > 0) {
                        kvVar.mo11468x92b714fd(bArr2);
                    }
                    slVar.f467353d.add(kvVar);
                }
                return 0;
            case 2:
                slVar.f467354e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.jv jvVar = new r45.jv();
                    if (bArr3 != null && bArr3.length > 0) {
                        jvVar.mo11468x92b714fd(bArr3);
                    }
                    slVar.f467355f.add(jvVar);
                }
                return 0;
            case 4:
                slVar.f467356g = aVar2.g(intValue);
                return 0;
            case 5:
                slVar.f467357h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.sm smVar = new r45.sm();
                    if (bArr4 != null && bArr4.length > 0) {
                        smVar.mo11468x92b714fd(bArr4);
                    }
                    slVar.f467358i.add(smVar);
                }
                return 0;
            case 7:
                slVar.f467359m = aVar2.g(intValue);
                return 0;
            case 8:
                slVar.f467360n = aVar2.g(intValue);
                return 0;
            case 9:
                slVar.f467361o = aVar2.g(intValue);
                return 0;
            case 10:
                slVar.f467362p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
