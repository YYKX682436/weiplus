package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class a0 implements android.view.PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f288960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f288961b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 f288962c;

    public a0(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8, android.widget.ImageView imageView, android.view.ViewGroup viewGroup) {
        this.f288962c = activityC22359x66709fa8;
        this.f288960a = imageView;
        this.f288961b = viewGroup;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public void onPixelCopyFinished(int i17) {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8 = this.f288962c;
        bitmap = activityC22359x66709fa8.f39552x857fd1a9;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.m80463xbf186a64(activityC22359x66709fa8, bitmap, this.f288960a, this.f288961b);
    }
}
