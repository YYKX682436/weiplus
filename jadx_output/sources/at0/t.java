package at0;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final at0.t f13629a = new at0.t();

    /* renamed from: b, reason: collision with root package name */
    public static ms0.c f13630b;

    public final ht0.b a(int i17, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, ts0.r camera, android.opengl.EGLContext eglContext, et0.q view, ms0.c cVar) {
        kotlin.jvm.internal.o.g(videoTransPara, "videoTransPara");
        kotlin.jvm.internal.o.g(camera, "camera");
        kotlin.jvm.internal.o.g(eglContext, "eglContext");
        kotlin.jvm.internal.o.g(view, "view");
        at0.s sVar = new at0.s(i17);
        ts0.d dVar = ts0.d.f421550a;
        if (i17 == 2) {
            if (cVar == null) {
                f13630b = (ms0.c) sVar.invoke();
            } else {
                f13630b = cVar;
            }
            ms0.c cVar2 = f13630b;
            if (cVar2 != null) {
                if (dVar.a()) {
                    cVar2.u(videoTransPara.f71191d, videoTransPara.f71192e);
                } else if (camera.z() != null) {
                    cVar2.u(ts0.c.f421543c, ts0.c.f421542b);
                    cVar2.r(ts0.c.f421544d);
                    cVar2.m(ts0.c.f421548h);
                }
            }
            ms0.c cVar3 = f13630b;
            is0.c previewTexture = view.getPreviewTexture();
            return new ht0.s(videoTransPara, cVar3, eglContext, previewTexture != null ? previewTexture.f294395e : -1);
        }
        if (cVar == null) {
            f13630b = (ms0.c) sVar.invoke();
        } else {
            f13630b = cVar;
        }
        ms0.c cVar4 = f13630b;
        if (cVar4 != null) {
            if (dVar.a()) {
                cVar4.u(videoTransPara.f71191d, videoTransPara.f71192e);
            } else if (camera.z() != null) {
                android.graphics.Point point = new android.graphics.Point(ts0.c.f421543c, ts0.c.f421542b);
                cVar4.u(point.x, point.y);
                cVar4.r(ts0.c.f421544d);
                cVar4.m(ts0.c.f421548h);
            }
        }
        ms0.c cVar5 = f13630b;
        is0.c previewTexture2 = view.getPreviewTexture();
        return new ht0.c0(videoTransPara, cVar5, eglContext, previewTexture2 != null ? previewTexture2.f294395e : -1);
    }
}
