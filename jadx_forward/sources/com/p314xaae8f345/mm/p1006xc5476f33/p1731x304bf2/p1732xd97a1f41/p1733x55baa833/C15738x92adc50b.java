package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomNotice */
/* loaded from: classes2.dex */
public class C15738x92adc50b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: notice_text */
    public java.lang.String f36592xd74dee34;

    /* renamed from: update_time */
    public long f36593xddd1e883;

    /* renamed from: updater_uin */
    public int f36594xded447e4;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15738x92adc50b m63952xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15738x92adc50b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15738x92adc50b)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15738x92adc50b c15738x92adc50b = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15738x92adc50b) fVar;
        return n51.f.a(this.f36592xd74dee34, c15738x92adc50b.f36592xd74dee34) && n51.f.a(java.lang.Long.valueOf(this.f36593xddd1e883), java.lang.Long.valueOf(c15738x92adc50b.f36593xddd1e883)) && n51.f.a(java.lang.Integer.valueOf(this.f36594xded447e4), java.lang.Integer.valueOf(c15738x92adc50b.f36594xded447e4));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36592xd74dee34;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f36593xddd1e883);
            fVar.e(3, this.f36594xded447e4);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f36592xd74dee34;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f36593xddd1e883) + b36.f.e(3, this.f36594xded447e4);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15738x92adc50b c15738x92adc50b = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15738x92adc50b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15738x92adc50b.f36592xd74dee34 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            c15738x92adc50b.f36593xddd1e883 = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        c15738x92adc50b.f36594xded447e4 = aVar2.g(intValue);
        return 0;
    }

    /* renamed from: setNotice_text */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15738x92adc50b m63953x4789a872(java.lang.String str) {
        this.f36592xd74dee34 = str;
        return this;
    }

    /* renamed from: setUpdate_time */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15738x92adc50b m63954x4e0da2c1(long j17) {
        this.f36593xddd1e883 = j17;
        return this;
    }

    /* renamed from: setUpdater_uin */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15738x92adc50b m63955x4f100222(int i17) {
        this.f36594xded447e4 = i17;
        return this;
    }
}
