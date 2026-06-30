package zo5;

/* loaded from: classes14.dex */
public class i extends zo5.a {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f556425a = jz5.h.b(zo5.g.f556423d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f556426b = jz5.h.b(zo5.h.f556424d);

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MVR.TextureRenderLogic", "release");
        android.opengl.GLES20.glDeleteProgram(((ap5.c) ((jz5.n) this.f556425a).mo141623x754a37bb()).f94344m);
        android.opengl.GLES20.glDeleteProgram(((ap5.d) ((jz5.n) this.f556426b).mo141623x754a37bb()).f94351m);
    }

    public java.lang.Object b(zo5.f params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        boolean z17 = params.f556419a;
        android.util.Size size = params.f556422d;
        zo5.e eVar = params.f556421c;
        int i17 = params.f556420b;
        if (z17) {
            ap5.c cVar = (ap5.c) ((jz5.n) this.f556425a).mo141623x754a37bb();
            cVar.f94349r = i17;
            int i18 = eVar.f556413a;
            int i19 = eVar.f556414b;
            cVar.d(i18, i19);
            android.util.Size size2 = eVar.f556418f;
            if (size2 != null && (size2.getWidth() != eVar.f556413a || size2.getHeight() != i19)) {
                android.graphics.Point point = new android.graphics.Point(0, size2.getHeight());
                android.graphics.Point point2 = new android.graphics.Point(size2.getWidth(), 0);
                cVar.f94342k = point;
                cVar.f94343l = point2;
            }
            cVar.f94341j = eVar.f556416d;
            int width = size.getWidth();
            cVar.f94335d = size.getHeight();
            cVar.f94334c = width;
            cVar.f94340i = eVar.f556415c;
            cVar.b();
            return null;
        }
        ap5.d dVar = (ap5.d) ((jz5.n) this.f556426b).mo141623x754a37bb();
        dVar.f94356r = i17;
        int i27 = eVar.f556413a;
        int i28 = eVar.f556414b;
        dVar.d(i27, i28);
        android.util.Size size3 = eVar.f556418f;
        if (size3 != null && (size3.getWidth() != eVar.f556413a || size3.getHeight() != i28)) {
            android.graphics.Point point3 = new android.graphics.Point(0, size3.getHeight());
            android.graphics.Point point4 = new android.graphics.Point(size3.getWidth(), 0);
            dVar.f94342k = point3;
            dVar.f94343l = point4;
        }
        dVar.f94341j = eVar.f556416d;
        int width2 = size.getWidth();
        dVar.f94335d = size.getHeight();
        dVar.f94334c = width2;
        dVar.f94340i = eVar.f556415c;
        dVar.b();
        return null;
    }
}
