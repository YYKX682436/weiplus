package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* loaded from: classes8.dex */
public final class k1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.l1 f264848d;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.l1 l1Var) {
        this.f264848d = l1Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTingEntryHelper", "user click ting!");
        nw4.n nVar = this.f264848d.f264850a.f265377p0;
        if (!nVar.f422428i) {
            return false;
        }
        nVar.f422420a.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("onTingEntryClick", null, nVar.f422436q, nVar.f422437r) + ")", null);
        return false;
    }
}
