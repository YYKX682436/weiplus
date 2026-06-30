package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui;

/* loaded from: classes12.dex */
public class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.d f177077d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f177078e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f177079f;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f0 f0Var) {
        super(f0Var);
        this.f177078e = new java.util.ArrayList();
    }

    public static xv1.b a(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.l lVar) {
        return lVar.f177061b.f6();
    }

    public void b(boolean z17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileListUIController", "[loadData] isFirst:%s", java.lang.Boolean.valueOf(z17));
        this.f177061b.P(z17);
        if (z17) {
            ((java.util.ArrayList) this.f177078e).clear();
        }
        gm0.j1.i();
        gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.j(this, str2, z17));
    }
}
