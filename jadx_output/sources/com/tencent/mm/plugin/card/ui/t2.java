package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class t2 implements tt1.i {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.card.ui.s2 f95162a;

    public t2(com.tencent.mm.plugin.card.ui.s2 s2Var) {
        this.f95162a = s2Var;
    }

    @Override // tt1.i
    public tt1.j getItem(int i17) {
        com.tencent.mm.plugin.card.ui.s2 s2Var = this.f95162a;
        if (s2Var != null) {
            return (com.tencent.mm.plugin.card.model.CardInfo) ((java.util.ArrayList) s2Var.f95155e).get(i17);
        }
        return null;
    }

    @Override // tt1.i
    public void onCreate() {
        this.f95162a.notifyDataSetChanged();
    }

    @Override // tt1.i
    public void onDestroy() {
        com.tencent.mm.plugin.card.ui.s2 s2Var = this.f95162a;
        if (s2Var != null) {
            ((com.tencent.mm.plugin.card.ui.l4) s2Var.f95154d).release();
            s2Var.f95154d = null;
            ((java.util.ArrayList) s2Var.f95155e).clear();
            this.f95162a = null;
        }
    }

    @Override // tt1.i
    public void onNotify() {
        com.tencent.mm.plugin.card.ui.s2 s2Var = this.f95162a;
        if (s2Var != null) {
            s2Var.notifyDataSetChanged();
        }
    }
}
