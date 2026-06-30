package vh4;

/* loaded from: classes.dex */
public abstract class m1 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public long f518640d;

    public m1(int i17, r35.m3 m3Var) {
        super(i17, m3Var);
        this.f518640d = -1L;
    }

    public abstract void a(android.view.View view);

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/model/TeenModeAvoidDuplicatedPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        long j17 = this.f518640d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (android.os.SystemClock.elapsedRealtime() - j17 > 1000) {
            super.onClick(view);
            a(view);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AvoidDuplicatedPressableSpan", "hy: too often click");
            mo2167x263a2556(false);
        }
        this.f518640d = android.os.SystemClock.elapsedRealtime();
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/model/TeenModeAvoidDuplicatedPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
