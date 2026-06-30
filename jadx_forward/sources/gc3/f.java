package gc3;

/* loaded from: classes12.dex */
public class f implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16411x58668904 f351959d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16411x58668904 c16411x58668904) {
        this.f351959d = c16411x58668904;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceLayout$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16411x58668904 c16411x58668904 = this.f351959d;
        int i17 = c16411x58668904.f229144n;
        c16411x58668904.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jp jpVar = c16411x58668904.f229138e;
        jpVar.f228621m = 7;
        jpVar.invalidateSelf();
        yj0.a.i(true, this, "com/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceLayout$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
