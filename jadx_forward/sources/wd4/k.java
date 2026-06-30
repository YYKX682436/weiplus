package wd4;

/* loaded from: classes4.dex */
public final class k implements zh1.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f526473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wd4.g f526474b;

    public k(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, wd4.g gVar) {
        this.f526473a = interfaceC29045xdcb5ca57;
        this.f526474b = gVar;
    }

    @Override // zh1.a1
    public final void a(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 collection) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onOpenMaterialsGot", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$doFetch$2$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collection, "collection");
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f526473a;
        if (z17) {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(collection));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOpenMaterialsGot", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$doFetch$2$1");
            return;
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.io.IOException("fetchOpenMaterials for " + this.f526474b.a() + " failure"))));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOpenMaterialsGot", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$doFetch$2$1");
    }
}
