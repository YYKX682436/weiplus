package tl5;

/* loaded from: classes10.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl5.s f501912d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(tl5.s sVar) {
        super(1);
        this.f501912d = sVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int u07;
        xm3.t0 b17;
        uc5.l0 l0Var;
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable.ConstantState constantState;
        android.graphics.drawable.Drawable newDrawable;
        long longValue = ((java.lang.Number) obj).longValue();
        cd5.a aVar = (cd5.a) this.f501912d.f501918a;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c17 = aVar.c();
        int childCount = c17.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c17.getChildAt(i17);
            if (childAt != null && (u07 = c17.u0(childAt)) != -1 && (b17 = xm3.u0.b(c17)) != null && (l0Var = (uc5.l0) kz5.n0.a0(b17.m82898xfb7e5820(), u07)) != null && aVar.d(l0Var) == longValue && (l0Var instanceof uc5.h0)) {
                android.widget.ImageView imageView = (android.widget.ImageView) childAt.findViewById(com.p314xaae8f345.mm.R.id.chd);
                if (imageView == null || (drawable = imageView.getDrawable()) == null) {
                    return null;
                }
                if (!(!(drawable instanceof android.graphics.drawable.ColorDrawable))) {
                    drawable = null;
                }
                if (drawable == null || (constantState = drawable.getConstantState()) == null || (newDrawable = constantState.newDrawable()) == null) {
                    return null;
                }
                return newDrawable.mutate();
            }
        }
        return null;
    }
}
