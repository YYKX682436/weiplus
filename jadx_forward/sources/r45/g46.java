package r45;

/* loaded from: classes4.dex */
public class g46 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456412d;

    /* renamed from: e, reason: collision with root package name */
    public int f456413e;

    /* renamed from: f, reason: collision with root package name */
    public int f456414f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f456415g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g46)) {
            return false;
        }
        r45.g46 g46Var = (r45.g46) fVar;
        return n51.f.a(this.f76494x2de60e5e, g46Var.f76494x2de60e5e) && n51.f.a(this.f456412d, g46Var.f456412d) && n51.f.a(java.lang.Integer.valueOf(this.f456413e), java.lang.Integer.valueOf(g46Var.f456413e)) && n51.f.a(java.lang.Integer.valueOf(this.f456414f), java.lang.Integer.valueOf(g46Var.f456414f)) && n51.f.a(this.f456415g, g46Var.f456415g);
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
            java.lang.String str = this.f456412d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f456413e);
            fVar.e(4, this.f456414f);
            fVar.k(5, 2, this.f456415g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f456412d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f456413e) + b36.f.e(4, this.f456414f) + b36.f.k(5, 2, this.f456415g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f456415g.clear();
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
        r45.g46 g46Var = (r45.g46) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                g46Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            g46Var.f456412d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            g46Var.f456413e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            g46Var.f456414f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        byte[] bArr3 = aVar2.d(intValue).f273689a;
        d36.b unknownTagHandler = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler, "unknownTagHandler");
        e36.a aVar3 = new e36.a(bArr3, 0, bArr3.length);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (aVar3.f329129c < aVar3.f329128b) {
            linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
        }
        g46Var.f456415g = linkedList;
        return 0;
    }
}
