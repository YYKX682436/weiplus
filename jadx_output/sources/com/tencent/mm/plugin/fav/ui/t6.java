package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public class t6 implements db5.t6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavTagEditUI f101449d;

    public t6(com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI) {
        this.f101449d = favTagEditUI;
    }

    @Override // db5.t6
    public void a(java.lang.String str) {
    }

    @Override // db5.t6
    public void c() {
    }

    @Override // db5.t6
    public void d(java.lang.String str) {
    }

    @Override // db5.t6
    public void f(java.lang.String str) {
        com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI = this.f101449d;
        favTagEditUI.f100417g.p(str);
        com.tencent.mm.plugin.fav.ui.adapter.f fVar = favTagEditUI.f100421n;
        ((java.util.HashSet) fVar.f100500g).remove(str);
        fVar.notifyDataSetChanged();
        favTagEditUI.T6();
    }

    @Override // db5.t6
    public void g(java.lang.String str) {
    }

    @Override // db5.t6
    public void h(java.lang.String str) {
        com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI = this.f101449d;
        favTagEditUI.f100417g.d(str, true);
        com.tencent.mm.plugin.fav.ui.adapter.f fVar = favTagEditUI.f100421n;
        ((java.util.HashSet) fVar.f100500g).add(str);
        fVar.notifyDataSetChanged();
        favTagEditUI.T6();
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
    }
}
