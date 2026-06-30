package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class td extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f104606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f104607e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.widget.LinearLayout linearLayout) {
        super(1);
        this.f104606d = baseFinderFeed;
        this.f104607e = linearLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.LinearLayout linearLayout;
        int intValue = ((java.lang.Number) obj).intValue();
        if ((this.f104606d.getNeedShowAnchorTips() || intValue != 0) && (linearLayout = this.f104607e) != null) {
            linearLayout.setVisibility(intValue);
        }
        return jz5.f0.f302826a;
    }
}
