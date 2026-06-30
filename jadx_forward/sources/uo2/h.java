package uo2;

/* loaded from: classes2.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14492xad25b4ca f511154d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14492xad25b4ca c14492xad25b4ca) {
        this.f511154d = c14492xad25b4ca;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$copyrightRestrictionListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14492xad25b4ca c14492xad25b4ca = this.f511154d;
        r45.o03 finderBgmInfo = c14492xad25b4ca.getFinderBgmInfo();
        java.lang.Integer num = null;
        if ((finderBgmInfo != null ? (r45.zi2) finderBgmInfo.m75936x14adae67(1) : null) != null) {
            db5.t7.m123882x26a183b(c14492xad25b4ca.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f572819cn0, 0).show();
        } else {
            db5.t7.m123882x26a183b(c14492xad25b4ca.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.cmz, 0).show();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        android.content.Context context = c14492xad25b4ca.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 originFeed = c14492xad25b4ca.getOriginFeed();
        if (originFeed != null && (feedObject = originFeed.getFeedObject()) != null) {
            num = java.lang.Integer.valueOf(feedObject.m76775xd85283c6());
        }
        o3Var.zk(context, 2, 4, num);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$copyrightRestrictionListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
