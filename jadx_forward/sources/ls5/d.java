package ls5;

/* loaded from: classes10.dex */
public final class d implements ls5.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f402654a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f402655b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f402656c;

    /* renamed from: d, reason: collision with root package name */
    public long f402657d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f402658e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f402659f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f402660g;

    /* renamed from: h, reason: collision with root package name */
    public ls5.l f402661h;

    public d(java.lang.String eventTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventTag, "eventTag");
        this.f402654a = eventTag;
        this.f402658e = "";
        this.f402659f = new java.util.LinkedList();
        this.f402660g = "";
    }

    public final void a(java.lang.String str) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f402660g)) {
            return;
        }
        this.f402659f.add(str);
        this.f402660g = str;
    }

    public void b(android.view.View view) {
        this.f402655b = view;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402654a, "bindMiniWindowView: " + view);
    }

    public final android.app.Activity c(android.view.View view) {
        if (view == null) {
            return null;
        }
        if (!(view.getContext() instanceof android.app.Activity)) {
            android.view.ViewParent parent = view.getParent();
            return c(parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null);
        }
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        return (android.app.Activity) context;
    }

    public final java.lang.String d(android.app.Activity activity) {
        if (activity != null) {
            java.lang.String str = activity.getClass().getSimpleName() + '@' + activity.hashCode();
            if (str != null) {
                return str;
            }
        }
        return "";
    }
}
