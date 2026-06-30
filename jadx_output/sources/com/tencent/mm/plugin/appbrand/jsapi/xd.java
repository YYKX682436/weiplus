package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class xd implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.md f83921d;

    public xd(com.tencent.mm.plugin.appbrand.jsapi.md mdVar) {
        this.f83921d = mdVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mm.plugin.appbrand.jsapi.md mdVar = this.f83921d;
        kd0.p2 p2Var = mdVar.f81610g;
        if (p2Var != null) {
            ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var).n();
            ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) mdVar.f81610g).f158647d = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        mdVar.f81610g = null;
    }
}
