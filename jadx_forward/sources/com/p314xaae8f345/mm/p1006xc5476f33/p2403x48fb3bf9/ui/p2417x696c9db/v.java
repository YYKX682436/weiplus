package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f268485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f268486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9 f268487g;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9 activityC19314x5b64dca9, java.lang.String str, android.content.Intent intent, int i17) {
        this.f268487g = activityC19314x5b64dca9;
        this.f268484d = str;
        this.f268485e = intent;
        this.f268486f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = this.f268484d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.d(str);
        d17.f264281t = true;
        d17.f264275n = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(d17);
        arrayList.add(d17.f264269e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "filepath is : %s, local id is : %s", str, d17.f264269e);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9 activityC19314x5b64dca9 = this.f268487g;
        java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(activityC19314x5b64dca9.f265166p, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3.f34476x24728b) ? com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.g(arrayList) : com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.h(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", g17);
        android.content.Intent intent = this.f268485e;
        intent.putExtra("key_pick_local_media_local_ids", g17);
        intent.putExtra("key_pick_local_media_callback_type", 2);
        intent.putExtra("key_pick_local_media_show_memory_warning", activityC19314x5b64dca9.f265169s);
        intent.putExtra("key_pick_local_pic_source_type", activityC19314x5b64dca9.f265167q ? "camera" : com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37635xb5a3973f);
        activityC19314x5b64dca9.setResult(this.f268486f, intent);
        activityC19314x5b64dca9.finish();
    }
}
