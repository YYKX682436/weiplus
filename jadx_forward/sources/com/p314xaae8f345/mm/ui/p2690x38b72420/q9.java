package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes5.dex */
public class q9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 f288676e;

    public q9(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8, java.lang.String str) {
        this.f288676e = activityC22325x8baa24f8;
        this.f288675d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "return the result,and create new label");
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f288675d;
        intent.putExtra("Select_Contact", str);
        intent.putExtra("Select_Conv_User", str);
        intent.putExtra("Select_Contact", str);
        intent.putExtra("Select_Contacts_To_Create_New_Label", str);
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8 = this.f288676e;
        activityC22325x8baa24f8.setResult(-1, intent);
        activityC22325x8baa24f8.finish();
    }
}
