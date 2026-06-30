package com.p314xaae8f345.mm.ui;

/* loaded from: classes10.dex */
public class ud implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21406xeafe92f0 f292619d;

    public ud(com.p314xaae8f345.mm.ui.ActivityC21406xeafe92f0 activityC21406xeafe92f0) {
        this.f292619d = activityC21406xeafe92f0;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNewPhotoEditUI", "connected!!!");
        int i17 = com.p314xaae8f345.mm.ui.ActivityC21406xeafe92f0.f278432t;
        com.p314xaae8f345.mm.ui.ActivityC21406xeafe92f0 activityC21406xeafe92f0 = this.f292619d;
        android.content.Intent intent = activityC21406xeafe92f0.getIntent();
        activityC21406xeafe92f0.f278434e = intent.getStringExtra("raw_photo_path");
        activityC21406xeafe92f0.f278435f = intent.getLongExtra("raw_photo_img_id", -1L);
        activityC21406xeafe92f0.f278436g = intent.getStringExtra("after_photo_edit");
        activityC21406xeafe92f0.f278439m = intent.getIntExtra("from_scene", 0);
        activityC21406xeafe92f0.f278440n = intent.getBooleanExtra("from_scene_small_preview", false);
        activityC21406xeafe92f0.f278438i = activityC21406xeafe92f0.f278442p.m78803x26784b16();
        activityC21406xeafe92f0.mo43517x10010bd5();
    }
}
