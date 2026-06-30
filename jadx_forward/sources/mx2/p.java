package mx2;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final mx2.p f414044a = new mx2.p();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f414045b = kz5.c0.i(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.eds), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.tde));

    /* renamed from: c, reason: collision with root package name */
    public static final int f414046c = com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn;

    /* renamed from: d, reason: collision with root package name */
    public static final int f414047d = com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn;

    public final void a(mx2.o oVar, mx2.n nVar) {
        int i17;
        android.view.View mo62729x69f0cde3 = oVar.mo62729x69f0cde3();
        if (mo62729x69f0cde3.getHeight() <= 0) {
            return;
        }
        int[] iArr = new int[2];
        mo62729x69f0cde3.getLocationInWindow(iArr);
        int height = (iArr[1] - nVar.f414040a) + mo62729x69f0cde3.getHeight();
        int i18 = nVar.f414041b;
        if (height <= i18) {
            i17 = nVar.f414042c;
        } else {
            i17 = nVar.f414043d + (height - i18);
        }
        oVar.mo62734x25200dc7(i17);
    }

    public final mx2.n b(in5.s0 s0Var) {
        android.view.View p17;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.f566019ee3);
        if (viewGroup == null || (p17 = s0Var.p(com.p314xaae8f345.mm.R.id.gbz)) == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        int i17 = 0;
        while (true) {
            if (i17 >= childCount) {
                break;
            }
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt.getVisibility() == 0) {
                if (childAt.getAlpha() == 0.0f) {
                    continue;
                } else if (!f414045b.contains(java.lang.Integer.valueOf(childAt.getId()))) {
                    p17 = childAt;
                    break;
                }
            }
            i17++;
        }
        android.view.View itemView = s0Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        int[] iArr = new int[2];
        itemView.getLocationInWindow(iArr);
        int i18 = iArr[1];
        android.content.res.Resources resources = s0Var.f3639x46306858.getResources();
        int[] iArr2 = new int[2];
        p17.getLocationInWindow(iArr2);
        return new mx2.n(i18, iArr2[1] - i18, resources.getDimensionPixelSize(f414047d), resources.getDimensionPixelSize(f414046c));
    }
}
