package b04;

/* loaded from: classes5.dex */
public final class j0 extends wm3.a implements ll5.h {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f16915d;

    /* renamed from: e, reason: collision with root package name */
    public al5.s0 f16916e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16917f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16918g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f16919h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f16920i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f16919h = jz5.h.b(new b04.h0(this));
        this.f16920i = jz5.h.b(b04.a0.f16876d);
    }

    public final int T6() {
        return ((java.lang.Number) ((jz5.n) this.f16919h).getValue()).intValue();
    }

    public final void U6(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RedPacketUIC", "reportBackDialogAction: action=" + i17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(37640, java.lang.String.valueOf(i17));
    }

    @Override // ll5.h
    public android.view.View i2() {
        com.tencent.mm.ui.widget.code.CodeItemView codeItemView = new com.tencent.mm.ui.widget.code.CodeItemView(getContext(), null, 2, null);
        ll5.a aVar = new ll5.a();
        aVar.f319266d = com.tencent.mm.R.raw.icons_outlined_facehb;
        aVar.f319267e = codeItemView.getContext().getColor(com.tencent.mm.R.color.Red_100);
        java.lang.String string = codeItemView.getContext().getString(com.tencent.mm.R.string.nlh);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        aVar.f319268f = string;
        java.lang.String string2 = codeItemView.getContext().getString(com.tencent.mm.R.string.nkx);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        aVar.f319269g = string2;
        aVar.f319272m = true;
        ((hs.d0) ((kd0.i2) i95.n0.c(kd0.i2.class))).wi(kd0.g3.f306650o, aVar, T6(), null);
        kd0.i2 i2Var = (kd0.i2) i95.n0.c(kd0.i2.class);
        kd0.g3 g3Var = kd0.g3.f306651p;
        int T6 = T6();
        b04.d0 d0Var = new b04.d0(this, codeItemView);
        ((hs.d0) i2Var).getClass();
        aVar.f319273n = new hs.c0(g3Var, aVar, T6, d0Var);
        aVar.f319271i = new b04.g0(codeItemView, this);
        codeItemView.setViewModel(aVar);
        return codeItemView;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        if (this.f16918g) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) this.f16920i).getValue();
            if (!(o4Var != null ? o4Var.getBoolean("back_dialog_shown", false) : false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RedPacketUIC", "showBackConfirmDialog: show exit dialog");
                U6(1);
                db5.e1.E(getContext(), getContext().getString(com.tencent.mm.R.string.nkv), "", getContext().getString(com.tencent.mm.R.string.f490454vi), false, new b04.i0(this));
                return true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RedPacketUIC", "onBackPressed: dialog already shown, execute default back");
        return super.onBackPressed();
    }
}
