package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class oh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.uh f108660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh(com.tencent.mm.plugin.finder.feed.uh uhVar) {
        super(0);
        this.f108660d = uhVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.li liVar;
        com.tencent.mm.ui.MMActivity mMActivity;
        java.lang.String e17;
        com.tencent.mm.plugin.finder.feed.uh uhVar = this.f108660d;
        return (uhVar.f109182d != 1 || (liVar = uhVar.f109188m) == null || (mMActivity = liVar.f107297g) == null || (e17 = xy2.c.e(mMActivity)) == null) ? "" : e17;
    }
}
