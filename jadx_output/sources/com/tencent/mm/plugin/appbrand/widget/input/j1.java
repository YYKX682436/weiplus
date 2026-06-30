package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.h1 f91503d;

    public j1(com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var) {
        this.f91503d = h1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var = this.f91503d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIdRootFrameLayout", "callOnPanelChanged, size %d", java.lang.Integer.valueOf(((java.util.HashSet) h1Var.f91476t).size()));
        if (((java.util.HashSet) h1Var.f91476t).size() <= 0) {
            return;
        }
        int size = ((java.util.HashSet) h1Var.f91476t).size();
        com.tencent.mm.plugin.appbrand.widget.input.l1[] l1VarArr = new com.tencent.mm.plugin.appbrand.widget.input.l1[size];
        ((java.util.HashSet) h1Var.f91476t).toArray(l1VarArr);
        if (size <= 0) {
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.l1 l1Var = l1VarArr[0];
        throw null;
    }
}
