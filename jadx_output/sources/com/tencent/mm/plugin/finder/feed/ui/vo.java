package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class vo extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az2.f f110676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34 f110677g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(java.lang.String str, java.lang.String str2, az2.f fVar, com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34 occupyFinderUI34) {
        super(1);
        this.f110674d = str;
        this.f110675e = str2;
        this.f110676f = fVar;
        this.f110677g = occupyFinderUI34;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appid: ");
        sb6.append(this.f110674d);
        sb6.append(", openId: ");
        sb6.append(this.f110675e);
        sb6.append(", errType: ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
        sb6.append(", errCode: ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
        sb6.append(", errMsg: ");
        sb6.append(fVar != null ? fVar.f70617c : null);
        com.tencent.mars.xlog.Log.i("FinderGameBind", sb6.toString());
        this.f110676f.b();
        java.lang.String str = fVar != null ? fVar.f70617c : null;
        boolean z17 = str == null || str.length() == 0;
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34 occupyFinderUI34 = this.f110677g;
        if (!z17) {
            db5.t7.m(occupyFinderUI34.getContext(), str);
        }
        occupyFinderUI34.finish();
        occupyFinderUI34.c7(-1, fVar != null ? fVar.f70617c : null);
        return jz5.f0.f302826a;
    }
}
