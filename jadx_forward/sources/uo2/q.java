package uo2;

/* loaded from: classes2.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14492xad25b4ca f511171d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14492xad25b4ca c14492xad25b4ca) {
        this.f511171d = c14492xad25b4ca;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$pauseVideoListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14492xad25b4ca c14492xad25b4ca = this.f511171d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15199x5a7ac820 videoView = c14492xad25b4ca.getVideoView();
        if (videoView != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) c14492xad25b4ca.findViewById(com.p314xaae8f345.mm.R.id.ftl);
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(c14492xad25b4ca.getContext(), com.p314xaae8f345.mm.R.raw.f79312xe67557d9, i65.a.d(c14492xad25b4ca.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
            }
            videoView.mo48231x65825f6();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) c14492xad25b4ca.findViewById(com.p314xaae8f345.mm.R.id.ftl);
            android.view.View.OnClickListener onClickListener = c14492xad25b4ca.L;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setOnClickListener(onClickListener);
            }
            c14492xad25b4ca.m58325xf1c6c88b(onClickListener);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            android.content.Context context = c14492xad25b4ca.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 originFeed = c14492xad25b4ca.getOriginFeed();
            o3Var.zk(context, 2, 3, (originFeed == null || (feedObject = originFeed.getFeedObject()) == null) ? null : java.lang.Integer.valueOf(feedObject.m76775xd85283c6()));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$pauseVideoListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
