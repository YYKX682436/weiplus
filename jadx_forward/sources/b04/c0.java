package b04;

/* loaded from: classes3.dex */
public final class c0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b04.j0 f98415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 f98416e;

    public c0(b04.j0 j0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185) {
        this.f98415d = j0Var;
        this.f98416e = c22675xc8629185;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        b04.j0 j0Var = this.f98415d;
        j0Var.getClass();
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedPacketUIC", "showHistory");
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.m("view_clk", "face2face_get_red_packet_records_sheet", j0Var.T6());
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(this.f98416e.getContext(), "com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI");
            android.content.Intent intent2 = j0Var.m158354x19263085().getIntent();
            intent.putExtra("key_username", intent2 != null ? intent2.getStringExtra("key_username") : null);
            intent.putExtra("key_type", 2);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = j0Var.m158354x19263085();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m158354x19263085, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/qrcode/RedPacketUIC$createItemView$1$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            m158354x19263085.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(m158354x19263085, "com/tencent/mm/plugin/scanner/ui/qrcode/RedPacketUIC$createItemView$1$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
