package r45;

/* loaded from: classes2.dex */
public class yp extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472799d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472800e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f472801f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yp)) {
            return false;
        }
        r45.yp ypVar = (r45.yp) fVar;
        return n51.f.a(this.f472799d, ypVar.f472799d) && n51.f.a(this.f472800e, ypVar.f472800e) && n51.f.a(this.f472801f, ypVar.f472801f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472801f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f472799d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f472800e;
            if (gVar2 != null) {
                fVar.b(2, gVar2);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f472799d;
            int b17 = gVar3 != null ? 0 + b36.f.b(1, gVar3) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f472800e;
            if (gVar4 != null) {
                b17 += b36.f.b(2, gVar4);
            }
            return b17 + b36.f.g(3, 8, linkedList);
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
        r45.yp ypVar = (r45.yp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ypVar.f472799d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            ypVar.f472800e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.p06 p06Var = new r45.p06();
            if (bArr2 != null && bArr2.length > 0) {
                p06Var.mo11468x92b714fd(bArr2);
            }
            ypVar.f472801f.add(p06Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f472799d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Title", gVar, false);
            eVar.d(jSONObject, "ServiceUrl", this.f472800e, false);
            eVar.d(jSONObject, "ItemFieldList", this.f472801f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
