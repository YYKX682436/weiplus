package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class pc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.rc f145964d;

    public pc(com.p314xaae8f345.mm.p648x55baa833.ui.rc rcVar) {
        this.f145964d = rcVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p648x55baa833.ui.rc rcVar = this.f145964d;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10369x3b98011d activityC10369x3b98011d = rcVar.f146019d;
        int i18 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10369x3b98011d.f145500v;
        activityC10369x3b98011d.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(activityC10369x3b98011d.f145514q);
        intent.putExtra("Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ","));
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10369x3b98011d activityC10369x3b98011d2 = rcVar.f146019d;
        activityC10369x3b98011d2.setResult(-1, intent);
        activityC10369x3b98011d2.finish();
    }
}
