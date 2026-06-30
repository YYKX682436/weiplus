package bg2;

/* loaded from: classes2.dex */
public final class l8 extends tc2.c {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f20274e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f20275f;

    /* renamed from: g, reason: collision with root package name */
    public dg2.m f20276g;

    /* renamed from: h, reason: collision with root package name */
    public r45.vw0 f20277h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f20278i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f20279m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f20280n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f20281o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f20282p;

    /* renamed from: q, reason: collision with root package name */
    public final long f20283q;

    /* renamed from: r, reason: collision with root package name */
    public final long f20284r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f20285s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f20286t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f20287u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f20288v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Integer f20289w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f20274e = "LiveSatisfactionQuestController";
        this.f20278i = jz5.h.b(bg2.p7.f20388d);
        this.f20279m = jz5.h.b(bg2.r7.f20475d);
        this.f20280n = jz5.h.b(bg2.o7.f20370d);
        this.f20281o = jz5.h.b(bg2.n7.f20339d);
        this.f20282p = jz5.h.b(bg2.q7.f20423d);
        this.f20283q = 3000L;
        this.f20284r = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
        this.f20286t = jz5.h.b(new bg2.w7(this));
        this.f20287u = jz5.h.b(new bg2.s7(this));
    }

    public static final java.lang.String Y6(bg2.l8 l8Var) {
        return (java.lang.String) ((jz5.n) l8Var.f20287u).getValue();
    }

    public static final java.lang.String Z6(bg2.l8 l8Var) {
        return (java.lang.String) ((jz5.n) l8Var.f20286t).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a7(bg2.l8 r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.l8.a7(bg2.l8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b7(bg2.l8 r18, int r19, java.util.LinkedList r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.l8.b7(bg2.l8, int, java.util.LinkedList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc2.c
    public void Q6() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        r45.iq1 iq1Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        r45.nw1 liveInfo2;
        r45.iq1 iq1Var2;
        tc2.g gVar = this.f417141d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
        int i17 = 0;
        boolean z17 = (baseFinderFeed == null || (feedObject2 = baseFinderFeed.getFeedObject()) == null || (liveInfo2 = feedObject2.getLiveInfo()) == null || (iq1Var2 = (r45.iq1) liveInfo2.getCustom(70)) == null) ? false : iq1Var2.getBoolean(0);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = gVar.f417148h;
        if (baseFinderFeed2 != null && (feedObject = baseFinderFeed2.getFeedObject()) != null && (liveInfo = feedObject.getLiveInfo()) != null && (iq1Var = (r45.iq1) liveInfo.getCustom(70)) != null) {
            i17 = iq1Var.getInteger(1);
        }
        long j17 = i17;
        com.tencent.mars.xlog.Log.i(this.f20274e, "[checkAndShowSatisfaction] need:" + z17 + ", delay:" + j17 + ", hasShownSatisfaction:" + this.f20285s);
        if (z17 && !this.f20285s) {
            kotlinx.coroutines.r2 r2Var = this.f20275f;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            kotlinx.coroutines.y0 y0Var = gVar.f417147g;
            this.f20275f = y0Var != null ? kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.q1.f310570c, null, new bg2.m7(this, j17, null), 2, null) : null;
        }
    }

    @Override // tc2.c
    public void U6() {
        java.lang.Integer num;
        in5.s0 s0Var;
        android.content.Context context;
        if (this.f20288v && (num = this.f20289w) != null && num.intValue() != 1 && (s0Var = this.f417141d.f417149i) != null && (context = s0Var.f293121e) != null) {
            com.tencent.mars.xlog.Log.i(this.f20274e, "[notifyRemoveFeed] scene:onUnFocusFeedCenter");
            pm0.v.X(new bg2.z7(null, context, this, false));
        }
        this.f20288v = false;
        this.f20289w = null;
        kotlinx.coroutines.r2 r2Var = this.f20275f;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    public final int c7() {
        return ((java.lang.Number) ((jz5.n) this.f20281o).getValue()).intValue();
    }
}
