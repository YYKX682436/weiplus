package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack */
/* loaded from: classes15.dex */
public class C15731x94356d67 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: channel_id */
    public int f36568x8cea31d7;

    /* renamed from: cli_msg_id */
    public java.lang.String f36569x2960698;

    /* renamed from: from_username */
    public java.lang.String f36570xfd4da1cb;

    /* renamed from: msg_content */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15791x7c5dbdd8 f36571x8f2d71bb;

    /* renamed from: msg_options */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd f36572xbfcc3e0;

    /* renamed from: msg_sub_type */
    public int f36573xfc5ddcd7;

    /* renamed from: msg_type */
    public int f36574xb3812938;

    /* renamed from: send_time */
    public long f36575x197b124;
    public long seq;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 m63920xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f36574xb3812938), java.lang.Integer.valueOf(c15731x94356d67.f36574xb3812938)) && n51.f.a(this.f36570xfd4da1cb, c15731x94356d67.f36570xfd4da1cb) && n51.f.a(this.f36569x2960698, c15731x94356d67.f36569x2960698) && n51.f.a(java.lang.Long.valueOf(this.seq), java.lang.Long.valueOf(c15731x94356d67.seq)) && n51.f.a(java.lang.Long.valueOf(this.f36575x197b124), java.lang.Long.valueOf(c15731x94356d67.f36575x197b124)) && n51.f.a(this.f36571x8f2d71bb, c15731x94356d67.f36571x8f2d71bb) && n51.f.a(this.f36572xbfcc3e0, c15731x94356d67.f36572xbfcc3e0) && n51.f.a(java.lang.Integer.valueOf(this.f36573xfc5ddcd7), java.lang.Integer.valueOf(c15731x94356d67.f36573xfc5ddcd7)) && n51.f.a(java.lang.Integer.valueOf(this.f36568x8cea31d7), java.lang.Integer.valueOf(c15731x94356d67.f36568x8cea31d7));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f36574xb3812938);
            java.lang.String str = this.f36570xfd4da1cb;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f36569x2960698;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.seq);
            fVar.h(5, this.f36575x197b124);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15791x7c5dbdd8 c15791x7c5dbdd8 = this.f36571x8f2d71bb;
            if (c15791x7c5dbdd8 != null) {
                fVar.i(6, c15791x7c5dbdd8.mo75928xcd1e8d8());
                this.f36571x8f2d71bb.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd c15792xf92d0ffd = this.f36572xbfcc3e0;
            if (c15792xf92d0ffd != null) {
                fVar.i(7, c15792xf92d0ffd.mo75928xcd1e8d8());
                this.f36572xbfcc3e0.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f36573xfc5ddcd7);
            fVar.e(9, this.f36568x8cea31d7);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f36574xb3812938) + 0;
            java.lang.String str3 = this.f36570xfd4da1cb;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f36569x2960698;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            int h17 = e17 + b36.f.h(4, this.seq) + b36.f.h(5, this.f36575x197b124);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15791x7c5dbdd8 c15791x7c5dbdd82 = this.f36571x8f2d71bb;
            if (c15791x7c5dbdd82 != null) {
                h17 += b36.f.i(6, c15791x7c5dbdd82.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd c15792xf92d0ffd2 = this.f36572xbfcc3e0;
            if (c15792xf92d0ffd2 != null) {
                h17 += b36.f.i(7, c15792xf92d0ffd2.mo75928xcd1e8d8());
            }
            return h17 + b36.f.e(8, this.f36573xfc5ddcd7) + b36.f.e(9, this.f36568x8cea31d7);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c15731x94356d67.f36574xb3812938 = aVar2.g(intValue);
                return 0;
            case 2:
                c15731x94356d67.f36570xfd4da1cb = aVar2.k(intValue);
                return 0;
            case 3:
                c15731x94356d67.f36569x2960698 = aVar2.k(intValue);
                return 0;
            case 4:
                c15731x94356d67.seq = aVar2.i(intValue);
                return 0;
            case 5:
                c15731x94356d67.f36575x197b124 = aVar2.i(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15791x7c5dbdd8 c15791x7c5dbdd83 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15791x7c5dbdd8();
                    if (bArr != null && bArr.length > 0) {
                        c15791x7c5dbdd83.mo11468x92b714fd(bArr);
                    }
                    c15731x94356d67.f36571x8f2d71bb = c15791x7c5dbdd83;
                }
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd c15792xf92d0ffd3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd();
                    if (bArr2 != null && bArr2.length > 0) {
                        c15792xf92d0ffd3.mo11468x92b714fd(bArr2);
                    }
                    c15731x94356d67.f36572xbfcc3e0 = c15792xf92d0ffd3;
                }
                return 0;
            case 8:
                c15731x94356d67.f36573xfc5ddcd7 = aVar2.g(intValue);
                return 0;
            case 9:
                c15731x94356d67.f36568x8cea31d7 = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setChannel_id */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 m63921xa94f37d9(int i17) {
        this.f36568x8cea31d7 = i17;
        return this;
    }

    /* renamed from: setCli_msg_id */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 m63922x1efb0c9a(java.lang.String str) {
        this.f36569x2960698 = str;
        return this;
    }

    /* renamed from: setFrom_username */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 m63923x4d83c489(java.lang.String str) {
        this.f36570xfd4da1cb = str;
        return this;
    }

    /* renamed from: setMsg_content */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 m63924xff692bf9(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15791x7c5dbdd8 c15791x7c5dbdd8) {
        this.f36571x8f2d71bb = c15791x7c5dbdd8;
        return this;
    }

    /* renamed from: setMsg_options */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 m63925x7c387e1e(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd c15792xf92d0ffd) {
        this.f36572xbfcc3e0 = c15792xf92d0ffd;
        return this;
    }

    /* renamed from: setMsg_sub_type */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 m63926x93996a59(int i17) {
        this.f36573xfc5ddcd7 = i17;
        return this;
    }

    /* renamed from: setMsg_type */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 m63927x2a13c7ba(int i17) {
        this.f36574xb3812938 = i17;
        return this;
    }

    /* renamed from: setSend_time */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 m63928x5d58e2e2(long j17) {
        this.f36575x197b124 = j17;
        return this;
    }

    /* renamed from: setSeq */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 m63929xca02949d(long j17) {
        this.seq = j17;
        return this;
    }
}
