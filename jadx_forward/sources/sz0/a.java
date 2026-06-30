package sz0;

/* loaded from: classes14.dex */
public final class a implements android.graphics.drawable.Drawable.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz0.c f495445d;

    public a(sz0.c cVar) {
        this.f495445d = cVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable d17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d17, "d");
        sz0.c cVar = this.f495445d;
        int intValue = ((java.lang.Number) ((n0.q4) cVar.f495448m).mo128745x754a37bb()).intValue() + 1;
        ((n0.q4) cVar.f495448m).mo148714x53d8522f(java.lang.Integer.valueOf(intValue));
        long a17 = sz0.e.a(cVar.f495447i);
        ((n0.q4) cVar.f495449n).mo148714x53d8522f(new d1.k(a17));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable d17, java.lang.Runnable what, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d17, "d");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(what, "what");
        ((android.os.Handler) sz0.e.f495453a.mo141623x754a37bb()).postAtTime(what, j17);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable d17, java.lang.Runnable what) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d17, "d");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(what, "what");
        ((android.os.Handler) sz0.e.f495453a.mo141623x754a37bb()).removeCallbacks(what);
    }
}
