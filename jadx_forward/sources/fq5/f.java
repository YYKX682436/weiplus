package fq5;

/* loaded from: classes5.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 f347198d;

    public f(com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 c22927xe8447aa8) {
        this.f347198d = c22927xe8447aa8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 c22927xe8447aa8 = this.f347198d;
        em.j4 j4Var = c22927xe8447aa8.f295809e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = null;
        if (j4Var != null) {
            if (j4Var.f336010b == null) {
                j4Var.f336010b = (android.widget.TextView) j4Var.f336009a.findViewById(com.p314xaae8f345.mm.R.id.f566986u84);
            }
            textView = j4Var.f336010b;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(c22927xe8447aa8.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nms));
        }
        em.j4 j4Var2 = c22927xe8447aa8.f295809e;
        if (j4Var2 != null) {
            if (j4Var2.f336019k == null) {
                j4Var2.f336019k = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) j4Var2.f336009a.findViewById(com.p314xaae8f345.mm.R.id.f566983u81);
            }
            c22661xa3a2b3c0 = j4Var2.f336019k;
        }
        if (c22661xa3a2b3c0 != null) {
            c22661xa3a2b3c0.setText(c22927xe8447aa8.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nmr));
        }
        em.j4 j4Var3 = c22927xe8447aa8.f295809e;
        if (j4Var3 != null) {
            if (j4Var3.f336019k == null) {
                j4Var3.f336019k = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) j4Var3.f336009a.findViewById(com.p314xaae8f345.mm.R.id.f566983u81);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = j4Var3.f336019k;
            if (c22661xa3a2b3c02 != null) {
                c22661xa3a2b3c02.setOnClickListener(new fq5.e(c22927xe8447aa8));
            }
        }
    }
}
