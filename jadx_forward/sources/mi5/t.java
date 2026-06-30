package mi5;

/* loaded from: classes9.dex */
public final class t implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f408450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l15.c f408451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408452c;

    public t(q80.d0 d0Var, l15.c cVar, android.content.Context context) {
        this.f408450a = d0Var;
        this.f408451b = cVar;
        this.f408452c = context;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        y05.c cVar;
        y05.d j17;
        y05.c cVar2;
        y05.d j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingGameCardView", "openLiteApp fail %s. fallback to H5", this.f408450a.f442182a);
        l15.c cVar3 = this.f408451b;
        v05.b k17 = cVar3.k();
        java.lang.String k18 = (k17 == null || (cVar2 = (y05.c) k17.m75936x14adae67(k17.f513848e + 40)) == null || (j18 = cVar2.j()) == null) ? null : j18.k();
        if (k18 == null || k18.length() == 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        v05.b k19 = cVar3.k();
        intent.putExtra("rawUrl", (k19 == null || (cVar = (y05.c) k19.m75936x14adae67(k19.f513848e + 40)) == null || (j17 = cVar.j()) == null) ? null : j17.k());
        j45.l.j(this.f408452c, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingGameCardView", "openLiteApp success %s.", this.f408450a.f442182a);
    }
}
