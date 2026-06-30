package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class l8 extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.y8 f101248c;

    public l8(com.tencent.mm.plugin.fav.ui.y8 y8Var) {
        this.f101248c = y8Var;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        int itemViewType = this.f101248c.getItemViewType(i17);
        return (itemViewType == 18 || itemViewType == 19) ? 3 : 1;
    }
}
