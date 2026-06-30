package r45;

/* loaded from: classes9.dex */
public class jo extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f459514d;

    /* renamed from: e, reason: collision with root package name */
    public int f459515e;

    /* renamed from: f, reason: collision with root package name */
    public int f459516f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f459517g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f459518h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jo)) {
            return false;
        }
        r45.jo joVar = (r45.jo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f459514d), java.lang.Integer.valueOf(joVar.f459514d)) && n51.f.a(java.lang.Integer.valueOf(this.f459515e), java.lang.Integer.valueOf(joVar.f459515e)) && n51.f.a(java.lang.Integer.valueOf(this.f459516f), java.lang.Integer.valueOf(joVar.f459516f)) && n51.f.a(this.f459517g, joVar.f459517g) && n51.f.a(this.f459518h, joVar.f459518h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f459518h;
        java.util.LinkedList linkedList2 = this.f459517g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f459514d);
            fVar.e(2, this.f459515e);
            fVar.e(5, this.f459516f);
            fVar.g(3, 8, linkedList2);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f459514d) + 0 + b36.f.e(2, this.f459515e) + b36.f.e(5, this.f459516f) + b36.f.g(3, 8, linkedList2) + b36.f.g(4, 8, linkedList);
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
        r45.jo joVar = (r45.jo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            joVar.f459514d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            joVar.f459515e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.io ioVar = new r45.io();
                if (bArr2 != null && bArr2.length > 0) {
                    ioVar.mo11468x92b714fd(bArr2);
                }
                joVar.f459517g.add(ioVar);
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            joVar.f459516f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.io ioVar2 = new r45.io();
            if (bArr3 != null && bArr3.length > 0) {
                ioVar2.mo11468x92b714fd(bArr3);
            }
            joVar.f459518h.add(ioVar2);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f459514d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "LongConnectIPCount", valueOf, false);
            eVar.d(jSONObject, "ShortConnectIPCount", java.lang.Integer.valueOf(this.f459515e), false);
            eVar.d(jSONObject, "Seq", java.lang.Integer.valueOf(this.f459516f), false);
            eVar.d(jSONObject, "LongConnectIPList", this.f459517g, false);
            eVar.d(jSONObject, "ShortConnectIPList", this.f459518h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
