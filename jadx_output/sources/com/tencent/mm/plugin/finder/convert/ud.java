package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ud extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f104700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f104701e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.widget.LinearLayout linearLayout) {
        super(1);
        this.f104700d = baseFinderFeed;
        this.f104701e = linearLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            this.f104700d.B1(false);
            android.widget.LinearLayout linearLayout = this.f104701e;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
