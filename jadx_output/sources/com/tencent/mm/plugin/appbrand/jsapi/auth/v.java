package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f79754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79755f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f79756g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ui1.z f79757h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, android.content.Context context, java.lang.String str2, android.graphics.Bitmap bitmap, ui1.z zVar) {
        super(0);
        this.f79753d = str;
        this.f79754e = context;
        this.f79755f = str2;
        this.f79756g = bitmap;
        this.f79757h = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new fl1.h1(0, this.f79753d, this.f79754e.getResources().getString(com.tencent.mm.R.string.a07), this.f79755f, this.f79756g, false, "", 0));
        this.f79757h.setSelectListItem(arrayList);
        return jz5.f0.f302826a;
    }
}
