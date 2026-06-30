package r45;

/* loaded from: classes4.dex */
public class te extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f467871d;

    /* renamed from: f, reason: collision with root package name */
    public int f467873f;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f467872e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f467874g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.te)) {
            return false;
        }
        r45.te teVar = (r45.te) fVar;
        return n51.f.a(this.f76494x2de60e5e, teVar.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f467871d), java.lang.Integer.valueOf(teVar.f467871d)) && n51.f.a(this.f467872e, teVar.f467872e) && n51.f.a(java.lang.Integer.valueOf(this.f467873f), java.lang.Integer.valueOf(teVar.f467873f)) && n51.f.a(this.f467874g, teVar.f467874g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467874g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f467871d);
            fVar.k(3, 2, this.f467872e);
            fVar.e(4, this.f467873f);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f467871d) + b36.f.k(3, 2, this.f467872e) + b36.f.e(4, this.f467873f) + b36.f.g(5, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f467872e.clear();
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
        r45.te teVar = (r45.te) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                teVar.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            teVar.f467871d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            byte[] bArr3 = aVar2.d(intValue).f273689a;
            d36.b unknownTagHandler = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler, "unknownTagHandler");
            e36.a aVar3 = new e36.a(bArr3, 0, bArr3.length);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            while (aVar3.f329129c < aVar3.f329128b) {
                linkedList2.add(java.lang.Integer.valueOf(aVar3.f()));
            }
            teVar.f467872e = linkedList2;
            return 0;
        }
        if (intValue == 4) {
            teVar.f467873f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr4 = (byte[]) j18.get(i19);
            r45.uo6 uo6Var = new r45.uo6();
            if (bArr4 != null && bArr4.length > 0) {
                uo6Var.mo11468x92b714fd(bArr4);
            }
            teVar.f467874g.add(uo6Var);
        }
        return 0;
    }
}
