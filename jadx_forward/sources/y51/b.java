package y51;

/* loaded from: classes10.dex */
public final class b extends android.widget.RelativeLayout implements y51.c, y51.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f540999d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.RelativeLayout f541000e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f540999d = new java.util.HashMap();
        this.f541000e = new android.widget.RelativeLayout(context);
    }

    public z51.x a(java.lang.Class clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        java.util.HashMap hashMap = this.f540999d;
        java.lang.String canonicalName = clazz.getCanonicalName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(canonicalName);
        java.lang.Object obj = hashMap.get(canonicalName);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type T of com.tencent.mm.player.MMLivePhotoLocalPlayerView.component");
        return (z51.x) obj;
    }

    public void b() {
        java.util.Iterator it = this.f540999d.entrySet().iterator();
        while (it.hasNext()) {
            ((z51.x) ((java.util.Map.Entry) it.next()).getValue()).h();
        }
    }

    public void c() {
        java.util.Iterator it = this.f540999d.entrySet().iterator();
        while (it.hasNext()) {
            ((z51.x) ((java.util.Map.Entry) it.next()).getValue()).i();
        }
    }

    public void d() {
        z51.c cVar = (z51.c) a(z51.c.class);
        cVar.f("prepare");
        a61.c cVar2 = cVar.f551707f;
        if (cVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceConfig");
            throw null;
        }
        if (cVar2.f83253b) {
            return;
        }
        cVar.f551708g = p3325xe03a0797.p3326xc267989b.l.d(cVar.f551769c, null, null, new z51.b(cVar, null), 3, null);
    }

    public void e() {
        java.util.Iterator it = this.f540999d.entrySet().iterator();
        while (it.hasNext()) {
            ((z51.x) ((java.util.Map.Entry) it.next()).getValue()).j();
        }
    }

    /* renamed from: getPlayerContext */
    public android.content.Context m176504x94381fd8() {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return context;
    }

    /* renamed from: getScaleParent */
    public android.view.View m176505xa2cba55e() {
        return this.f541000e;
    }

    /* renamed from: getTagLayout */
    public android.view.View m176506x5aa37cae() {
        return ((z51.r) a(z51.r.class)).f551747i;
    }

    @Override // y51.c
    /* renamed from: setPlayCallback */
    public void mo176507x6332291b(y51.e callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((z51.p) a(z51.p.class)).f551739m = callback;
    }

    @Override // y51.g
    /* renamed from: setTagViewCallback */
    public void mo176508x4c403202(y51.f callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((z51.r) a(z51.r.class)).f551748j = callback;
    }
}
