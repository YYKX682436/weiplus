package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse */
/* loaded from: classes4.dex */
public class C15806xd90c8ec extends r45.js5 {

    /* renamed from: at_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15702x75707fa1 f36837xd69ab93a;

    /* renamed from: last_received_seq */
    public long f36838x8add380a;

    /* renamed from: next_seq */
    public long f36840x54ebc513;

    /* renamed from: next_version */
    public java.lang.String f36841x5f83ab8c;

    /* renamed from: msg_pack_list */
    public java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67> f36839xfd2b63c6 = new java.util.LinkedList<>();

    /* renamed from: notice_msg_list */
    public java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15795xe89e2969> f36842x74fb1823 = new java.util.LinkedList<>();

    /* renamed from: refresh_msg_pack_list */
    public java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67> f36843xf0f82d62 = new java.util.LinkedList<>();

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15806xd90c8ec m64272xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15806xd90c8ec();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15806xd90c8ec)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15806xd90c8ec c15806xd90c8ec = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15806xd90c8ec) fVar;
        return n51.f.a(this.f76492x92037252, c15806xd90c8ec.f76492x92037252) && n51.f.a(this.f36839xfd2b63c6, c15806xd90c8ec.f36839xfd2b63c6) && n51.f.a(java.lang.Long.valueOf(this.f36840x54ebc513), java.lang.Long.valueOf(c15806xd90c8ec.f36840x54ebc513)) && n51.f.a(this.f36837xd69ab93a, c15806xd90c8ec.f36837xd69ab93a) && n51.f.a(this.f36842x74fb1823, c15806xd90c8ec.f36842x74fb1823) && n51.f.a(java.lang.Long.valueOf(this.f36838x8add380a), java.lang.Long.valueOf(c15806xd90c8ec.f36838x8add380a)) && n51.f.a(this.f36843xf0f82d62, c15806xd90c8ec.f36843xf0f82d62) && n51.f.a(this.f36841x5f83ab8c, c15806xd90c8ec.f36841x5f83ab8c);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, this.f36839xfd2b63c6);
            fVar.h(3, this.f36840x54ebc513);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15702x75707fa1 c15702x75707fa1 = this.f36837xd69ab93a;
            if (c15702x75707fa1 != null) {
                fVar.i(4, c15702x75707fa1.mo75928xcd1e8d8());
                this.f36837xd69ab93a.mo75956x3d5d1f78(fVar);
            }
            fVar.g(5, 8, this.f36842x74fb1823);
            fVar.h(6, this.f36838x8add380a);
            fVar.g(7, 8, this.f36843xf0f82d62);
            java.lang.String str = this.f36841x5f83ab8c;
            if (str != null) {
                fVar.j(8, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, this.f36839xfd2b63c6) + b36.f.h(3, this.f36840x54ebc513);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15702x75707fa1 c15702x75707fa12 = this.f36837xd69ab93a;
            if (c15702x75707fa12 != null) {
                i18 += b36.f.i(4, c15702x75707fa12.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(5, 8, this.f36842x74fb1823) + b36.f.h(6, this.f36838x8add380a) + b36.f.g(7, 8, this.f36843xf0f82d62);
            java.lang.String str2 = this.f36841x5f83ab8c;
            return str2 != null ? g17 + b36.f.j(8, str2) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f36839xfd2b63c6.clear();
            this.f36842x74fb1823.clear();
            this.f36843xf0f82d62.clear();
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15806xd90c8ec c15806xd90c8ec = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15806xd90c8ec) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    c15806xd90c8ec.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67();
                    if (bArr3 != null && bArr3.length > 0) {
                        c15731x94356d67.mo11468x92b714fd(bArr3);
                    }
                    c15806xd90c8ec.f36839xfd2b63c6.add(c15731x94356d67);
                }
                return 0;
            case 3:
                c15806xd90c8ec.f36840x54ebc513 = aVar2.i(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15702x75707fa1 c15702x75707fa13 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15702x75707fa1();
                    if (bArr4 != null && bArr4.length > 0) {
                        c15702x75707fa13.mo11468x92b714fd(bArr4);
                    }
                    c15806xd90c8ec.f36837xd69ab93a = c15702x75707fa13;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15795xe89e2969 c15795xe89e2969 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15795xe89e2969();
                    if (bArr5 != null && bArr5.length > 0) {
                        c15795xe89e2969.mo11468x92b714fd(bArr5);
                    }
                    c15806xd90c8ec.f36842x74fb1823.add(c15795xe89e2969);
                }
                return 0;
            case 6:
                c15806xd90c8ec.f36838x8add380a = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d672 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67();
                    if (bArr6 != null && bArr6.length > 0) {
                        c15731x94356d672.mo11468x92b714fd(bArr6);
                    }
                    c15806xd90c8ec.f36843xf0f82d62.add(c15731x94356d672);
                }
                return 0;
            case 8:
                c15806xd90c8ec.f36841x5f83ab8c = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAt_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15806xd90c8ec m64273x87d94278(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15702x75707fa1 c15702x75707fa1) {
        this.f36837xd69ab93a = c15702x75707fa1;
        return this;
    }

    /* renamed from: setLast_received_seq */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15806xd90c8ec m64274xb9a7cbc8(long j17) {
        this.f36838x8add380a = j17;
        return this;
    }

    /* renamed from: setMsg_pack_list */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15806xd90c8ec m64275x4d618684(java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67> linkedList) {
        this.f36839xfd2b63c6 = linkedList;
        return this;
    }

    /* renamed from: setNext_seq */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15806xd90c8ec m64276xcb7e6395(long j17) {
        this.f36840x54ebc513 = j17;
        return this;
    }

    /* renamed from: setNext_version */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15806xd90c8ec m64277xf6bf390e(java.lang.String str) {
        this.f36841x5f83ab8c = str;
        return this;
    }

    /* renamed from: setNotice_msg_list */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15806xd90c8ec m64278x90338361(java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15795xe89e2969> linkedList) {
        this.f36842x74fb1823 = linkedList;
        return this;
    }

    /* renamed from: setRefresh_msg_pack_list */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15806xd90c8ec m64279xccb6b220(java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67> linkedList) {
        this.f36843xf0f82d62 = linkedList;
        return this;
    }
}
