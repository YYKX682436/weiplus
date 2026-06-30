package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class wc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.id f110967d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc(com.tencent.mm.plugin.finder.feed.id idVar) {
        super(0);
        this.f110967d = idVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent;
        android.content.Context context = this.f110967d.f107001d;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        boolean z17 = false;
        if (activity != null && (intent = activity.getIntent()) != null) {
            z17 = intent.getBooleanExtra("key_show_first_like_tag", false);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
