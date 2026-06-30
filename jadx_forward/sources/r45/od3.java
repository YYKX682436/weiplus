package r45;

/* loaded from: classes11.dex */
public class od3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f463696d;

    /* renamed from: i, reason: collision with root package name */
    public int f463701i;

    /* renamed from: m, reason: collision with root package name */
    public int f463702m;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f463697e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f463698f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f463699g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f463700h = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f463703n = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.od3)) {
            return false;
        }
        r45.od3 od3Var = (r45.od3) fVar;
        return n51.f.a(this.f76492x92037252, od3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f463696d), java.lang.Integer.valueOf(od3Var.f463696d)) && n51.f.a(this.f463697e, od3Var.f463697e) && n51.f.a(this.f463698f, od3Var.f463698f) && n51.f.a(this.f463699g, od3Var.f463699g) && n51.f.a(this.f463700h, od3Var.f463700h) && n51.f.a(java.lang.Integer.valueOf(this.f463701i), java.lang.Integer.valueOf(od3Var.f463701i)) && n51.f.a(java.lang.Integer.valueOf(this.f463702m), java.lang.Integer.valueOf(od3Var.f463702m)) && n51.f.a(this.f463703n, od3Var.f463703n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f463703n;
        java.util.LinkedList linkedList2 = this.f463700h;
        java.util.LinkedList linkedList3 = this.f463699g;
        java.util.LinkedList linkedList4 = this.f463697e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f463696d);
            fVar.g(3, 8, linkedList4);
            fVar.k(4, 2, this.f463698f);
            fVar.g(5, 8, linkedList3);
            fVar.g(6, 8, linkedList2);
            fVar.e(7, this.f463701i);
            fVar.e(8, this.f463702m);
            fVar.g(9, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f463696d) + b36.f.g(3, 8, linkedList4) + b36.f.k(4, 2, this.f463698f) + b36.f.g(5, 8, linkedList3) + b36.f.g(6, 8, linkedList2) + b36.f.e(7, this.f463701i) + b36.f.e(8, this.f463702m) + b36.f.g(9, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList4.clear();
            this.f463698f.clear();
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
        r45.od3 od3Var = (r45.od3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    od3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                od3Var.f463696d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.tn4 tn4Var = new r45.tn4();
                    if (bArr3 != null && bArr3.length > 0) {
                        tn4Var.mo11468x92b714fd(bArr3);
                    }
                    od3Var.f463697e.add(tn4Var);
                }
                return 0;
            case 4:
                byte[] bArr4 = aVar2.d(intValue).f273689a;
                d36.b unknownTagHandler = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr4, 0, bArr4.length);
                java.util.LinkedList linkedList5 = new java.util.LinkedList();
                while (aVar3.f329129c < aVar3.f329128b) {
                    linkedList5.add(java.lang.Integer.valueOf(aVar3.f()));
                }
                od3Var.f463698f = linkedList5;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr5 = (byte[]) j19.get(i27);
                    r45.oy6 oy6Var = new r45.oy6();
                    if (bArr5 != null && bArr5.length > 0) {
                        oy6Var.mo11468x92b714fd(bArr5);
                    }
                    od3Var.f463699g.add(oy6Var);
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr6 = (byte[]) j27.get(i28);
                    r45.gz5 gz5Var = new r45.gz5();
                    if (bArr6 != null && bArr6.length > 0) {
                        gz5Var.mo11468x92b714fd(bArr6);
                    }
                    od3Var.f463700h.add(gz5Var);
                }
                return 0;
            case 7:
                od3Var.f463701i = aVar2.g(intValue);
                return 0;
            case 8:
                od3Var.f463702m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr7 = (byte[]) j28.get(i29);
                    r45.eu5 eu5Var = new r45.eu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        eu5Var.b(bArr7);
                    }
                    od3Var.f463703n.add(eu5Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
