package yf0;

/* loaded from: classes9.dex */
public final class a extends jm0.g implements qi3.a0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f543025f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f543025f = new java.util.concurrent.ConcurrentHashMap();
    }

    @Override // qi3.a0
    public void L8(qi3.e0 event) {
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event instanceof yf0.l0) {
            int ordinal = event.f445224a.ordinal();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f543025f;
            if (ordinal != 3 && ordinal != 4) {
                if ((ordinal == 7 || ordinal == 8) && (c16564xb55e1d5 = event.f445230g) != null) {
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d52 = event.f445230g;
            float f17 = event.f445231h;
            if (c16564xb55e1d52 == null) {
                return;
            }
            java.lang.Float f18 = (java.lang.Float) concurrentHashMap.get(c16564xb55e1d52);
            if (f18 == null) {
                f18 = java.lang.Float.valueOf(0.0f);
            }
            if (f17 - f18.floatValue() < 3.0f) {
                return;
            }
            concurrentHashMap.put(c16564xb55e1d52, java.lang.Float.valueOf(f17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoBubbleProgressFSC", "notifyBubbleUpdate msgIdTalker=" + c16564xb55e1d52 + " percent=" + f17);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5236x8e0a6828 c5236x8e0a6828 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5236x8e0a6828();
            long j17 = c16564xb55e1d52.f231013d;
            am.a2 a2Var = c5236x8e0a6828.f135569g;
            a2Var.f87650a = j17;
            a2Var.f87651b = c16564xb55e1d52.a();
            c5236x8e0a6828.e();
        }
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).Zi(this);
    }

    @Override // jm0.g
    public void S6() {
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).fj(this);
        this.f543025f.clear();
    }
}
