package wx0;

/* loaded from: classes5.dex */
public final class y0 implements android.widget.RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wx0.z0 f532103a;

    public y0(wx0.z0 z0Var) {
        this.f532103a = z0Var;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.RadioGroup radioGroup, int i17) {
        int i18;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(radioGroup, "radioGroup");
        radioGroup.performHapticFeedback(6);
        wx0.x0 x0Var = i17 == com.p314xaae8f345.mm.R.id.rpa ? wx0.x0.f532098d : i17 == com.p314xaae8f345.mm.R.id.f568313s46 ? wx0.x0.f532099e : i17 == com.p314xaae8f345.mm.R.id.s8e ? wx0.x0.f532100f : wx0.x0.f532098d;
        wx0.z0 z0Var = this.f532103a;
        z0Var.getClass();
        z0Var.f532107g = x0Var;
        int ordinal = x0Var.ordinal();
        if (ordinal == 0) {
            i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.boj;
        } else if (ordinal == 1) {
            i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.bol;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.bok;
        }
        android.view.View view = z0Var.f413347d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView");
        ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10992x3dae1b94) view).m47408x8d516947(i18);
        int ordinal2 = x0Var.ordinal();
        if (ordinal2 == 0) {
            str = "15s";
        } else if (ordinal2 == 1) {
            str = "60s";
        } else {
            if (ordinal2 != 2) {
                throw new jz5.j();
            }
            str = "180s";
        }
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        m7Var.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.y6(m7Var, str, null), 3, null);
    }
}
