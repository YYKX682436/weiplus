package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class xc extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0 implements zy2.b7 {

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f217970t = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final so2.c f217971f;

    /* renamed from: g, reason: collision with root package name */
    public long f217972g;

    /* renamed from: h, reason: collision with root package name */
    public long f217973h;

    /* renamed from: i, reason: collision with root package name */
    public long f217974i;

    /* renamed from: m, reason: collision with root package name */
    public long f217975m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f217976n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f217977o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 f217978p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 f217979q;

    /* renamed from: r, reason: collision with root package name */
    public int f217980r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f217981s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f217971f = so2.c.f491812f;
        this.f217977o = new java.util.LinkedHashMap();
        this.f217981s = ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.L0().r()).booleanValue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void Q6(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 animationType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationType, "animationType");
        g7(holder);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public android.view.View R6(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (!this.f217981s) {
            return holder.p(com.p314xaae8f345.mm.R.id.ehc);
        }
        bw2.o oVar = bw2.o.f106402a;
        return ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f106407f).mo141623x754a37bb()).mo146xb9724478(holder)).a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public so2.c S6() {
        return this.f217971f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void W6(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (!this.f217981s) {
            super.W6(holder);
            return;
        }
        bw2.o oVar = bw2.o.f106402a;
        android.view.View b17 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f106407f).mo141623x754a37bb()).mo146xb9724478(holder)).b();
        if (b17 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedHotCommentUIC", "hideWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedHotCommentUIC", "hideWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public boolean X6(in5.s0 holder, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return this.f217981s ? d7(holder) : d7(holder) && R6(holder) != null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void Z6(in5.s0 holder, boolean z17, long j17, long j18) {
        android.view.View b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (z17) {
            if (this.f217973h == j17) {
                i7(j17, 1);
            }
            boolean booleanValue = ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.L0().r()).booleanValue();
            this.f217981s = booleanValue;
            if (booleanValue) {
                bw2.o oVar = bw2.o.f106402a;
                b17 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f106407f).mo141623x754a37bb()).mo146xb9724478(holder)).b();
            } else {
                b17 = R6(holder);
            }
            if (b17 != null && b17.getVisibility() == 0) {
                g7(holder);
                return;
            }
            this.f217973h = 0L;
            this.f217974i = 0L;
            this.f217975m = 0L;
            this.f217972g = 0L;
            this.f217976n = false;
            this.f217980r = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0131, code lost:
    
        if (((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).sj(r6.m76102x6c03c64c()) != false) goto L49;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c7(in5.s0 r18) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xc.c7(in5.s0):void");
    }

    public final boolean d7(in5.s0 s0Var) {
        java.lang.Object obj = s0Var.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 == null) {
            return false;
        }
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(((jz5.l) f7(abstractC14490x69736cb5.mo2128x1ed62e84()).mo3195x754a37bb()) != null ? (java.util.LinkedList) r5.f384366d : null);
    }

    public final void e7(long j17) {
        f217970t.remove(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var = this.f217979q;
        if (l0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.f189659h, "removeCache feedId=" + j17);
            l0Var.f189667s.remove(java.lang.Long.valueOf(j17));
            bu2.n.f106083a.d(j17);
        }
    }

    public final p012xc85e97e9.p093xedfae76a.j0 f7(long j17) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f217970t;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new p012xc85e97e9.p093xedfae76a.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (p012xc85e97e9.p093xedfae76a.j0) obj;
    }

    public final void g7(in5.s0 s0Var) {
        java.util.LinkedList linkedList;
        java.lang.Object obj = s0Var.f374658i;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 == null) {
            return;
        }
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(abstractC14490x69736cb5.getFeedObject().m59264x7efe73ec());
        long m75942xfb822ef2 = (mb4Var != null ? mb4Var.m75942xfb822ef2(24) : 0L) / 1000;
        this.f217973h = abstractC14490x69736cb5.mo2128x1ed62e84();
        jz5.l lVar = (jz5.l) f7(abstractC14490x69736cb5.mo2128x1ed62e84()).mo3195x754a37bb();
        if (lVar != null && (linkedList = (java.util.LinkedList) lVar.f384366d) != null) {
            c19781xd1c47b87 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) kz5.n0.Z(linkedList);
        }
        this.f217978p = c19781xd1c47b87;
        this.f217974i = c19781xd1c47b87 != null ? c19781xd1c47b87.m76058xa6514d24() : 0L;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b872 = this.f217978p;
        this.f217980r = c19781xd1c47b872 != null ? c19781xd1c47b872.m76062x928789b6() : 0;
        this.f217975m = m75942xfb822ef2;
        this.f217972g = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedHotCommentUIC", "hotcomment is expose, showingFeedId = " + this.f217973h + " startExposeTime = " + this.f217972g + " showingCommentId = " + this.f217974i + " showingDuration = " + this.f217975m);
    }

    public final void h7() {
        this.f217972g = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedHotCommentUIC", "hotcomment is expose, showingFeedId = " + this.f217973h + " startExposeTime = " + this.f217972g + " showingCommentId = " + this.f217974i + " showingDuration = " + this.f217975m);
    }

    public final void i7(long j17, int i17) {
        if (j17 == 0) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.lang.Object obj = ((java.util.LinkedHashMap) this.f217977o).get(java.lang.Long.valueOf(j17));
        if (obj == null) {
            obj = 0L;
        }
        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
        long j18 = this.f217974i;
        ((m30.m) rVar).getClass();
        jSONObject2.put("cid", b52.b.q(j18));
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        jSONObject2.put("feedid", b52.b.q(j17));
        jSONObject2.put("current_play_sec", obj);
        jSONObject2.put("video_duration", this.f217975m);
        jSONObject2.put("expose_start_time", this.f217972g);
        jSONObject2.put("expose_end_time", java.lang.System.currentTimeMillis());
        jSONObject2.put("expose_end_type", i17);
        jSONObject2.put(ya.b.f77470xbd76cf60, this.f217980r);
        jSONObject.put("hot_comment", jSONObject2);
        k7(jSONObject2);
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a, nyVar != null ? nyVar.V6() : null, "hot_comment", 0, jSONObject, false, null, 48, null);
    }

    public final void k7(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = this.f217978p;
        int m76071x9ca513a0 = c19781xd1c47b87 != null ? c19781xd1c47b87.m76071x9ca513a0() : 0;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b872 = this.f217978p;
        int m76068x3ffea218 = c19781xd1c47b872 != null ? c19781xd1c47b872.m76068x3ffea218() : 0;
        int i17 = (m76068x3ffea218 & 512) != 0 ? 1 : 0;
        jSONObject.put("if_finder_reply", i17);
        jSONObject.put("reply_cnt", m76071x9ca513a0);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b873 = this.f217978p;
        jSONObject.put("like_cnt", c19781xd1c47b873 != null ? c19781xd1c47b873.m76080xf4204902() : 0);
        if (i17 != 0) {
            jSONObject.put("overt_type", 1);
        } else if (m76071x9ca513a0 > 0) {
            jSONObject.put("overt_type", 2);
        } else {
            jSONObject.put("overt_type", 3);
        }
        if (hc2.c0.c(m76068x3ffea218)) {
            jSONObject.put("comment_prefix", 3);
            return;
        }
        if ((m76068x3ffea218 & 1024) != 0) {
            jSONObject.put("comment_prefix", 1);
        } else {
            jSONObject.put("comment_prefix", 2);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        long j17 = this.f217973h;
        if (j17 != 0) {
            e7(j17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        long j17 = this.f217973h;
        if (j17 != 0) {
            i7(j17, 1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (this.f217973h != 0) {
            h7();
        }
    }
}
