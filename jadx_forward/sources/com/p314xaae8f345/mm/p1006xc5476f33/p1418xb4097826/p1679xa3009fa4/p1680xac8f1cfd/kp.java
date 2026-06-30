package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class kp extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f216510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f216511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f216512f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp(android.widget.ProgressBar progressBar, android.graphics.Bitmap bitmap, java.lang.String str) {
        super(0);
        this.f216510d = progressBar;
        this.f216511e = bitmap;
        this.f216512f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ProgressBar progressBar = this.f216510d;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (this.f216511e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderMultiImageDescCommentUIC", "load image failed, bitmap is null, url=" + this.f216512f);
        }
        return jz5.f0.f384359a;
    }
}
