package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f109856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f109857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f109858f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.view.View view, android.view.View view2, float f17) {
        super(0);
        this.f109856d = view;
        this.f109857e = view2;
        this.f109858f = f17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f109856d.setTranslationY(0.0f);
        this.f109857e.setTranslationY(-this.f109858f);
        return jz5.f0.f302826a;
    }
}
