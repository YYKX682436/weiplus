package c04;

/* loaded from: classes13.dex */
public abstract class b implements c04.f {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.ArrayList f119203e = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f119204d;

    public b(android.content.Context context, c04.e scanAnimationDotsView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanAnimationDotsView, "scanAnimationDotsView");
        this.f119204d = new java.util.HashSet();
        new c04.a(this);
    }

    public void a() {
        java.util.HashSet hashSet = this.f119204d;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((c04.g) ((c04.d) it.next())).getClass();
        }
        hashSet.clear();
    }
}
