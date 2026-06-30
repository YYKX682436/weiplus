package ki2;

/* loaded from: classes10.dex */
public final class e extends gi2.c {

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f389642b;

    static {
        new ki2.b(null);
        f389642b = jz5.h.b(ki2.a.f389637d);
    }

    @Override // gi2.c
    public java.lang.String d() {
        return "KTVRoomLayout";
    }

    @Override // gi2.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void b(java.util.ArrayList viewList, gi2.d adapter, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewList, "viewList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        int i17 = 0;
        for (java.lang.Object obj : viewList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view = (android.view.View) obj;
            f(view, adapter, i17);
            parent.getContentLayout().addView(view);
            if (i17 == 0) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.leftMargin = i65.a.b(parent.getContext(), 6);
                }
            }
            i17 = i18;
        }
    }

    @Override // gi2.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        ki2.d dVar = new ki2.d(parent, this);
        if (parent.getWidth() == 0 || parent.getHeight() == 0) {
            parent.getViewTreeObserver().addOnPreDrawListener(new ki2.c(parent, dVar));
        } else {
            dVar.mo152xb9724478();
        }
    }
}
