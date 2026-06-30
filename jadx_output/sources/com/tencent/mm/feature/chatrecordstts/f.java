package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f65404a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.feature.chatrecordstts.i f65405b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f65406c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f65407d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.model.BallInfo f65408e;

    /* renamed from: f, reason: collision with root package name */
    public long f65409f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f65410g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f65411h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f65412i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.feature.chatrecordstts.ChatRecordsTtsFloatBallHelper$EventReceiver f65413j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.feature.chatrecordstts.a f65414k;

    /* JADX WARN: Type inference failed for: r2v9, types: [com.tencent.mm.feature.chatrecordstts.ChatRecordsTtsFloatBallHelper$EventReceiver] */
    public f(yz5.a onPlayPauseClick, yz5.a onDeleteClick, com.tencent.mm.feature.chatrecordstts.i iVar) {
        kotlin.jvm.internal.o.g(onPlayPauseClick, "onPlayPauseClick");
        kotlin.jvm.internal.o.g(onDeleteClick, "onDeleteClick");
        this.f65404a = onDeleteClick;
        this.f65405b = iVar;
        this.f65406c = jz5.h.b(com.tencent.mm.feature.chatrecordstts.b.f65348d);
        this.f65407d = jz5.h.b(com.tencent.mm.feature.chatrecordstts.e.f65394d);
        this.f65411h = "";
        this.f65412i = jz5.h.b(com.tencent.mm.feature.chatrecordstts.c.f65368d);
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        this.f65413j = new android.os.ResultReceiver(weakReference) { // from class: com.tencent.mm.feature.chatrecordstts.ChatRecordsTtsFloatBallHelper$EventReceiver

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f65326d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(new android.os.Handler(android.os.Looper.getMainLooper()));
                kotlin.jvm.internal.o.g(weakReference, "helperRef");
                this.f65326d = weakReference;
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                com.tencent.mm.feature.chatrecordstts.f fVar = (com.tencent.mm.feature.chatrecordstts.f) this.f65326d.get();
                if (fVar == null) {
                    return;
                }
                yz5.a aVar = fVar.f65404a;
                if (i17 == 3) {
                    com.tencent.mars.xlog.Log.i("ChatRecordsTtsFloatBallHelper", "ball info removed");
                    aVar.invoke();
                } else {
                    if (i17 != 7) {
                        return;
                    }
                    aVar.invoke();
                }
            }
        };
        this.f65414k = new com.tencent.mm.feature.chatrecordstts.a(this);
    }

    public final java.lang.String a(android.content.Context context, com.tencent.mm.storage.f9 message) {
        oy.i iVar = (oy.i) ((jz5.n) this.f65407d).getValue();
        kotlin.jvm.internal.o.f(iVar, "<get-ttsService>(...)");
        com.tencent.mm.feature.chatrecordstts.b1 b1Var = (com.tencent.mm.feature.chatrecordstts.b1) iVar;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(message, "message");
        if (!jm0.g.class.isAssignableFrom(com.tencent.mm.feature.chatrecordstts.x1.class)) {
            throw new java.lang.IllegalArgumentException(com.tencent.mm.feature.chatrecordstts.b1.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(b1Var.getViewModel(), new jm0.e(b1Var)).a(com.tencent.mm.feature.chatrecordstts.x1.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        java.lang.String V6 = ((com.tencent.mm.feature.chatrecordstts.x1) ((jm0.g) a17)).V6(context, message, null);
        java.lang.String v17 = r26.i0.v(com.tencent.mm.feature.chatrecordstts.r1.a(context, message), "\n", " ", false, 4, null);
        if (message.j2() || message.S2()) {
            return v17;
        }
        return V6 + ": " + v17;
    }

    public final java.lang.String b(android.content.Context context) {
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) this.f65412i).getValue();
        if ((o4Var != null ? o4Var.getInt("chat_records_tts_float_ball_exposure_count", 0) : 0) >= 3) {
            return this.f65411h;
        }
        java.lang.String string = context.getString(com.tencent.mm.R.string.nhf);
        kotlin.jvm.internal.o.d(string);
        return string;
    }

    public final gp1.v c() {
        return (gp1.v) ((jz5.n) this.f65406c).getValue();
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("ChatRecordsTtsFloatBallHelper", "release");
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f65408e;
        if (ballInfo != null) {
            c().l(ballInfo);
            c().U(ballInfo);
        }
        c().L(70, this.f65414k);
        this.f65408e = null;
        this.f65409f = 0L;
        this.f65410g = null;
        this.f65411h = "";
    }
}
