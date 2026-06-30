package gc3;

/* loaded from: classes9.dex */
public final class p implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16412xaf564658 f351970d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16412xaf564658 c16412xaf564658) {
        this.f351970d = c16412xaf564658;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceTransLayout$onLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16412xaf564658 c16412xaf564658 = this.f351970d;
        c16412xaf564658.getCurrentState();
        c16412xaf564658.f229152s = true;
        yj0.a.i(true, this, "com/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceTransLayout$onLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
