package qj5;

/* loaded from: classes5.dex */
public final class f implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qj5.n f445503a;

    public f(qj5.n nVar) {
        this.f445503a = nVar;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View v17, n3.g3 insets) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "insets");
        qj5.n nVar = this.f445503a;
        if (nVar.h()) {
            return insets;
        }
        int i17 = insets.a(1).f328578b;
        android.view.ViewGroup.LayoutParams layoutParams = v17.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        android.content.Context context = nVar.f445522w2;
        if (context == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
            throw null;
        }
        layoutParams2.topMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) + i17;
        layoutParams2.addRule(10);
        layoutParams2.addRule(2, com.p314xaae8f345.mm.R.id.f564976sl0);
        v17.setLayoutParams(layoutParams2);
        return insets;
    }
}
