package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderAutoSeekTPProxy;", "Lcom/tencent/mm/plugin/finder/video/FinderThumbPlayerProxy;", "Lcw2/t6;", "getStartPlayParam", "", "k2", "J", "getContinuePlayTimeLimitMs", "()J", "setContinuePlayTimeLimitMs", "(J)V", "continuePlayTimeLimitMs", "", "l2", "Z", "getEnableContinuePlay", "()Z", "setEnableContinuePlay", "(Z)V", "enableContinuePlay", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderAutoSeekTPProxy */
/* loaded from: classes2.dex */
public class C15172xcfc1ad85 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd {

    /* renamed from: j2, reason: collision with root package name */
    public final ey2.v2 f212046j2;

    /* renamed from: k2, reason: collision with root package name and from kotlin metadata */
    public long continuePlayTimeLimitMs;

    /* renamed from: l2, reason: collision with root package name and from kotlin metadata */
    public boolean enableContinuePlay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15172xcfc1ad85(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.v2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f212046j2 = (ey2.v2) a17;
        this.enableContinuePlay = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd
    public boolean Q(java.lang.String invokeSource) {
        zy2.ub videoViewCallback;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        boolean Q = super.Q(invokeSource);
        if (Q && (videoViewCallback = getVideoViewCallback()) != null) {
            cw2.wa mediaSource = getMediaSource();
            videoViewCallback.p2("", mediaSource != null ? mediaSource.f305629c : null);
        }
        return Q;
    }

    public final long getContinuePlayTimeLimitMs() {
        return this.continuePlayTimeLimitMs;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd, cw2.da
    /* renamed from: getCoverImage */
    public /* bridge */ /* synthetic */ android.widget.ImageView mo56684x37b3d7da() {
        return null;
    }

    public final boolean getEnableContinuePlay() {
        return this.enableContinuePlay;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd
    /* renamed from: getStartPlayParam */
    public cw2.t6 getS() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        cw2.wa f212140n = getF212140n();
        if (f212140n == null || (c14989xf862ae88 = f212140n.f305632f) == null) {
            return null;
        }
        long feedId = c14989xf862ae88.getFeedId();
        ey2.q2 R6 = this.f212046j2.R6(feedId, false, ey2.t2.f339048e);
        if (R6 == null) {
            return null;
        }
        boolean z17 = this.continuePlayTimeLimitMs <= 0 || java.lang.System.currentTimeMillis() - R6.f339017g < this.continuePlayTimeLimitMs;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m61380xe56ce956(), "getStartPlayMs: enableContinuePlay=" + z17 + ", playTimeMs=" + R6.f339014d + ", feedId=" + pm0.v.u(feedId) + ", continuePlayTimeLimitMs=" + this.continuePlayTimeLimitMs);
        if (z17) {
            return new cw2.t6(R6.f339014d, false);
        }
        return null;
    }

    public void p0(java.lang.String source) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        cw2.wa f212140n = getF212140n();
        if (f212140n != null && (c14989xf862ae88 = f212140n.f305632f) != null) {
            long feedId = c14989xf862ae88.getFeedId();
            long mo56685x3d7f3f1d = mo56685x3d7f3f1d();
            long mo56695x7723e6ff = mo56695x7723e6ff();
            int i17 = (int) ((((float) mo56685x3d7f3f1d) / ((float) mo56695x7723e6ff)) * 500);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m61380xe56ce956(), "storeVideoProgress: source=" + source + ", progress=" + i17 + ", currentPlayMs=" + mo56685x3d7f3f1d + ", videoDurationMs=" + mo56695x7723e6ff);
            if (mo56685x3d7f3f1d >= 0 && mo56695x7723e6ff > 0) {
                ey2.v2.X6(this.f212046j2, feedId, 0, i17, mo56685x3d7f3f1d, mo56695x7723e6ff, 1.0f, 0, false, ey2.t2.f339048e, 192, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd, zy2.g5
    /* renamed from: pause */
    public boolean mo58788x65825f6() {
        boolean mo58788x65825f6 = super.mo58788x65825f6();
        if (mo58788x65825f6) {
            p0("pause");
        }
        return mo58788x65825f6;
    }

    /* renamed from: setContinuePlayTimeLimitMs */
    public final void m61190xf0c430f7(long j17) {
        this.continuePlayTimeLimitMs = j17;
    }

    /* renamed from: setEnableContinuePlay */
    public final void m61191xff77b1a0(boolean z17) {
        this.enableContinuePlay = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd, zy2.g5
    /* renamed from: stop */
    public void mo58801x360802() {
        if (W()) {
            p0("stop");
        }
        super.mo58801x360802();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15172xcfc1ad85(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.v2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f212046j2 = (ey2.v2) a17;
        this.enableContinuePlay = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15172xcfc1ad85(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.v2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f212046j2 = (ey2.v2) a17;
        this.enableContinuePlay = true;
    }
}
