package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f268253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f268254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9 f268255f;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9 activityC19314x5b64dca9, android.content.Intent intent, int i17) {
        this.f268255f = activityC19314x5b64dca9;
        this.f268253d = intent;
        this.f268254e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = this.f268253d;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
        boolean booleanExtra = intent.getBooleanExtra("isTakePhoto", false);
        boolean booleanExtra2 = intent.getBooleanExtra("CropImage_Compress_Img", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : stringArrayListExtra) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.d(str);
            java.lang.String str2 = d17.f264269e;
            d17.f264281t = booleanExtra2;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(d17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "now filepath is : %s, local id is : %s", str, str2);
            arrayList.add(str2);
        }
        java.lang.String g17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.g(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", g17);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_pick_local_pic_callback_local_ids", g17);
        intent2.putExtra("key_pick_local_pic_source_type", booleanExtra ? "camera" : com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37635xb5a3973f);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9 activityC19314x5b64dca9 = this.f268255f;
        intent2.putExtra("key_pick_local_media_show_memory_warning", activityC19314x5b64dca9.f265169s);
        activityC19314x5b64dca9.setResult(this.f268254e, intent2);
        activityC19314x5b64dca9.finish();
    }
}
