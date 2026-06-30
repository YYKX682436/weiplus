package vw3;

/* loaded from: classes.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI f522507d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI repairerChatroomDebugUI) {
        super(0);
        this.f522507d = repairerChatroomDebugUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f522507d.findViewById(com.p314xaae8f345.mm.R.id.f78309xcc53afe2);
        int i17 = com.p314xaae8f345.mm.R.id.cj6;
        android.widget.Button button = (android.widget.Button) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.cj6);
        if (button != null) {
            i17 = com.p314xaae8f345.mm.R.id.gcf;
            android.widget.Button button2 = (android.widget.Button) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.gcf);
            if (button2 != null) {
                i17 = com.p314xaae8f345.mm.R.id.gqw;
                android.widget.Button button3 = (android.widget.Button) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.gqw);
                if (button3 != null) {
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById;
                    i17 = com.p314xaae8f345.mm.R.id.f569031os5;
                    android.widget.Button button4 = (android.widget.Button) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f569031os5);
                    if (button4 != null) {
                        return new ww3.a(linearLayout, button, button2, button3, linearLayout, button4);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
