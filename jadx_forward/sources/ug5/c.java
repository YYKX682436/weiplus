package ug5;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final ug5.g f509117a;

    public c(ug5.b action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f509117a = new ug5.g(action);
    }

    public static /* synthetic */ ug5.c h(ug5.c cVar, java.lang.Class cls, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTransparentActivity");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        cVar.g(cls, z17);
        return cVar;
    }

    public final ug5.v a() {
        ug5.g gVar = this.f509117a;
        ug5.i iVar = gVar.f509123d;
        gVar.f509129j.isEmpty();
        gVar.f509130k.isEmpty();
        android.view.Window window = gVar.f509121b;
        if (window == null && window == null) {
            java.lang.Class cls = gVar.f509140u;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentPerformer", "[build] " + gVar);
        return new ug5.v(gVar);
    }

    public final ug5.c b(float f17) {
        float[] fArr = this.f509117a.f509145z;
        fArr[0] = f17;
        fArr[1] = f17;
        fArr[2] = f17;
        fArr[3] = f17;
        return this;
    }

    public final ug5.c c(java.lang.String key, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f509117a.f509128i.put(key, obj);
        return this;
    }

    public final ug5.c d(java.util.Map extra) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        this.f509117a.f509128i.putAll(extra);
        return this;
    }

    public final ug5.c e(android.graphics.Rect rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        this.f509117a.f509129j.set(rect);
        return this;
    }

    public final ug5.c f(android.animation.TimeInterpolator interpolator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interpolator, "interpolator");
        ug5.g gVar = this.f509117a;
        gVar.getClass();
        gVar.f509138s = interpolator;
        return this;
    }

    public final ug5.c g(java.lang.Class cls, boolean z17) {
        ug5.g gVar = this.f509117a;
        gVar.f509140u = cls;
        gVar.f509141v = z17;
        return this;
    }

    public final ug5.c i(android.graphics.Rect rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        this.f509117a.f509130k.set(rect);
        return this;
    }
}
