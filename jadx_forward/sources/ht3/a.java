package ht3;

/* loaded from: classes.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ht3.a f366477d = new ht3.a();

    public a() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) it;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                if (childAt != null && childAt.getContentDescription() != null && childAt.getVisibility() == 0) {
                    return childAt.getContentDescription().toString();
                }
            }
        }
        return "";
    }
}
