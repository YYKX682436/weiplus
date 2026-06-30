package g95;

/* loaded from: classes9.dex */
public final class c0 {
    public c0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String str) {
        if (b().f(str)) {
            b().remove(str);
        }
        if (gm0.j1.a()) {
            if (c01.id.c() - ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) g95.d0.f351331c).mo141623x754a37bb()).getLong("time", 0L) > g95.d0.f351333e) {
                ((ku5.t0) ku5.t0.f394148d).q(g95.a0.f351326d);
            }
        }
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) g95.d0.f351330b).mo141623x754a37bb();
    }

    public final float c(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getLocalVisibleRect(rect);
        if (new android.graphics.Rect(0, 0, view.getWidth(), view.getHeight()).isEmpty()) {
            return 100.0f;
        }
        if (rect.isEmpty()) {
            return 0.0f;
        }
        return ((rect.width() * 100.0f) * rect.height()) / (r1.width() * r1.height());
    }
}
