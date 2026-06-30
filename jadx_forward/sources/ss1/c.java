package ss1;

/* loaded from: classes8.dex */
public final class c implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss1.d f493417d;

    public c(ss1.d dVar) {
        this.f493417d = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.ViewGroup viewGroup;
        android.content.res.Resources resources;
        android.view.ViewTreeObserver viewTreeObserver;
        ss1.d dVar = this.f493417d;
        android.view.ViewGroup viewGroup2 = dVar.f493430s;
        if (viewGroup2 != null && (viewTreeObserver = viewGroup2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        android.content.Context context = dVar.f493418d;
        int dimension = (context == null || (resources = context.getResources()) == null) ? 0 : (int) resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561236an3);
        if (dVar.f493421g == dVar.c() || (viewGroup = dVar.f493430s) == null) {
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        if (viewGroup.getHeight() >= dimension) {
            return true;
        }
        android.view.ViewGroup viewGroup3 = dVar.f493430s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup3);
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup3.getLayoutParams();
        layoutParams.height = dimension;
        android.view.ViewGroup viewGroup4 = dVar.f493430s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup4);
        viewGroup4.setLayoutParams(layoutParams);
        return true;
    }
}
