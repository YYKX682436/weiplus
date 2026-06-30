package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes14.dex */
public class h implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.i f127694d;

    public h(com.p314xaae8f345.p362xadfe2b3.ui.i iVar) {
        this.f127694d = iVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.p362xadfe2b3.ui.i iVar = this.f127694d;
        if (iVar.f127703c != null) {
            int i17 = iVar.f127705e.bottom;
            iVar.f127706f.getWindowVisibleDisplayFrame(this.f127694d.f127705e);
            if (this.f127694d.f127705e.bottom != i17) {
                kd.c.c("LiteApp.KeyboardHeightProvider", "onGlobalLayout: %s, %s", java.lang.Integer.valueOf(i17), this.f127694d.f127705e.toShortString());
                com.p314xaae8f345.p362xadfe2b3.ui.i.b(this.f127694d);
            }
        }
    }
}
