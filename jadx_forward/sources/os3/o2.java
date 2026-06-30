package os3;

/* loaded from: classes8.dex */
public class o2 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed f429698d;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed c16936x21d2caed) {
        this.f429698d = c16936x21d2caed;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed c16936x21d2caed = this.f429698d;
        os3.u2 u2Var = c16936x21d2caed.f236420i;
        if (u2Var != null) {
            os3.t0 t0Var = (os3.t0) u2Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86 = t0Var.f429736c;
            activityC16931x24037f86.f236367f.setVisibility(4);
            activityC16931x24037f86.f236372m.setVisibility(4);
            activityC16931x24037f86.f236375p.setVisibility(4);
            t0Var.f429734a.setVisibility(z17 ? 0 : 4);
            int i17 = t0Var.f429735b;
            if ((i17 == 1 || i17 == 2) && !z17) {
                activityC16931x24037f86.f236368g.postDelayed(new os3.s0(t0Var), 10L);
            }
        }
        java.lang.String obj = c16936x21d2caed.f236417f.getEditableText().toString();
        if (!z17 && obj.trim().length() > 0) {
            c16936x21d2caed.e(obj, false);
        }
        android.view.View view2 = c16936x21d2caed.f236422n;
        if (view2 != null && view2.isSelected()) {
            c16936x21d2caed.f236422n.setSelected(z17);
            c16936x21d2caed.f236422n = null;
        }
        c16936x21d2caed.a();
    }
}
