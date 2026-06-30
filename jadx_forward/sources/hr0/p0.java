package hr0;

/* loaded from: classes11.dex */
public final class p0 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f364851b = jz5.h.b(hr0.m0.f364845d);

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f364852c = jz5.h.b(hr0.o0.f364849d);

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        jz5.g gVar = this.f364851b;
        android.os.Handler handler = (android.os.Handler) ((jz5.n) gVar).mo141623x754a37bb();
        jz5.g gVar2 = this.f364852c;
        handler.removeCallbacks((java.lang.Runnable) ((jz5.n) gVar2).mo141623x754a37bb());
        ((android.os.Handler) ((jz5.n) gVar).mo141623x754a37bb()).postDelayed((java.lang.Runnable) ((jz5.n) gVar2).mo141623x754a37bb(), 300000L);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        ((android.os.Handler) ((jz5.n) this.f364851b).mo141623x754a37bb()).removeCallbacks((java.lang.Runnable) ((jz5.n) this.f364852c).mo141623x754a37bb());
    }
}
