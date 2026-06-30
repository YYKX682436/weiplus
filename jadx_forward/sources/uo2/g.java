package uo2;

/* loaded from: classes2.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14492xad25b4ca f511151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f511152e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14492xad25b4ca c14492xad25b4ca, int i17) {
        this.f511151d = c14492xad25b4ca;
        this.f511152e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$bindOriginFeed$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14492xad25b4ca.R;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14492xad25b4ca c14492xad25b4ca = this.f511151d;
        c14492xad25b4ca.getClass();
        if ((this.f511152e & 1) == 1) {
            c14492xad25b4ca.Q.onClick(view);
        } else {
            c14492xad25b4ca.D();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        android.content.Context context = c14492xad25b4ca.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        p2Var.D(context, false, 6);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$bindOriginFeed$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
