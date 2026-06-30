package c04;

/* loaded from: classes13.dex */
public final class v implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView f37694a;

    public v(com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView) {
        this.f37694a = scanGoodsMaskView;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        nm5.b bVar = (nm5.b) obj;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = bVar != null ? (java.lang.Boolean) bVar.a(0) : null;
        objArr[1] = bVar != null ? (java.lang.String) bVar.a(1) : null;
        com.tencent.mars.xlog.Log.e("MicroMsg.ScanGoodsMaskView", "showCustomView onInterrupt result: %s, %s", objArr);
        if (bVar != null ? kotlin.jvm.internal.o.b(bVar.a(0), java.lang.Boolean.FALSE) : false) {
            int i17 = com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView.A1;
            this.f37694a.w();
        }
    }
}
