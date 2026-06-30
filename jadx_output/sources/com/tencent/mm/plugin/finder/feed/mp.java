package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class mp extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f108522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f108523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f108524f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp(db5.g4 g4Var, com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.plugin.finder.feed.kr krVar) {
        super(1);
        this.f108522d = g4Var;
        this.f108523e = k0Var;
        this.f108524f = krVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.assist.i4 actionMenuInfo = (com.tencent.mm.plugin.finder.assist.i4) obj;
        kotlin.jvm.internal.o.g(actionMenuInfo, "actionMenuInfo");
        if (!actionMenuInfo.f102262l && this.f108522d.findItem(208) == null) {
            this.f108522d.j(208, actionMenuInfo.f102258h, com.tencent.mm.R.raw.bottomsheet_icon_wework, 0, actionMenuInfo.f102254d);
            hc2.f1.C(this.f108523e, this.f108524f.f107230d);
        }
        return jz5.f0.f302826a;
    }
}
