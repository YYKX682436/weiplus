package pj4;

/* loaded from: classes8.dex */
public class p1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f436784d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436785e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f436786f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f436787g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.p1)) {
            return false;
        }
        pj4.p1 p1Var = (pj4.p1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f436784d), java.lang.Long.valueOf(p1Var.f436784d)) && n51.f.a(this.f436785e, p1Var.f436785e) && n51.f.a(this.f436786f, p1Var.f436786f) && n51.f.a(this.f436787g, p1Var.f436787g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f436787g;
        java.util.LinkedList linkedList2 = this.f436786f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f436784d);
            java.lang.String str = this.f436785e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList2);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f436784d) + 0;
            java.lang.String str2 = this.f436785e;
            if (str2 != null) {
                h17 += b36.f.j(2, str2);
            }
            return h17 + b36.f.g(3, 8, linkedList2) + b36.f.g(4, 8, linkedList);
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
        pj4.p1 p1Var = (pj4.p1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p1Var.f436784d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            p1Var.f436785e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                pj4.q1 q1Var = new pj4.q1();
                if (bArr2 != null && bArr2.length > 0) {
                    q1Var.mo11468x92b714fd(bArr2);
                }
                p1Var.f436786f.add(q1Var);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            pj4.o1 o1Var = new pj4.o1();
            if (bArr3 != null && bArr3.length > 0) {
                o1Var.mo11468x92b714fd(bArr3);
            }
            p1Var.f436787g.add(o1Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public org.json.JSONObject mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f436784d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "key", valueOf, false);
            eVar.d(jSONObject, "configId", this.f436785e, false);
            eVar.d(jSONObject, "iconGroups", this.f436786f, false);
            eVar.d(jSONObject, "icons", this.f436787g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
