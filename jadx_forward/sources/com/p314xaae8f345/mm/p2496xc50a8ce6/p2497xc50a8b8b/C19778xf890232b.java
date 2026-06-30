package com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b;

/* renamed from: com.tencent.mm.protocal.protobuf.EncryptJNIFuncCallParam */
/* loaded from: classes4.dex */
public class C19778xf890232b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: ContactInfoUIScreenShotInfoParam */
    public r45.p80 f38900xa4e98257;

    /* renamed from: FuncID */
    public int f38901x7e1776ff;

    /* renamed from: PaiedOrderUIScreenShotInfoParam */
    public r45.n45 f38902xfe1d844e;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19778xf890232b m76017xaf65a0fc() {
        return new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19778xf890232b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19778xf890232b)) {
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19778xf890232b c19778xf890232b = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19778xf890232b) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f38901x7e1776ff), java.lang.Integer.valueOf(c19778xf890232b.f38901x7e1776ff)) && n51.f.a(this.f38902xfe1d844e, c19778xf890232b.f38902xfe1d844e) && n51.f.a(this.f38900xa4e98257, c19778xf890232b.f38900xa4e98257);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f38901x7e1776ff);
            r45.n45 n45Var = this.f38902xfe1d844e;
            if (n45Var != null) {
                fVar.i(2, n45Var.mo75928xcd1e8d8());
                this.f38902xfe1d844e.mo75956x3d5d1f78(fVar);
            }
            r45.p80 p80Var = this.f38900xa4e98257;
            if (p80Var != null) {
                fVar.i(3, p80Var.mo75928xcd1e8d8());
                this.f38900xa4e98257.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f38901x7e1776ff) + 0;
            r45.n45 n45Var2 = this.f38902xfe1d844e;
            if (n45Var2 != null) {
                e17 += b36.f.i(2, n45Var2.mo75928xcd1e8d8());
            }
            r45.p80 p80Var2 = this.f38900xa4e98257;
            return p80Var2 != null ? e17 + b36.f.i(3, p80Var2.mo75928xcd1e8d8()) : e17;
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
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19778xf890232b c19778xf890232b = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19778xf890232b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c19778xf890232b.f38901x7e1776ff = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.n45 n45Var3 = new r45.n45();
                if (bArr != null && bArr.length > 0) {
                    n45Var3.mo11468x92b714fd(bArr);
                }
                c19778xf890232b.f38902xfe1d844e = n45Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.p80 p80Var3 = new r45.p80();
            if (bArr2 != null && bArr2.length > 0) {
                p80Var3.mo11468x92b714fd(bArr2);
            }
            c19778xf890232b.f38900xa4e98257 = p80Var3;
        }
        return 0;
    }

    /* renamed from: setContactInfoUIScreenShotInfoParam */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19778xf890232b m76018xfb9136b9(r45.p80 p80Var) {
        this.f38900xa4e98257 = p80Var;
        return this;
    }

    /* renamed from: setFuncID */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19778xf890232b m76019xcfee1e1(int i17) {
        this.f38901x7e1776ff = i17;
        return this;
    }

    /* renamed from: setPaiedOrderUIScreenShotInfoParam */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19778xf890232b m76020xcf5cbbac(r45.n45 n45Var) {
        this.f38902xfe1d844e = n45Var;
        return this;
    }
}
