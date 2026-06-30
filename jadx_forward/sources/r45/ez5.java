package r45;

/* loaded from: classes12.dex */
public class ez5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f455383d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f455384e = new java.util.LinkedList();

    public com.p314xaae8f345.mm.p944x882e457a.i b() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 522;
        lVar.f152199c = "/cgi-bin/micromsg-bin/newsendmsg";
        lVar.f152197a = this;
        lVar.f152198b = new r45.fz5();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
        iVar.p(a17);
        return iVar;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ez5)) {
            return false;
        }
        r45.ez5 ez5Var = (r45.ez5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455383d), java.lang.Integer.valueOf(ez5Var.f455383d)) && n51.f.a(this.f455384e, ez5Var.f455384e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f455384e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455383d);
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f455383d) + 0 + b36.f.g(2, 8, linkedList);
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
        r45.ez5 ez5Var = (r45.ez5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ez5Var.f455383d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.ll4 ll4Var = new r45.ll4();
            if (bArr2 != null && bArr2.length > 0) {
                ll4Var.mo11468x92b714fd(bArr2);
            }
            ez5Var.f455384e.add(ll4Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f455383d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Count", valueOf, false);
            eVar.d(jSONObject, "List", this.f455384e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
