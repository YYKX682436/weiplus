package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class h8 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f102231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f102232b;

    public h8(yz5.l lVar, yz5.l lVar2) {
        this.f102231a = lVar;
        this.f102232b = lVar2;
    }

    @Override // zy2.i5
    public final void a(java.lang.Object obj) {
        if (obj instanceof r45.nw6) {
            this.f102231a.invoke(obj);
        } else {
            this.f102232b.invoke(java.lang.Integer.valueOf(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMNOTFOUND));
        }
    }
}
