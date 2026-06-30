package n2;

/* loaded from: classes14.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f415741a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f415742b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f415743c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f415744d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f415745e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f415746f;

    public d(yz5.a setAnimationsTimeCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setAnimationsTimeCallback, "setAnimationsTimeCallback");
        this.f415741a = new java.util.HashSet();
        this.f415742b = new java.util.HashSet();
        this.f415743c = new java.util.HashMap();
        this.f415744d = new java.lang.Object();
        this.f415745e = new java.util.HashMap();
        this.f415746f = new java.lang.Object();
    }

    public final void a(z.l2 parent, yz5.a onSeek) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSeek, "onSeek");
        synchronized (this.f415746f) {
            if (this.f415745e.containsKey(parent)) {
                return;
            }
            this.f415745e.put(parent, new n2.b(((java.lang.Boolean) parent.b()).booleanValue() ? "Exit" : "Enter"));
            java.lang.String str = parent.f550255b;
            if (str == null) {
                str = "AnimatedVisibility";
            }
            n2.a aVar = new n2.a(parent, str);
            java.lang.Object obj = this.f415745e.get(parent);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            jz5.l lVar = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((n2.b) obj).f415738a, "Enter") ? new jz5.l(java.lang.Boolean.FALSE, java.lang.Boolean.TRUE) : new jz5.l(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE);
            parent.g(java.lang.Boolean.valueOf(((java.lang.Boolean) lVar.f384366d).booleanValue()), java.lang.Boolean.valueOf(((java.lang.Boolean) lVar.f384367e).booleanValue()), 0L);
            onSeek.mo152xb9724478();
            this.f415742b.add(aVar);
        }
    }

    public final void b(z.l2 transition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transition, "transition");
        synchronized (this.f415744d) {
            if (this.f415743c.containsKey(transition)) {
                return;
            }
            this.f415743c.put(transition, new n2.c(transition.b(), transition.d()));
            java.lang.Object obj = ((z.e2) transition.c()).f550177a;
            java.lang.Object[] enumConstants = obj.getClass().getEnumConstants();
            java.util.Set D0 = enumConstants != null ? kz5.z.D0(enumConstants) : kz5.o1.c(obj);
            java.lang.String str = transition.f550255b;
            if (str == null) {
                str = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(obj.getClass()).g();
            }
            this.f415741a.add(new n2.e(transition, D0, str));
        }
    }
}
