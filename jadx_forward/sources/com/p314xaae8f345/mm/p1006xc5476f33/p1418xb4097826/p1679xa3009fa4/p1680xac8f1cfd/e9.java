package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class e9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0 implements zy2.i6 {

    /* renamed from: f, reason: collision with root package name */
    public final so2.c f215752f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f215753g;

    /* renamed from: h, reason: collision with root package name */
    public long f215754h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f215755i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 f215756m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.ref.WeakReference f215757n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f215758o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f215759p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f215760q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f215761r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f215762s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f215752f = so2.c.f491815i;
        this.f215753g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t8.f217525d);
        this.f215759p = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u8.f217640d);
        this.f215760q = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d9.f215625d);
        this.f215761r = true;
        this.f215762s = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.x8(this, activity));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void O6(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 animationType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationType, "animationType");
        h7("hide");
        g7("hide");
        java.lang.Object obj = holder.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 != null) {
            e7().add(java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()));
            d7().e(java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()));
        }
        this.f215756m = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void Q6(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 animationType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationType, "animationType");
        g7("show");
        h7("show");
        java.lang.Object obj = holder.f374658i;
        java.util.ArrayList arrayList = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 == null) {
            return;
        }
        long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
        this.f215754h = mo2128x1ed62e84;
        java.util.LinkedList linkedList = (java.util.LinkedList) d7().b(java.lang.Long.valueOf(mo2128x1ed62e84));
        this.f215755i = linkedList;
        this.f215761r = true;
        if (linkedList != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) kz5.n0.Z(linkedList);
            this.f215756m = c19781xd1c47b87;
            android.view.View R6 = R6(holder);
            if (c19781xd1c47b87 != null && R6 != null) {
                this.f215758o = R6;
                k7("show", c19781xd1c47b87, R6);
                R6.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s8(c19781xd1c47b87, this, R6, holder, abstractC14490x69736cb5, animationType));
                this.f215757n = new java.lang.ref.WeakReference(holder);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(R6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC", "beforeShow", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$AnimationType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                R6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(R6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC", "beforeShow", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$AnimationType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(R6, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC", "beforeShow", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$AnimationType;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                R6.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(R6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC", "beforeShow", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$AnimationType;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show feedId=");
        sb6.append(pm0.v.u(mo2128x1ed62e84));
        sb6.append(",commentList=");
        java.util.LinkedList linkedList2 = this.f215755i;
        if (linkedList2 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                arrayList.add(pm0.v.u(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) it.next()).m76058xa6514d24()));
            }
        }
        sb6.append(arrayList);
        sb6.append(",emojiDescCommentMap contain feedId=");
        sb6.append(d7().f274024b.containsKey(java.lang.Long.valueOf(mo2128x1ed62e84)));
        sb6.append(",displayFeedIdList=");
        java.util.LinkedList e76 = e7();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(e76, 10));
        java.util.Iterator it6 = e76.iterator();
        while (it6.hasNext()) {
            arrayList4.add(pm0.v.u(((java.lang.Number) it6.next()).longValue()));
        }
        sb6.append(arrayList4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.DescCommentContentUIC", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public android.view.View R6(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.tcv);
        if (p17 != null) {
            return p17;
        }
        try {
            android.view.ViewStub viewStub = (android.view.ViewStub) holder.p(com.p314xaae8f345.mm.R.id.tcw);
            return viewStub != null ? viewStub.inflate() : null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.DescCommentContentUIC", e17, "", new java.lang.Object[0]);
            return p17;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public so2.c S6() {
        return this.f215752f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void V6(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 animationType, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationType, "animationType");
        super.V6(holder, animationType, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DescCommentContentUIC", "hideWithAnimation");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void W6(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (holder.p(com.p314xaae8f345.mm.R.id.tcv) != null) {
            super.W6(holder);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DescCommentContentUIC", "hideWithoutAnimate");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public boolean X6(in5.s0 holder, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = holder.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DescCommentContentUIC", "isNeedShow false, feedId is null!");
            return false;
        }
        long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
        boolean contains = e7().contains(java.lang.Long.valueOf(mo2128x1ed62e84));
        java.util.LinkedList linkedList = (java.util.LinkedList) d7().b(java.lang.Long.valueOf(mo2128x1ed62e84));
        if ((linkedList == null || linkedList.isEmpty()) && !contains) {
            return false;
        }
        boolean contains2 = ((java.util.LinkedList) ((jz5.n) this.f215760q).mo141623x754a37bb()).contains(java.lang.Long.valueOf(mo2128x1ed62e84));
        if (!contains2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isNeedShow,commentList size=");
            sb6.append(linkedList != null ? linkedList.size() : 0);
            sb6.append(",videoCompleted=");
            sb6.append(contains2);
            sb6.append(",haveDisplayed=");
            sb6.append(contains);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DescCommentContentUIC", sb6.toString());
            return false;
        }
        android.view.View R6 = R6(holder);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("isNeedShow has contentView=");
        sb7.append(R6 != null);
        sb7.append(",commentList size=");
        sb7.append(linkedList != null ? linkedList.size() : 0);
        sb7.append(",videoCompleted=");
        sb7.append(contains2);
        sb7.append(",haveDisplayed=");
        sb7.append(contains);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DescCommentContentUIC", sb7.toString());
        return R6 != null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public boolean a7(so2.c type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        return type != so2.c.f491810d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void b7(boolean z17, in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 animationType, yz5.a onVisible) {
        java.lang.Boolean bool;
        float f17;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationType, "animationType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onVisible, "onVisible");
        android.view.View R6 = R6(holder);
        if (R6 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665) R6.findViewById(com.p314xaae8f345.mm.R.id.det);
        c7(holder);
        onVisible.mo152xb9724478();
        float x17 = R6.getX();
        float y17 = R6.getY();
        R6.setScaleX(0.0f);
        R6.setScaleY(0.0f);
        R6.setPivotX(R6.getWidth());
        R6.setPivotY(R6.getHeight());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(R6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC", "showWithAnimation", "(ZLcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$AnimationType;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        R6.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(R6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC", "showWithAnimation", "(ZLcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$AnimationType;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(R6, "scaleX", 0.0f, 1.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(R6, "scaleY", 0.0f, 1.0f);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(R6, "alpha", 0.0f, 1.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        java.lang.Object tag = R6.getTag();
        java.lang.Boolean bool2 = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showEmojiDescWithAnimation");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.h6c);
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.avl);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool2, java.lang.Boolean.TRUE) || !this.f215761r || p17 == null || p18 == null) {
            bool = bool2;
            f17 = y17;
            i17 = 0;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        } else {
            int[] iArr = new int[2];
            p18.getLocationInWindow(iArr);
            int height = iArr[1] + p18.getHeight();
            p17.getLocationInWindow(iArr);
            float height2 = iArr[1] + p17.getHeight();
            android.view.ViewGroup.LayoutParams layoutParams = R6.getLayoutParams();
            float f18 = ((layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r0.bottomMargin : 0) - (height - height2);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("comment pos=");
            bool = bool2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(2);
            f17 = y17;
            int i18 = 0;
            for (int i19 = 2; i18 < i19; i19 = 2) {
                arrayList2.add(java.lang.Integer.valueOf(iArr[i18]));
                i18++;
            }
            sb7.append(arrayList2);
            sb7.append(" height=");
            sb7.append(p17.getHeight());
            sb7.append(" commentIconBottomY=");
            sb7.append(height2);
            sb7.append(" fromTranslationY ");
            sb7.append(f18);
            sb6.append(sb7.toString());
            i17 = 0;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, android.animation.ObjectAnimator.ofFloat(R6, "translationY", f18, 0.0f));
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(" targetView height=");
        sb8.append(R6.getHeight());
        sb8.append(";emojiView height=");
        sb8.append(c15276x168ec665.getHeight());
        sb8.append(" posY=");
        sb8.append(c15276x168ec665.getY());
        sb8.append(" location=");
        int[] iArr2 = new int[2];
        c15276x168ec665.getLocationInWindow(iArr2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(2);
        for (int i27 = i17; i27 < 2; i27++) {
            arrayList3.add(java.lang.Integer.valueOf(iArr2[i27]));
        }
        sb8.append(arrayList3);
        sb8.append("; translate from(");
        sb8.append(R6.getX());
        sb8.append(',');
        sb8.append(R6.getY());
        sb8.append(") to (");
        sb8.append(x17);
        sb8.append(',');
        sb8.append(f17);
        sb8.append("),isAnimating=");
        sb8.append(bool);
        sb8.append(",needTranslateAnim=");
        sb8.append(this.f215761r);
        sb6.append(sb8.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DescCommentContentUIC", sb6.toString());
        animatorSet.setDuration(500L);
        animatorSet.start();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void c7(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = holder.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        java.lang.Long valueOf = abstractC14490x69736cb5 != null ? java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()) : null;
        if (valueOf != null && !e7().contains(valueOf)) {
            super.c7(holder);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DescCommentContentUIC", "showWithoutAnimate");
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 d7() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.c0) ((jz5.n) this.f215753g).mo141623x754a37bb();
    }

    public final java.util.LinkedList e7() {
        return (java.util.LinkedList) ((jz5.n) this.f215759p).mo141623x754a37bb();
    }

    public final java.lang.Runnable f7() {
        return (java.lang.Runnable) ((jz5.n) this.f215762s).mo141623x754a37bb();
    }

    public final void g7(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(" hideView,container=");
        sb6.append(this.f215758o);
        sb6.append(",holder=");
        java.lang.ref.WeakReference weakReference = this.f215757n;
        sb6.append(weakReference != null ? (in5.s0) weakReference.get() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DescCommentContentUIC", sb6.toString());
        android.view.View view = this.f215758o;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC", "hideView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderDescCommentContentUIC", "hideView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f215758o = null;
    }

    public final void h7(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(" removeTask showingCommentInfo=");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = this.f215756m;
        sb6.append(pm0.v.u(c19781xd1c47b87 != null ? c19781xd1c47b87.m76058xa6514d24() : -1L));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DescCommentContentUIC", sb6.toString());
        pm0.v.C(f7());
    }

    public final void i7(java.lang.String str, java.lang.String str2, long j17, long j18, java.util.Map map) {
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        if (V6 != null) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            java.util.Map l17 = kz5.c1.l(new jz5.l("feed_id", pm0.v.u(j17)), new jz5.l("finder_context_id", V6.m75945x2fec8307(1)), new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5))), new jz5.l("comment_id", pm0.v.u(j18)));
            l17.putAll(map);
            ((cy1.a) rVar).Bj(str, str2, l17, 1, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0714  */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.widget.ImageView, android.view.View] */
    /* JADX WARN: Type inference failed for: r2v40, types: [wo0.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k7(java.lang.String r37, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 r38, android.view.View r39) {
        /*
            Method dump skipped, instructions count: 2027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e9.k7(java.lang.String, com.tencent.mm.protocal.protobuf.FinderCommentInfo, android.view.View):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        fc2.c n17;
        super.mo739xfd763ae1(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209139af).mo141623x754a37bb()).r()).booleanValue()) {
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar == null || (n17 = zy2.ra.n1(nyVar, 0, 1, null)) == null) {
                return;
            }
            n17.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.z8(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        h7("onDestroy");
        g7("onDestroy");
        this.f215756m = null;
        d7().a();
    }
}
