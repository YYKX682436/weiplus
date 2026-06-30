package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class vf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14397xacff3a56 f201599d;

    public vf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14397xacff3a56 c14397xacff3a56) {
        this.f201599d = c14397xacff3a56;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubTagWidget$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14397xacff3a56 c14397xacff3a56 = this.f201599d;
        yz5.p clickListener = c14397xacff3a56.getClickListener();
        if (clickListener != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            clickListener.mo149xb9724478(view, java.lang.Boolean.valueOf(c14397xacff3a56.getHasJoinFansClub()));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubTagWidget$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
