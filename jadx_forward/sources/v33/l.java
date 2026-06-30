package v33;

/* loaded from: classes5.dex */
public final class l extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f514654d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f514655e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15701x78babc7d f514656f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f514657g;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.q f514658h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f514659i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f514660m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f514661n;

    public /* synthetic */ l(java.util.LinkedList linkedList, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15701x78babc7d c15701x78babc7d, boolean z17, p3325xe03a0797.p3326xc267989b.q qVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(linkedList, str, c15701x78babc7d, (i17 & 8) != 0 ? false : z17, (i17 & 16) != 0 ? null : qVar);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f514660m = u0Var;
        java.lang.Object mo141623x754a37bb = this.f514661n.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return mo9409x10f9447a(sVar, (com.p314xaae8f345.mm.p944x882e457a.o) mo141623x754a37bb, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4952;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.String str2;
        java.util.LinkedList<java.lang.String> linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatroomMemberPreloadManager.SyncRoomMember", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        if (i18 == 0 && i19 == 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Object mo141623x754a37bb = this.f514661n.mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((com.p314xaae8f345.mm.p944x882e457a.o) mo141623x754a37bb).f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.BatchGetSimpleChatroomMemberResponse");
            java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15745x77d77dda> simple_data_list = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15707xb734a85c) fVar).f36455x4307e9c6;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(simple_data_list, "simple_data_list");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(simple_data_list, 10));
            java.util.Iterator<T> it = simple_data_list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                str2 = this.f514655e;
                if (!hasNext) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15745x77d77dda c15745x77d77dda = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15745x77d77dda) it.next();
                y33.g gVar = new y33.g();
                gVar.f68997xb2033e3a = str2 + c15745x77d77dda.f36640xf02988d6;
                java.lang.String username = c15745x77d77dda.f36640xf02988d6;
                gVar.f69002xdde069b = username;
                gVar.f68998x21eb2633 = c15745x77d77dda.f36639x436a86e;
                gVar.f69000x136b93ab = str2;
                gVar.f68996x81118851 = c15745x77d77dda.f36638xac32c159;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "username");
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15701x78babc7d c15701x78babc7d = this.f514656f;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c15701x78babc7d != null ? c15701x78babc7d.f36445x98e520e2 : null, username)) {
                    r5 = ((c15701x78babc7d == null || (linkedList = c15701x78babc7d.f36444x486e5577) == null || !linkedList.contains(username)) ? 0 : 1) != 0 ? 2 : 0;
                }
                gVar.f68999x2261249b = r5;
                gVar.f69001xa783a79b = currentTimeMillis;
                arrayList.add(gVar);
            }
            p3325xe03a0797.p3326xc267989b.q qVar = this.f514658h;
            if (qVar != null) {
                p3325xe03a0797.p3326xc267989b.r rVar = (p3325xe03a0797.p3326xc267989b.r) qVar;
                if (rVar.n()) {
                    rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(arrayList));
                }
            }
            ((y33.h) this.f514659i.mo141623x754a37bb()).z2(arrayList, str2);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f514660m;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    public l(java.util.LinkedList userNameList, java.lang.String chatroomName, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15701x78babc7d c15701x78babc7d, boolean z17, p3325xe03a0797.p3326xc267989b.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userNameList, "userNameList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroomName, "chatroomName");
        this.f514654d = userNameList;
        this.f514655e = chatroomName;
        this.f514656f = c15701x78babc7d;
        this.f514657g = z17;
        this.f514658h = qVar;
        jz5.i iVar = jz5.i.f384364f;
        this.f514659i = jz5.h.a(iVar, v33.k.f514653d);
        this.f514661n = jz5.h.a(iVar, new v33.j(this));
    }
}
