package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class g implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.i f46156d;

    public g(com.tencent.liteapp.ui.i iVar) {
        this.f46156d = iVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.liteapp.ui.i iVar = this.f46156d;
        if (iVar.f46170c != null) {
            com.tencent.liteapp.ui.i.b(iVar);
        }
    }
}
