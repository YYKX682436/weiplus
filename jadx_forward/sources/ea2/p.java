package ea2;

/* loaded from: classes2.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.r23 f332109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 f332110e;

    public p(r45.r23 r23Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72) {
        this.f332109d = r23Var;
        this.f332110e = c13650x1bf60d72;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initEffectTemplate$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((r45.rz6) this.f332109d.m75936x14adae67(1)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72 = this.f332110e;
            c13650x1bf60d72.e7("EffectTemplate", c13650x1bf60d72.m158354x19263085(), c13650x1bf60d72.X6());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72.p7(c13650x1bf60d72, 108, null, null, 0, 14, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initEffectTemplate$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
