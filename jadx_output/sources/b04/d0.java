package b04;

/* loaded from: classes3.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b04.j0 f16885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.code.CodeItemView f16886e;

    public d0(b04.j0 j0Var, com.tencent.mm.ui.widget.code.CodeItemView codeItemView) {
        this.f16885d = j0Var;
        this.f16886e = codeItemView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/qrcode/RedPacketUIC$createItemView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.RedPacketUIC", "moreBtnClickListener() called");
        com.tencent.mm.ui.widget.code.CodeItemView codeItemView = this.f16886e;
        al5.s0 s0Var = new al5.s0(codeItemView.getContext(), 1, false);
        b04.j0 j0Var = this.f16885d;
        j0Var.f16916e = s0Var;
        al5.s0 s0Var2 = j0Var.f16916e;
        if (s0Var2 != null) {
            s0Var2.f211872n = new b04.b0(j0Var);
        }
        if (s0Var2 != null) {
            s0Var2.f211881s = new b04.c0(j0Var, codeItemView);
        }
        com.tencent.mm.plugin.scanner.model.h2.m("view_clk", "face2face_get_red_packets_more_btn", j0Var.T6());
        al5.s0 s0Var3 = j0Var.f16916e;
        if (s0Var3 != null) {
            s0Var3.v();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/qrcode/RedPacketUIC$createItemView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
