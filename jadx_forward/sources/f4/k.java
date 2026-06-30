package f4;

/* loaded from: classes15.dex */
public abstract class k extends f4.q {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f340925b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.Choreographer f340926c;

    /* renamed from: d, reason: collision with root package name */
    public final f4.s f340927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f4.i jankStats, android.view.View view) {
        super(jankStats);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jankStats, "jankStats");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f340925b = new java.lang.ref.WeakReference(view);
        android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(choreographer, "getInstance(...)");
        this.f340926c = choreographer;
        android.view.ViewParent parent = view.getParent();
        while (parent instanceof android.view.View) {
            view = parent;
            parent = view.getParent();
        }
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.jid);
        if (tag == null) {
            tag = new f4.s();
            view.setTag(com.p314xaae8f345.mm.R.id.jid, tag);
        }
        this.f340927d = (f4.s) tag;
        new f4.j(jankStats, this);
    }
}
