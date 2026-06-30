package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend */
/* loaded from: classes4.dex */
public class C15732xa4e12f61 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: brief_content */
    public java.lang.String f36576x69629b4;

    /* renamed from: msg_pack */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 f36577xb37efc17;

    /* renamed from: user_data */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88 f36578x1435639e;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15732xa4e12f61 m63930xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15732xa4e12f61();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15732xa4e12f61)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15732xa4e12f61 c15732xa4e12f61 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15732xa4e12f61) fVar;
        return n51.f.a(this.f36577xb37efc17, c15732xa4e12f61.f36577xb37efc17) && n51.f.a(this.f36578x1435639e, c15732xa4e12f61.f36578x1435639e) && n51.f.a(this.f36576x69629b4, c15732xa4e12f61.f36576x69629b4);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = this.f36577xb37efc17;
            if (c15731x94356d67 != null) {
                fVar.i(1, c15731x94356d67.mo75928xcd1e8d8());
                this.f36577xb37efc17.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88 c15744x2fe9df88 = this.f36578x1435639e;
            if (c15744x2fe9df88 != null) {
                fVar.i(2, c15744x2fe9df88.mo75928xcd1e8d8());
                this.f36578x1435639e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f36576x69629b4;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d672 = this.f36577xb37efc17;
            int i18 = c15731x94356d672 != null ? 0 + b36.f.i(1, c15731x94356d672.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88 c15744x2fe9df882 = this.f36578x1435639e;
            if (c15744x2fe9df882 != null) {
                i18 += b36.f.i(2, c15744x2fe9df882.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f36576x69629b4;
            return str2 != null ? i18 + b36.f.j(3, str2) : i18;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15732xa4e12f61 c15732xa4e12f61 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15732xa4e12f61) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d673 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67();
                if (bArr != null && bArr.length > 0) {
                    c15731x94356d673.mo11468x92b714fd(bArr);
                }
                c15732xa4e12f61.f36577xb37efc17 = c15731x94356d673;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            c15732xa4e12f61.f36576x69629b4 = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88 c15744x2fe9df883 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88();
            if (bArr2 != null && bArr2.length > 0) {
                c15744x2fe9df883.mo11468x92b714fd(bArr2);
            }
            c15732xa4e12f61.f36578x1435639e = c15744x2fe9df883;
        }
        return 0;
    }

    /* renamed from: setBrief_content */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15732xa4e12f61 m63931x56cc4c72(java.lang.String str) {
        this.f36576x69629b4 = str;
        return this;
    }

    /* renamed from: setMsg_pack */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15732xa4e12f61 m63932x2a119a99(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67) {
        this.f36577xb37efc17 = c15731x94356d67;
        return this;
    }

    /* renamed from: setUser_data */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15732xa4e12f61 m63933x6ff6955c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88 c15744x2fe9df88) {
        this.f36578x1435639e = c15744x2fe9df88;
        return this;
    }
}
