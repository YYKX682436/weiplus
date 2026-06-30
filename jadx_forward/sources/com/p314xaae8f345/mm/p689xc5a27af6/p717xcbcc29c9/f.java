package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f146937a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.i f146938b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f146939c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f146940d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f146941e;

    /* renamed from: f, reason: collision with root package name */
    public long f146942f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f146943g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f146944h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f146945i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.ResultReceiverC10508x8aac39c5 f146946j;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.a f146947k;

    /* JADX WARN: Type inference failed for: r2v9, types: [com.tencent.mm.feature.chatrecordstts.ChatRecordsTtsFloatBallHelper$EventReceiver] */
    public f(yz5.a onPlayPauseClick, yz5.a onDeleteClick, com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onPlayPauseClick, "onPlayPauseClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDeleteClick, "onDeleteClick");
        this.f146937a = onDeleteClick;
        this.f146938b = iVar;
        this.f146939c = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b.f146881d);
        this.f146940d = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.e.f146927d);
        this.f146944h = "";
        this.f146945i = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.c.f146901d);
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        this.f146946j = new android.os.ResultReceiver(weakReference) { // from class: com.tencent.mm.feature.chatrecordstts.ChatRecordsTtsFloatBallHelper$EventReceiver

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f146859d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(new android.os.Handler(android.os.Looper.getMainLooper()));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakReference, "helperRef");
                this.f146859d = weakReference;
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f fVar = (com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f) this.f146859d.get();
                if (fVar == null) {
                    return;
                }
                yz5.a aVar = fVar.f146937a;
                if (i17 == 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatRecordsTtsFloatBallHelper", "ball info removed");
                    aVar.mo152xb9724478();
                } else {
                    if (i17 != 7) {
                        return;
                    }
                    aVar.mo152xb9724478();
                }
            }
        };
        this.f146947k = new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.a(this);
    }

    public final java.lang.String a(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 message) {
        oy.i iVar = (oy.i) ((jz5.n) this.f146940d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iVar, "<get-ttsService>(...)");
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 b1Var = (com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1) iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        if (!jm0.g.class.isAssignableFrom(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.x1.class)) {
            throw new java.lang.IllegalArgumentException(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(b1Var.getViewModel(), new jm0.e(b1Var)).a(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.x1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        java.lang.String V6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.x1) ((jm0.g) a17)).V6(context, message, null);
        java.lang.String v17 = r26.i0.v(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.r1.a(context, message), "\n", " ", false, 4, null);
        if (message.j2() || message.S2()) {
            return v17;
        }
        return V6 + ": " + v17;
    }

    public final java.lang.String b(android.content.Context context) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) this.f146945i).mo141623x754a37bb();
        if ((o4Var != null ? o4Var.getInt("chat_records_tts_float_ball_exposure_count", 0) : 0) >= 3) {
            return this.f146944h;
        }
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nhf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        return string;
    }

    public final gp1.v c() {
        return (gp1.v) ((jz5.n) this.f146939c).mo141623x754a37bb();
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatRecordsTtsFloatBallHelper", "release");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f146941e;
        if (c12886x91aa2b6d != null) {
            c().l(c12886x91aa2b6d);
            c().U(c12886x91aa2b6d);
        }
        c().L(70, this.f146947k);
        this.f146941e = null;
        this.f146942f = 0L;
        this.f146943g = null;
        this.f146944h = "";
    }
}
