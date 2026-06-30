package mm2;

/* loaded from: classes3.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.w f410974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f410975e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(mm2.w wVar, long j17) {
        super(0);
        this.f410974d = wVar;
        this.f410975e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        java.lang.Object obj2;
        mn0.b0 b0Var;
        mm2.w wVar = this.f410974d;
        wVar.getClass();
        long j17 = this.f410975e;
        if (j17 > 0) {
            ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
            tn0.w0 w0Var = dk2.ef.f314911d;
            co0.s sVar = w0Var instanceof co0.s ? (co0.s) w0Var : null;
            if (sVar != null && (b0Var = sVar.R1.f363942a) != null) {
                mn0.c0 listener = wVar.f411040s;
                mn0.y yVar = (mn0.y) b0Var;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
                if (!yVar.f411341g.contains(listener)) {
                    yVar.a(listener);
                }
            }
            mm2.i iVar = wVar.f411033i;
            if (iVar == mm2.i.f410660e || iVar == mm2.i.f410662g) {
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = ((mm2.w) wVar.m147920xbba4bfc0(mm2.w.class)).f411031g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (((mm2.j) next).f410682a == mm2.l.f410736d) {
                        arrayList.add(next);
                    }
                }
                for (java.util.Iterator it6 = arrayList.iterator(); it6.hasNext(); it6 = it6) {
                    mm2.j jVar = (mm2.j) it6.next();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPlayInLivingInMiniMode id:");
                    sb6.append(jVar.f410683b.m75945x2fec8307(0));
                    sb6.append(" diff:");
                    r45.ce2 ce2Var = jVar.f410683b;
                    sb6.append(ce2Var.m75942xfb822ef2(1) - j17);
                    sb6.append(" state:");
                    sb6.append(jVar.f410682a);
                    sb6.append(" anchorT:");
                    sb6.append(j17);
                    sb6.append(" statT:");
                    sb6.append(ce2Var.m75942xfb822ef2(1));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAdVideoSlice", sb6.toString());
                }
                java.util.Iterator it7 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it7.next();
                    mm2.j jVar2 = (mm2.j) obj;
                    long m75942xfb822ef2 = jVar2.f410683b.m75942xfb822ef2(1);
                    r45.ce2 ce2Var2 = jVar2.f410683b;
                    if (j17 > ce2Var2.m75942xfb822ef2(1) && (m75942xfb822ef2 + ce2Var2.m75942xfb822ef2(2)) - j17 > 5000 && jVar2.f410682a == mm2.l.f410736d) {
                        break;
                    }
                }
                mm2.j jVar3 = (mm2.j) obj;
                if (jVar3 != null) {
                    r45.ce2 ce2Var3 = jVar3.f410683b;
                    long m75942xfb822ef22 = (ce2Var3.m75942xfb822ef2(1) + ce2Var3.m75942xfb822ef2(2)) - j17;
                    long m75942xfb822ef23 = ce2Var3.m75942xfb822ef2(2) - m75942xfb822ef22;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveAdVideoSlice", "startPlayLivingAdVideoInMiniMode id:" + ce2Var3.m75945x2fec8307(0) + " left" + m75942xfb822ef22 + "  startPos:" + m75942xfb822ef23 + " duration:" + ce2Var3.m75942xfb822ef2(2));
                    mm2.h hVar = wVar.f411037p;
                    if (hVar != null && hVar.m66744x2a55bdd7().mo162437xc00617a4()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveAdVideoSlice", "loadLivingVideoInMiniMode return for playing.");
                    } else {
                        fo0.c cVar = fo0.c.f346331a;
                        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) fo0.c.f346332b.f346340a).f174665d.f174587o.f174602d) {
                            java.lang.String m75945x2fec8307 = ce2Var3.m75945x2fec8307(3);
                            if (m75945x2fec8307 == null) {
                                m75945x2fec8307 = "";
                            }
                            if (m75945x2fec8307.length() == 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveAdVideoSlice", "loadLivingVideoInMiniMode return for url:".concat(m75945x2fec8307));
                            } else {
                                java.lang.String m75945x2fec83072 = ce2Var3.m75945x2fec8307(0);
                                wVar.f411035n = m75945x2fec83072 != null ? m75945x2fec83072 : "";
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAdVideoSlice", "loadLivingVideoInMiniMode start play startPositionMs:" + m75942xfb822ef23 + " duration:" + ce2Var3.m75942xfb822ef2(2) + " url:" + m75945x2fec8307);
                                if (wVar.f411037p == null) {
                                    mm2.w wVar2 = (mm2.w) wVar.m147920xbba4bfc0(mm2.w.class);
                                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                                    wVar2.f411037p = new mm2.h(context);
                                }
                                mm2.h hVar2 = wVar.f411037p;
                                if (hVar2 != null ? hVar2.u(ce2Var3, m75942xfb822ef23, new mm2.t(wVar, ce2Var3)) : false) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAdVideoSlice", "handleOnMiniVideoViewStart liveAdId:" + ce2Var3.m75945x2fec8307(0));
                                    ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
                                    tn0.w0 w0Var2 = dk2.ef.f314911d;
                                    co0.s sVar2 = w0Var2 instanceof co0.s ? (co0.s) w0Var2 : null;
                                    if (sVar2 != null) {
                                        sVar2.f1(true);
                                    }
                                    wVar.f411036o.mo523x53d8522f(mm2.f.f410549g);
                                    jVar3.f410682a = mm2.l.f410737e;
                                }
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAdVideoSlice", "loadLivingVideoInMiniMode return for isBallPlaying is false.");
                        }
                    }
                } else {
                    java.util.Iterator it8 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        java.lang.Object next2 = it8.next();
                        mm2.j jVar4 = (mm2.j) next2;
                        long m75942xfb822ef24 = jVar4.f410683b.m75942xfb822ef2(1) - j17;
                        if (((1000L > m75942xfb822ef24 ? 1 : (1000L == m75942xfb822ef24 ? 0 : -1)) <= 0 && (m75942xfb822ef24 > 5001L ? 1 : (m75942xfb822ef24 == 5001L ? 0 : -1)) < 0) && jVar4.f410682a == mm2.l.f410736d) {
                            obj2 = next2;
                            break;
                        }
                    }
                    mm2.j jVar5 = (mm2.j) obj2;
                    if (jVar5 != null) {
                        r45.ce2 ce2Var4 = jVar5.f410683b;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveAdVideoSlice", "startPlayAnimationInMiniMode id:" + ce2Var4.m75945x2fec8307(0) + " animationDurationMs:" + (ce2Var4.m75942xfb822ef2(1) - j17));
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
