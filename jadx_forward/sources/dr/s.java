package dr;

/* loaded from: classes12.dex */
public abstract class s {

    /* renamed from: a */
    public final com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f323933a;

    /* renamed from: b */
    public er.f f323934b;

    public s(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        this.f323933a = emojiInfo;
    }

    public static /* synthetic */ void e(dr.s sVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reload");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        sVar.d(z17);
    }

    public static /* synthetic */ void g(dr.s sVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        sVar.f(z17);
    }

    public void a() {
        er.f fVar = this.f323934b;
        if (fVar != null) {
            fVar.g(this);
        }
    }

    public er.f b() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.m0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5.class))).getClass();
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo = this.f323933a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        zq.h hVar = zq.h.f556505a;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) emojiInfo;
        er.f fVar = (er.f) zq.h.f556506b.get(c21053xdbf1e5f4.mo42933xb5885648());
        return fVar == null ? ((km0.c) gm0.j1.p().a()).a() ? new er.d(c21053xdbf1e5f4) : new er.j(c21053xdbf1e5f4) : fVar;
    }

    public abstract void c(boolean z17);

    public void d(boolean z17) {
        er.f fVar = this.f323934b;
        if (fVar != null) {
            fVar.g(this);
        }
        er.f b17 = b();
        this.f323934b = b17;
        if (b17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IEmojiLoadTask", "addRequest , " + b17.f337463f.mo42933xb5885648() + ", " + b17.f337468n);
            if (b17.f337468n) {
                c(b17.f337467m);
            } else {
                java.util.List list = b17.f337470p;
                if (!list.contains(this)) {
                    list.add(this);
                }
            }
        }
        er.f fVar2 = this.f323934b;
        if (fVar2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IEmojiLoadTask", "start , " + fVar2.f337463f.mo42933xb5885648() + ", " + fVar2.f337464g);
            if (fVar2.f337464g) {
                return;
            }
            fVar2.f337464g = true;
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5 w5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5.class);
            java.lang.String key = fVar2.e();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.m0) w5Var).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
            zq.h hVar = zq.h.f556505a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiLoader", "addTask: " + key + ' ' + z17);
            zq.h.f556506b.put(key, fVar2);
            if (fVar2.f337469o == er.k.f337474e) {
                fVar2.run();
            } else if (z17) {
                zq.h.f556507c.a(fVar2);
            } else {
                fVar2.run();
            }
        }
    }

    public abstract void f(boolean z17);
}
