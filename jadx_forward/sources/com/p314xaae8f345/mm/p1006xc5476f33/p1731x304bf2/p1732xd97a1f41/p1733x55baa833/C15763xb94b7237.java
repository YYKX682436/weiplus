package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest */
/* loaded from: classes4.dex */
public class C15763xb94b7237 extends r45.mr5 {

    /* renamed from: channel_id */
    public int f36694x8cea31d7;

    /* renamed from: chatroom_name */
    public java.lang.String f36695x3923b317;

    /* renamed from: seq_gt */
    public long f36696xca0164cd;

    /* renamed from: seq_lt */
    public long f36697xca016568;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15763xb94b7237 m64081xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15763xb94b7237();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15763xb94b7237)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15763xb94b7237 c15763xb94b7237 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15763xb94b7237) fVar;
        return n51.f.a(this.f76494x2de60e5e, c15763xb94b7237.f76494x2de60e5e) && n51.f.a(this.f36695x3923b317, c15763xb94b7237.f36695x3923b317) && n51.f.a(java.lang.Long.valueOf(this.f36696xca0164cd), java.lang.Long.valueOf(c15763xb94b7237.f36696xca0164cd)) && n51.f.a(java.lang.Long.valueOf(this.f36697xca016568), java.lang.Long.valueOf(c15763xb94b7237.f36697xca016568)) && n51.f.a(java.lang.Integer.valueOf(this.f36694x8cea31d7), java.lang.Integer.valueOf(c15763xb94b7237.f36694x8cea31d7));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f36695x3923b317;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f36696xca0164cd);
            fVar.h(4, this.f36697xca016568);
            fVar.e(5, this.f36694x8cea31d7);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f36695x3923b317;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.h(3, this.f36696xca0164cd) + b36.f.h(4, this.f36697xca016568) + b36.f.e(5, this.f36694x8cea31d7);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15763xb94b7237 c15763xb94b7237 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15763xb94b7237) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                c15763xb94b7237.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            c15763xb94b7237.f36695x3923b317 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            c15763xb94b7237.f36696xca0164cd = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            c15763xb94b7237.f36697xca016568 = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        c15763xb94b7237.f36694x8cea31d7 = aVar2.g(intValue);
        return 0;
    }

    /* renamed from: setChannel_id */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15763xb94b7237 m64082xa94f37d9(int i17) {
        this.f36694x8cea31d7 = i17;
        return this;
    }

    /* renamed from: setChatroom_name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15763xb94b7237 m64083x8959d5d5(java.lang.String str) {
        this.f36695x3923b317 = str;
        return this;
    }

    /* renamed from: setSeq_gt */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15763xb94b7237 m64084x224dbbcf(long j17) {
        this.f36696xca0164cd = j17;
        return this;
    }

    /* renamed from: setSeq_lt */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15763xb94b7237 m64085x224dbc6a(long j17) {
        this.f36697xca016568 = j17;
        return this;
    }
}
