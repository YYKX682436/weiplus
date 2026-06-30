package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public final class LaunchAAUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f72529d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f72530e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f72531f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f72532g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.aa.ui.LaunchAAUIC$refreshAfterSelectBillsEventIListener$1 f72533h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.aa.ui.LaunchAAUIC$refreshAfterSelectBillsEventIListener$1] */
    public LaunchAAUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f72533h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RefreshAAUIAfterSelectBillsEvent>(a0Var) { // from class: com.tencent.mm.plugin.aa.ui.LaunchAAUIC$refreshAfterSelectBillsEventIListener$1
            {
                this.__eventId = 1797513767;
            }

            /* JADX WARN: Removed duplicated region for block: B:64:0x021e  */
            /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.RefreshAAUIAfterSelectBillsEvent r21) {
                /*
                    Method dump skipped, instructions count: 552
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.aa.ui.LaunchAAUIC$refreshAfterSelectBillsEventIListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
    }

    public final void O6(int i17) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = activity instanceof com.tencent.mm.plugin.aa.ui.LaunchAAUI ? (com.tencent.mm.plugin.aa.ui.LaunchAAUI) activity : null;
        if (launchAAUI != null) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = launchAAUI.f72510p;
            java.lang.String valueOf = java.lang.String.valueOf(mMEditText != null ? mMEditText.getText() : null);
            if (com.tencent.mm.sdk.platformtools.t8.K0(valueOf)) {
                valueOf = getString(com.tencent.mm.R.string.gal);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13723, 4, java.lang.Integer.valueOf(((java.util.ArrayList) launchAAUI.n7()).size()), java.lang.Integer.valueOf(i17), 0, valueOf, "");
        }
    }
}
