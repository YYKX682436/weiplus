package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class bd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.jd f205100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.jd jdVar) {
        super(0);
        this.f205100d = jdVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fetchEndCallback] totalSize=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.jd jdVar = this.f205100d;
        sb6.append(jdVar.O6().m56393xfb854877());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, sb6.toString());
        if (jdVar.m58723x96811f7a().m82923x19404fcc() != null) {
            jdVar.m58723x96811f7a().E(true);
            jdVar.m58723x96811f7a().C(ym5.x.a(jdVar.m80379x76847179(), 160.0f));
            android.view.View mo144222x4ff8c0f0 = jdVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ilh);
            if (mo144222x4ff8c0f0 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileProductUIC$initFeedLoader$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileProductUIC$initFeedLoader$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View mo144222x4ff8c0f02 = jdVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ilg);
            if (mo144222x4ff8c0f02 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(mo144222x4ff8c0f02, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileProductUIC$initFeedLoader$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo144222x4ff8c0f02.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(mo144222x4ff8c0f02, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileProductUIC$initFeedLoader$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f384359a;
    }
}
