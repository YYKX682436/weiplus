package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes5.dex */
public final class se extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f108984d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se(android.graphics.Bitmap bitmap) {
        super(0);
        this.f108984d = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f108984d.isRecycled() ? "bad" : "good";
    }
}
