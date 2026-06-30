package mo2;

/* loaded from: classes2.dex */
public abstract class q extends in5.r implements ko2.f, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.d {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.c f411921e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f411922f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f411923g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f411924h;

    /* renamed from: i, reason: collision with root package name */
    public final int f411925i;

    /* renamed from: m, reason: collision with root package name */
    public final int f411926m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f411927n;

    /* renamed from: o, reason: collision with root package name */
    public final int f411928o;

    /* renamed from: p, reason: collision with root package name */
    public final int f411929p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f411930q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f411931r;

    /* renamed from: s, reason: collision with root package name */
    public android.animation.ValueAnimator f411932s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.ViewOutlineProvider f411933t;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.c cVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, java.lang.String authorFinderUsername, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        this.f411921e = cVar;
        this.f411922f = activityC0065xcd7aa112;
        this.f411923g = authorFinderUsername;
        this.f411924h = z17;
        this.f411925i = i17;
        this.f411926m = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c);
        this.f411927n = jz5.h.b(mo2.m.f411915d);
        this.f411928o = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        this.f411929p = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        this.f411930q = jz5.h.b(new mo2.a(this));
        this.f411931r = jz5.h.b(new mo2.o(this));
        jz5.h.b(new mo2.p(this));
        this.f411933t = new mo2.c();
    }

    public static final void n(mo2.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var, long j17) {
        boolean z17;
        qVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (z17) {
            return;
        }
        mo2.b bVar = new mo2.b(abstractC14490x69736cb5, s0Var, qVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.c cVar = qVar.f411921e;
        if (cVar != null) {
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            cVar.f(context, cVar.j2(), abstractC14490x69736cb5, qVar.f411923g, 0L, bVar, 11);
        }
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570345dc4;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee A[LOOP:1: B:36:0x00b7->B:44:0x00ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb A[SYNTHETIC] */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r42, in5.c r43, int r44, int r45, boolean r46, java.util.List r47) {
        /*
            Method dump skipped, instructions count: 2500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mo2.q.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    public final void o(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (item.getFeedObject().m59328xcaae1dc7() || !item.getFeedObject().m59331xcb21161d()) {
            return;
        }
        if (i18 == 1) {
            android.content.Intent intent = new android.content.Intent();
            ya2.b2 contact = item.getContact();
            intent.putExtra("finder_username", contact != null ? contact.D0() : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, context, intent, item.getFeedObject().m59251x5db1b11(), null, 0, i17, false, 0, item.w(), 192, null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(context, intent);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Avatar", item.n());
        intent2.putExtra("Nickname", item.getFeedObject().m59273x80025a04());
        intent2.putExtra("FeedId", item.getFeedObject().m59251x5db1b11());
        intent2.putExtra("DupFlag", item.w());
        intent2.putExtra("memberProviderUsername", this.f411923g);
        intent2.putExtra("showInteraction", true);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = item.getFeedObject().getFeedObject().m76760x76845fea();
        intent2.putExtra("V5UserName", m76760x76845fea != null ? m76760x76845fea.m76197x6c03c64c() : null);
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.sl((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17, context, item.getFeedObject().m59299x6bf53a6c(), intent2, 11, null, 16, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011e A[Catch: Exception -> 0x01e2, TryCatch #3 {Exception -> 0x01e2, blocks: (B:50:0x00ff, B:52:0x0112, B:57:0x011e, B:58:0x0123, B:60:0x0139, B:62:0x0148, B:63:0x0142, B:74:0x0168), top: B:49:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139 A[Catch: Exception -> 0x01e2, TryCatch #3 {Exception -> 0x01e2, blocks: (B:50:0x00ff, B:52:0x0112, B:57:0x011e, B:58:0x0123, B:60:0x0139, B:62:0x0148, B:63:0x0142, B:74:0x0168), top: B:49:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142 A[Catch: Exception -> 0x01e2, TryCatch #3 {Exception -> 0x01e2, blocks: (B:50:0x00ff, B:52:0x0112, B:57:0x011e, B:58:0x0123, B:60:0x0139, B:62:0x0148, B:63:0x0142, B:74:0x0168), top: B:49:0x00ff }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r25, in5.s0 r26) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mo2.q.p(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0):void");
    }

    public final void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var) {
        com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2 c22803x544dcce2 = (com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2) s0Var.p(com.p314xaae8f345.mm.R.id.r86);
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.f567422r85);
        android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.f567412r81);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f567917q01);
        if (abstractC14490x69736cb5.getFeedObject().m59328xcaae1dc7()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(8);
            return;
        }
        if (abstractC14490x69736cb5.getFeedObject().m59331xcb21161d()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p18, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(p18, arrayList5.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(p17, arrayList6.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(8);
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(c22803x544dcce2.getProgress(), abstractC14490x69736cb5.getFeedObject().m59277xa8f45ee4().m75939xb282bd08(4));
        this.f411932s = ofInt;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ofInt);
        ofInt.addUpdateListener(new mo2.h(c22803x544dcce2));
        android.animation.ValueAnimator valueAnimator = this.f411932s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueAnimator);
        android.animation.ValueAnimator duration = valueAnimator.setDuration(400L);
        if (duration != null) {
            duration.start();
        }
    }

    public final void r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var) {
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f567915q00);
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.pzu);
        ya2.b2 contact = abstractC14490x69736cb5.getContact();
        int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(contact != null ? contact.D0() : null) ? 1 : 2;
        if (i17 == 1) {
            android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.pzz);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.pzz);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        imageView.setOnClickListener(new mo2.i(this, s0Var, abstractC14490x69736cb5, i17));
        textView.setOnClickListener(new mo2.j(this, s0Var, abstractC14490x69736cb5, i17));
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        ya2.b2 contact2 = abstractC14490x69736cb5.getContact();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(contact2 != null ? contact2.D0() : null, this.f411923g)) {
            android.view.View p19 = s0Var.p(com.p314xaae8f345.mm.R.id.pzy);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p27 = s0Var.p(com.p314xaae8f345.mm.R.id.pzz);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View p28 = s0Var.p(com.p314xaae8f345.mm.R.id.pzy);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p28, arrayList5.toArray(), "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert", "refreshPosterContact", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean m59328xcaae1dc7 = abstractC14490x69736cb5.getFeedObject().m59328xcaae1dc7();
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (!m59328xcaae1dc7 && abstractC14490x69736cb5.getFeedObject().m59331xcb21161d()) {
            java.lang.String n17 = abstractC14490x69736cb5.n();
            if (i17 == 1) {
                g1Var.a().c(new mn2.n(n17, null, 2, null), imageView, g1Var.h(mn2.f1.f411490h));
            } else {
                g1Var.l().c(new mn2.n(n17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.X), imageView, g1Var.h(mn2.f1.f411494o));
            }
            textView.setText(abstractC14490x69736cb5.getFeedObject().getNickNameSpan());
            return;
        }
        android.content.Context context = s0Var.f374654e;
        if (i17 == 2) {
            ng5.a.a(imageView, c01.z1.r());
        } else {
            ya2.g gVar = ya2.h.f542017a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            ya2.b2 b17 = gVar.b(xy2.c.e(context));
            g1Var.a().c(new mn2.n(b17 != null ? b17.m176700xe5e0d2a0() : "", null, 2, null), imageView, g1Var.h(mn2.f1.f411490h));
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String b18 = hc2.t.b(context, i17);
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, b18));
    }

    public abstract void s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var);

    /* JADX WARN: Removed duplicated region for block: B:50:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r19, in5.s0 r20) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mo2.q.t(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0):void");
    }

    public final void u(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MemberCommonConvert.kt", "showAction id=%s", pm0.v.u(feed.getFeedObject().m59251x5db1b11()));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.c cVar = this.f411921e;
        k0Var.f293405n = cVar != null ? cVar.Y(feed, k0Var) : null;
        k0Var.f293414s = cVar != null ? cVar.c4(feed, holder) : null;
        k0Var.v();
    }

    public final void v(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var, android.widget.TextView textView, android.view.View view, int i17) {
        int size = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76759x57341267().size();
        int i18 = this.f411928o;
        if (i17 > size) {
            if (abstractC14490x69736cb5.getFeedObject().m59338xecb5e178()) {
                textView.setText(s0Var.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lvx, java.lang.Integer.valueOf(i17)));
            } else {
                textView.setText(s0Var.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m9l, java.lang.Integer.valueOf(i17)));
            }
            textView.setVisibility(0);
            if (abstractC14490x69736cb5.getFeedObject().getFeedObject().m76759x57341267().isEmpty()) {
                textView.setPadding(textView.getPaddingLeft(), i18, textView.getPaddingRight(), textView.getPaddingBottom());
            } else {
                textView.setPadding(textView.getPaddingLeft(), 0, textView.getPaddingRight(), textView.getPaddingBottom());
            }
            view.setPadding(textView.getPaddingLeft(), textView.getPaddingLeft(), textView.getPaddingRight(), this.f411929p);
        } else {
            view.setPadding(textView.getPaddingLeft(), textView.getPaddingLeft(), textView.getPaddingRight(), i18);
            textView.setVisibility(8);
        }
        textView.setOnClickListener(new mo2.n(this, abstractC14490x69736cb5, s0Var));
    }
}
