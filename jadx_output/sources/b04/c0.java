package b04;

/* loaded from: classes3.dex */
public final class c0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b04.j0 f16882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.code.CodeItemView f16883e;

    public c0(b04.j0 j0Var, com.tencent.mm.ui.widget.code.CodeItemView codeItemView) {
        this.f16882d = j0Var;
        this.f16883e = codeItemView;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        b04.j0 j0Var = this.f16882d;
        j0Var.getClass();
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RedPacketUIC", "showHistory");
            com.tencent.mm.plugin.scanner.model.h2.m("view_clk", "face2face_get_red_packet_records_sheet", j0Var.T6());
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(this.f16883e.getContext(), "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI");
            android.content.Intent intent2 = j0Var.getActivity().getIntent();
            intent.putExtra("key_username", intent2 != null ? intent2.getStringExtra("key_username") : null);
            intent.putExtra("key_type", 2);
            androidx.appcompat.app.AppCompatActivity activity = j0Var.getActivity();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/qrcode/RedPacketUIC$createItemView$1$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/scanner/ui/qrcode/RedPacketUIC$createItemView$1$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
