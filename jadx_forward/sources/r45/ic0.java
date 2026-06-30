package r45;

/* loaded from: classes4.dex */
public class ic0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f458456d;

    /* renamed from: e, reason: collision with root package name */
    public int f458457e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f458458f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ic0)) {
            return false;
        }
        r45.ic0 ic0Var = (r45.ic0) fVar;
        return n51.f.a(this.f458456d, ic0Var.f458456d) && n51.f.a(java.lang.Integer.valueOf(this.f458457e), java.lang.Integer.valueOf(ic0Var.f458457e)) && n51.f.a(this.f458458f, ic0Var.f458458f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du5 du5Var = this.f458456d;
            if (du5Var != null) {
                fVar.i(1, du5Var.mo75928xcd1e8d8());
                this.f458456d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f458457e);
            fVar.k(3, 2, this.f458458f);
            return 0;
        }
        if (i17 == 1) {
            r45.du5 du5Var2 = this.f458456d;
            return (du5Var2 != null ? 0 + b36.f.i(1, du5Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f458457e) + b36.f.k(3, 2, this.f458458f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f458458f.clear();
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
        r45.ic0 ic0Var = (r45.ic0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.du5 du5Var3 = new r45.du5();
                if (bArr2 != null && bArr2.length > 0) {
                    du5Var3.b(bArr2);
                }
                ic0Var.f458456d = du5Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            ic0Var.f458457e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
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
        ic0Var.f458458f = linkedList;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.du5 du5Var = this.f458456d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "UserName", du5Var, false);
            eVar.d(jSONObject, "Count", java.lang.Integer.valueOf(this.f458457e), false);
            eVar.d(jSONObject, "MsgIdList", this.f458458f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
