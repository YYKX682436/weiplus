package cb5;

/* loaded from: classes5.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cb5.c f121882d;

    public a(cb5.c cVar) {
        this.f121882d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/banner/ChattingMonitoredBanner$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cb5.c cVar = this.f121882d;
        cb5.e.l(cVar.f121885e.f121886d, 1);
        cb5.e eVar = cVar.f121885e.f121886d;
        java.lang.String str = eVar.f121888n;
        eVar.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingMonitoredBanner", "hy: not provide url");
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            j45.l.j((android.content.Context) eVar.f484375g.get(), "webview", ".ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/banner/ChattingMonitoredBanner$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
