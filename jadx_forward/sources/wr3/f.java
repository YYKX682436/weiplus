package wr3;

/* loaded from: classes11.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f530309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16894x4f59e657 f530310e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16894x4f59e657 abstractC16894x4f59e657) {
        super(1);
        this.f530309d = str;
        this.f530310e = abstractC16894x4f59e657;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        vr3.d0 it = (vr3.d0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        tr3.b bVar = new tr3.b();
        bVar.f502963a = 2001;
        bVar.f502964b = false;
        tr3.a.f502959a.a(bVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f530309d, "user click topic item");
        intent.putExtra("rawUrl", it.f521159d.f469008f);
        intent.putExtra("geta8key_scene", 3);
        intent.putExtra("key_enable_fts_quick", true);
        j45.l.j(this.f530310e.mo7438x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
        return jz5.f0.f384359a;
    }
}
