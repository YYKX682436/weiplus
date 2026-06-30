package xx0;

/* loaded from: classes5.dex */
public final class t extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final xx0.i f539471d;

    /* renamed from: e, reason: collision with root package name */
    public final xx0.j f539472e;

    /* renamed from: f, reason: collision with root package name */
    public final yo0.i f539473f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f539474g;

    /* renamed from: h, reason: collision with root package name */
    public xx0.u f539475h;

    /* renamed from: i, reason: collision with root package name */
    public vt3.r f539476i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f539477m;

    public t(xx0.i dataProvider, xx0.j jVar) {
        java.lang.String M;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataProvider, "dataProvider");
        this.f539471d = dataProvider;
        this.f539472e = jVar;
        yo0.f fVar = new yo0.f();
        fVar.f545611b = true;
        fVar.f545610a = true;
        this.f539473f = fVar.a();
        this.f539474g = new java.util.ArrayList();
        xx0.u uVar = null;
        if (jVar != null && (M = ((mx0.x7) jVar).f413968a.f151090v.M()) != null) {
            uVar = new xx0.u(M, null);
        }
        this.f539475h = uVar;
    }

    public final void B(int i17) {
        vt3.r rVar = this.f539476i;
        long j17 = rVar != null ? rVar.f521572a : 0L;
        vt3.p pVar = (vt3.p) kz5.n0.a0(this.f539474g, i17);
        if (pVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TemplateTabPageView", "onTemplateVisible: template is invalid at: " + i17);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTemplateVisibleAt: ");
        sb6.append(i17);
        sb6.append(", tabID: ");
        sb6.append(j17);
        sb6.append(", templateID: ");
        java.lang.String templateID = pVar.f521553b;
        sb6.append(templateID);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateTabPageView", sb6.toString());
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        m7Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateID, "templateID");
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.l6(m7Var, templateID, null), 3, null);
        java.util.Map Ai = m7Var.Ai();
        Ai.put("template_id", templateID);
        Ai.put("template_tab_id", java.lang.Long.valueOf(j17));
        Ai.put("template_position", java.lang.Integer.valueOf(i17 + 1));
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = pVar.f521559h;
            if (gVar != null) {
                java.lang.String encodeToString = android.util.Base64.encodeToString(gVar.f273689a, 2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "encodeToString(...)");
                Ai.put("template_session_buffer", encodeToString);
            } else {
                Ai.put("template_session_buffer", "");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TemplateTabPageView", "encodeToString templateSessionBuffer exception: " + e17);
            Ai.put("template_session_buffer", "");
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(templateID, "kEmptyTemplateId")) {
            Ai.put("template_type", 4);
        } else {
            Ai.put("template_type", 3);
        }
        Ai.put("template_is_favorite", java.lang.Boolean.valueOf(pVar.f521560i));
        Ai.put("template_is_aigc", java.lang.Boolean.valueOf(pVar.f521564m));
        Ai.put("view_id", "sc_template_expose");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("sc_template_expose", null, Ai, 6, false);
    }

    public final void E(vt3.p pVar, xx0.q qVar) {
        xx0.u uVar = this.f539475h;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pVar.f521553b, uVar != null ? uVar.f539478a : null)) {
            android.view.View view = qVar.f539465g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            qVar.f539464f.setVisibility(8);
            android.view.View view2 = qVar.f539466h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = qVar.f539463e;
            textView.setTextColor(textView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30, null));
            return;
        }
        if (uVar.f539479b != null) {
            android.view.View view3 = qVar.f539465g;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ProgressBar progressBar = qVar.f539464f;
            progressBar.setVisibility(0);
            progressBar.setProgress(uVar.f539479b.intValue());
        } else {
            android.view.View view4 = qVar.f539465g;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            qVar.f539464f.setVisibility(8);
        }
        android.view.View view5 = qVar.f539466h;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter", "updateSelectedStateUI", "(Lcom/tencent/mm/plugin/recordvideo/model/ImproveRecordMaasTemplateItem;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$TemplateViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView2 = qVar.f539463e;
        textView2.setTextColor(textView2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su, null));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f539474g).size() + 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return i17 == ((java.util.ArrayList) this.f539474g).size() ? 1 : 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 0) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571004dk4, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new xx0.q(inflate);
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("Unknown view type");
        }
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571005dk5, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        return new xx0.p(inflate2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r10.f512006e == true) goto L21;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(xx0.r r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = "holder"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            vt3.r r0 = r9.f539476i
            if (r0 != 0) goto La
            return
        La:
            long r4 = r0.f521572a
            boolean r1 = r10 instanceof xx0.q
            if (r1 == 0) goto L43
            java.util.List r0 = r9.f539474g
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r11)
            vt3.p r0 = (vt3.p) r0
            r7 = r10
            xx0.q r7 = (xx0.q) r7
            android.widget.TextView r1 = r7.f539463e
            java.lang.String r2 = r0.f521554c
            r1.setText(r2)
            vo0.e r1 = vo0.e.f520000a
            vo0.a r1 = vo0.e.f520001b
            java.lang.String r2 = r0.f521557f
            com.tencent.mm.ui.widget.MMRoundCornerImageView r3 = r7.f539462d
            yo0.i r6 = r9.f539473f
            r1.c(r2, r3, r6)
            android.view.View r10 = r10.f3639x46306858
            xx0.s r8 = new xx0.s
            r1 = r8
            r2 = r11
            r3 = r9
            r6 = r0
            r1.<init>(r2, r3, r4, r6)
            r10.setOnClickListener(r8)
            r9.E(r0, r7)
            goto Laf
        L43:
            xx0.i r10 = r9.f539471d
            r10.getClass()
            us2.u r11 = us2.u.f512081a
            int r10 = r10.f539436a
            long r1 = r0.f521572a
            vt3.n r11 = r0.f521574c
            java.lang.String r0 = "followContext"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r0)
            java.lang.Object r0 = us2.u.f512086f
            monitor-enter(r0)
            us2.d r3 = new us2.d     // Catch: java.lang.Throwable -> Lb0
            r3.<init>(r1, r11)     // Catch: java.lang.Throwable -> Lb0
            java.util.Map r11 = us2.u.f512088h     // Catch: java.lang.Throwable -> Lb0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> Lb0
            java.util.HashMap r11 = (java.util.HashMap) r11     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r10 = r11.get(r10)     // Catch: java.lang.Throwable -> Lb0
            java.util.Map r10 = (java.util.Map) r10     // Catch: java.lang.Throwable -> Lb0
            if (r10 == 0) goto L7f
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> Lb0
            us2.a r10 = (us2.a) r10     // Catch: java.lang.Throwable -> Lb0
            if (r10 == 0) goto L7f
            us2.b r10 = r10.f512001b     // Catch: java.lang.Throwable -> Lb0
            if (r10 == 0) goto L7f
            boolean r10 = r10.f512006e     // Catch: java.lang.Throwable -> Lb0
            r11 = 1
            if (r10 != r11) goto L7f
            goto L80
        L7f:
            r11 = 0
        L80:
            monitor-exit(r0)
            java.lang.String r10 = "MicroMsg.TemplateTabPageView"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "loadMoreTemplate: tabId: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ", reachEnd: "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r10, r0)
            java.util.List r10 = r9.f539474g
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r10 = r10.size()
            if (r10 <= 0) goto Laf
            if (r11 != 0) goto Laf
            yz5.a r10 = r9.f539477m
            if (r10 == 0) goto Laf
            r10.mo152xb9724478()
        Laf:
            return
        Lb0:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: xx0.t.mo864xe5e2e48d(xx0.r, int):void");
    }

    public final void y(java.lang.String templateId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        xx0.u uVar = this.f539475h;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uVar != null ? uVar.f539478a : null, templateId)) {
            this.f539475h = new xx0.u(templateId, null);
            java.util.Iterator it = ((java.util.ArrayList) this.f539474g).iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((vt3.p) it.next()).f521553b, templateId)) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 >= 0) {
                m8148xed6e4d18(i17, 0);
            }
        }
    }

    public final void z(int i17) {
        vt3.r rVar = this.f539476i;
        long j17 = rVar != null ? rVar.f521572a : 0L;
        vt3.p pVar = (vt3.p) kz5.n0.a0(this.f539474g, i17);
        if (pVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TemplateTabPageView", "onTemplateInvisible: template is invalid at: " + i17);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTemplateInvisibleAt: ");
        sb6.append(i17);
        sb6.append(", tabID: ");
        sb6.append(j17);
        sb6.append(", templateID: ");
        java.lang.String templateID = pVar.f521553b;
        sb6.append(templateID);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateTabPageView", sb6.toString());
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        m7Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateID, "templateID");
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.b6(m7Var, templateID, null), 3, null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        xx0.r holder = (xx0.r) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if (holder instanceof xx0.q) {
            if (payloads.isEmpty()) {
                mo864xe5e2e48d(holder, i17);
                return;
            } else {
                E((vt3.p) ((java.util.ArrayList) this.f539474g).get(i17), (xx0.q) holder);
                return;
            }
        }
        mo864xe5e2e48d(holder, i17);
    }
}
