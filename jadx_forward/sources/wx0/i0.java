package wx0;

/* loaded from: classes5.dex */
public final class i0 implements android.widget.RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wx0.k0 f532031a;

    public i0(wx0.k0 k0Var) {
        this.f532031a = k0Var;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.RadioGroup radioGroup, int i17) {
        int i18;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(radioGroup, "radioGroup");
        radioGroup.performHapticFeedback(6);
        wx0.h0 h0Var = i17 == com.p314xaae8f345.mm.R.id.rpa ? wx0.h0.f532026d : i17 == com.p314xaae8f345.mm.R.id.f568313s46 ? wx0.h0.f532027e : i17 == com.p314xaae8f345.mm.R.id.s8e ? wx0.h0.f532028f : wx0.h0.f532026d;
        wx0.k0 k0Var = this.f532031a;
        k0Var.f532035g = h0Var;
        int ordinal = h0Var.ordinal();
        if (ordinal == 0) {
            i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.cwt;
        } else if (ordinal == 1) {
            i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.cwv;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.cwu;
        }
        android.view.View view = k0Var.f413347d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView");
        ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10992x3dae1b94) view).m47408x8d516947(i18);
        int ordinal2 = h0Var.ordinal();
        if (ordinal2 == 0) {
            str = "Off";
        } else if (ordinal2 == 1) {
            str = "3s";
        } else {
            if (ordinal2 != 2) {
                throw new jz5.j();
            }
            str = "10s";
        }
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        m7Var.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.t6(m7Var, str, null), 3, null);
    }
}
