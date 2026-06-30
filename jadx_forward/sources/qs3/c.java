package qs3;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final qs3.c f447870a = new qs3.c();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 f447871b = (com.p314xaae8f345.mm.p2470x93e71c27.ui.j1) i95.n0.c(ic0.e.class);

    public final void a(android.widget.ImageView iv6, java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iv6, "iv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        android.graphics.drawable.Drawable drawable = iv6.getDrawable();
        qs3.d dVar = (drawable == null || !(drawable instanceof qs3.d)) ? new qs3.d(tag, null) : (qs3.d) drawable;
        dVar.b(tag);
        iv6.setImageDrawable(dVar);
    }
}
