package re2;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final long f476028a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f476029b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f476030c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f476031d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f476032e;

    public w(long j17, java.util.List avatarUrls) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatarUrls, "avatarUrls");
        this.f476028a = j17;
        this.f476029b = avatarUrls;
        this.f476030c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f476031d = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f476032e = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
    }

    public static final void a(re2.w wVar, yz5.l lVar, re2.g gVar, int i17, java.lang.String str) {
        if (wVar.f476030c.compareAndSet(false, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.CoLiveAvatarMerger", "dispatchFail: stage=" + gVar + ", errCode=" + i17 + ", errMsg=" + str);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                lVar.mo146xb9724478(new re2.h(gVar, i17, str));
            } else {
                wVar.f476031d.post(new re2.i(lVar, gVar, i17, str));
            }
        }
    }

    public final void b(yz5.l lVar, java.lang.String str) {
        if (this.f476030c.compareAndSet(false, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveAvatarMerger", "dispatchSuccess: mergedUrl=".concat(r26.p0.E0(str, 80)));
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                lVar.mo146xb9724478(str);
            } else {
                this.f476031d.post(new re2.j(lVar, str));
            }
        }
    }
}
