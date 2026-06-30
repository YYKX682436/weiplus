package im2;

/* loaded from: classes3.dex */
public final class p3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f374019d;

    public p3(im2.z3 z3Var) {
        this.f374019d = z3Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        im2.z3 z3Var = this.f374019d;
        ((android.widget.TextView) ((jz5.n) z3Var.S).mo141623x754a37bb()).setText(menuItem.getTitle());
        int itemId = menuItem.getItemId();
        boolean z17 = false;
        jz5.g gVar = z3Var.f374164J;
        if (itemId == 0) {
            z3Var.v7(false);
            z3Var.f374203y1 = new r45.re2();
            z3Var.Y1 = 0;
            ((android.widget.LinearLayout) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(8);
        } else if (itemId == z3Var.W1) {
            zl2.q4 q4Var = zl2.q4.f555466a;
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
            if (c1Var != null && c1Var.f410311a5) {
                z17 = true;
            }
            if (q4Var.F(z17)) {
                z3Var.r7();
            }
        } else if (itemId == z3Var.X1) {
            z3Var.Y1 = 0;
            if (z3Var.S6()) {
                ((android.widget.LinearLayout) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(0);
                ((android.widget.RelativeLayout) ((jz5.n) z3Var.L).mo141623x754a37bb()).setOnClickListener(new im2.r3(z3Var));
                ((android.widget.RelativeLayout) ((jz5.n) z3Var.N).mo141623x754a37bb()).setOnClickListener(new im2.s3(z3Var));
                z3Var.v7(true);
                z3Var.w7(r45.vw4.Auto);
            }
        }
        z3Var.f374185m2 = true;
        z3Var.R6();
    }
}
