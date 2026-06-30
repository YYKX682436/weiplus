package km3;

/* loaded from: classes10.dex */
public final class l implements km3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f390780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f390781b;

    public l(int i17, int i18) {
        this.f390780a = i17;
        this.f390781b = i18;
    }

    public void a(km3.p pVar, int i17, boolean z17) {
        android.view.View view;
        if ((pVar != null ? pVar.f390785d : null) == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference = pVar.f390785d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(weakReference);
        android.widget.TextView textView = (android.widget.TextView) weakReference.get();
        if (textView == null || (view = (android.view.View) pVar.f390786e.get()) == null) {
            return;
        }
        km3.p.f390783i.b(textView, view, i17, this.f390780a, this.f390781b, z17);
        km3.p.f390784m.remove(textView);
    }
}
