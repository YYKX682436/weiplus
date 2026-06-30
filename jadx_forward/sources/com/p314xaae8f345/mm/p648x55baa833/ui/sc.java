package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class sc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.uc f146047d;

    public sc(com.p314xaae8f345.mm.p648x55baa833.ui.uc ucVar) {
        this.f146047d = ucVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p648x55baa833.ui.uc ucVar = this.f146047d;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10370x551acb57 activityC10370x551acb57 = ucVar.f146116d;
        int i18 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10370x551acb57.f145501x;
        activityC10370x551acb57.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(activityC10370x551acb57.f145514q);
        intent.putExtra("Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ","));
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10370x551acb57 activityC10370x551acb572 = ucVar.f146116d;
        activityC10370x551acb572.setResult(-1, intent);
        activityC10370x551acb572.finish();
    }
}
