package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions */
/* loaded from: classes4.dex */
public class C15792xf92d0ffd extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: at_list */
    public java.util.LinkedList<java.lang.String> f36773xd69c052a = new java.util.LinkedList<>();

    /* renamed from: bg_type */
    public int f36774xf5571ef4;

    /* renamed from: chosen_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15747xab9f2f60 f36775x6610f15b;

    /* renamed from: cli_local_data */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f36776xae74947d;

    /* renamed from: complaint_url */
    public java.lang.String f36777x3617a3db;

    /* renamed from: msg_biz_type */
    public int f36778xc49369e4;

    /* renamed from: msg_channel_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15790xa0c6de30 f36779xc6ad0668;

    /* renamed from: reply_seq */
    public long f36780xe62b798a;

    /* renamed from: self_msg */
    public boolean f36781x4712200e;

    /* renamed from: tickle_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15825xfe7745c4 f36782x6e3ba777;

    /* renamed from: topic_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d f36783xce4135be;

    /* renamed from: vote_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8 f36784xc460ce3;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd m64190xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd c15792xf92d0ffd = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd) fVar;
        return n51.f.a(this.f36773xd69c052a, c15792xf92d0ffd.f36773xd69c052a) && n51.f.a(this.f36777x3617a3db, c15792xf92d0ffd.f36777x3617a3db) && n51.f.a(this.f36776xae74947d, c15792xf92d0ffd.f36776xae74947d) && n51.f.a(java.lang.Integer.valueOf(this.f36778xc49369e4), java.lang.Integer.valueOf(c15792xf92d0ffd.f36778xc49369e4)) && n51.f.a(java.lang.Boolean.valueOf(this.f36781x4712200e), java.lang.Boolean.valueOf(c15792xf92d0ffd.f36781x4712200e)) && n51.f.a(java.lang.Long.valueOf(this.f36780xe62b798a), java.lang.Long.valueOf(c15792xf92d0ffd.f36780xe62b798a)) && n51.f.a(this.f36784xc460ce3, c15792xf92d0ffd.f36784xc460ce3) && n51.f.a(java.lang.Integer.valueOf(this.f36774xf5571ef4), java.lang.Integer.valueOf(c15792xf92d0ffd.f36774xf5571ef4)) && n51.f.a(this.f36775x6610f15b, c15792xf92d0ffd.f36775x6610f15b) && n51.f.a(this.f36779xc6ad0668, c15792xf92d0ffd.f36779xc6ad0668) && n51.f.a(this.f36783xce4135be, c15792xf92d0ffd.f36783xce4135be) && n51.f.a(this.f36782x6e3ba777, c15792xf92d0ffd.f36782x6e3ba777);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, this.f36773xd69c052a);
            java.lang.String str = this.f36777x3617a3db;
            if (str != null) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f36776xae74947d;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f36778xc49369e4);
            fVar.a(5, this.f36781x4712200e);
            fVar.h(6, this.f36780xe62b798a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8 c15835xa11d0ad8 = this.f36784xc460ce3;
            if (c15835xa11d0ad8 != null) {
                fVar.i(7, c15835xa11d0ad8.mo75928xcd1e8d8());
                this.f36784xc460ce3.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f36774xf5571ef4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15747xab9f2f60 c15747xab9f2f60 = this.f36775x6610f15b;
            if (c15747xab9f2f60 != null) {
                fVar.i(9, c15747xab9f2f60.mo75928xcd1e8d8());
                this.f36775x6610f15b.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15790xa0c6de30 c15790xa0c6de30 = this.f36779xc6ad0668;
            if (c15790xa0c6de30 != null) {
                fVar.i(10, c15790xa0c6de30.mo75928xcd1e8d8());
                this.f36779xc6ad0668.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d c15828x8e93965d = this.f36783xce4135be;
            if (c15828x8e93965d != null) {
                fVar.i(11, c15828x8e93965d.mo75928xcd1e8d8());
                this.f36783xce4135be.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15825xfe7745c4 c15825xfe7745c4 = this.f36782x6e3ba777;
            if (c15825xfe7745c4 != null) {
                fVar.i(12, c15825xfe7745c4.mo75928xcd1e8d8());
                this.f36782x6e3ba777.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, this.f36773xd69c052a) + 0;
            java.lang.String str2 = this.f36777x3617a3db;
            if (str2 != null) {
                g17 += b36.f.j(2, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f36776xae74947d;
            if (gVar2 != null) {
                g17 += b36.f.b(3, gVar2);
            }
            int e17 = g17 + b36.f.e(4, this.f36778xc49369e4) + b36.f.a(5, this.f36781x4712200e) + b36.f.h(6, this.f36780xe62b798a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8 c15835xa11d0ad82 = this.f36784xc460ce3;
            if (c15835xa11d0ad82 != null) {
                e17 += b36.f.i(7, c15835xa11d0ad82.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(8, this.f36774xf5571ef4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15747xab9f2f60 c15747xab9f2f602 = this.f36775x6610f15b;
            if (c15747xab9f2f602 != null) {
                e18 += b36.f.i(9, c15747xab9f2f602.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15790xa0c6de30 c15790xa0c6de302 = this.f36779xc6ad0668;
            if (c15790xa0c6de302 != null) {
                e18 += b36.f.i(10, c15790xa0c6de302.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d c15828x8e93965d2 = this.f36783xce4135be;
            if (c15828x8e93965d2 != null) {
                e18 += b36.f.i(11, c15828x8e93965d2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15825xfe7745c4 c15825xfe7745c42 = this.f36782x6e3ba777;
            return c15825xfe7745c42 != null ? e18 + b36.f.i(12, c15825xfe7745c42.mo75928xcd1e8d8()) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f36773xd69c052a.clear();
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd c15792xf92d0ffd = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c15792xf92d0ffd.f36773xd69c052a.add(aVar2.k(intValue));
                return 0;
            case 2:
                c15792xf92d0ffd.f36777x3617a3db = aVar2.k(intValue);
                return 0;
            case 3:
                c15792xf92d0ffd.f36776xae74947d = aVar2.d(intValue);
                return 0;
            case 4:
                c15792xf92d0ffd.f36778xc49369e4 = aVar2.g(intValue);
                return 0;
            case 5:
                c15792xf92d0ffd.f36781x4712200e = aVar2.c(intValue);
                return 0;
            case 6:
                c15792xf92d0ffd.f36780xe62b798a = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8 c15835xa11d0ad83 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8();
                    if (bArr2 != null && bArr2.length > 0) {
                        c15835xa11d0ad83.mo11468x92b714fd(bArr2);
                    }
                    c15792xf92d0ffd.f36784xc460ce3 = c15835xa11d0ad83;
                }
                return 0;
            case 8:
                c15792xf92d0ffd.f36774xf5571ef4 = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15747xab9f2f60 c15747xab9f2f603 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15747xab9f2f60();
                    if (bArr3 != null && bArr3.length > 0) {
                        c15747xab9f2f603.mo11468x92b714fd(bArr3);
                    }
                    c15792xf92d0ffd.f36775x6610f15b = c15747xab9f2f603;
                }
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15790xa0c6de30 c15790xa0c6de303 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15790xa0c6de30();
                    if (bArr4 != null && bArr4.length > 0) {
                        c15790xa0c6de303.mo11468x92b714fd(bArr4);
                    }
                    c15792xf92d0ffd.f36779xc6ad0668 = c15790xa0c6de303;
                }
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d c15828x8e93965d3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d();
                    if (bArr5 != null && bArr5.length > 0) {
                        c15828x8e93965d3.mo11468x92b714fd(bArr5);
                    }
                    c15792xf92d0ffd.f36783xce4135be = c15828x8e93965d3;
                }
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15825xfe7745c4 c15825xfe7745c43 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15825xfe7745c4();
                    if (bArr6 != null && bArr6.length > 0) {
                        c15825xfe7745c43.mo11468x92b714fd(bArr6);
                    }
                    c15792xf92d0ffd.f36782x6e3ba777 = c15825xfe7745c43;
                }
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAt_list */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd m64191x87da8e68(java.util.LinkedList<java.lang.String> linkedList) {
        this.f36773xd69c052a = linkedList;
        return this;
    }

    /* renamed from: setBg_type */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd m64192xa695a832(int i17) {
        this.f36774xf5571ef4 = i17;
        return this;
    }

    /* renamed from: setChosen_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd m64193xd64cab99(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15747xab9f2f60 c15747xab9f2f60) {
        this.f36775x6610f15b = c15747xab9f2f60;
        return this;
    }

    /* renamed from: setCli_local_data */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd m64194x6502c97f(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f36776xae74947d = gVar;
        return this;
    }

    /* renamed from: setComplaint_url */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd m64195x864dc699(java.lang.String str) {
        this.f36777x3617a3db = str;
        return this;
    }

    /* renamed from: setMsg_biz_type */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd m64196x5bcef766(int i17) {
        this.f36778xc49369e4 = i17;
        return this;
    }

    /* renamed from: setMsg_channel_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd m64197x128202ea(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15790xa0c6de30 c15790xa0c6de30) {
        this.f36779xc6ad0668 = c15790xa0c6de30;
        return this;
    }

    /* renamed from: setReply_seq */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd m64198x41ecab48(long j17) {
        this.f36780xe62b798a = j17;
        return this;
    }

    /* renamed from: setSelf_msg */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd m64199xbda4be90(boolean z17) {
        this.f36781x4712200e = z17;
        return this;
    }

    /* renamed from: setTickle_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd m64200xde7761b5(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15825xfe7745c4 c15825xfe7745c4) {
        this.f36782x6e3ba777 = c15825xfe7745c4;
        return this;
    }

    /* renamed from: setTopic_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd m64201xeaa63bc0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d c15828x8e93965d) {
        this.f36783xce4135be = c15828x8e93965d;
        return this;
    }

    /* renamed from: setVote_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd m64202x68073ea1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8 c15835xa11d0ad8) {
        this.f36784xc460ce3 = c15835xa11d0ad8;
        return this;
    }
}
