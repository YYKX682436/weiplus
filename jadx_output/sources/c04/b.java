package c04;

/* loaded from: classes13.dex */
public abstract class b implements c04.f {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.ArrayList f37670e = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f37671d;

    public b(android.content.Context context, c04.e scanAnimationDotsView) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(scanAnimationDotsView, "scanAnimationDotsView");
        this.f37671d = new java.util.HashSet();
        new c04.a(this);
    }

    public void a() {
        java.util.HashSet hashSet = this.f37671d;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((c04.g) ((c04.d) it.next())).getClass();
        }
        hashSet.clear();
    }
}
