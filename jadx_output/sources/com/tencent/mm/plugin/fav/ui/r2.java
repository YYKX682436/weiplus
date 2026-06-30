package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class r2 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavFilterUI f101366a;

    public r2(com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI) {
        this.f101366a = favFilterUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        this.f101366a.f100335o.notifyDataSetChanged();
    }
}
