package bg2;

/* loaded from: classes2.dex */
public final class q6 extends tc2.c {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f20413e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vw0 f20414f;

    /* renamed from: g, reason: collision with root package name */
    public dg2.m f20415g;

    /* renamed from: h, reason: collision with root package name */
    public final long f20416h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f20417i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20418m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f20419n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f20420o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f20421p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f20422q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f20413e = "LiveNotInterestedController";
        this.f20416h = 3000L;
        this.f20417i = jz5.h.b(bg2.t5.f20523d);
        this.f20419n = jz5.h.b(new bg2.w5(this));
        this.f20420o = jz5.h.b(new bg2.u5(this));
        this.f20421p = jz5.h.b(new bg2.c6(store, this));
        this.f20422q = jz5.h.b(new bg2.z5(store, this));
    }

    public static final java.lang.String Y6(bg2.q6 q6Var) {
        return (java.lang.String) ((jz5.n) q6Var.f20420o).getValue();
    }

    public static final java.lang.String Z6(bg2.q6 q6Var) {
        return (java.lang.String) ((jz5.n) q6Var.f20419n).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a7(bg2.q6 r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.q6.a7(bg2.q6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b7(bg2.q6 r18, java.util.LinkedList r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.q6.b7(bg2.q6, java.util.LinkedList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc2.c
    public void Q6() {
        com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveNotInterestedController$noInterestedExposedListener$2$1$1 liveNotInterestedController$noInterestedExposedListener$2$1$1 = (com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveNotInterestedController$noInterestedExposedListener$2$1$1) ((jz5.n) this.f20421p).getValue();
        if (liveNotInterestedController$noInterestedExposedListener$2$1$1 != null) {
            liveNotInterestedController$noInterestedExposedListener$2$1$1.alive();
        }
        com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveNotInterestedController$noInterestedClickListener$2$1$1 liveNotInterestedController$noInterestedClickListener$2$1$1 = (com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveNotInterestedController$noInterestedClickListener$2$1$1) ((jz5.n) this.f20422q).getValue();
        if (liveNotInterestedController$noInterestedClickListener$2$1$1 != null) {
            liveNotInterestedController$noInterestedClickListener$2$1$1.alive();
        }
        this.f20414f = null;
    }

    @Override // tc2.c
    public void U6() {
        in5.s0 s0Var;
        android.content.Context context;
        com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveNotInterestedController$noInterestedExposedListener$2$1$1 liveNotInterestedController$noInterestedExposedListener$2$1$1 = (com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveNotInterestedController$noInterestedExposedListener$2$1$1) ((jz5.n) this.f20421p).getValue();
        if (liveNotInterestedController$noInterestedExposedListener$2$1$1 != null) {
            liveNotInterestedController$noInterestedExposedListener$2$1$1.dead();
        }
        com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveNotInterestedController$noInterestedClickListener$2$1$1 liveNotInterestedController$noInterestedClickListener$2$1$1 = (com.tencent.mm.plugin.finder.live.convert.convertcontroller.LiveNotInterestedController$noInterestedClickListener$2$1$1) ((jz5.n) this.f20422q).getValue();
        if (liveNotInterestedController$noInterestedClickListener$2$1$1 != null) {
            liveNotInterestedController$noInterestedClickListener$2$1$1.dead();
        }
        if (this.f20418m && (s0Var = this.f417141d.f417149i) != null && (context = s0Var.f293121e) != null) {
            com.tencent.mars.xlog.Log.i(this.f20413e, "[notifyRemoveFeed] scene:onUnFocusFeedCenter");
            pm0.v.X(new bg2.f6(null, context, this, false));
        }
        this.f20414f = null;
        this.f20418m = false;
    }
}
