package at0;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final at0.t f95162a = new at0.t();

    /* renamed from: b, reason: collision with root package name */
    public static ms0.c f95163b;

    public final ht0.b a(int i17, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d videoTransPara, ts0.r camera, android.opengl.EGLContext eglContext, et0.q view, ms0.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoTransPara, "videoTransPara");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camera, "camera");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eglContext, "eglContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        at0.s sVar = new at0.s(i17);
        ts0.d dVar = ts0.d.f503083a;
        if (i17 == 2) {
            if (cVar == null) {
                f95163b = (ms0.c) sVar.mo152xb9724478();
            } else {
                f95163b = cVar;
            }
            ms0.c cVar2 = f95163b;
            if (cVar2 != null) {
                if (dVar.a()) {
                    cVar2.u(videoTransPara.f152724d, videoTransPara.f152725e);
                } else if (camera.z() != null) {
                    cVar2.u(ts0.c.f503076c, ts0.c.f503075b);
                    cVar2.r(ts0.c.f503077d);
                    cVar2.m(ts0.c.f503081h);
                }
            }
            ms0.c cVar3 = f95163b;
            is0.c mo8982xa9fb0529 = view.mo8982xa9fb0529();
            return new ht0.s(videoTransPara, cVar3, eglContext, mo8982xa9fb0529 != null ? mo8982xa9fb0529.f375928e : -1);
        }
        if (cVar == null) {
            f95163b = (ms0.c) sVar.mo152xb9724478();
        } else {
            f95163b = cVar;
        }
        ms0.c cVar4 = f95163b;
        if (cVar4 != null) {
            if (dVar.a()) {
                cVar4.u(videoTransPara.f152724d, videoTransPara.f152725e);
            } else if (camera.z() != null) {
                android.graphics.Point point = new android.graphics.Point(ts0.c.f503076c, ts0.c.f503075b);
                cVar4.u(point.x, point.y);
                cVar4.r(ts0.c.f503077d);
                cVar4.m(ts0.c.f503081h);
            }
        }
        ms0.c cVar5 = f95163b;
        is0.c mo8982xa9fb05292 = view.mo8982xa9fb0529();
        return new ht0.c0(videoTransPara, cVar5, eglContext, mo8982xa9fb05292 != null ? mo8982xa9fb05292.f375928e : -1);
    }
}
