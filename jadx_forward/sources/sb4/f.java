package sb4;

/* loaded from: classes4.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f487028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb4.e f487029e;

    public f(sb4.e eVar, android.widget.TextView textView) {
        this.f487029e = eVar;
        this.f487028d = textView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$1");
        new android.graphics.Rect();
        android.widget.TextView textView = this.f487028d;
        textView.measure(0, 0);
        int measuredHeight = textView.getMeasuredHeight();
        sb4.e eVar = this.f487029e;
        eVar.f487004w = measuredHeight;
        int i17 = eVar.f487004w;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$1");
    }
}
