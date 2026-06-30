package lm5;

/* loaded from: classes7.dex */
public class b implements lm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f401132a;

    public b(android.os.Handler handler) {
        this.f401132a = handler;
    }

    @Override // lm5.a
    public void a() {
        this.f401132a.removeCallbacksAndMessages(null);
    }

    @Override // lm5.a
    /* renamed from: getLooper */
    public android.os.Looper mo146067x23b2dd47() {
        return this.f401132a.getLooper();
    }

    @Override // lm5.a
    /* renamed from: post */
    public void mo146068x3498a0(java.lang.Runnable runnable) {
        this.f401132a.post(runnable);
    }

    @Override // lm5.a
    /* renamed from: postDelayed */
    public void mo146069x7c4d7ca2(java.lang.Runnable runnable, long j17) {
        this.f401132a.postDelayed(runnable, j17);
    }
}
