package g43;

/* loaded from: classes5.dex */
public final class m implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final g43.m f350299d = new g43.m();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f350300e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f350301f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f350302g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f350303h;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f350304i;

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f350305m;

    static {
        jz5.i iVar = jz5.i.f384364f;
        f350300e = jz5.h.a(iVar, g43.g.f350290d);
        f350301f = jz5.h.a(iVar, g43.b.f350275d);
        f350302g = jz5.h.a(iVar, g43.k.f350297d);
        f350303h = jz5.h.a(iVar, g43.l.f350298d);
        f350304i = jz5.h.a(iVar, g43.j.f350296d);
        f350305m = jz5.h.b(g43.a.f350273d);
    }

    public static final java.lang.Object a(g43.m mVar, java.util.List list, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        mVar.getClass();
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        if (list.isEmpty() && rVar.n()) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(kz5.p0.f395529d));
        }
        g43.m mVar2 = f350299d;
        java.util.List Q1 = ((y33.h) f350304i.mo141623x754a37bb()).Q1(list, str);
        if (Q1.size() != list.size()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(Q1, 10));
            java.util.Iterator it = Q1.iterator();
            while (it.hasNext()) {
                arrayList.add(((y33.g) it.next()).f69002xdde069b);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!arrayList.contains((java.lang.String) obj)) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                gm0.j1.d().g(new v33.l(new java.util.LinkedList(list), str, (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15701x78babc7d) mVar2.b().get(str), false, rVar));
            }
        } else if (rVar.n()) {
            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(Q1));
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public final java.util.HashMap b() {
        return (java.util.HashMap) f350301f.mo141623x754a37bb();
    }

    public final java.util.HashMap c() {
        return (java.util.HashMap) f350300e.mo141623x754a37bb();
    }

    public final java.util.LinkedList d(java.util.List list, java.lang.String str) {
        int size = list.size();
        jz5.g gVar = f350305m;
        int intValue = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        jz5.g gVar2 = f350303h;
        if (size > intValue) {
            java.util.List subList = list.subList(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue(), size);
            ((java.util.HashMap) gVar2.mo141623x754a37bb()).put(str, subList);
            java.util.List subList2 = list.subList(0, ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("GameChatRoom.ChatroomMemberPreloadManager", "handleSyncChatroomMember restList size = " + subList.size() + "  requestSize = " + subList2.size() + "  rawUserSize =" + list.size());
            list = subList2;
        } else {
            ((java.util.HashMap) gVar2.mo141623x754a37bb()).remove(str);
        }
        return list instanceof java.util.LinkedList ? (java.util.LinkedList) list : new java.util.LinkedList(list);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var != null) {
            int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
            g43.m mVar = f350299d;
            jz5.g gVar = f350302g;
            boolean z17 = true;
            if (mo808xfb85f7b0 == 4713) {
                if (i17 == 0 && i18 == 0 && (m1Var instanceof v33.w)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleSyncChatroomMember  rawUserSize = ");
                    v33.w wVar = (v33.w) m1Var;
                    sb6.append(wVar.I().f36869x71fabd82.size());
                    sb6.append(" chatroomName = ");
                    sb6.append(wVar.H().f36867x3923b317);
                    sb6.append("   lastVersion = ");
                    sb6.append(wVar.H().f36868x371e602f);
                    sb6.append("   nextVersion = ");
                    sb6.append(wVar.I().f36870x5f83ab8c);
                    com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("GameChatRoom.ChatroomMemberPreloadManager", sb6.toString());
                    java.util.LinkedList<java.lang.String> linkedList = wVar.I().f36869x71fabd82;
                    if (linkedList != null && !linkedList.isEmpty()) {
                        z17 = false;
                    }
                    if (!z17) {
                        java.util.HashMap hashMap = (java.util.HashMap) gVar.mo141623x754a37bb();
                        java.lang.String chatroom_name = wVar.H().f36867x3923b317;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(chatroom_name, "chatroom_name");
                        hashMap.put(chatroom_name, new jz5.l(wVar.H().f36868x371e602f, wVar.I().f36870x5f83ab8c));
                        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c), null, null, new g43.f(m1Var, null), 3, null);
                        return;
                    }
                    m33.t1 t1Var = (m33.t1) i95.n0.c(m33.t1.class);
                    java.lang.String str2 = wVar.H().f36867x3923b317 + "memberVersion";
                    java.lang.String next_version = wVar.I().f36870x5f83ab8c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next_version, "next_version");
                    byte[] bytes = next_version.getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.v1) t1Var).Ai(str2, bytes);
                    return;
                }
                return;
            }
            if (mo808xfb85f7b0 != 4952) {
                if (mo808xfb85f7b0 == 5069 && i17 == 0 && i18 == 0 && (m1Var instanceof v33.n)) {
                    v33.n nVar = (v33.n) m1Var;
                    if (nVar.m171053x5a9a73ac().f152244b.f152233a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15776x24097a0d) {
                        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = nVar.m171053x5a9a73ac().f152244b.f152233a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListResponse");
                        java.util.LinkedList<java.lang.String> linkedList2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15776x24097a0d) fVar).f36729x30217a0e;
                        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("GameChatRoom.ChatroomMemberPreloadManager", "handleCgiGetUserAtMemberList  atMembers = " + linkedList2.size() + "  threadId = " + java.lang.Thread.currentThread().getId() + "   threadName =  " + java.lang.Thread.currentThread().getName());
                        if (!linkedList2.isEmpty()) {
                            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c), null, null, new g43.e(linkedList2, m1Var, null), 3, null);
                            return;
                        }
                        java.util.HashMap c17 = mVar.c();
                        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = nVar.m171053x5a9a73ac().f152243a.f152217a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListRequest");
                        u33.m mVar2 = (u33.m) c17.get(((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15775x8d72a343) fVar2).f36728x3923b317);
                        if (mVar2 != null) {
                            ((g43.u) mVar2).a(kz5.p0.f395529d);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i17 == 0 && i18 == 0 && (m1Var instanceof v33.l)) {
                v33.l lVar = (v33.l) m1Var;
                if (lVar.f514657g) {
                    java.util.HashMap hashMap2 = (java.util.HashMap) f350303h.mo141623x754a37bb();
                    java.lang.String str3 = lVar.f514655e;
                    java.util.List list = (java.util.List) hashMap2.get(str3);
                    if (list != null && !list.isEmpty()) {
                        z17 = false;
                    }
                    if (!z17) {
                        gm0.j1.d().g(new v33.l(mVar.d(list, str3), lVar.f514655e, (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15701x78babc7d) mVar.b().get(str3), true, null, 16, null));
                        return;
                    }
                    jz5.l lVar2 = (jz5.l) ((java.util.HashMap) gVar.mo141623x754a37bb()).get(str3);
                    if (lVar2 != null) {
                        if (lVar2.f384366d == null) {
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            m33.t1 t1Var2 = (m33.t1) i95.n0.c(m33.t1.class);
                            java.lang.String str4 = str3 + dm.i4.f66874x4c6b1f55;
                            byte[] bArr = new byte[8];
                            for (int i19 = 0; i19 < 8; i19++) {
                                bArr[i19] = (byte) ((currentTimeMillis >> (i19 * 8)) & 255);
                            }
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.v1) t1Var2).Ai(str4, bArr);
                        }
                        m33.t1 t1Var3 = (m33.t1) i95.n0.c(m33.t1.class);
                        byte[] bytes2 = ((java.lang.String) lVar2.f384367e).getBytes(r26.c.f450398a);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.v1) t1Var3).Ai(str3 + "memberVersion", bytes2);
                    }
                    mVar.b().remove(str3);
                    u33.m mVar3 = (u33.m) mVar.c().remove(str3);
                    if (mVar3 != null) {
                        g43.x xVar = ((g43.u) mVar3).f350320a;
                        xVar.getClass();
                        p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.d1.a(xVar), (oz5.l) xVar.f350334n.mo141623x754a37bb(), null, new g43.s(xVar, null), 2, null);
                    }
                }
            }
        }
    }
}
