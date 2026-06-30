package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class h implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.i f46161d;

    public h(com.tencent.liteapp.ui.i iVar) {
        this.f46161d = iVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.liteapp.ui.i iVar = this.f46161d;
        if (iVar.f46170c != null) {
            int i17 = iVar.f46172e.bottom;
            iVar.f46173f.getWindowVisibleDisplayFrame(this.f46161d.f46172e);
            if (this.f46161d.f46172e.bottom != i17) {
                kd.c.c("LiteApp.KeyboardHeightProvider", "onGlobalLayout: %s, %s", java.lang.Integer.valueOf(i17), this.f46161d.f46172e.toShortString());
                com.tencent.liteapp.ui.i.b(this.f46161d);
            }
        }
    }
}
