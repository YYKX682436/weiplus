package ea2;

/* loaded from: classes2.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 f332089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f332090e;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72, boolean z17) {
        this.f332089d = c13650x1bf60d72;
        this.f332090e = z17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$showLikeTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72 = this.f332089d;
        if (this.f332090e) {
            c13650x1bf60d72.e7("BottomBar", c13650x1bf60d72.m158354x19263085(), c13650x1bf60d72.X6());
        } else {
            c13650x1bf60d72.getClass();
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.app.Activity m80379x76847179 = c13650x1bf60d72.m80379x76847179();
            bw5.o50 o50Var = new bw5.o50();
            o50Var.i("1010");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.gl((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17, m80379x76847179, o50Var, bw5.ar0.TingScene_FinderProfileMusicianList, false, false, 24, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$showLikeTips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
