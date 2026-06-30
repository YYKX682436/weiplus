package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes3.dex */
public class e0 implements gb3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f227380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.re6 f227381b;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.g0 g0Var, in5.s0 s0Var, r45.re6 re6Var) {
        this.f227380a = s0Var;
        this.f227381b = re6Var;
    }

    @Override // gb3.i
    /* renamed from: onComplete */
    public void mo66107x815f5438(boolean z17) {
        if (z17) {
            in5.s0 s0Var = this.f227380a;
            java.lang.String str = (java.lang.String) s0Var.p(com.p314xaae8f345.mm.R.id.j0a).getTag(com.p314xaae8f345.mm.R.id.j1c);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals(this.f227381b.f466308e)) {
                return;
            }
            android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.j0a);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryConvert$1", "onComplete", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryConvert$1", "onComplete", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
