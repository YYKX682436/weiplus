package l44;

/* loaded from: classes4.dex */
public class a4 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f397560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ab4.u f397561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f397562f;

    public a4(android.content.Context context, ab4.u uVar, android.widget.Button button) {
        this.f397560d = context;
        this.f397561e = uVar;
        this.f397562f = button;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        android.widget.Button button = this.f397562f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayoutChange", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$1");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BtnIconUpdateHelper", "after onLayoutChange, then updateBtnIconLogic");
            android.content.Context context = this.f397560d;
            ab4.u uVar = this.f397561e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            l44.f4.f(context, uVar, button);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            button.removeOnLayoutChangeListener(this);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BtnIconUpdateHelper", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayoutChange", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$1");
    }
}
