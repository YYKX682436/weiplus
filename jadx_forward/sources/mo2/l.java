package mo2;

/* loaded from: classes2.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f411912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f411913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mo2.q f411914f;

    public l(boolean[] zArr, in5.s0 s0Var, mo2.q qVar) {
        this.f411912d = zArr;
        this.f411913e = s0Var;
        this.f411914f = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/view/MemberCommonConvert$refreshStarCount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean[] zArr = this.f411912d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            fo3.s sVar = fo3.s.INSTANCE;
            sVar.Z7("ce_feed_fav", "<FeedFav>");
            sVar.H2("ce_feed_fav", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_feed_fav");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClickStar: ");
        in5.s0 s0Var = this.f411913e;
        sb6.append(s0Var.m8183xf806b362());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MemberCommonConvert.kt", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i;
        nv2.o oVar = nv2.o.f422091e;
        boolean z17 = !nv2.o.f422091e.c(abstractC14490x69736cb5.getFeedObject().getFeedObject());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.c cVar = this.f411914f.f411921e;
        if (cVar != null) {
            cVar.u2(abstractC14490x69736cb5.getFeedObject(), z17, this.f411913e, 0, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert$refreshStarCount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
