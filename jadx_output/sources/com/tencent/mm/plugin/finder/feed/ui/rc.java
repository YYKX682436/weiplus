package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes10.dex */
public final class rc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveSelectRoomForLuckMoneyUI f110492d;

    public rc(com.tencent.mm.plugin.finder.feed.ui.FinderLiveSelectRoomForLuckMoneyUI finderLiveSelectRoomForLuckMoneyUI) {
        this.f110492d = finderLiveSelectRoomForLuckMoneyUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.ga gaVar;
        android.widget.Button button;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveSelectRoomForLuckMoneyUI finderLiveSelectRoomForLuckMoneyUI = this.f110492d;
        gaVar = ((com.tencent.mm.ui.MMActivity) finderLiveSelectRoomForLuckMoneyUI).mController;
        com.tencent.mm.ui.eb E = gaVar.E(1);
        if (E != null) {
            android.view.View view = E.f208385k;
            if (view == null && (view = E.f208384j) == null) {
                view = null;
            }
            if (view == null || (button = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.f482481fp)) == null) {
                return;
            }
            androidx.appcompat.app.AppCompatActivity context = finderLiveSelectRoomForLuckMoneyUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.Object systemService = context.getSystemService("window");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            button.setTextSize(1, (displayMetrics.density * 16.0f) / context.getResources().getDisplayMetrics().density);
        }
    }
}
