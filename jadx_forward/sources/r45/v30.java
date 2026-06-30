package r45;

/* loaded from: classes15.dex */
public class v30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f implements r45.k66 {

    /* renamed from: d, reason: collision with root package name */
    public int f469369d;

    /* renamed from: e, reason: collision with root package name */
    public int f469370e;

    /* renamed from: f, reason: collision with root package name */
    public int f469371f;

    /* renamed from: g, reason: collision with root package name */
    public int f469372g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f469373h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f469374i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f469375m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public int f469376n;

    /* renamed from: o, reason: collision with root package name */
    public int f469377o;

    /* renamed from: p, reason: collision with root package name */
    public int f469378p;

    /* renamed from: q, reason: collision with root package name */
    public r45.gw3 f469379q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v30)) {
            return false;
        }
        r45.v30 v30Var = (r45.v30) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f469369d), java.lang.Integer.valueOf(v30Var.f469369d)) && n51.f.a(java.lang.Integer.valueOf(this.f469370e), java.lang.Integer.valueOf(v30Var.f469370e)) && n51.f.a(java.lang.Integer.valueOf(this.f469371f), java.lang.Integer.valueOf(v30Var.f469371f)) && n51.f.a(java.lang.Integer.valueOf(this.f469372g), java.lang.Integer.valueOf(v30Var.f469372g)) && n51.f.a(this.f469373h, v30Var.f469373h) && n51.f.a(this.f469374i, v30Var.f469374i) && n51.f.a(this.f469375m, v30Var.f469375m) && n51.f.a(java.lang.Integer.valueOf(this.f469376n), java.lang.Integer.valueOf(v30Var.f469376n)) && n51.f.a(java.lang.Integer.valueOf(this.f469377o), java.lang.Integer.valueOf(v30Var.f469377o)) && n51.f.a(java.lang.Integer.valueOf(this.f469378p), java.lang.Integer.valueOf(v30Var.f469378p)) && n51.f.a(this.f469379q, v30Var.f469379q);
    }

    @Override // r45.k66
    /* renamed from: getRet */
    public final int mo161589xb588696b() {
        return this.f469369d;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469375m;
        java.util.LinkedList linkedList2 = this.f469374i;
        java.util.LinkedList linkedList3 = this.f469373h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f469369d);
            fVar.e(2, this.f469370e);
            fVar.e(3, this.f469371f);
            fVar.e(4, this.f469372g);
            fVar.g(5, 8, linkedList3);
            fVar.g(6, 8, linkedList2);
            fVar.g(7, 8, linkedList);
            fVar.e(8, this.f469376n);
            fVar.e(9, this.f469377o);
            fVar.e(10, this.f469378p);
            r45.gw3 gw3Var = this.f469379q;
            if (gw3Var != null) {
                fVar.i(11, gw3Var.mo75928xcd1e8d8());
                this.f469379q.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f469369d) + 0 + b36.f.e(2, this.f469370e) + b36.f.e(3, this.f469371f) + b36.f.e(4, this.f469372g) + b36.f.g(5, 8, linkedList3) + b36.f.g(6, 8, linkedList2) + b36.f.g(7, 8, linkedList) + b36.f.e(8, this.f469376n) + b36.f.e(9, this.f469377o) + b36.f.e(10, this.f469378p);
            r45.gw3 gw3Var2 = this.f469379q;
            return gw3Var2 != null ? e17 + b36.f.i(11, gw3Var2.mo75928xcd1e8d8()) : e17;
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
        r45.v30 v30Var = (r45.v30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                v30Var.f469369d = aVar2.g(intValue);
                return 0;
            case 2:
                v30Var.f469370e = aVar2.g(intValue);
                return 0;
            case 3:
                v30Var.f469371f = aVar2.g(intValue);
                return 0;
            case 4:
                v30Var.f469372g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.nf6 nf6Var = new r45.nf6();
                    if (bArr2 != null && bArr2.length > 0) {
                        nf6Var.mo11468x92b714fd(bArr2);
                    }
                    v30Var.f469373h.add(nf6Var);
                }
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.nf6 nf6Var2 = new r45.nf6();
                    if (bArr3 != null && bArr3.length > 0) {
                        nf6Var2.mo11468x92b714fd(bArr3);
                    }
                    v30Var.f469374i.add(nf6Var2);
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.nf6 nf6Var3 = new r45.nf6();
                    if (bArr4 != null && bArr4.length > 0) {
                        nf6Var3.mo11468x92b714fd(bArr4);
                    }
                    v30Var.f469375m.add(nf6Var3);
                }
                return 0;
            case 8:
                v30Var.f469376n = aVar2.g(intValue);
                return 0;
            case 9:
                v30Var.f469377o = aVar2.g(intValue);
                return 0;
            case 10:
                v30Var.f469378p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.gw3 gw3Var3 = new r45.gw3();
                    if (bArr5 != null && bArr5.length > 0) {
                        gw3Var3.mo11468x92b714fd(bArr5);
                    }
                    v30Var.f469379q = gw3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
