package com.tencent.mm.plugin.choosemsgfile.logic.ui;

/* loaded from: classes12.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.logic.ui.p f95551d;

    public o(com.tencent.mm.plugin.choosemsgfile.logic.ui.p pVar) {
        this.f95551d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f95551d.f95552a.f95561d.notifyDataSetChanged();
    }
}
