package r45;

/* loaded from: classes2.dex */
public class r76 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f466129d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f466130e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f466131f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r76)) {
            return false;
        }
        r45.r76 r76Var = (r45.r76) fVar;
        return n51.f.a(this.f76492x92037252, r76Var.f76492x92037252) && n51.f.a(this.f466129d, r76Var.f466129d) && n51.f.a(java.lang.Boolean.valueOf(this.f466130e), java.lang.Boolean.valueOf(r76Var.f466130e)) && n51.f.a(this.f466131f, r76Var.f466131f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f466129d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.a(3, this.f466130e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f466131f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.a(3, this.f466130e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f466131f;
            return gVar2 != null ? i18 + b36.f.b(4, gVar2) : i18;
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
        r45.r76 r76Var = (r45.r76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr2);
                }
                r76Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                r76Var.f466130e = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            r76Var.f466131f = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.k96 k96Var = new r45.k96();
            if (bArr3 != null && bArr3.length > 0) {
                k96Var.mo11468x92b714fd(bArr3);
            }
            r76Var.f466129d.add(k96Var);
        }
        return 0;
    }
}
