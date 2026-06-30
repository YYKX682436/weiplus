package r45;

/* loaded from: classes11.dex */
public class vy extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f470190d;

    /* renamed from: f, reason: collision with root package name */
    public int f470192f;

    /* renamed from: g, reason: collision with root package name */
    public r45.du5 f470193g;

    /* renamed from: h, reason: collision with root package name */
    public int f470194h;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f470191e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f470195i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vy)) {
            return false;
        }
        r45.vy vyVar = (r45.vy) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f470190d), java.lang.Integer.valueOf(vyVar.f470190d)) && n51.f.a(this.f470191e, vyVar.f470191e) && n51.f.a(java.lang.Integer.valueOf(this.f470192f), java.lang.Integer.valueOf(vyVar.f470192f)) && n51.f.a(this.f470193g, vyVar.f470193g) && n51.f.a(java.lang.Integer.valueOf(this.f470194h), java.lang.Integer.valueOf(vyVar.f470194h)) && n51.f.a(this.f470195i, vyVar.f470195i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470195i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f470190d);
            fVar.g(2, 8, this.f470191e);
            fVar.e(3, this.f470192f);
            r45.du5 du5Var = this.f470193g;
            if (du5Var != null) {
                fVar.i(4, du5Var.mo75928xcd1e8d8());
                this.f470193g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f470194h);
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f470190d) + 0 + b36.f.g(2, 8, this.f470191e) + b36.f.e(3, this.f470192f);
            r45.du5 du5Var2 = this.f470193g;
            if (du5Var2 != null) {
                e17 += b36.f.i(4, du5Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(5, this.f470194h) + b36.f.g(6, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f470191e.clear();
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
        r45.vy vyVar = (r45.vy) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vyVar.f470190d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.wy wyVar = new r45.wy();
                    if (bArr2 != null && bArr2.length > 0) {
                        wyVar.mo11468x92b714fd(bArr2);
                    }
                    vyVar.f470191e.add(wyVar);
                }
                return 0;
            case 3:
                vyVar.f470192f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var3.b(bArr3);
                    }
                    vyVar.f470193g = du5Var3;
                }
                return 0;
            case 5:
                vyVar.f470194h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.az azVar = new r45.az();
                    if (bArr4 != null && bArr4.length > 0) {
                        azVar.mo11468x92b714fd(bArr4);
                    }
                    vyVar.f470195i.add(azVar);
                }
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f470190d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "MemberCount", valueOf, false);
            eVar.d(jSONObject, "ChatRoomMember", this.f470191e, false);
            eVar.d(jSONObject, "InfoMask", java.lang.Integer.valueOf(this.f470192f), false);
            eVar.d(jSONObject, "ChatRoomUserName", this.f470193g, false);
            eVar.d(jSONObject, "WatchMemberCount", java.lang.Integer.valueOf(this.f470194h), false);
            eVar.d(jSONObject, "WatchMembers", this.f470195i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
