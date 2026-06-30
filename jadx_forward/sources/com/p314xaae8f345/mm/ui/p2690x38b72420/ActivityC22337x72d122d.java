package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* renamed from: com.tencent.mm.ui.contact.SnsSelectFromConvBoxUI */
/* loaded from: classes11.dex */
public class ActivityC22337x72d122d extends com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22335xd5b6c7eb {
    public android.content.Intent P;
    public java.util.List Q = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22335xd5b6c7eb, com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.fc(this, null, true, true, false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22335xd5b6c7eb, com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22335xd5b6c7eb, com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        return getString(com.p314xaae8f345.mm.R.C30867xcad56011.jhi);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22335xd5b6c7eb, com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = b7().getItem(i17 - this.f287979d.getHeaderViewsCount());
        if (item == null || (str = item.f288383s) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSelectFromConvBoxUI", "ClickUser=%s", str);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22334x657dae5.class);
        intent.putExtra("no_result_tip", mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jhp));
        intent.putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.Q, ","));
        intent.putExtra("select_chatroom_name", str);
        startActivityForResult(intent, 6);
        A7(this.Q);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22335xd5b6c7eb, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        this.P = intent;
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                this.Q.clear();
                this.Q.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(",")));
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22335xd5b6c7eb, com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("Select_Conv_User");
        java.util.List linkedList = android.text.TextUtils.isEmpty(stringExtra) ? new java.util.LinkedList() : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","));
        this.Q = linkedList;
        if (linkedList == null) {
            this.Q = new java.util.ArrayList();
        }
        super.onCreate(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22335xd5b6c7eb, com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void p7() {
        setResult(-1, this.P);
        super.p7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void r7(android.widget.ListView listView, int i17) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22335xd5b6c7eb
    public void w7() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22335xd5b6c7eb
    public void z7() {
    }
}
