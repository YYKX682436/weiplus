package com.tencent.luggage.sdk.jsapi.component;

/* loaded from: classes7.dex */
public class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.b f47344a;

    public h(com.tencent.luggage.sdk.jsapi.component.b bVar) {
        this.f47344a = bVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.luggage.sdk.jsapi.component.b bVar = this.f47344a;
        android.view.View contentView = bVar.a2().getContentView();
        if (contentView == null) {
            return null;
        }
        int width = bVar.a2().getWidth();
        int height = bVar.a2().getHeight();
        int webScrollX = bVar.a2().getWebScrollX();
        int webScrollY = bVar.a2().getWebScrollY();
        if (width == 0 || height == 0) {
            return null;
        }
        contentView.scrollTo(0, 0);
        bVar.a2().e0(new com.tencent.luggage.sdk.jsapi.component.g(this, width, height, km5.u.c(), contentView, webScrollX, webScrollY));
        return null;
    }
}
