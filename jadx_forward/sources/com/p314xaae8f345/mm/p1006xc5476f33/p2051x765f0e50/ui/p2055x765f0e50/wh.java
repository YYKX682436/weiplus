package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class wh implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17440xc8d425e4 f243240d;

    public wh(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17440xc8d425e4 activityC17440xc8d425e4) {
        this.f243240d = activityC17440xc8d425e4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17440xc8d425e4 activityC17440xc8d425e4 = this.f243240d;
        android.content.Intent intent = new android.content.Intent(activityC17440xc8d425e4, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11463xc681e6dc.class);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
        if (yp5.a.f545942a.a()) {
            intent.putExtra("kintent_hint", activityC17440xc8d425e4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0c));
        } else {
            intent.putExtra("kintent_hint", activityC17440xc8d425e4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0d));
        }
        intent.putExtra("from_unbind", true);
        activityC17440xc8d425e4.startActivityForResult(intent, 1);
    }
}
