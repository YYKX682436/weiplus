package f93;

/* loaded from: classes11.dex */
public class r1 implements k93.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d f341981a;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d) {
        this.f341981a = viewOnCreateContextMenuListenerC16169x37a19e8d;
    }

    @Override // k93.x
    public void T(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d = this.f341981a;
        if (viewOnCreateContextMenuListenerC16169x37a19e8d.f224790x || viewOnCreateContextMenuListenerC16169x37a19e8d.f224788v) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.d4 z17 = viewOnCreateContextMenuListenerC16169x37a19e8d.A.z(i17);
        if (z17 == null || !z17.f66584x284d1882 || z17.f66585x70ce48ca != -1000000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d2 = this.f341981a;
            viewOnCreateContextMenuListenerC16169x37a19e8d2.f224773J.g(view, i17, -1L, viewOnCreateContextMenuListenerC16169x37a19e8d2, viewOnCreateContextMenuListenerC16169x37a19e8d2, viewOnCreateContextMenuListenerC16169x37a19e8d2.L, viewOnCreateContextMenuListenerC16169x37a19e8d2.M);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerUI", "onItemLongClick, is no lebal title item, position = " + i17);
        }
    }

    @Override // k93.x
    public void U(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d = this.f341981a;
        viewOnCreateContextMenuListenerC16169x37a19e8d.N = false;
        viewOnCreateContextMenuListenerC16169x37a19e8d.startActivityForResult(intent, com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14514x4fe44208);
    }

    @Override // k93.x
    public void V(f93.d5 d5Var, int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.d4 z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d = this.f341981a;
        if (viewOnCreateContextMenuListenerC16169x37a19e8d.A.mo863xcdaf1228(i17) == 2) {
            viewOnCreateContextMenuListenerC16169x37a19e8d.getClass();
            gm0.j1.e().j(new f93.w1(viewOnCreateContextMenuListenerC16169x37a19e8d));
            return;
        }
        k93.j jVar = viewOnCreateContextMenuListenerC16169x37a19e8d.A;
        if (jVar == null || i17 < 0 || (z17 = jVar.z(i17)) == null) {
            return;
        }
        if (viewOnCreateContextMenuListenerC16169x37a19e8d.f224788v) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d.V6(viewOnCreateContextMenuListenerC16169x37a19e8d, d5Var.f341848f, z17);
            return;
        }
        if (viewOnCreateContextMenuListenerC16169x37a19e8d.f224790x) {
            if (viewOnCreateContextMenuListenerC16169x37a19e8d.f224792z) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d.V6(viewOnCreateContextMenuListenerC16169x37a19e8d, d5Var.f341848f, z17);
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("label_id", z17.f66585x70ce48ca);
            viewOnCreateContextMenuListenerC16169x37a19e8d.setResult(-1, intent);
            viewOnCreateContextMenuListenerC16169x37a19e8d.finish();
            return;
        }
        java.lang.String str = z17.f66585x70ce48ca + "";
        java.lang.String str2 = z17.f66586x7661fe9a;
        viewOnCreateContextMenuListenerC16169x37a19e8d.getClass();
        f93.q5 q5Var = f93.q5.f341974a;
        if (q5Var.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerUI", "startLabelEditUIV2() called with: labelID = [" + str + "], mLabelName = [" + str2 + "]");
            q5Var.d(viewOnCreateContextMenuListenerC16169x37a19e8d, str, str2);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("label_id", str);
        intent2.putExtra("label_name", str2);
        intent2.putExtra("label_source", "label_source_Address");
        intent2.putExtra("last_page_source_type", 1);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_new_contact_label_ui, 1) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerUI", "startActivity ContactEditLabel ");
            intent2.setClass(viewOnCreateContextMenuListenerC16169x37a19e8d, com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea.class);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerUI", "startActivity ContactLabelEditUI ");
            intent2.setClass(viewOnCreateContextMenuListenerC16169x37a19e8d, com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12.class);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(viewOnCreateContextMenuListenerC16169x37a19e8d, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "startLabelEditUI", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        viewOnCreateContextMenuListenerC16169x37a19e8d.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(viewOnCreateContextMenuListenerC16169x37a19e8d, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "startLabelEditUI", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        b93.n.a(viewOnCreateContextMenuListenerC16169x37a19e8d.getIntent().getIntExtra("key_label_click_source", 0), 2L, 0L, 0L, 0L);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.util.ArrayList arrayList2 = viewOnCreateContextMenuListenerC16169x37a19e8d.B;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11347, 1, 0);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11347, 1, 1);
            }
        }
    }
}
