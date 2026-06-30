package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f234179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f234180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f234181f;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38, java.lang.Integer num, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        this.f234179d = num;
        this.f234180e = imageView;
        this.f234181f = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        int intValue = this.f234179d.intValue();
        android.widget.ImageView imageView = this.f234180e;
        if (imageView instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) imageView).m82037xa10c26f6(false);
        }
        imageView.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(this.f234181f, intValue, intValue, true, false));
    }
}
