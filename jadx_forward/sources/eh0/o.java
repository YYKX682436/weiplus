package eh0;

@j95.b
/* loaded from: classes5.dex */
public final class o extends i95.w implements dh0.j {

    /* renamed from: d, reason: collision with root package name */
    public final eh0.j f334428d = new eh0.j();

    /* renamed from: e, reason: collision with root package name */
    public final eh0.e f334429e = new eh0.e();

    /* renamed from: f, reason: collision with root package name */
    public e70.a0 f334430f;

    public static final void wi(eh0.o oVar, eh0.i iVar, com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.x xVar) {
        oVar.getClass();
        java.lang.String str = iVar.f334415e;
        boolean z17 = str == null || str.length() == 0;
        long j17 = iVar.f334411a;
        if (z17 || j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeClawStream.Service", "handleStreamError: talker or msgSvrId is empty. talker:" + str + ", msgSvrId:" + j17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeClawStream.Service", eh0.q.a(str, j17, iVar.f334413c) + "handleStreamError: errorCode:" + xVar.ordinal() + ", errorName:" + xVar.name());
        java.lang.String Ni = oVar.Ni(str, j17);
        oVar.Zi(iVar);
        eh0.g.f334408a.b(Ni);
        oVar.Bi(iVar);
        oVar.f334429e.b(str, iVar.f334411a, iVar.f334412b, xVar.ordinal(), xVar.name());
    }

    public void Ai(java.lang.String talker, long j17) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        eh0.j jVar = this.f334428d;
        jVar.getClass();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) jVar.f334420a.get(talker);
        if (copyOnWriteArrayList == null) {
            list = kz5.p0.f395529d;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                eh0.i iVar = (eh0.i) it.next();
                if (iVar.f334411a == j17) {
                    arrayList.add(iVar);
                }
            }
            copyOnWriteArrayList.removeAll(kz5.n0.X0(arrayList));
            if (!arrayList.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.StreamSessionManager", "removeAllSessions: removed %d session(s) for talker:%s, msgSvrId:%d", java.lang.Integer.valueOf(arrayList.size()), talker, java.lang.Long.valueOf(j17));
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeClawStream.Service", "[talker:" + talker + "|svrId:" + j17 + "] cancelStream: no session found");
            return;
        }
        eh0.g.f334408a.b(Ni(talker, j17));
        java.util.Iterator it6 = list.iterator();
        while (true) {
            java.lang.Object obj = null;
            if (!it6.hasNext()) {
                java.util.Iterator it7 = list.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it7.next();
                    if (((eh0.i) next).f334412b > 0) {
                        obj = next;
                        break;
                    }
                }
                eh0.i iVar2 = (eh0.i) obj;
                this.f334429e.b(talker, j17, iVar2 != null ? iVar2.f334412b : ((eh0.i) kz5.n0.X(list)).f334412b, -2, "canceled due to completed");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.Service", "[talker:" + talker + "|svrId:" + j17 + "] cancelStream: " + list.size() + " session(s) canceled, error notified to listeners");
                return;
            }
            eh0.i iVar3 = (eh0.i) it6.next();
            java.lang.String a17 = eh0.q.a(talker, j17, iVar3.f334413c);
            java.lang.String str = iVar3.f334413c;
            if (!(str == null || r26.n0.N(str))) {
                e70.a0 a0Var = this.f334430f;
                if (a0Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("streamController");
                    throw null;
                }
                ((d83.t0) a0Var).e(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.Service", a17 + "cancelStream: stream released, isThinking:" + iVar3.f334419i);
            }
        }
    }

    public final void Bi(eh0.i iVar) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
        java.lang.String talker = iVar.f334415e;
        boolean z17 = talker == null || talker.length() == 0;
        long j17 = iVar.f334411a;
        if (z17 || j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeClawStream.Service", "cleanSessions: talker or msgSvrId is empty. talker:" + talker + ", msgSvrId:" + j17);
            return;
        }
        eh0.j jVar = this.f334428d;
        jVar.getClass();
        java.lang.String str = iVar.f334415e;
        if (str != null && (copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) jVar.f334420a.get(str)) != null && copyOnWriteArrayList.remove(iVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.StreamSessionManager", "removeSession: talker:%s, msgSvrId:%d, remaining:%d", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(copyOnWriteArrayList.size()));
        }
        java.lang.String a17 = iVar.a();
        long j18 = iVar.f334411a;
        long j19 = iVar.f334412b;
        eh0.e eVar = this.f334429e;
        eVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = (java.util.concurrent.CopyOnWriteArrayList) eVar.f334406a.get(talker);
        if (copyOnWriteArrayList2 == null) {
            return;
        }
        java.util.Iterator it = copyOnWriteArrayList2.iterator();
        while (it.hasNext()) {
            try {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qp) ((dh0.i) it.next())).r0(talker, j18, j19, a17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeClawStream.StreamListenerManager", e17, "notifyStreamEnd error", new java.lang.Object[0]);
            }
        }
    }

    public java.lang.String Di(java.lang.String talker, long j17, java.lang.String streamTicket, boolean z17) {
        java.lang.String str;
        boolean z18;
        fh0.d dVar;
        java.lang.Object putIfAbsent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamTicket, "streamTicket");
        java.lang.String a17 = eh0.q.a(talker, j17, null);
        eh0.i a18 = this.f334428d.a(talker, j17, z17);
        if (a18 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeClawStream.Service", a17 + "createAndStartStream: session already exists, skip creating. isThinking:" + z17 + ", existingStreamId:" + a18.f334413c);
            return a18.f334413c;
        }
        e70.a0 a0Var = this.f334430f;
        if (a0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("streamController");
            throw null;
        }
        d83.t0 t0Var = (d83.t0) a0Var;
        t0Var.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkStreamController", "createDownStream businessType: 10");
        if (t0Var.f308555b == null) {
            synchronized (t0Var) {
                if (t0Var.f308555b == null) {
                    t0Var.f308555b = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.p.f298827b.d(t0Var.f308554a);
                    t0Var.f308560g.set(false);
                }
            }
        }
        d83.t0.a(t0Var);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.o oVar = t0Var.f308555b;
        if (oVar != null) {
            java.lang.String a19 = oVar.a(10, null, streamTicket, new com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.h());
            t0Var.f308556c.put(a19, new d83.h0(10, null, 0L, null, null, new d83.i0(a19, t0Var), 30, null));
            str = a19;
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeClawStream.Service", a17.concat("createDownStream: streamId is empty"));
            return null;
        }
        java.lang.String streamId = str;
        eh0.i iVar = new eh0.i(j17, 0L, str, streamTicket, talker, 0L, null, null, z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.j.f34051x366c91de, null);
        e70.a0 a0Var2 = this.f334430f;
        if (a0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("streamController");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamId, "streamId");
        d83.h0 h0Var = (d83.h0) ((d83.t0) a0Var2).f308556c.get(streamId);
        if (h0Var != null) {
            h0Var.f308505c = 60000L;
        }
        e70.a0 a0Var3 = this.f334430f;
        if (a0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("streamController");
            throw null;
        }
        ((d83.t0) a0Var3).b(streamId, new eh0.l(this, iVar));
        fh0.k kVar = fh0.k.f344063a;
        if (fh0.k.f344066d) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(j17);
            sb6.append('_');
            sb6.append(z17);
            java.lang.String sb7 = sb6.toString();
            z18 = z17;
            fh0.k.f344067e.put(sb7, new fh0.b(j17, z17, null, 0, null, 28, null));
            kVar.a();
            dVar = new fh0.d(sb7);
        } else {
            z18 = z17;
            dVar = null;
        }
        if (dVar != null) {
            e70.a0 a0Var4 = this.f334430f;
            if (a0Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("streamController");
                throw null;
            }
            ((d83.t0) a0Var4).b(streamId, dVar);
        }
        eh0.j jVar = this.f334428d;
        jVar.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = jVar.f334420a;
        java.lang.Object obj = concurrentHashMap.get(talker);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(talker, (obj = new java.util.concurrent.CopyOnWriteArrayList()))) != null) {
            obj = putIfAbsent;
        }
        ((java.util.concurrent.CopyOnWriteArrayList) obj).add(iVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.StreamSessionManager", "addSession: added session for talker:%s, msgSvrId:%d", talker, java.lang.Long.valueOf(iVar.f334411a));
        eh0.g.f334408a.c(Ni(talker, j17), iVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.Service", a17 + "createAndStartStream: stream created success, streamId:" + streamId + ", isThinking:" + z18 + ", streamTicket:" + streamTicket);
        return streamId;
    }

    public final java.lang.String Ni(java.lang.String str, long j17) {
        return str + '_' + j17;
    }

    public boolean Ri(java.lang.String talker, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        java.lang.String b17 = eh0.k.f334421a.b(talker, j17);
        return !(b17 == null || r26.n0.N(b17));
    }

    public boolean Ui(java.lang.String talker, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        return this.f334428d.a(talker, j17, false) != null;
    }

    public boolean Vi(java.lang.String talker, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        return this.f334428d.a(talker, j17, true) != null;
    }

    public final void Zi(eh0.i iVar) {
        java.lang.String str = iVar.f334415e;
        long j17 = iVar.f334411a;
        java.lang.String a17 = eh0.q.a(str, j17, iVar.f334413c);
        boolean z17 = iVar.f334419i;
        if (z17 && iVar.f334412b > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.Service", a17 + "updateMsgInfoContent: thinking stream, msg already exists (msgId=" + iVar.f334412b + "), skip");
            return;
        }
        java.lang.String a18 = iVar.a();
        if (a18.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.Service", a17.concat("updateMsgInfoContent: content is empty, skip update"));
            return;
        }
        pt0.e0 e0Var = pt0.f0.f439742b1;
        java.lang.String str2 = iVar.f334415e;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 l17 = e0Var.l(str2, j17);
        if (l17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeClawStream.Service", a17.concat("updateMsgInfoContent: msgInfo not found, creating new one"));
            l17 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            l17.o1(j17);
            l17.u1(str2);
            l17.m124850x7650bebc(16777265);
            l17.j1(0);
            l17.r1(3);
            l17.e1(c01.w9.o(str2));
        }
        if (!z17) {
            v05.b bVar = new v05.b();
            int i17 = bVar.f449898d;
            bVar.set(i17 + 2, a18);
            bVar.set(i17 + 6, 1);
            l17.d1(bVar.m126747x696739c());
        }
        try {
            long m124847x74d37ac6 = l17.m124847x74d37ac6();
            if (l17.m124847x74d37ac6() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeClawStream.Service", a17.concat("updateMsgInfoContent: msgId is 0, skip update"));
            } else if (!z17) {
                e0Var.s(l17.Q0(), l17.m124847x74d37ac6(), l17);
            }
            iVar.f334412b = m124847x74d37ac6;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeClawStream.Service", e17, a17.concat("updateMsgInfoContent: failed to save message"), new java.lang.Object[0]);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.Service", "onAccountInitialized");
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new eh0.m(this, null), 1, null);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.Service", "onAccountReleased");
        this.f334428d.f334420a.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.StreamSessionManager", "clear: all sessions cleared");
        this.f334429e.f334406a.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.StreamListenerManager", "clear: all listeners cleared");
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
    }
}
