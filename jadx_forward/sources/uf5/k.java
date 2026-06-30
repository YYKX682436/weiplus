package uf5;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f508787a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f508788b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f508789c;

    public k(android.app.Activity activity, yz5.p onSync, yz5.p onConfirm) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSync, "onSync");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onConfirm, "onConfirm");
        this.f508787a = activity;
        this.f508788b = onSync;
        this.f508789c = onConfirm;
    }

    public static final void a(uf5.k kVar, android.widget.ImageView imageView, java.util.Set set, java.util.List list) {
        kVar.getClass();
        l02.n.a(imageView, (list.isEmpty() ^ true) && set.size() == list.size() ? "checkbox_cell_on" : "checkbox_cell_off");
    }

    public static final void b(uf5.k kVar, android.widget.Button button, java.util.Set set) {
        kVar.getClass();
        int size = set.size();
        android.app.Activity activity = kVar.f508787a;
        if (size > 0) {
            button.setText(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pa6, java.lang.Integer.valueOf(size)));
            button.setEnabled(true);
        } else {
            button.setText(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575371pa4));
            button.setEnabled(false);
        }
    }
}
