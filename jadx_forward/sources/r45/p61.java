package r45;

/* loaded from: classes4.dex */
public class p61 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f464315d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f464316e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f464317f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f464318g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f464319h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p61)) {
            return false;
        }
        r45.p61 p61Var = (r45.p61) fVar;
        return n51.f.a(this.f76492x92037252, p61Var.f76492x92037252) && n51.f.a(this.f464315d, p61Var.f464315d) && n51.f.a(this.f464316e, p61Var.f464316e) && n51.f.a(java.lang.Integer.valueOf(this.f464317f), java.lang.Integer.valueOf(p61Var.f464317f)) && n51.f.a(java.lang.Boolean.valueOf(this.f464318g), java.lang.Boolean.valueOf(p61Var.f464318g)) && n51.f.a(java.lang.Boolean.valueOf(this.f464319h), java.lang.Boolean.valueOf(p61Var.f464319h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f464316e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f464315d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f464317f);
            fVar.a(5, this.f464318g);
            fVar.a(6, this.f464319h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f464315d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            return i18 + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f464317f) + b36.f.a(5, this.f464318g) + b36.f.a(6, this.f464319h);
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
        r45.p61 p61Var = (r45.p61) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    p61Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                p61Var.f464315d = aVar2.d(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ch1 ch1Var = new r45.ch1();
                    if (bArr3 != null && bArr3.length > 0) {
                        ch1Var.mo11468x92b714fd(bArr3);
                    }
                    p61Var.f464316e.add(ch1Var);
                }
                return 0;
            case 4:
                p61Var.f464317f = aVar2.g(intValue);
                return 0;
            case 5:
                p61Var.f464318g = aVar2.c(intValue);
                return 0;
            case 6:
                p61Var.f464319h = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.f76492x92037252;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "last_buffer", this.f464315d, false);
            eVar.d(jSONObject, "app_msg_list", this.f464316e, false);
            eVar.d(jSONObject, "next_interval_ms", java.lang.Integer.valueOf(this.f464317f), false);
            eVar.d(jSONObject, "has_new_msg", java.lang.Boolean.valueOf(this.f464318g), false);
            eVar.d(jSONObject, "need_clear_msg", java.lang.Boolean.valueOf(this.f464319h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
