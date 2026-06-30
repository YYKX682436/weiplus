package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class t2 implements tt1.i {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s2 f176695a;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s2 s2Var) {
        this.f176695a = s2Var;
    }

    @Override // tt1.i
    /* renamed from: getItem */
    public tt1.j mo54455xfb80e389(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s2 s2Var = this.f176695a;
        if (s2Var != null) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) ((java.util.ArrayList) s2Var.f176688e).get(i17);
        }
        return null;
    }

    @Override // tt1.i
    /* renamed from: onCreate */
    public void mo54456x3e5a77bb() {
        this.f176695a.notifyDataSetChanged();
    }

    @Override // tt1.i
    /* renamed from: onDestroy */
    public void mo54457xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s2 s2Var = this.f176695a;
        if (s2Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.l4) s2Var.f176687d).mo54459x41012807();
            s2Var.f176687d = null;
            ((java.util.ArrayList) s2Var.f176688e).clear();
            this.f176695a = null;
        }
    }

    @Override // tt1.i
    /* renamed from: onNotify */
    public void mo54458x50fc6e08() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s2 s2Var = this.f176695a;
        if (s2Var != null) {
            s2Var.notifyDataSetChanged();
        }
    }
}
