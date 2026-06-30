package com.tencent.mm.plugin.choosemsgfile.logic.ui;

/* loaded from: classes12.dex */
public class l extends com.tencent.mm.plugin.choosemsgfile.logic.ui.b {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.choosemsgfile.logic.ui.d f95544d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f95545e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f95546f;

    public l(com.tencent.mm.plugin.choosemsgfile.ui.f0 f0Var) {
        super(f0Var);
        this.f95545e = new java.util.ArrayList();
    }

    public static xv1.b a(com.tencent.mm.plugin.choosemsgfile.logic.ui.l lVar) {
        return lVar.f95528b.f6();
    }

    public void b(boolean z17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileListUIController", "[loadData] isFirst:%s", java.lang.Boolean.valueOf(z17));
        this.f95528b.P(z17);
        if (z17) {
            ((java.util.ArrayList) this.f95545e).clear();
        }
        gm0.j1.i();
        gm0.j1.e().j(new com.tencent.mm.plugin.choosemsgfile.logic.ui.j(this, str2, z17));
    }
}
