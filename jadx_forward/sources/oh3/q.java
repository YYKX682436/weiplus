package oh3;

@j95.b
/* loaded from: classes8.dex */
public final class q extends i95.w implements p90.j {

    /* renamed from: n, reason: collision with root package name */
    public static final long f426982n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f426983o = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f426984d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("MMEcInit-Handler");

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f426985e = jz5.h.b(oh3.p.f426981d);

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1867x33323e.p1868x7643c6b5.C16522x40e0a374 f426986f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1867x33323e.p1868x7643c6b5.C16523x9548c076 f426987g;

    /* renamed from: h, reason: collision with root package name */
    public long f426988h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.vt f426989i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f426990m;

    static {
        int i17 = s26.a.f483901f;
        f426982n = s26.a.g(s26.c.e(6, s26.d.f483907i), s26.d.f483904f);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.plugin.mmec.service.PluginMMEcFeatureService$notifyEntranceListener$1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.tencent.mm.plugin.mmec.service.PluginMMEcFeatureService$notifyRedDotListener$1] */
    public q() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(new oh3.l(this));
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f426986f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5214x664d29b2>(a0Var) { // from class: com.tencent.mm.plugin.mmec.service.PluginMMEcFeatureService$notifyEntranceListener$1
            {
                this.f39173x3fe91575 = 1178720674;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5214x664d29b2 c5214x664d29b2) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5214x664d29b2 event = c5214x664d29b2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                int i17 = oh3.q.f426983o;
                oh3.q qVar = oh3.q.this;
                qVar.f426984d.mo50293x3498a0(new oh3.o(false, qVar, "notify"));
                return true;
            }
        };
        this.f426987g = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5215x3fde532c>(a0Var) { // from class: com.tencent.mm.plugin.mmec.service.PluginMMEcFeatureService$notifyRedDotListener$1
            {
                this.f39173x3fe91575 = 82275100;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5215x3fde532c c5215x3fde532c) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5215x3fde532c event = c5215x3fde532c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                int i17 = oh3.q.f426983o;
                nh3.d wi6 = oh3.q.this.wi();
                byte[] bufferCtx = event.f135550g.f88338a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bufferCtx, "bufferCtx");
                wi6.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onRedDotNotify] bufferCtx=");
                sb6.append(bufferCtx.length);
                sb6.append(" isAfterMMEcInit=");
                sb6.append(wi6.f418652a);
                sb6.append(" pendingSyncList=");
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = wi6.f418653b;
                sb6.append(concurrentLinkedQueue.size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMEcRedDotHandler", sb6.toString());
                if (!wi6.f418652a) {
                    concurrentLinkedQueue.add(new nh3.b(bufferCtx));
                    return true;
                }
                w71.m1 wi7 = ((h70.a) ((f70.e) i95.n0.c(f70.e.class))).wi();
                if (wi7 == null) {
                    return true;
                }
                p3380x6a61f93.p3386xf51b86f1.C30596x21b1ccf3.m170136x21b36361(((w71.n1) wi7).m105978x2737f10(), 11L, 5L, bufferCtx);
                return true;
            }
        };
        this.f426989i = new r45.vt();
        this.f426990m = new java.util.concurrent.CopyOnWriteArraySet();
    }

    public final void Ai(r45.vt vtVar) {
        java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MMEC_NEW_CARD_ENTRANCE_STRING, "");
        if (v17 != null) {
            try {
                vtVar.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(v17));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
    }

    public final java.lang.String Bi(r45.vt vtVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vtVar, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[show_type=");
        sb6.append(vtVar.f470044d);
        sb6.append(" need_preload=");
        sb6.append(vtVar.f470046f);
        sb6.append(" jump_info=");
        sb6.append(vtVar.f470045e != null);
        sb6.append(']');
        return sb6.toString();
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        mo48813x58998cd();
        mo48813x58998cd();
        r45.vt vtVar = this.f426989i;
        Ai(vtVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginMMEcFeatureService", "[onAccountInitialized] " + Bi(vtVar));
        this.f426984d.mo50293x3498a0(new oh3.o(false, this, "onAccountInitialized"));
        f70.e eVar = (f70.e) i95.n0.c(f70.e.class);
        nh3.d handler = wi();
        ((h70.a) eVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        w71.l1.f524951a.add(handler);
        ((h70.a) ((f70.e) i95.n0.c(f70.e.class))).Ai();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        mo48814x2efc64();
        mo48814x2efc64();
        f70.e eVar = (f70.e) i95.n0.c(f70.e.class);
        nh3.d handler = wi();
        ((h70.a) eVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        w71.l1.f524951a.remove(handler);
        this.f426984d.mo50302x6b17ad39(null);
    }

    public final nh3.d wi() {
        return (nh3.d) ((jz5.n) this.f426985e).mo141623x754a37bb();
    }
}
