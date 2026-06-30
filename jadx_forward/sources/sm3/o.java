package sm3;

/* loaded from: classes10.dex */
public final class o extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final sm3.f f491429d;

    /* renamed from: e, reason: collision with root package name */
    public final sm3.h f491430e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f491431f;

    public o(sm3.f callback, sm3.h provider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        this.f491429d = callback;
        this.f491430e = provider;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f491430e.mo67409x317d5b7e().size() + 3;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (i17 == 0) {
            return 1;
        }
        sm3.h hVar = this.f491430e;
        if (i17 == hVar.mo67409x317d5b7e().size() + 1) {
            return 4;
        }
        return i17 == hVar.mo67409x317d5b7e().size() + 2 ? 3 : 2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        boolean z17 = holder instanceof sm3.n;
        sm3.h hVar = this.f491430e;
        if (!z17) {
            if (!(holder instanceof sm3.g)) {
                if (holder instanceof sm3.i) {
                    sm3.i iVar = (sm3.i) holder;
                    android.view.View view = iVar.f3639x46306858;
                    android.view.ViewGroup viewGroup = iVar.f491408d;
                    view.setLayoutParams(new android.view.ViewGroup.LayoutParams(viewGroup.getWidth() / 2, (viewGroup.getHeight() - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom()));
                    return;
                }
                return;
            }
            sm3.g gVar = (sm3.g) holder;
            int mo67405x2a6997fd = hVar.getDraggingIndex() == -1 ? hVar.mo67405x2a6997fd() : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvTracksAdapter", "filling " + mo67405x2a6997fd);
            android.view.View view2 = gVar.f3639x46306858;
            android.view.ViewGroup viewGroup2 = gVar.f491394d;
            view2.setLayoutParams(new android.view.ViewGroup.LayoutParams(mo67405x2a6997fd, (viewGroup2.getHeight() - viewGroup2.getPaddingTop()) - viewGroup2.getPaddingBottom()));
            return;
        }
        sm3.n nVar = (sm3.n) holder;
        kp4.a trackInfo = (kp4.a) hVar.mo67409x317d5b7e().get(i17 - 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trackInfo, "trackInfo");
        int i18 = nVar.i();
        android.view.View view3 = nVar.f3639x46306858;
        sm3.o oVar = nVar.f491428g;
        view3.setOnClickListener(new sm3.k(trackInfo, oVar, i18, nVar));
        qm3.i thumbLoader = oVar.f491430e.getThumbLoader();
        if (thumbLoader != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16707x92645a7 c16707x92645a7 = nVar.f491425d;
            c16707x92645a7.getClass();
            c16707x92645a7.f233538e = trackInfo;
            c16707x92645a7.f233539f = thumbLoader;
            int i19 = trackInfo.f392604a;
            android.graphics.Rect rect = c16707x92645a7.f233541h;
            rect.right = i19;
            rect.bottom = trackInfo.f392605b;
            float d17 = (i19 * trackInfo.f392609f) / ((float) trackInfo.d());
            c16707x92645a7.m67401x63d7833c((int) (((float) trackInfo.f392607d) * d17));
            c16707x92645a7.m67400x23443635((int) (d17 * ((float) trackInfo.f392608e)));
            p3325xe03a0797.p3326xc267989b.r2 r2Var = c16707x92645a7.f233540g;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            c16707x92645a7.f233540g = p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new sm3.b(thumbLoader, trackInfo, c16707x92645a7, null), 2, null);
        }
        int i27 = nVar.i();
        sm3.h hVar2 = oVar.f491430e;
        boolean z18 = i27 == hVar2.mo67409x317d5b7e().size() - 1;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        if (!z18 || hVar2.mo67405x2a6997fd() > 0) {
            f0Var.f391649d += hVar2.getSpaceSize();
        }
        boolean z19 = i18 == hVar2.getSelectedIndex();
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16709x6913f423 c16709x6913f423 = nVar.f491426e;
        c16709x6913f423.m67424x37bd608(z19);
        c16709x6913f423.m67428x17db17d9(((int) (((float) trackInfo.d()) * hVar2.mo67411xf6b910ea())) - f0Var.f391649d);
        c16709x6913f423.m67429x24915916(((int) (2000 * hVar2.mo67411xf6b910ea())) - f0Var.f391649d);
        c16709x6913f423.m67431x53b68520((int) (((float) trackInfo.f392607d) * hVar2.mo67411xf6b910ea()));
        if (hVar2.getDraggingIndex() != -1) {
            c16709x6913f423.m67426xca026119(trackInfo.f392604a);
        } else {
            c16709x6913f423.m67426xca026119(((int) (((float) trackInfo.f392608e) * hVar2.mo67411xf6b910ea())) - f0Var.f391649d);
        }
        c16709x6913f423.m67427x4d528939(i18 == 0);
        c16709x6913f423.m67425x6c4ebec7(new sm3.m(oVar, i18, f0Var, nVar));
        if (i18 == hVar2.getDraggingIndex()) {
            android.view.View view4 = nVar.f491427f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/widget/MvTracksAdapter$TrackViewHolder", "bind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/mv/ui/widget/MvTracksAdapter$TrackViewHolder", "bind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view5 = nVar.f491427f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/widget/MvTracksAdapter$TrackViewHolder", "bind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/mv/ui/widget/MvTracksAdapter$TrackViewHolder", "bind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvTracksAdapter", "bind[" + nVar.i() + "]: time=" + trackInfo.f392613j + ", duration=" + (trackInfo.f392608e - trackInfo.f392607d) + ", width=" + (c16709x6913f423.getEnd() - c16709x6913f423.getStart()) + ", clipWidth=" + f0Var.f391649d);
        nVar.f3639x46306858.requestLayout();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 1 || i17 == 3) {
            return new sm3.i(parent);
        }
        if (i17 == 4) {
            return new sm3.g(parent);
        }
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c4y, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new sm3.n(this, inflate);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewRecycled */
    public void mo8162x34789575(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        qm3.i iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8162x34789575(holder);
        if (holder instanceof sm3.n) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16707x92645a7 c16707x92645a7 = ((sm3.n) holder).f491425d;
            kp4.a aVar = c16707x92645a7.f233538e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvFrameListView", aVar + " stop");
            if (aVar != null && (iVar = c16707x92645a7.f233539f) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThumbCachedLoader", "stop " + aVar);
                qm3.a a17 = iVar.a(aVar);
                a17.f446293b.clear();
                a17.f446294c.clear();
                p3325xe03a0797.p3326xc267989b.r2 r2Var = a17.f446297f;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                a17.f446297f = null;
                rm5.k kVar = a17.f446292a;
                if (kVar != null) {
                    kVar.mo122875x5cd39ffa();
                }
                a17.f446292a = null;
            }
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = c16707x92645a7.f233540g;
            if (r2Var2 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
            }
            c16707x92645a7.f233540g = null;
        }
    }
}
