package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.f0 f265622f;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.f0 f0Var, java.lang.String str, java.lang.String str2) {
        this.f265622f = f0Var;
        this.f265620d = str;
        this.f265621e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_pick_local_media_callback_type", 1);
        intent.putExtra("key_pick_local_media_local_id", this.f265620d);
        java.lang.String str = this.f265621e;
        intent.putExtra("key_pick_local_media_thumb_local_id", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.f0 f0Var = this.f265622f;
        intent.putExtra("sourceType", f0Var.f265698e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "thumbLocalId:%s", str);
        f0Var.f265699f.setResult(-1, intent);
        f0Var.f265699f.finish();
    }
}
