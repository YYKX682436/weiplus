package ss2;

/* loaded from: classes10.dex */
public final class d implements ya2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f493464d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f493465e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f493466f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f493467g;

    /* renamed from: h, reason: collision with root package name */
    public int f493468h;

    /* renamed from: i, reason: collision with root package name */
    public final int f493469i;

    public d(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f493464d = activity;
        this.f493469i = 3000;
    }

    public final void a() {
        android.app.Activity context = this.f493464d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ss2.l lVar = (ss2.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(ss2.l.class);
        ss2.d dVar = lVar.f493493i;
        if (!(dVar != null && dVar.f493467g)) {
            lVar.Q6().setEnabled(false);
        } else if (lVar.f493492h != null) {
            lVar.Q6().setEnabled(true);
        } else {
            lVar.Q6().setEnabled(false);
        }
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 b() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f493465e;
        if (c22621x7603e017 != null) {
            return c22621x7603e017;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTv");
        throw null;
    }

    public final android.widget.TextView c() {
        android.widget.TextView textView = this.f493466f;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("textCountTv");
        throw null;
    }
}
