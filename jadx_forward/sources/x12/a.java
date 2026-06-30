package x12;

/* loaded from: classes5.dex */
public final class a implements zp0.e {

    /* renamed from: a, reason: collision with root package name */
    public final aq0.i f532958a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.RectF f532959b;

    public a(aq0.i scene, android.graphics.RectF fireworkPlayRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fireworkPlayRect, "fireworkPlayRect");
        this.f532958a = scene;
        this.f532959b = fireworkPlayRect;
    }

    @Override // zp0.e
    public java.util.Map b() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f532958a.ordinal()));
        hashMap.put("fireworkPlayRect", cq0.a.f302858a.b(this.f532959b));
        return hashMap;
    }

    @Override // zp0.e
    /* renamed from: getName */
    public java.lang.String mo174917xfb82e301() {
        return "onFireworkSceneChange";
    }
}
