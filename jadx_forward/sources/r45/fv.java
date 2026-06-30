package r45;

/* loaded from: classes4.dex */
public class fv extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f456145d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f456146e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f456147f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fv)) {
            return false;
        }
        r45.fv fvVar = (r45.fv) fVar;
        return n51.f.a(this.f456145d, fvVar.f456145d) && n51.f.a(this.f456146e, fvVar.f456146e) && n51.f.a(this.f456147f, fvVar.f456147f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f456145d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f456146e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f456147f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f456146e;
            if (gVar3 != null) {
                g17 += b36.f.b(2, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f456147f;
            return gVar4 != null ? g17 + b36.f.b(3, gVar4) : g17;
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
        r45.fv fvVar = (r45.fv) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                fvVar.f456146e = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            fvVar.f456147f = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.ev6 ev6Var = new r45.ev6();
            if (bArr2 != null && bArr2.length > 0) {
                ev6Var.mo11468x92b714fd(bArr2);
            }
            fvVar.f456145d.add(ev6Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.LinkedList linkedList = this.f456145d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "CdnUrlInfo", linkedList, false);
            eVar.d(jSONObject, "CoverUrl", this.f456146e, false);
            eVar.d(jSONObject, "ArticleUrl", this.f456147f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
