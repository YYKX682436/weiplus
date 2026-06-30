package uf5;

/* loaded from: classes4.dex */
public class j0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d f508784d;

    public j0(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d abstractActivityC22347xd7e8b37d) {
        this.f508784d = abstractActivityC22347xd7e8b37d;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d abstractActivityC22347xd7e8b37d = this.f508784d;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMgrUIBase", "setOnMenuSelectedListener , MENU_ID_LABEL.");
            android.content.Intent intent = new android.content.Intent(abstractActivityC22347xd7e8b37d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d.class);
            intent.putExtra("select_label", true);
            intent.putExtra("intent_status_from_privacy_setting", true);
            intent.putExtra("privacy_source_type", abstractActivityC22347xd7e8b37d.f288636g.v());
            intent.putExtra("group_multi_select", true);
            abstractActivityC22347xd7e8b37d.startActivityForResult(intent, 4);
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                abstractActivityC22347xd7e8b37d.V6();
                return;
            } else {
                abstractActivityC22347xd7e8b37d.V6();
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMgrUIBase", "setOnMenuSelectedListener , MENU_ID_CHATROOM.");
        android.content.Intent intent2 = new android.content.Intent(abstractActivityC22347xd7e8b37d, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22345x3d5f486e.class);
        intent2.putExtra("group_multi_select", true);
        intent2.putExtra("group_select_need_result", true);
        intent2.putExtra("group_multi_select", true);
        intent2.putExtra("privacy_source_type", abstractActivityC22347xd7e8b37d.f288636g.v());
        intent2.putExtra("max_limit_num", abstractActivityC22347xd7e8b37d.getIntent().getIntExtra("max_limit_num", 50));
        abstractActivityC22347xd7e8b37d.startActivityForResult(intent2, 3);
    }
}
