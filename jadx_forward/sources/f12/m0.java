package f12;

/* loaded from: classes4.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f12.o0 f340174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f340176f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f340177g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo f340178h;

    public m0(f12.o0 o0Var, java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        this.f340174d = o0Var;
        this.f340175e = str;
        this.f340176f = j17;
        this.f340177g = j18;
        this.f340178h = videoInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t21.h0 h0Var = this.f340174d.f340192g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h0Var);
        java.lang.String str = this.f340175e;
        long j17 = this.f340176f;
        long j18 = this.f340177g;
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo = this.f340178h;
        java.lang.String str2 = videoInfo != null ? videoInfo.f18114x9330627b : null;
        if (str2 == null) {
            str2 = "";
        }
        ((com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800) h0Var).e0(str, j17, j18, str2);
    }
}
