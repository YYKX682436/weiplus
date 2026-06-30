package qu0;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final vu0.k f448263a;

    /* renamed from: b, reason: collision with root package name */
    public final vu0.r0 f448264b;

    /* renamed from: c, reason: collision with root package name */
    public final qu0.c f448265c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f448266d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f448267e;

    /* renamed from: f, reason: collision with root package name */
    public final qu0.g f448268f;

    /* renamed from: g, reason: collision with root package name */
    public final int f448269g;

    /* renamed from: h, reason: collision with root package name */
    public final wu0.a f448270h;

    public i(vu0.k audioRecognitionService, vu0.r0 waveformService, qu0.c audioRecordListener) {
        java.lang.Object m143895xf1229813;
        boolean booleanValue;
        com.p314xaae8f345.mm.vfs.r6 b17;
        qu0.i iVar = this;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioRecognitionService, "audioRecognitionService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(waveformService, "waveformService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioRecordListener, "audioRecordListener");
        iVar.f448263a = audioRecognitionService;
        iVar.f448264b = waveformService;
        iVar.f448265c = audioRecordListener;
        iVar.f448266d = jz5.h.b(qu0.h.f448262d);
        iVar.f448267e = new java.util.concurrent.ConcurrentHashMap();
        iVar.f448268f = new qu0.g(iVar);
        yy0.m0 m0Var = (yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class));
        m0Var.getClass();
        int nj6 = !pp0.h0.Q2(m0Var, false, 1, null) ? 0 : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2546x5be56f80.C20397x56ece24c());
        iVar.f448269g = nj6;
        wu0.a aVar = new wu0.a();
        ru0.c[] cVarArr = ru0.c.f481192d;
        if (nj6 == 2) {
            if (aVar.f531182a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AudioDenoise3AHelper", "create3aInterface: processInterface == null");
                booleanValue = true;
            } else {
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioDenoise3AHelper", "create3aInterface: ");
                    b17 = aVar.b();
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                if (b17 == null) {
                    ((yy0.o7) ((pp0.m0) i95.n0.c(pp0.m0.class))).Ni("mj_setup_voip_3a_denoise", kz5.c1.k(new jz5.l("mj_publisher_session_id", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ri()), new jz5.l("state", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, "can not find valid voip model, file does not exist")));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioDenoise3AHelper", "create3aInterface: modesFile " + b17.o());
                    com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.C10932x97174782 c10932x97174782 = new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.C10932x97174782();
                    int m47030x2d7df81 = c10932x97174782.m47030x2d7df81(b17.o(), b17.o().length());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioDenoise3AHelper", "create3aInterface: modeResult " + m47030x2d7df81);
                    if (m47030x2d7df81 != 22) {
                        aVar.a();
                        ((yy0.o7) ((pp0.m0) i95.n0.c(pp0.m0.class))).Ni("mj_setup_voip_3a_denoise", kz5.c1.k(new jz5.l("mj_publisher_session_id", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ri()), new jz5.l("state", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, "can not find valid voip model, setModelBinFilePath failed for modeResult:" + m47030x2d7df81)));
                    } else {
                        boolean m47025x316510 = c10932x97174782.m47025x316510();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioDenoise3AHelper", "create3aInterface: initResult " + m47025x316510);
                        if (m47025x316510) {
                            int m47029x78bda44 = c10932x97174782.m47029x78bda44(new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.C10930x8784eb16());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioDenoise3AHelper", "create3aInterface: configResult " + m47029x78bda44);
                            if (m47029x78bda44 != 0) {
                                aVar.a();
                                ((yy0.o7) ((pp0.m0) i95.n0.c(pp0.m0.class))).Ni("mj_setup_voip_3a_denoise", kz5.c1.k(new jz5.l("mj_publisher_session_id", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ri()), new jz5.l("state", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, "config failed, configResult:" + m47029x78bda44)));
                            } else {
                                aVar.f531182a = c10932x97174782;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioDenoise3AHelper", "create3aInterface: success");
                                ((yy0.o7) ((pp0.m0) i95.n0.c(pp0.m0.class))).Ni("mj_setup_voip_3a_denoise", kz5.c1.k(new jz5.l("mj_publisher_session_id", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ri()), new jz5.l("state", "successful")));
                                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE);
                                java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
                                if (m143898xd4a2fc34 != null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AudioDenoise3AHelper", "create3aInterface: failed ", m143898xd4a2fc34);
                                }
                                booleanValue = ((java.lang.Boolean) (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813) ? java.lang.Boolean.FALSE : m143895xf1229813)).booleanValue();
                            }
                        } else {
                            aVar.a();
                            ((yy0.o7) ((pp0.m0) i95.n0.c(pp0.m0.class))).Ni("mj_setup_voip_3a_denoise", kz5.c1.k(new jz5.l("mj_publisher_session_id", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ri()), new jz5.l("state", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, "init failed, initResult:" + m47025x316510)));
                        }
                    }
                }
                booleanValue = false;
            }
            if (booleanValue) {
                iVar = this;
            } else {
                ru0.c[] cVarArr2 = ru0.c.f481192d;
                iVar = this;
                iVar.f448269g = 1;
            }
        }
        iVar.f448270h = aVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJAudioManager", "init: denoiseType " + iVar.f448269g + ' ');
        uu0.c.e().f512756r = new qu0.a(iVar);
        uu0.c.e().f512757s = new qu0.b(iVar);
    }

    public final uu0.k a() {
        return (uu0.k) this.f448266d.mo141623x754a37bb();
    }

    public final void b(java.util.List narrationSegmentViewModels) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(narrationSegmentViewModels, "narrationSegmentViewModels");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f448267e;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!narrationSegmentViewModels.isEmpty()) {
                java.util.Iterator it6 = narrationSegmentViewModels.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = ((ex0.q) it6.next()).f338700a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c4190xd8dd3713, "null cannot be cast to non-null type com.tencent.maas.moviecomposing.segments.NarrationSegment");
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951) c4190xd8dd3713).Q1(), ((ru0.b) entry.getValue()).f481189b)) {
                        i17 = 1;
                        break;
                    }
                }
            }
            if (i17 != 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        concurrentHashMap.clear();
        concurrentHashMap.putAll(linkedHashMap);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Collection<ru0.b> values = concurrentHashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (ru0.b bVar : values) {
            if (bVar.f481189b != null && bVar.f481191d != null) {
                arrayList.add(bVar);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4173x35b021c8 c4173x35b021c8 = ((ru0.b) it7.next()).f481191d;
            if (c4173x35b021c8 != null) {
                arrayList2.add(c4173x35b021c8);
            }
        }
        float[] a17 = com.p314xaae8f345.p457x3304c6.p479x4179489f.C4175x22639adb.a(arrayList2);
        java.util.Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            java.lang.Object next = it8.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ru0.b bVar2 = (ru0.b) next;
            java.lang.String str = bVar2.f481189b;
            if (str != null && bVar2.f481191d != null) {
                hashMap.put(str, java.lang.Float.valueOf(a17[i17]));
            }
            i17 = i18;
        }
        java.util.Iterator it9 = narrationSegmentViewModels.iterator();
        while (it9.hasNext()) {
            ex0.q qVar = (ex0.q) it9.next();
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd37132 = qVar.f338700a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c4190xd8dd37132, "null cannot be cast to non-null type com.tencent.maas.moviecomposing.segments.NarrationSegment");
            java.lang.String Q1 = ((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951) c4190xd8dd37132).Q1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q1, "getOriginNarrationFilePath(...)");
            java.lang.Float f17 = (java.lang.Float) hashMap.get(Q1);
            if (f17 != null) {
                java.lang.Object obj = qVar.f338700a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.maas.moviecomposing.segments.VocalAdjustable");
                float floatValue = f17.floatValue();
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) ((ug.p) obj);
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
                if (D != null) {
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.F0(c4181x2248e1a3, floatValue, D);
                }
            }
        }
    }
}
