package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class uo extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az2.f f110627f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34 f110628g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo(java.lang.String str, java.lang.String str2, az2.f fVar, com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34 occupyFinderUI34) {
        super(1);
        this.f110625d = str;
        this.f110626e = str2;
        this.f110627f = fVar;
        this.f110628g = occupyFinderUI34;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.g41 it = (r45.g41) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("FinderGameBind", "appid: " + this.f110625d + ", openId: " + this.f110626e);
        this.f110627f.b();
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34 occupyFinderUI34 = this.f110628g;
        occupyFinderUI34.finish();
        occupyFinderUI34.c7(0, null);
        return jz5.f0.f302826a;
    }
}
