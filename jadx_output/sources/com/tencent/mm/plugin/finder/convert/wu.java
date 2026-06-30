package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class wu implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.yu f104906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f104907e;

    public wu(com.tencent.mm.plugin.finder.convert.yu yuVar, android.widget.ImageView imageView) {
        this.f104906d = yuVar;
        this.f104907e = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f104906d.f105058v;
        if (textView != null) {
            android.widget.ImageView imageView = this.f104907e;
            if (imageView.getRight() > textView.getLeft()) {
                imageView.setVisibility(8);
            }
        }
    }
}
