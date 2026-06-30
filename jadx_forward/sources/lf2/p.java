package lf2;

/* loaded from: classes10.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf2.s f399833d;

    public p(lf2.s sVar) {
        this.f399833d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel$plusKeyListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lf2.s sVar = this.f399833d;
        int i17 = sVar.T;
        if (i17 < sVar.S) {
            sVar.T = i17 + 1;
            sVar.f0();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel$plusKeyListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
