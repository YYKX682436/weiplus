package mx0;

/* loaded from: classes5.dex */
public abstract class t9 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public int f413889d;

    /* renamed from: e, reason: collision with root package name */
    public final yo0.i f413890e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f413891f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f413892g;

    /* renamed from: h, reason: collision with root package name */
    public mx0.q9 f413893h;

    public t9(int i17) {
        this.f413889d = i17;
        yo0.f fVar = new yo0.f();
        fVar.f545611b = true;
        fVar.f545610a = true;
        this.f413890e = fVar.a();
        this.f413891f = new java.util.ArrayList();
    }

    public abstract java.lang.String B(int i17);

    public abstract boolean E(int i17);

    public abstract boolean I(int i17);

    public abstract com.p314xaae8f345.mm.p2495xc50a8b8b.g J(int i17);

    public void K(int i17, mx0.ba holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View view = holder.f413396h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapter", "onBindViewHolderUpdateSelection", "(ILcom/tencent/mm/mj_publisher/finder/shoot_composing/TemplateNormalViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapter", "onBindViewHolderUpdateSelection", "(ILcom/tencent/mm/mj_publisher/finder/shoot_composing/TemplateNormalViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.f413395g.setVisibility(8);
        holder.f413394f.setVisibility(8);
    }

    public void L(java.lang.String templateId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        mx0.q9 q9Var = this.f413893h;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(q9Var != null ? q9Var.f413802a : null, templateId)) {
            this.f413893h = null;
        }
        java.util.Iterator it = this.f413891f.iterator();
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
            m8148xed6e4d18(z(i17), mx0.r9.f413827d);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShootComposingImproveRecordMaasTemplateAdapter", "onTemplateDownloadFinished: templateId not found: ".concat(templateId));
        }
    }

    public final void M(int i17) {
        java.lang.String B = B(i17);
        if (B == null) {
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g J2 = J(i17);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        m7Var.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.l6(m7Var, B, null), 3, null);
        java.util.Map Ai = m7Var.Ai();
        Ai.put("template_id", B);
        Ai.put("template_tab_id", 0);
        Ai.put("template_position", java.lang.Integer.valueOf(i17));
        try {
            if (J2 != null) {
                java.lang.String encodeToString = android.util.Base64.encodeToString(J2.f273689a, 2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "encodeToString(...)");
                Ai.put("template_session_buffer", encodeToString);
            } else {
                Ai.put("template_session_buffer", "");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShootComposingImproveRecordMaasTemplateAdapter", "encodeToString templateSessionBuffer exception: " + e17);
            Ai.put("template_session_buffer", "");
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(B, "kEmptyTemplateId")) {
            Ai.put("template_type", 4);
        } else {
            Ai.put("template_type", 3);
        }
        Ai.put("template_is_favorite", java.lang.Boolean.valueOf(I(i17)));
        Ai.put("template_is_aigc", java.lang.Boolean.valueOf(E(i17)));
        Ai.put("view_id", "sc_template_expose");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("sc_template_expose", null, Ai, 6, false);
    }

    public void N(java.lang.String templateId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        if (this.f413893h != null) {
            L(templateId);
        }
        int i17 = 0;
        this.f413893h = new mx0.q9(templateId, 0);
        java.util.Iterator it = this.f413891f.iterator();
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
            m8148xed6e4d18(z(i17), mx0.r9.f413827d);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        mx0.ba holder = (mx0.ba) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        boolean isEmpty = payloads.isEmpty();
        android.widget.TextView textView = holder.f413394f;
        if (isEmpty) {
            mo864xe5e2e48d(holder, i17);
            holder.f3639x46306858.setContentDescription(textView.getText());
            return;
        }
        if (!payloads.contains(mx0.r9.f413827d)) {
            if (payloads.contains(mx0.r9.f413828e)) {
                K(i17, holder);
                return;
            }
            return;
        }
        mx0.q9 q9Var = this.f413893h;
        android.widget.ProgressBar progressBar = holder.f413395g;
        if (q9Var != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(q9Var.f413802a, holder.f413392d)) {
                android.view.View view = holder.f413396h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapter", "onBindViewHolderUpdateDownloadProgress", "(ILcom/tencent/mm/mj_publisher/finder/shoot_composing/TemplateNormalViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapter", "onBindViewHolderUpdateDownloadProgress", "(ILcom/tencent/mm/mj_publisher/finder/shoot_composing/TemplateNormalViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                progressBar.setVisibility(0);
                textView.setVisibility(8);
            }
        }
        android.view.View view2 = holder.f413396h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapter", "onBindViewHolderUpdateDownloadProgress", "(ILcom/tencent/mm/mj_publisher/finder/shoot_composing/TemplateNormalViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapter", "onBindViewHolderUpdateDownloadProgress", "(ILcom/tencent/mm/mj_publisher/finder/shoot_composing/TemplateNormalViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        progressBar.setVisibility(8);
        textView.setVisibility(8);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ddf, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new mx0.ba(inflate);
    }

    public final void x(int i17, mx0.ba holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        vt3.p pVar = (vt3.p) kz5.n0.a0(this.f413891f, i17);
        if (pVar == null) {
            return;
        }
        int z17 = z(i17);
        java.lang.String str = pVar.f521553b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        holder.f413392d = str;
        android.widget.TextView textView = holder.f413394f;
        java.lang.String str2 = pVar.f521554c;
        textView.setText(str2);
        java.lang.String str3 = pVar.f521557f;
        boolean z18 = str3.length() > 0;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = holder.f413393e;
        if (z18) {
            vo0.e.f520001b.c(str3, c22628xfde5d61d, this.f413890e);
        } else {
            c22628xfde5d61d.setImageBitmap(m95.a.a(c22628xfde5d61d.getContext().getResources(), com.p314xaae8f345.mm.R.raw.f79921xe8fe498f, 0.0f));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingImproveRecordMaasTemplateAdapter", "bindNormalTemplate onBindViewHolder >> " + i17 + ' ' + str3 + ", " + str2 + ' ' + holder.f413392d);
        holder.f3639x46306858.setOnClickListener(new mx0.s9(this, z17));
        K(z17, holder);
    }

    public abstract int y(int i17);

    public abstract int z(int i17);
}
