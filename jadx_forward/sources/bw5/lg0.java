package bw5;

/* loaded from: classes4.dex */
public class lg0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f111307d;

    /* renamed from: f, reason: collision with root package name */
    public int f111309f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.kj0 f111310g;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f111308e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f111311h = new boolean[5];

    static {
        new bw5.lg0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lg0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.lg0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lg0)) {
            return false;
        }
        bw5.lg0 lg0Var = (bw5.lg0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f111307d), java.lang.Integer.valueOf(lg0Var.f111307d)) && n51.f.a(this.f111308e, lg0Var.f111308e) && n51.f.a(java.lang.Integer.valueOf(this.f111309f), java.lang.Integer.valueOf(lg0Var.f111309f)) && n51.f.a(this.f111310g, lg0Var.f111310g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.lg0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f111308e;
        boolean[] zArr = this.f111311h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f111307d);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.e(3, this.f111309f);
            }
            bw5.kj0 kj0Var = this.f111310g;
            if (kj0Var != null && zArr[4]) {
                fVar.i(4, kj0Var.mo75928xcd1e8d8());
                this.f111310g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? 0 + b36.f.e(1, this.f111307d) : 0) + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f111309f);
            }
            bw5.kj0 kj0Var2 = this.f111310g;
            return (kj0Var2 == null || !zArr[4]) ? e17 : e17 + b36.f.i(4, kj0Var2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f111307d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.g10 g10Var = new bw5.g10();
                if (bArr != null && bArr.length > 0) {
                    g10Var.mo11468x92b714fd(bArr);
                }
                linkedList.add(g10Var);
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f111309f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.kj0 kj0Var3 = new bw5.kj0();
            if (bArr2 != null && bArr2.length > 0) {
                kj0Var3.mo11468x92b714fd(bArr2);
            }
            this.f111310g = kj0Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f111307d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "type", valueOf, false);
            eVar.d(jSONObject, "product_infos", this.f111308e, false);
            eVar.d(jSONObject, "condition", java.lang.Integer.valueOf(this.f111309f), false);
            eVar.d(jSONObject, "shelf_message_entrance_info", this.f111310g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
