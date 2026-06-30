package com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd;

/* loaded from: classes11.dex */
public class u extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f300725d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f300726e = "";

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.v f300727f = com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.v.BizShowReddotType_ShowUnReadNum;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j f300728g = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j();

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j f300729h = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j();

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.u();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.u mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.u) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.u)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.u uVar = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.u) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f300725d), java.lang.Integer.valueOf(uVar.f300725d)) && n51.f.a(this.f300726e, uVar.f300726e) && n51.f.a(this.f300727f, uVar.f300727f) && n51.f.a(this.f300728g, uVar.f300728g) && n51.f.a(this.f300729h, uVar.f300729h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.u();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f300725d);
            java.lang.String str = this.f300726e;
            if (str != null) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.v vVar = this.f300727f;
            if (vVar != null) {
                fVar.e(3, vVar.f300735d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j jVar = this.f300728g;
            if (jVar != null) {
                fVar.i(4, jVar.mo75928xcd1e8d8());
                this.f300728g.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j jVar2 = this.f300729h;
            if (jVar2 != null) {
                fVar.i(5, jVar2.mo75928xcd1e8d8());
                this.f300729h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f300725d) + 0;
            java.lang.String str2 = this.f300726e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.v vVar2 = this.f300727f;
            if (vVar2 != null) {
                e17 += b36.f.e(3, vVar2.f300735d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j jVar3 = this.f300728g;
            if (jVar3 != null) {
                e17 += b36.f.i(4, jVar3.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j jVar4 = this.f300729h;
            return jVar4 != null ? e17 + b36.f.i(5, jVar4.mo75928xcd1e8d8()) : e17;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f300725d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f300726e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            int g17 = aVar2.g(intValue);
            this.f300727f = g17 != 1 ? g17 != 2 ? g17 != 3 ? null : com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.v.BizShowReddotType_NotShowRedDot : com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.v.BizShowReddotType_ShowUnReadAsRedDot : com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.v.BizShowReddotType_ShowUnReadNum;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j jVar5 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j();
                if (bArr != null && bArr.length > 0) {
                    jVar5.mo11468x92b714fd(bArr);
                }
                this.f300728g = jVar5;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j jVar6 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j();
            if (bArr2 != null && bArr2.length > 0) {
                jVar6.mo11468x92b714fd(bArr2);
            }
            this.f300729h = jVar6;
        }
        return 0;
    }
}
