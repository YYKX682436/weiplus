package r45;

/* loaded from: classes11.dex */
public class j25 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f459050d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f459051e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f459052f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j25)) {
            return false;
        }
        r45.j25 j25Var = (r45.j25) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f459050d), java.lang.Integer.valueOf(j25Var.f459050d)) && n51.f.a(this.f459051e, j25Var.f459051e) && n51.f.a(this.f459052f, j25Var.f459052f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f459052f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f459050d);
            fVar.k(2, 2, this.f459051e);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f459050d) + 0 + b36.f.k(2, 2, this.f459051e) + b36.f.g(3, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f459051e.clear();
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
        r45.j25 j25Var = (r45.j25) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            j25Var.f459050d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            byte[] bArr2 = aVar2.d(intValue).f273689a;
            d36.b unknownTagHandler = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler, "unknownTagHandler");
            e36.a aVar3 = new e36.a(bArr2, 0, bArr2.length);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            while (aVar3.f329129c < aVar3.f329128b) {
                linkedList2.add(java.lang.Integer.valueOf(aVar3.f()));
            }
            j25Var.f459051e = linkedList2;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr3 = (byte[]) j17.get(i18);
            r45.g25 g25Var = new r45.g25();
            if (bArr3 != null && bArr3.length > 0) {
                g25Var.mo11468x92b714fd(bArr3);
            }
            j25Var.f459052f.add(g25Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f459050d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Count", valueOf, false);
            eVar.d(jSONObject, "Ret", this.f459051e, false);
            eVar.d(jSONObject, "ErrMsg", this.f459052f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
