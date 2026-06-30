package pj4;

/* loaded from: classes8.dex */
public class o1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436761d;

    /* renamed from: e, reason: collision with root package name */
    public int f436762e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f436763f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f436764g;

    /* renamed from: h, reason: collision with root package name */
    public long f436765h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.o1)) {
            return false;
        }
        pj4.o1 o1Var = (pj4.o1) fVar;
        return n51.f.a(this.f436761d, o1Var.f436761d) && n51.f.a(java.lang.Integer.valueOf(this.f436762e), java.lang.Integer.valueOf(o1Var.f436762e)) && n51.f.a(this.f436763f, o1Var.f436763f) && n51.f.a(java.lang.Integer.valueOf(this.f436764g), java.lang.Integer.valueOf(o1Var.f436764g)) && n51.f.a(java.lang.Long.valueOf(this.f436765h), java.lang.Long.valueOf(o1Var.f436765h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f436763f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f436761d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f436762e);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f436764g);
            fVar.h(5, this.f436765h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f436761d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f436762e) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f436764g) + b36.f.h(5, this.f436765h);
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
        pj4.o1 o1Var = (pj4.o1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o1Var.f436761d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            o1Var.f436762e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                o1Var.f436764g = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            o1Var.f436765h = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            pj4.g0 g0Var = new pj4.g0();
            if (bArr2 != null && bArr2.length > 0) {
                g0Var.mo11468x92b714fd(bArr2);
            }
            o1Var.f436763f.add(g0Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f436761d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "iconId", str, false);
            eVar.d(jSONObject, "showType", java.lang.Integer.valueOf(this.f436762e), false);
            eVar.d(jSONObject, "actions", this.f436763f, false);
            eVar.d(jSONObject, "characterSetType", java.lang.Integer.valueOf(this.f436764g), false);
            eVar.d(jSONObject, "flag", java.lang.Long.valueOf(this.f436765h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
