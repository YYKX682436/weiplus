package eh5;

/* loaded from: classes5.dex */
public final class g implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractActivityC22432xeb4f0b3b f334492a;

    public g(com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractActivityC22432xeb4f0b3b abstractActivityC22432xeb4f0b3b) {
        this.f334492a = abstractActivityC22432xeb4f0b3b;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View view, n3.g3 insets) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "insets");
        if (this.f334492a.getF290471m()) {
            e3.d a17 = insets.a(7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getInsets(...)");
            view.setPadding(0, a17.f328578b, 0, a17.f328580d);
            return n3.g3.f415870b;
        }
        if (view.getPaddingTop() == 0 && view.getPaddingBottom() == 0 && view.getPaddingLeft() == 0 && view.getPaddingRight() == 0) {
            return insets;
        }
        view.setPadding(0, 0, 0, 0);
        return insets;
    }
}
