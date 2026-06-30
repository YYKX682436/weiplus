package r45;

/* loaded from: classes2.dex */
public class jm extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459454d;

    /* renamed from: e, reason: collision with root package name */
    public int f459455e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f459456f;

    /* renamed from: g, reason: collision with root package name */
    public int f459457g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f459458h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jm)) {
            return false;
        }
        r45.jm jmVar = (r45.jm) fVar;
        return n51.f.a(this.f459454d, jmVar.f459454d) && n51.f.a(java.lang.Integer.valueOf(this.f459455e), java.lang.Integer.valueOf(jmVar.f459455e)) && n51.f.a(this.f459456f, jmVar.f459456f) && n51.f.a(java.lang.Integer.valueOf(this.f459457g), java.lang.Integer.valueOf(jmVar.f459457g)) && n51.f.a(this.f459458h, jmVar.f459458h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f459458h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459454d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f459455e);
            java.lang.String str2 = this.f459456f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f459457g);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f459454d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f459455e);
            java.lang.String str4 = this.f459456f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f459457g) + b36.f.g(5, 8, linkedList);
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
        r45.jm jmVar = (r45.jm) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jmVar.f459454d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            jmVar.f459455e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            jmVar.f459456f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            jmVar.f459457g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.dj djVar = new r45.dj();
            if (bArr2 != null && bArr2.length > 0) {
                djVar.mo11468x92b714fd(bArr2);
            }
            jmVar.f459458h.add(djVar);
        }
        return 0;
    }
}
