package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo */
/* loaded from: classes4.dex */
public class C15835xa11d0ad8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: can_vote */
    public boolean f36907xf877edf9;

    /* renamed from: desc */
    public java.lang.String f36908x2efe91;

    /* renamed from: latest_voter_username_list */
    public java.util.LinkedList<java.lang.String> f36909x1c2b6878 = new java.util.LinkedList<>();

    /* renamed from: show_type */
    public int f36910x8e8dc33c;

    /* renamed from: voted_by_me */
    public boolean f36911x9c46cbb;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8 m64372xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8 c15835xa11d0ad8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8) fVar;
        return n51.f.a(this.f36909x1c2b6878, c15835xa11d0ad8.f36909x1c2b6878) && n51.f.a(this.f36908x2efe91, c15835xa11d0ad8.f36908x2efe91) && n51.f.a(java.lang.Integer.valueOf(this.f36910x8e8dc33c), java.lang.Integer.valueOf(c15835xa11d0ad8.f36910x8e8dc33c)) && n51.f.a(java.lang.Boolean.valueOf(this.f36911x9c46cbb), java.lang.Boolean.valueOf(c15835xa11d0ad8.f36911x9c46cbb)) && n51.f.a(java.lang.Boolean.valueOf(this.f36907xf877edf9), java.lang.Boolean.valueOf(c15835xa11d0ad8.f36907xf877edf9));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, this.f36909x1c2b6878);
            java.lang.String str = this.f36908x2efe91;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f36910x8e8dc33c);
            fVar.a(4, this.f36911x9c46cbb);
            fVar.a(5, this.f36907xf877edf9);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, this.f36909x1c2b6878) + 0;
            java.lang.String str2 = this.f36908x2efe91;
            if (str2 != null) {
                g17 += b36.f.j(2, str2);
            }
            return g17 + b36.f.e(3, this.f36910x8e8dc33c) + b36.f.a(4, this.f36911x9c46cbb) + b36.f.a(5, this.f36907xf877edf9);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f36909x1c2b6878.clear();
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8 c15835xa11d0ad8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15835xa11d0ad8.f36909x1c2b6878.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 2) {
            c15835xa11d0ad8.f36908x2efe91 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            c15835xa11d0ad8.f36910x8e8dc33c = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            c15835xa11d0ad8.f36911x9c46cbb = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        c15835xa11d0ad8.f36907xf877edf9 = aVar2.c(intValue);
        return 0;
    }

    /* renamed from: setCan_vote */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8 m64373x6f0a8c7b(boolean z17) {
        this.f36907xf877edf9 = z17;
        return this;
    }

    /* renamed from: setDesc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8 m64374x76492e13(java.lang.String str) {
        this.f36908x2efe91 = str;
        return this;
    }

    /* renamed from: setLatest_voter_username_list */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8 m64375x6b182a7a(java.util.LinkedList<java.lang.String> linkedList) {
        this.f36909x1c2b6878 = linkedList;
        return this;
    }

    /* renamed from: setShow_type */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8 m64376xea4ef4fa(int i17) {
        this.f36910x8e8dc33c = i17;
        return this;
    }

    /* renamed from: setVoted_by_me */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8 m64377x7a0026f9(boolean z17) {
        this.f36911x9c46cbb = z17;
        return this;
    }
}
