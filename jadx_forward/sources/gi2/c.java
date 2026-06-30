package gi2;

/* loaded from: classes10.dex */
public abstract class c implements gi2.g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f353799a = d();

    public abstract void b(java.util.ArrayList arrayList, gi2.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1507xaf968b71.C14233xcca2a527 c14233xcca2a527);

    public void c(java.util.ArrayList viewList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewList, "viewList");
        java.util.Iterator it = viewList.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            if (view.getId() == -1) {
                view.setId(android.view.View.generateViewId());
            }
        }
    }

    public abstract java.lang.String d();

    @Override // gi2.g
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1507xaf968b71.C14233xcca2a527 parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        gi2.b bVar = new gi2.b(parent, this);
        if (parent.getWidth() == 0 || parent.getHeight() == 0) {
            parent.getViewTreeObserver().addOnPreDrawListener(new gi2.a(parent, bVar));
        } else {
            bVar.mo152xb9724478();
        }
    }

    public final void f(android.view.View view, gi2.d adapter, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        if (view.getParent() != null) {
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        adapter.d(i17, view);
    }
}
