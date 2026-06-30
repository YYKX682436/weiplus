package w24;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f524160a;

    /* renamed from: b, reason: collision with root package name */
    public w24.d f524161b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f524162c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f524163d;

    public l(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f524160a = key;
    }

    public final android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View view = this.f524162c;
        if (view == null) {
            view = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.clf, (android.view.ViewGroup) null, false);
            this.f524162c = view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        w24.w wVar = (w24.w) this;
        wVar.f524177f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.nu6);
        wVar.f524178g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) view.findViewById(com.p314xaae8f345.mm.R.id.ntt);
        wVar.c();
        return view;
    }
}
