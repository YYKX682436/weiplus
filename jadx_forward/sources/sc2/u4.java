package sc2;

/* loaded from: classes2.dex */
public final class u4 extends ad2.h {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f487816w = "FeedAdPosJumperObserver";

    @Override // ad2.h
    public java.lang.String k() {
        return this.f487816w;
    }

    @Override // ad2.h
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onBindView] hashCode:");
        sb6.append(hashCode());
        sb6.append("holder: ");
        sb6.append(holder.hashCode());
        sb6.append(" holder position: ");
        sb6.append(holder.m8188xa86cd69f());
        sb6.append(" feedId=");
        sb6.append(pm0.v.u(this.f84678f));
        sb6.append(" showPosition=");
        sb6.append(infoEx.f534789r);
        sb6.append(" showStyle=");
        sb6.append(infoEx.f534790s);
        sb6.append(" businessType=");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        sb6.append(c19786x6a1e2862.m76480xe2ee1ca3());
        sb6.append(" jumpType=");
        sb6.append(c19786x6a1e2862.m76503x92bc3c07());
        sb6.append(" title=");
        sb6.append(c19786x6a1e2862.m76514x1202da9d());
        sb6.append('|');
        sb6.append(c19786x6a1e2862.m76523x98b23862());
        sb6.append(" icon_url=");
        sb6.append(c19786x6a1e2862.m76497x4fe38a1f());
        sb6.append(" ext_info=");
        sb6.append(c19786x6a1e2862.m76489xefafd82());
        sb6.append(' ');
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f487816w;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        android.widget.TextView textView = (android.widget.TextView) jumpView.findViewById(com.p314xaae8f345.mm.R.id.nq6);
        if (textView != null) {
            textView.setText(c19786x6a1e2862.m76523x98b23862());
            textView.setAlpha((c19786x6a1e2862.m76477x682eab37() == 1 || c19786x6a1e2862.m76477x682eab37() == 2) ? 0.5f : 1.0f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onBindView: wording = " + c19786x6a1e2862.m76523x98b23862() + ", banner_type = " + c19786x6a1e2862.m76477x682eab37());
        }
        if (jumpView.getVisibility() != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(jumpView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperLuckyBagObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            jumpView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(jumpView, "com/tencent/mm/plugin/finder/feed/component/FeedJumperLuckyBagObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(jumpView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperLuckyBagObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            jumpView.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(jumpView, "com/tencent/mm/plugin/finder/feed/component/FeedJumperLuckyBagObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            jumpView.animate().alpha(1.0f).setDuration(280L).start();
        }
    }
}
