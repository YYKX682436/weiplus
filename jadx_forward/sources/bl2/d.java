package bl2;

/* loaded from: classes3.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bl2.f f103234d;

    public d(bl2.f fVar) {
        this.f103234d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        mf2.b0 b0Var;
        df2.tc tcVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveGuideAnchorWriteTopicPanel$openPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bl2.f fVar = this.f103234d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 abstractC14196xf9d9d703 = fVar.f103236h;
        if (abstractC14196xf9d9d703 != null && (tcVar = (df2.tc) abstractC14196xf9d9d703.m56789x25fe639c(df2.tc.class)) != null) {
            df2.tc.Z6(tcVar, 2, null, null, null, 14, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 abstractC14196xf9d9d7032 = fVar.f103236h;
        if (abstractC14196xf9d9d7032 != null && (b0Var = (if2.b) abstractC14196xf9d9d7032.m56789x25fe639c(yf2.i2.class)) != null && (b0Var instanceof jm2.a)) {
            ((yf2.i2) ((jm2.a) b0Var)).a7(3);
        }
        fVar.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveGuideAnchorWriteTopicPanel$openPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
