package ve2;

/* loaded from: classes3.dex */
public final class c implements ve2.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f517622d;

    /* renamed from: e, reason: collision with root package name */
    public ve2.b f517623e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f517624f;

    public c(android.view.View viewRoot, android.content.Context context, gk2.e liveData, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l plugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewRoot, "viewRoot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f517622d = viewRoot;
        this.f517624f = new java.util.ArrayList();
    }

    public final void c() {
        ve2.b bVar = this.f517623e;
        if (bVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1537x5c512bd.C14375x1f466727 c14375x1f466727 = ((ve2.d) bVar).f517626e;
            if (c14375x1f466727 != null) {
                c14375x1f466727.setVisibility(8);
            }
            if (c14375x1f466727 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoGroupView", "#reset");
                p3325xe03a0797.p3326xc267989b.r2 r2Var = c14375x1f466727.f197842e;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                ((java.util.ArrayList) c14375x1f466727.f197844g).clear();
                c14375x1f466727.f197845h = null;
                c14375x1f466727.f197843f.removeAllViews();
                c14375x1f466727.f197846i = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if ((((p3325xe03a0797.p3326xc267989b.a) r11).a() ^ true) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(java.util.List r11) {
        /*
            r10 = this;
            java.lang.String r0 = "#updateBubbleInfo"
            java.lang.String r1 = "FinderLiveLogoPresenter"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            if (r11 == 0) goto L78
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L10
            goto L78
        L10:
            r10.f517624f = r11
            ve2.b r0 = r10.f517623e
            if (r0 == 0) goto L77
            ve2.d r0 = (ve2.d) r0
            boolean r1 = r11.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L77
            r1 = 0
            com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView r0 = r0.f517626e
            if (r0 == 0) goto L71
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "#render taskInfo size: "
            r3.<init>(r4)
            int r4 = r11.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FinderLiveLogoGroupView"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r3)
            java.util.List r3 = r0.f197844g
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
            r3.addAll(r11)
            kotlinx.coroutines.r2 r11 = r0.f197842e
            if (r11 == 0) goto L58
            kotlinx.coroutines.a r11 = (p3325xe03a0797.p3326xc267989b.a) r11
            boolean r11 = r11.a()
            r11 = r11 ^ r2
            if (r11 != r2) goto L55
            r11 = r2
            goto L56
        L55:
            r11 = r1
        L56:
            if (r11 == 0) goto L71
        L58:
            kotlinx.coroutines.r2 r11 = r0.f197842e
            r3 = 0
            if (r11 == 0) goto L60
            p3325xe03a0797.p3326xc267989b.p2.a(r11, r3, r2, r3)
        L60:
            kotlinx.coroutines.y0 r4 = r0.f197841d
            r5 = 0
            r6 = 0
            dm2.b r7 = new dm2.b
            r7.<init>(r0, r3)
            r8 = 3
            r9 = 0
            kotlinx.coroutines.r2 r11 = p3325xe03a0797.p3326xc267989b.l.d(r4, r5, r6, r7, r8, r9)
            r0.f197842e = r11
        L71:
            if (r0 != 0) goto L74
            goto L77
        L74:
            r0.setVisibility(r1)
        L77:
            return
        L78:
            kz5.p0 r11 = kz5.p0.f395529d
            r10.f517624f = r11
            r10.c()
            java.lang.String r11 = "#updateBubbleInfo data is null, return"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve2.c.f(java.util.List):void");
    }

    @Override // fs2.a
    /* renamed from: onAttach */
    public void mo56536x3b13c504(java.lang.Object obj) {
        ve2.b callback = (ve2.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f517623e = callback;
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        c();
    }
}
