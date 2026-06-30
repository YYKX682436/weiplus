package com.tencent.mm.matrix;

/* loaded from: classes12.dex */
public class x implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.y f68850d;

    public x(com.tencent.mm.matrix.y yVar) {
        this.f68850d = yVar;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mm.matrix.o oVar = this.f68850d.f68854g;
        oVar.f68838m.postDelayed(oVar.f68837i, 3600000L);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mm.matrix.o oVar = this.f68850d.f68854g;
        oVar.f68838m.removeCallbacks(oVar.f68837i);
    }
}
