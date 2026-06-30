package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.PremadeCardInfo */
/* loaded from: classes4.dex */
public class C15801x63595e16 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: premade_info */
    public java.lang.String f36821xe5b39255;

    /* renamed from: team_icon_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15823xa060e096 f36822x163c7152;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15801x63595e16 m64249xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15801x63595e16();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15801x63595e16)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15801x63595e16 c15801x63595e16 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15801x63595e16) fVar;
        return n51.f.a(this.f36821xe5b39255, c15801x63595e16.f36821xe5b39255) && n51.f.a(this.f36822x163c7152, c15801x63595e16.f36822x163c7152);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36821xe5b39255;
            if (str != null) {
                fVar.j(1, str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15823xa060e096 c15823xa060e096 = this.f36822x163c7152;
            if (c15823xa060e096 != null) {
                fVar.i(2, c15823xa060e096.mo75928xcd1e8d8());
                this.f36822x163c7152.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f36821xe5b39255;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15823xa060e096 c15823xa060e0962 = this.f36822x163c7152;
            return c15823xa060e0962 != null ? j17 + b36.f.i(2, c15823xa060e0962.mo75928xcd1e8d8()) : j17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15801x63595e16 c15801x63595e16 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15801x63595e16) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15801x63595e16.f36821xe5b39255 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15823xa060e096 c15823xa060e0963 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15823xa060e096();
            if (bArr != null && bArr.length > 0) {
                c15823xa060e0963.mo11468x92b714fd(bArr);
            }
            c15801x63595e16.f36822x163c7152 = c15823xa060e0963;
        }
        return 0;
    }

    /* renamed from: setPremade_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15801x63595e16 m64250x7cef1fd7(java.lang.String str) {
        this.f36821xe5b39255 = str;
        return this;
    }

    /* renamed from: setTeam_icon_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15801x63595e16 m64251xcccaa654(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15823xa060e096 c15823xa060e096) {
        this.f36822x163c7152 = c15823xa060e096;
        return this;
    }
}
