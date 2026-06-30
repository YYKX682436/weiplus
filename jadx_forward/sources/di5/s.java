package di5;

/* loaded from: classes12.dex */
public final class s extends pf3.g implements fg3.a {

    /* renamed from: v, reason: collision with root package name */
    public t40.d f314343v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f314344w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f314345x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(mf3.p apiCenter) {
        super(apiCenter, "MediaGallery.FinderPostVideoBottomBarLayer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        this.f314344w = "";
        this.f314345x = "";
    }

    public static final void g0(di5.s sVar, java.lang.String clickId) {
        jz5.l h07;
        ml2.t1 t1Var;
        sVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportReplayHighlightsClick: clickId: ");
        sb6.append(clickId);
        sb6.append(" clipId: ");
        sb6.append(sVar.f314344w);
        sb6.append(" liveId: ");
        sb6.append(sVar.f314345x);
        sb6.append(",scene: ");
        t40.d dVar = sVar.f314343v;
        sb6.append(dVar != null ? dVar.name() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderPostVideoBottomBarLayer", sb6.toString());
        if (sVar.f314344w.length() == 0) {
            return;
        }
        if ((sVar.f314345x.length() == 0) || (h07 = sVar.h0()) == null) {
            return;
        }
        int intValue = ((java.lang.Number) h07.f384366d).intValue();
        java.lang.Integer num = (java.lang.Integer) h07.f384367e;
        zy2.ac acVar = (zy2.ac) i95.n0.c(zy2.ac.class);
        java.lang.String clipId = sVar.f314344w;
        java.lang.String liveId = sVar.f314345x;
        ((ml2.l0) acVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickId, "clickId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipId, "clipId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveId, "liveId");
        ml2.t1[] m147729xcee59d22 = ml2.t1.m147729xcee59d22();
        int length = m147729xcee59d22.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                t1Var = null;
                break;
            }
            ml2.t1 t1Var2 = m147729xcee59d22[i17];
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(t1Var2.f409546d, clickId)) {
                t1Var = t1Var2;
                break;
            }
            i17++;
        }
        if (t1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveReplayHighlightsReportUtil", "elementClickId is null");
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("live_id", liveId);
        if (intValue == 2) {
            linkedHashMap.put("lianmai_replay_id", clipId);
        } else if (intValue != 3) {
            linkedHashMap.put("clip_id", clipId);
        } else {
            linkedHashMap.put("sing_replay_id", clipId);
        }
        linkedHashMap.put(ya.b.f77470xbd76cf60, java.lang.String.valueOf(intValue));
        if (num != null) {
            linkedHashMap.put("source_type", num.toString());
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, t1Var, linkedHashMap, null, "378", null, null, false, 52, null);
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        super.F();
        i0("live_playback_high_clip_save");
        i0("live_playback_high_clip_share");
        i0("live_playback_high_clip_publish");
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ejf, (android.view.ViewGroup) null);
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2549xbc1609e9.C20473x21afd34e()) == 1) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.bhi)).setImageResource(com.p314xaae8f345.mm.R.raw.f79963x411ef6b4);
        }
        ((android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.b0y)).setVisibility(8);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.smw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(frameLayout, "getBtnSave(...)");
        pf3.d.U(this, frameLayout, null, new di5.p(this), 1, null);
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565038sn0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(frameLayout2, "getBtnShare(...)");
        pf3.d.U(this, frameLayout2, null, new di5.q(this), 1, null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.tzi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linearLayout, "getGalleryFinderPostBtn(...)");
        pf3.d.U(this, linearLayout, null, new di5.r(this), 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // fg3.a
    public void b() {
    }

    public final jz5.l h0() {
        int i17;
        t40.d dVar = this.f314343v;
        int i18 = dVar == null ? -1 : di5.o.f314339a[dVar.ordinal()];
        java.lang.Integer num = null;
        if (i18 == 1) {
            i17 = 1;
        } else if (i18 == 2) {
            i17 = 2;
            num = 1;
        } else if (i18 == 3) {
            i17 = 2;
            num = 2;
        } else if (i18 == 4) {
            i17 = 3;
            num = 1;
        } else {
            if (i18 != 5) {
                return null;
            }
            i17 = 3;
            num = 2;
        }
        return new jz5.l(i17, num);
    }

    public final void i0(java.lang.String clickId) {
        jz5.l h07;
        ml2.u1 u1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportReplayHighlightsExpose: clickId: ");
        sb6.append(clickId);
        sb6.append(" clipId: ");
        sb6.append(this.f314344w);
        sb6.append(" liveId: ");
        sb6.append(this.f314345x);
        sb6.append(",scene: ");
        t40.d dVar = this.f314343v;
        sb6.append(dVar != null ? dVar.name() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderPostVideoBottomBarLayer", sb6.toString());
        if (this.f314344w.length() == 0) {
            return;
        }
        if ((this.f314345x.length() == 0) || (h07 = h0()) == null) {
            return;
        }
        int intValue = ((java.lang.Number) h07.f384366d).intValue();
        java.lang.Integer num = (java.lang.Integer) h07.f384367e;
        zy2.ac acVar = (zy2.ac) i95.n0.c(zy2.ac.class);
        java.lang.String clipId = this.f314344w;
        java.lang.String liveId = this.f314345x;
        ((ml2.l0) acVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickId, "clickId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipId, "clipId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveId, "liveId");
        ml2.u1[] m147745xcee59d22 = ml2.u1.m147745xcee59d22();
        int length = m147745xcee59d22.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                u1Var = null;
                break;
            }
            ml2.u1 u1Var2 = m147745xcee59d22[i17];
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(u1Var2.f409641d, clickId)) {
                u1Var = u1Var2;
                break;
            }
            i17++;
        }
        if (u1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveReplayHighlightsReportUtil", "elementExposeId is null");
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("live_id", liveId);
        if (intValue == 2) {
            linkedHashMap.put("lianmai_replay_id", clipId);
        } else if (intValue != 3) {
            linkedHashMap.put("clip_id", clipId);
        } else {
            linkedHashMap.put("sing_replay_id", clipId);
        }
        linkedHashMap.put(ya.b.f77470xbd76cf60, java.lang.String.valueOf(intValue));
        if (num != null) {
            linkedHashMap.put("source_type", num.toString());
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, u1Var, linkedHashMap, null, "378", null, null, false, 52, null);
    }

    @Override // mf3.l
    /* renamed from: onResume */
    public void mo124474x57429eec() {
        e0();
        i0("live_playback_high_clip_save");
        i0("live_playback_high_clip_share");
        i0("live_playback_high_clip_publish");
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindContext, "bindContext");
        super.t(bindContext);
        mf3.s sVar = this.f407643m;
        mf3.k kVar = sVar != null ? sVar.f407650a : null;
        ci5.e eVar = kVar instanceof ci5.e ? (ci5.e) kVar : null;
        if (eVar != null) {
            this.f314343v = eVar.f123259b.f497007h;
            com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.api.p745xc4aaf986.C10598x47b4a646 c10598x47b4a646 = eVar.f123258a;
            this.f314344w = c10598x47b4a646.f148137e;
            this.f314345x = c10598x47b4a646.f148141i;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bind: ");
        t40.d dVar = this.f314343v;
        sb6.append(dVar != null ? dVar.name() : null);
        sb6.append(" clipId: ");
        sb6.append(this.f314344w);
        sb6.append(" liveId: ");
        sb6.append(this.f314345x);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderPostVideoBottomBarLayer", sb6.toString());
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        super.u(parentView);
    }
}
