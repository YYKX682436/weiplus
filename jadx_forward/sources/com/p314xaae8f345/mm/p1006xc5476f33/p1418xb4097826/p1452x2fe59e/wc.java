package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class wc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id f192500d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id idVar) {
        super(0);
        this.f192500d = idVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent;
        android.content.Context context = this.f192500d.f188534d;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        boolean z17 = false;
        if (activity != null && (intent = activity.getIntent()) != null) {
            z17 = intent.getBooleanExtra("key_show_first_like_tag", false);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
