package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f107058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f107059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.c0 f107060f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(db5.g4 g4Var, com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.plugin.finder.feed.c0 c0Var) {
        super(1);
        this.f107058d = g4Var;
        this.f107059e = k0Var;
        this.f107060f = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.assist.i4 actionMenuInfo = (com.tencent.mm.plugin.finder.assist.i4) obj;
        kotlin.jvm.internal.o.g(actionMenuInfo, "actionMenuInfo");
        if (!actionMenuInfo.f102262l && this.f107058d.findItem(208) == null) {
            this.f107058d.j(208, actionMenuInfo.f102258h, com.tencent.mm.R.raw.bottomsheet_icon_wework, 0, actionMenuInfo.f102254d);
            hc2.f1.C(this.f107059e, this.f107060f.f106421d);
        }
        return jz5.f0.f302826a;
    }
}
