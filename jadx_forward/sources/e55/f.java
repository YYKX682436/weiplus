package e55;

@j95.b
/* loaded from: classes8.dex */
public final class f extends i95.w implements f55.g {
    public void Ai(f55.e pageIndex, java.lang.String entryKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageIndex, "pageIndex");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entryKey, "entryKey");
        if (e55.e.f331200a.n()) {
            e55.m mVar = e55.m.f331214a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 g17 = mVar.g();
            android.os.Message mo50288x733c63a2 = mVar.g().mo50288x733c63a2();
            mo50288x733c63a2.what = 1006;
            mo50288x733c63a2.obj = nm5.j.c(java.lang.Integer.valueOf(pageIndex.f341307d), entryKey);
            g17.mo50308x2936bf5f(mo50288x733c63a2);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotReportService", "onAccountInitialized cur process " + bm5.f1.a());
        if (e55.e.f331200a.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotReportService", "start monitor");
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (e55.e.f331200a.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotReportService", "stop monitor");
            e55.m.f331214a.n();
        }
    }

    public android.widget.AbsListView.OnScrollListener wi() {
        if (!e55.e.f331200a.n()) {
            return null;
        }
        e55.m mVar = e55.m.f331214a;
        f55.e eVar = f55.e.f341304e;
        java.lang.Object obj = i55.u.f370422a.b().get(2);
        i55.h hVar = obj instanceof i55.h ? (i55.h) obj : null;
        if (hVar != null) {
            return hVar;
        }
        return null;
    }
}
