package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ex extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f106672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f106673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106674f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(db5.g4 g4Var, com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(1);
        this.f106672d = g4Var;
        this.f106673e = k0Var;
        this.f106674f = pzVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.assist.i4 actionMenuInfo = (com.tencent.mm.plugin.finder.assist.i4) obj;
        kotlin.jvm.internal.o.g(actionMenuInfo, "actionMenuInfo");
        if (!actionMenuInfo.f102262l && this.f106672d.findItem(208) == null) {
            this.f106672d.j(208, actionMenuInfo.f102258h, com.tencent.mm.R.raw.bottomsheet_icon_wework, 0, actionMenuInfo.f102254d);
            hc2.f1.C(this.f106673e, this.f106674f.f108755g);
        }
        return jz5.f0.f302826a;
    }
}
