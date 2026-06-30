package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes15.dex */
public class t3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 f224545d;

    public t3(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 activityC16143x7673980) {
        this.f224545d = activityC16143x7673980;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 activityC16143x7673980 = this.f224545d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.y3 y3Var = activityC16143x7673980.f224197t;
        if (y3Var != null) {
            y3Var.f224616d = null;
            y3Var.notifyDataSetChanged();
        }
        android.widget.ListView listView = activityC16143x7673980.f224196s;
        if (listView != null) {
            listView.setVisibility(4);
        }
        android.app.ProgressDialog progressDialog = activityC16143x7673980.f224199v;
        if (progressDialog != null) {
            progressDialog.show();
        }
        activityC16143x7673980.T6("");
    }
}
