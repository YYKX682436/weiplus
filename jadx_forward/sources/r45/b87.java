package r45;

/* loaded from: classes7.dex */
public class b87 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.k87 f452167d;

    /* renamed from: f, reason: collision with root package name */
    public long f452169f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f452168e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f452170g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b87)) {
            return false;
        }
        r45.b87 b87Var = (r45.b87) fVar;
        return n51.f.a(this.f452167d, b87Var.f452167d) && n51.f.a(this.f452168e, b87Var.f452168e) && n51.f.a(java.lang.Long.valueOf(this.f452169f), java.lang.Long.valueOf(b87Var.f452169f)) && n51.f.a(this.f452170g, b87Var.f452170g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f452170g;
        java.util.LinkedList linkedList2 = this.f452168e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.k87 k87Var = this.f452167d;
            if (k87Var != null) {
                fVar.i(1, k87Var.mo75928xcd1e8d8());
                this.f452167d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList2);
            fVar.h(3, this.f452169f);
            fVar.g(4, 6, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.k87 k87Var2 = this.f452167d;
            return (k87Var2 != null ? 0 + b36.f.i(1, k87Var2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList2) + b36.f.h(3, this.f452169f) + b36.f.g(4, 6, linkedList);
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
        r45.b87 b87Var = (r45.b87) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.k87 k87Var3 = new r45.k87();
                if (bArr2 != null && bArr2.length > 0) {
                    k87Var3.mo11468x92b714fd(bArr2);
                }
                b87Var.f452167d = k87Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                b87Var.f452169f = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            b87Var.f452170g.add(aVar2.d(intValue));
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.y77 y77Var = new r45.y77();
            if (bArr3 != null && bArr3.length > 0) {
                y77Var.mo11468x92b714fd(bArr3);
            }
            b87Var.f452168e.add(y77Var);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.k87 k87Var = this.f452167d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "user_info", k87Var, false);
            eVar.d(jSONObject, "content_infos", this.f452168e, false);
            eVar.d(jSONObject, "total_file_size", java.lang.Long.valueOf(this.f452169f), false);
            eVar.d(jSONObject, "thumbnails", this.f452170g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
