package fk2;

/* loaded from: classes3.dex */
public final class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.p1 f344976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f344977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f344978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f344979g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f344980h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dk2.ia f344981i;

    public o1(fk2.p1 p1Var, bm2.h1 h1Var, android.widget.RelativeLayout relativeLayout, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var, android.content.Context context, dk2.ia iaVar) {
        this.f344976d = p1Var;
        this.f344977e = h1Var;
        this.f344978f = relativeLayout;
        this.f344979g = f0Var;
        this.f344980h = context;
        this.f344981i = iaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int f17 = this.f344976d.f526773a.f();
        bm2.h1 h1Var = this.f344977e;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) h1Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.rlw);
        int width = viewGroup != null ? viewGroup.getWidth() : 0;
        android.widget.RelativeLayout relativeLayout = this.f344978f;
        int paddingLeft = (f17 - (relativeLayout.getPaddingLeft() + relativeLayout.getPaddingRight())) - width;
        int i17 = fk2.p1.f344984n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = h1Var.f103460e;
        java.lang.String string = this.f344980h.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.egq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        fk2.n1 n1Var = new fk2.n1(this.f344981i);
        int paddingLeft2 = (paddingLeft - c22624x85d69039.getPaddingLeft()) - c22624x85d69039.getPaddingRight();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039(c22624x85d69039.getContext());
        c22624x85d690392.l(0, c22624x85d69039.m84164x40077844());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = this.f344979g;
        int length = f0Var.length();
        int i18 = 0;
        java.lang.CharSequence charSequence = f0Var;
        while (i18 <= length) {
            int i19 = (i18 + length) / 2;
            java.lang.CharSequence subSequence = f0Var.subSequence(0, i19);
            c22624x85d690392.b(subSequence);
            if (((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2839xbddafb2a.C23000xc9450414) c22624x85d690392.i(paddingLeft2, Integer.MAX_VALUE)).L <= 3) {
                i18 = i19 + 1;
                charSequence = subSequence;
            } else {
                length = i19 - 1;
            }
        }
        if (charSequence.length() >= f0Var.length()) {
            c22624x85d69039.b(f0Var);
            return;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence);
        int max = java.lang.Math.max(spannableStringBuilder.length() - string.length(), 0);
        spannableStringBuilder.replace(max, java.lang.Math.min(spannableStringBuilder.length(), string.length() + max), (java.lang.CharSequence) string);
        spannableStringBuilder.setSpan(new fk2.m1(c22624x85d69039, n1Var, f0Var), max, string.length() + max, 17);
        c22624x85d69039.b(spannableStringBuilder);
    }
}
