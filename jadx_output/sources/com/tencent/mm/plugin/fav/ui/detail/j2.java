package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class j2 implements com.tencent.mm.ui.tools.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.k2 f100747a;

    public j2(com.tencent.mm.plugin.fav.ui.detail.k2 k2Var) {
        this.f100747a = k2Var;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
        com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = this.f100747a.f100751d.f100664o;
        if (favVideoView != null) {
            favVideoView.f();
        }
    }
}
