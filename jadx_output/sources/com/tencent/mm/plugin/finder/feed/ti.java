package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class ti extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.hp f109061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        if (getIntent().hasExtra("liveContact")) {
            boolean booleanExtra = getIntent().getBooleanExtra("isDarkMode", false);
            java.lang.String stringExtra = getIntent().getStringExtra("fromUsername");
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            r45.xn1 xn1Var = new r45.xn1();
            xn1Var.parseFrom(getIntent().getByteArrayExtra("liveContact"));
            h0Var.f310123d = xn1Var;
            java.lang.String stringExtra2 = getIntent().getStringExtra("liveId");
            java.lang.String stringExtra3 = getIntent().getStringExtra("objectId");
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveProfileWidgetJumpEmptyUIC", "liveIdStr:" + stringExtra2 + ", objectIdStr:" + stringExtra3);
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ri(booleanExtra, this, stringExtra, stringExtra2, stringExtra3, h0Var));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.live.widget.hp hpVar = this.f109061d;
        if (hpVar != null) {
            hpVar.g0();
        }
    }
}
