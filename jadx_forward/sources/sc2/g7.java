package sc2;

/* loaded from: classes2.dex */
public final class g7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.r7 f487450f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(in5.s0 s0Var, java.lang.String str, sc2.r7 r7Var) {
        super(1);
        this.f487448d = s0Var;
        this.f487449e = str;
        this.f487450f = r7Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        ad2.h observer = (ad2.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        in5.s0 s0Var = this.f487448d;
        java.lang.Object obj2 = s0Var.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj2 : null;
        if (abstractC14490x69736cb52 != null && hc2.o0.D(abstractC14490x69736cb52.getFeedObject().getFeedObject(), false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", "onJumpViewFocus feedId=" + pm0.v.u(abstractC14490x69736cb52.mo2128x1ed62e84()) + ", source=" + this.f487449e);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("hasObserver", java.lang.String.valueOf(true));
            xc2.p0 p0Var = observer.f84680h;
            xc2.o0 o0Var = p0Var != null ? p0Var.f534779h : null;
            xc2.n0 n0Var = o0Var instanceof xc2.n0 ? (xc2.n0) o0Var : null;
            long j17 = n0Var != null ? n0Var.f534763i : 0L;
            long mo2128x1ed62e84 = (p0Var == null || (abstractC14490x69736cb5 = p0Var.f534777f) == null) ? 0L : abstractC14490x69736cb5.mo2128x1ed62e84();
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1 p1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1.class);
            if (p1Var != null) {
                str = "getContext(...)";
                p1Var.O6(mo2128x1ed62e84, "onJumpViewFocus", jSONObject, j17);
            } else {
                str = "getContext(...)";
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            int m75939xb282bd08 = nyVar != null ? nyVar.V6().m75939xb282bd08(5) : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m1.f216642d.a();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feed = abstractC14490x69736cb52.getFeedObject().getFeedObject();
            a17.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m1.f216643e.contains(java.lang.Integer.valueOf(m75939xb282bd08))) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1) a17.f216645a.get(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k1(feed.m76784x5db1b11(), m75939xb282bd08));
                if (j1Var == null || j1Var.f216327f < 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdTraceMgr", "onFeedFocused return! focus without consume and dispatch, commentScene=" + m75939xb282bd08 + " feedId=" + pm0.v.u(feed.m76784x5db1b11()));
                } else {
                    j1Var.f216327f = 3;
                    j1Var.f216330i = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdTraceMgr", "onFeedFocused dispatchFeed=" + j1Var + " [focus-consume]=" + (j1Var.f216330i - j1Var.f216329h) + "ms");
                }
            }
        }
        xc2.p0 p0Var2 = observer.f84680h;
        android.view.View view = observer.f84676d;
        java.lang.String str2 = this.f487449e;
        if (p0Var2 != null && view != null) {
            s0Var.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.eid, java.lang.Boolean.TRUE);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onJumpViewFocus source=");
            sb6.append(str2);
            sb6.append(", feedId=");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = p0Var2.f534777f;
            sb6.append(pm0.v.u(abstractC14490x69736cb53 != null ? abstractC14490x69736cb53.mo2128x1ed62e84() : 0L));
            sb6.append(" appearConditionType=");
            sb6.append(p0Var2.B);
            sb6.append(" isRealShow=");
            sc2.q8 q8Var = p0Var2.f534766J;
            sb6.append(q8Var != null && q8Var.f487710a);
            sb6.append(" delayAppearMs=");
            sb6.append(p0Var2.f534791t);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", sb6.toString());
            int i17 = p0Var2.B;
            if (i17 == 0) {
                sc2.q8 q8Var2 = p0Var2.f534766J;
                if (q8Var2 != null && q8Var2.f487710a) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onJumpViewFocus source=");
                    sb7.append(str2);
                    sb7.append(", feedId=");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb54 = p0Var2.f534777f;
                    sb7.append(pm0.v.u(abstractC14490x69736cb54 != null ? abstractC14490x69736cb54.mo2128x1ed62e84() : 0L));
                    sb7.append(" not need delay, just show");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", sb7.toString());
                    ad2.k.b(observer, s0Var, view, p0Var2, false, null, 16, null);
                } else {
                    long j18 = p0Var2.f534791t;
                    if (j18 > 0) {
                        long uptimeMillis = j18 + android.os.SystemClock.uptimeMillis();
                        sc2.r7 r7Var = this.f487450f;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = r7Var.f487742e;
                        java.lang.Object obj3 = p0Var2.f534775e;
                        n3Var.mo50302x6b17ad39(obj3);
                        r7Var.f487742e.mo50296x41bd0e60(new sc2.f7(p0Var2, observer, s0Var, view, str2), obj3, uptimeMillis);
                        p0Var2.A = true;
                    } else {
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onJumpViewFocus source=");
                        sb8.append(str2);
                        sb8.append(", feedId=");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb55 = p0Var2.f534777f;
                        sb8.append(pm0.v.u(abstractC14490x69736cb55 != null ? abstractC14490x69736cb55.mo2128x1ed62e84() : 0L));
                        sb8.append(" not need delay, just show");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", sb8.toString());
                        ad2.k.b(observer, s0Var, view, p0Var2, false, null, 16, null);
                    }
                }
            } else {
                sc2.q8 q8Var3 = p0Var2.f534766J;
                if ((q8Var3 != null && q8Var3.f487710a) && i17 != 2) {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("onJumpViewFocus source=");
                    sb9.append(str2);
                    sb9.append(", feedId=");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb56 = p0Var2.f534777f;
                    sb9.append(pm0.v.u(abstractC14490x69736cb56 != null ? abstractC14490x69736cb56.mo2128x1ed62e84() : 0L));
                    sb9.append(" not need delay, just show");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", sb9.toString());
                    ad2.k.b(observer, s0Var, view, p0Var2, false, null, 16, null);
                }
            }
            observer.v(s0Var, view, p0Var2);
        }
        return jz5.f0.f384359a;
    }
}
