package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class le implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f107289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f107290b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f107291c;

    public le(java.lang.String str, com.tencent.mm.plugin.finder.feed.af afVar, boolean z17) {
        this.f107289a = str;
        this.f107290b = afVar;
        this.f107291c = z17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            java.lang.String str2 = this.f107289a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            float f17 = com.tencent.mm.plugin.finder.feed.af.B1;
            com.tencent.mm.plugin.finder.feed.af afVar = this.f107290b;
            afVar.e7();
            ((dk5.s5) tg3.t1.a()).Vi(afVar.getActivity(), this.f107289a, afVar.V, 0, "", "", null);
            g45.b.f268846a.a(str2, str, 0);
            com.tencent.mm.ui.widget.snackbar.j.c("已发送", null, afVar.getActivity(), null, null);
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().g(str2);
            com.tencent.mm.plugin.finder.feed.pe.a(afVar, str2, this.f107291c);
        }
    }
}
