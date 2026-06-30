package com.tencent.maas.handlebox.model;

/* loaded from: classes5.dex */
public class MJHandleBoxTitle {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner f48047a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.TextOverlayDesc f48048b;

    public MJHandleBoxTitle(com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner mJRectCorner, com.tencent.maas.moviecomposing.TextOverlayDesc textOverlayDesc) {
        this.f48047a = mJRectCorner;
        this.f48048b = textOverlayDesc;
    }

    public com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner getCorner() {
        return this.f48047a;
    }

    public int getCornerValue() {
        return this.f48047a.getValue();
    }

    public com.tencent.maas.moviecomposing.TextOverlayDesc getOverlayDesc() {
        return this.f48048b;
    }
}
