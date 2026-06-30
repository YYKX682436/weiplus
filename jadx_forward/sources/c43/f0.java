package c43;

/* loaded from: classes15.dex */
public class f0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c43.x f119957d;

    public f0(c43.x xVar) {
        this.f119957d = xVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15724x3096736f c15724x3096736f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd c15792xf92d0ffd;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8 c15835xa11d0ad8;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
        c43.x xVar = this.f119957d;
        switch (itemId) {
            case 9527:
                if (xVar.f120028m == null || xVar.M == null) {
                    return;
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5237xbeff673c c5237xbeff673c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5237xbeff673c();
                java.lang.String str = xVar.f120028m.f36570xfd4da1cb;
                am.b2 b2Var = c5237xbeff673c.f135570g;
                b2Var.f87741a = str;
                b2Var.f87742b = ((y33.e) xVar.M).f66960x21eb2633;
                c5237xbeff673c.e();
                long j17 = xVar.f120027i;
                long j18 = xVar.f120026h;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = xVar.f120028m;
                fVar.g(5L, 2L, j17, j18, c15731x94356d67.seq, c15731x94356d67.f36570xfd4da1cb, 0L, xVar.X);
                return;
            case 9528:
                if (xVar.f120028m != null) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", xVar.f120028m.f36572xbfcc3e0.f36777x3617a3db);
                    j45.l.j(xVar.f120025g, "webview", ".ui.tools.WebViewUI", intent, null);
                    return;
                }
                return;
            case 9529:
                if (xVar.M == null || xVar.N == null || (c15724x3096736f = xVar.Q) == null || (c15780xf49d6a1c = c15724x3096736f.f36514x2af773c5) == null) {
                    return;
                }
                java.lang.String str2 = c15780xf49d6a1c.f36743xf0cd21de;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    return;
                }
                java.lang.String b17 = s33.y.b(str2, "username=" + ((y33.e) xVar.M).f66967xdde069b);
                if (((y33.e) xVar.N).f66968xde00c86 != null) {
                    b17 = s33.y.b(b17, "from_role=" + ((y33.e) xVar.N).f66968xde00c86.f36904x358076);
                }
                if (((y33.e) xVar.M).f66968xde00c86 != null) {
                    b17 = s33.y.b(b17, "to_role=" + ((y33.e) xVar.M).f66968xde00c86.f36904x358076);
                }
                java.lang.String b18 = s33.y.b(b17, "chatroom_name=" + xVar.S);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c();
                try {
                    c15780xf49d6a1c2.mo11468x92b714fd(xVar.Q.f36514x2af773c5.mo14344x5f01b1f6());
                    c15780xf49d6a1c2.f36743xf0cd21de = b18;
                    s33.y.h(xVar.f120025g, c15780xf49d6a1c2);
                    return;
                } catch (java.io.IOException unused) {
                    return;
                }
            case 9530:
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d672 = xVar.f120028m;
                if (c15731x94356d672 != null) {
                    long j19 = c15731x94356d672.seq;
                    xVar.getClass();
                    android.content.Context context = xVar.f120025g;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
                    k0Var.f293405n = new c43.g0(xVar);
                    k0Var.f293414s = new c43.h0(xVar, j19);
                    k0Var.t(true);
                    android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bht, (android.view.ViewGroup) null);
                    ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mty)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.j4e);
                    k0Var.s(inflate, false);
                    k0Var.v();
                    return;
                }
                return;
            case 9531:
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d673 = xVar.f120028m;
                if (c15731x94356d673 != null) {
                    c43.x.i(xVar, c15731x94356d673.seq, true);
                    return;
                }
                return;
            case 9532:
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d674 = xVar.f120028m;
                if (c15731x94356d674 != null) {
                    c43.x.i(xVar, c15731x94356d674.seq, false);
                    return;
                }
                return;
            case 9533:
                if (xVar.f120028m != null) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5239x4881ea67 c5239x4881ea67 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5239x4881ea67();
                    am.d2 d2Var = c5239x4881ea67.f135572g;
                    d2Var.f87961a = 0;
                    d2Var.f87962b = xVar.f120028m.seq;
                    d2Var.f87963c = true;
                    c5239x4881ea67.e();
                    long j27 = xVar.f120027i;
                    long j28 = xVar.f120026h;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d675 = xVar.f120028m;
                    fVar.g(13L, 2L, j27, j28, c15731x94356d675.seq, c15731x94356d675.f36570xfd4da1cb, 0L, xVar.X);
                    return;
                }
                return;
            case 9534:
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d676 = xVar.f120028m;
                if (c15731x94356d676 == null || (c15792xf92d0ffd = c15731x94356d676.f36572xbfcc3e0) == null || (c15835xa11d0ad8 = c15792xf92d0ffd.f36784xc460ce3) == null || !c15835xa11d0ad8.f36907xf877edf9) {
                    return;
                }
                gm0.j1.d().g(c15835xa11d0ad8.f36911x9c46cbb ? new v33.y(xVar.S, c15731x94356d676.seq, false, c15731x94356d676.f36570xfd4da1cb, 15) : new v33.y(xVar.S, c15731x94356d676.seq, true, c15731x94356d676.f36570xfd4da1cb, 15));
                return;
            default:
                xVar.x(menuItem.getItemId());
                return;
        }
    }
}
