package r45;

/* loaded from: classes4.dex */
public class tn extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.qm1 f468113d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f468114e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tn)) {
            return false;
        }
        r45.tn tnVar = (r45.tn) fVar;
        return n51.f.a(this.f468113d, tnVar.f468113d) && n51.f.a(this.f468114e, tnVar.f468114e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.qm1 qm1Var = this.f468113d;
            if (qm1Var != null) {
                fVar.i(1, qm1Var.mo75928xcd1e8d8());
                this.f468113d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f468114e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.qm1 qm1Var2 = this.f468113d;
            int i18 = qm1Var2 != null ? 0 + b36.f.i(1, qm1Var2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f468114e;
            return gVar2 != null ? i18 + b36.f.b(2, gVar2) : i18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.tn tnVar = (r45.tn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            tnVar.f468114e = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.qm1 qm1Var3 = new r45.qm1();
            if (bArr != null && bArr.length > 0) {
                qm1Var3.mo11468x92b714fd(bArr);
            }
            tnVar.f468113d = qm1Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.qm1 qm1Var = this.f468113d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "box_id", qm1Var, false);
            eVar.d(jSONObject, "last_buffer", this.f468114e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
