package yw3;

/* loaded from: classes.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI f548334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f548335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f548336f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI repairerDBSelectDemoUI, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, java.lang.StringBuilder sb6) {
        super(0);
        this.f548334d = repairerDBSelectDemoUI;
        this.f548335e = g0Var;
        this.f548336f = sb6;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI repairerDBSelectDemoUI = this.f548334d;
        android.widget.TextView textView = repairerDBSelectDemoUI.f;
        if (textView != null) {
            textView.setText("Cost: " + this.f548335e.f391654d + " ms");
        }
        android.widget.TextView textView2 = repairerDBSelectDemoUI.e;
        if (textView2 != null) {
            textView2.setText(this.f548336f);
        }
        return jz5.f0.f384359a;
    }
}
