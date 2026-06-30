package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class me implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f107370a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ot0.q f107371b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f107372c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f107373d;

    public me(java.lang.String str, ot0.q qVar, com.tencent.mm.plugin.finder.feed.af afVar, boolean z17) {
        this.f107370a = str;
        this.f107371b = qVar;
        this.f107372c = afVar;
        this.f107373d = z17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            java.lang.String str2 = this.f107370a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            ((dk5.s5) tg3.t1.a()).Ai(str2, null, ot0.q.u(this.f107371b, null, null), null);
            g45.b.f268846a.a(str2, str, 0);
            com.tencent.mm.plugin.finder.feed.af afVar = this.f107372c;
            com.tencent.mm.ui.widget.snackbar.j.c("已发送", null, afVar.getActivity(), null, null);
            com.tencent.mm.plugin.finder.feed.pe.a(afVar, str2, this.f107373d);
        }
    }
}
