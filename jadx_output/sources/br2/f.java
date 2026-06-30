package br2;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.ui.special.factory.ThemeSmallLivingItemConvertFactory f23654d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.nearby.ui.special.factory.ThemeSmallLivingItemConvertFactory themeSmallLivingItemConvertFactory) {
        super(2);
        this.f23654d = themeSmallLivingItemConvertFactory;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) obj;
        java.lang.String username = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        kotlin.jvm.internal.o.g(username, "username");
        cq2.s sVar = cq2.s.f221445a;
        com.tencent.mm.plugin.finder.nearby.ui.special.factory.ThemeSmallLivingItemConvertFactory themeSmallLivingItemConvertFactory = this.f23654d;
        sVar.a(themeSmallLivingItemConvertFactory.getContext(), finderItem, username, themeSmallLivingItemConvertFactory.getCommentScene());
        return jz5.f0.f302826a;
    }
}
