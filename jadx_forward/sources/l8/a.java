package l8;

/* loaded from: classes14.dex */
public final class a implements android.graphics.drawable.Drawable.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l8.c f398515d;

    public a(l8.c cVar) {
        this.f398515d = cVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable d17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d17, "d");
        l8.c cVar = this.f398515d;
        int intValue = ((java.lang.Number) ((n0.q4) cVar.f398518m).mo128745x754a37bb()).intValue() + 1;
        ((n0.q4) cVar.f398518m).mo148714x53d8522f(java.lang.Integer.valueOf(intValue));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable d17, java.lang.Runnable what, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d17, "d");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(what, "what");
        ((android.os.Handler) l8.e.f398521a.mo141623x754a37bb()).postAtTime(what, j17);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable d17, java.lang.Runnable what) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d17, "d");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(what, "what");
        ((android.os.Handler) l8.e.f398521a.mo141623x754a37bb()).removeCallbacks(what);
    }
}
