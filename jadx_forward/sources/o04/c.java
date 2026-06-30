package o04;

/* loaded from: classes4.dex */
public class c implements o04.o {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f423431a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class f423432b;

    /* renamed from: c, reason: collision with root package name */
    public final int f423433c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f423434d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f423435e;

    public c(java.util.List activityNameList, java.lang.Class clazz, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityNameList, "activityNameList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        this.f423431a = activityNameList;
        this.f423432b = clazz;
        this.f423433c = i17;
        this.f423434d = z17;
        this.f423435e = jz5.h.b(new o04.b(this));
    }

    @Override // o04.o
    public boolean a() {
        return this.f423434d;
    }

    @Override // o04.o
    public boolean b(android.content.Intent intent) {
        java.lang.String str;
        java.lang.String className;
        if (intent == null) {
            return false;
        }
        android.content.ComponentName component = intent.getComponent();
        if (component == null || (className = component.getClassName()) == null || (str = (java.lang.String) kz5.n0.k0(r26.n0.f0(className, new java.lang.String[]{"."}, false, 0, 6, null))) == null) {
            str = "";
        }
        return this.f423431a.contains(str);
    }

    @Override // o04.o
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f c() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) ((jz5.n) this.f423435e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fVar, "<get-data>(...)");
        return fVar;
    }

    @Override // o04.o
    /* renamed from: getType */
    public int mo150337xfb85f7b0() {
        return this.f423433c;
    }
}
