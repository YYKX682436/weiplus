package jm3;

/* loaded from: classes4.dex */
public final class b1 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16654xdc9bdf62 f381831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f381832b;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16654xdc9bdf62 activityC16654xdc9bdf62, android.view.View view) {
        this.f381831a = activityC16654xdc9bdf62;
        this.f381832b = view;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String url, android.view.View view, q11.b bVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if ((bVar != null ? bVar.f441067d : null) == null || bVar.f441067d.isRecycled()) {
            return;
        }
        byte[] bytes = url.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        ax1.x xVar = ax1.x.f96560a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = this.f381831a.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        android.graphics.Bitmap bitmap = bVar.f441067d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bitmap, "bitmap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
        xVar.a(mo55332x76847179, this.f381832b, bitmap, g17);
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
