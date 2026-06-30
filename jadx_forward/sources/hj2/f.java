package hj2;

/* loaded from: classes10.dex */
public class f extends hj2.c {

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f363117c;

    static {
        new hj2.e(null);
        f363117c = jz5.h.b(hj2.d.f363116d);
    }

    @Override // hj2.c, gi2.c
    public java.lang.String d() {
        return "MultiVoiceRoomSinglePkLayout";
    }

    @Override // hj2.c, hj2.a
    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 parent, android.view.View firstItemView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(firstItemView, "firstItemView");
        android.view.View singleBattleBarViewLayout = parent.getSingleBattleBarViewLayout();
        jz5.f0 f0Var = null;
        if (singleBattleBarViewLayout != null) {
            android.view.ViewParent parent2 = singleBattleBarViewLayout.getParent();
            android.view.ViewGroup viewGroup = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (viewGroup != null) {
                viewGroup.removeView(singleBattleBarViewLayout);
            }
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
            layoutParams.f92426h = 0;
            layoutParams.f92418d = 0;
            layoutParams.f92424g = 0;
            layoutParams.setMargins(0, com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 172), 0, 0);
            parent.addView(singleBattleBarViewLayout, layoutParams);
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
        android.view.View singleBattleBarViewLayout2 = parent.getSingleBattleBarViewLayout();
        if (singleBattleBarViewLayout2 != null) {
            layoutParams2.f92428i = singleBattleBarViewLayout2.getId();
            layoutParams2.setMargins(0, com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16), 0, 0);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            layoutParams2.f92426h = 0;
            layoutParams2.setMargins(0, com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 172), 0, 0);
        }
        layoutParams2.f92418d = 0;
        layoutParams2.f92424g = 0;
        parent.addView(firstItemView, layoutParams2);
    }
}
