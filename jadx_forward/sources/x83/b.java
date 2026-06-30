package x83;

/* loaded from: classes.dex */
public abstract class b extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public long f534084d;

    public b(int i17, r35.m3 m3Var) {
        super(i17, m3Var);
        this.f534084d = -1L;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/model/KidsWatchAvoidDuplicatedPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        long j17 = this.f534084d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (android.os.SystemClock.elapsedRealtime() - j17 > 1000) {
            super.onClick(widget);
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6.f224672t;
            com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6 activityC16160x425523e6 = ((z83.h) this).f552273e;
            activityC16160x425523e6.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "click law link");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", activityC16160x425523e6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gb_, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()));
            j45.l.j(activityC16160x425523e6, "webview", ".ui.tools.WebViewUI", intent, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AvoidDuplicatedPressableSpan", "hy: too often click");
            mo2167x263a2556(false);
        }
        this.f534084d = android.os.SystemClock.elapsedRealtime();
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/model/KidsWatchAvoidDuplicatedPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
