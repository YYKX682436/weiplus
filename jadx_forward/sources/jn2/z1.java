package jn2;

/* loaded from: classes10.dex */
public final class z1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f382298d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f382299e;

    /* renamed from: f, reason: collision with root package name */
    public final if2.b f382300f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f382301g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f382302h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.q f382303i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f382304m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f382305n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.p f382306o;

    /* renamed from: p, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f382307p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f382308q;

    public z1(gk2.e liveData, android.content.Context context, if2.b controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f382298d = liveData;
        this.f382299e = context;
        this.f382300f = controller;
        this.f382301g = "FinderLiveAnchorSingSongListPanelAdapter";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f382302h = arrayList;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        zl2.q4.f555466a.R("FinderLiveAnchorSingSongListPanelAdapter");
        arrayList.addAll(((mm2.m6) liveData.a(mm2.m6.class)).f410782q.f315618a);
    }

    public final void B(java.lang.String str) {
        java.lang.String str2 = this.f382308q;
        mm2.j6 j6Var = (mm2.j6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.m6) this.f382298d.a(mm2.m6.class)).f410784s).mo144003x754a37bb();
        int i17 = 0;
        boolean z17 = true;
        boolean z18 = str2 == null || str2.length() == 0;
        int i18 = -1;
        java.util.ArrayList arrayList = this.f382302h;
        java.lang.String str3 = this.f382301g;
        if (!z18 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str)) {
            java.util.Iterator it = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.z22) it.next()).f473162f, str2)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i19 >= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "setPreparingUniqueAddId: refresh old preparing cell, pos=" + i19);
                m8148xed6e4d18(i19, "payload_sing_state");
            }
        }
        if (j6Var instanceof mm2.i6) {
            java.lang.String str4 = ((mm2.i6) j6Var).f410674a.f473162f;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, str) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, str2)) {
                java.util.Iterator it6 = arrayList.iterator();
                int i27 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i27 = -1;
                        break;
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.z22) it6.next()).f473162f, str4)) {
                        break;
                    } else {
                        i27++;
                    }
                }
                if (i27 >= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "setPreparingUniqueAddId: refresh singing cell, pos=" + i27);
                    m8148xed6e4d18(i27, "payload_sing_state");
                }
            }
        }
        this.f382308q = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "setPreparingUniqueAddId: " + str);
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        java.util.Iterator it7 = arrayList.iterator();
        while (true) {
            if (!it7.hasNext()) {
                break;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.z22) it7.next()).f473162f, str)) {
                i18 = i17;
                break;
            }
            i17++;
        }
        if (i18 >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "setPreparingUniqueAddId: refresh new preparing cell, pos=" + i18);
            m8148xed6e4d18(i18, "payload_sing_state");
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f382302h.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        return i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((r45.z22) this.f382302h.get(i17)).f473163g;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e8o, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new jn2.s1(this, inflate);
    }

    public final jn2.t1 x(r45.z22 z22Var) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382308q, z22Var.f473162f)) {
            return jn2.t1.f382238e;
        }
        mm2.j6 j6Var = (mm2.j6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.m6) this.f382298d.a(mm2.m6.class)).f410784s).mo144003x754a37bb();
        if (j6Var instanceof mm2.h6) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.h6) j6Var).f410646a.f473162f, z22Var.f473162f) ? jn2.t1.f382238e : jn2.t1.f382237d;
        }
        if ((j6Var instanceof mm2.i6) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.i6) j6Var).f410674a.f473162f, z22Var.f473162f)) {
            return jn2.t1.f382239f;
        }
        return jn2.t1.f382237d;
    }

    public final void y(int i17) {
        if (i17 < 0 || i17 >= this.f382302h.size()) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f382307p;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c1163xf1deaba4 != null ? c1163xf1deaba4.p0(i17) : null;
        if (p07 instanceof jn2.s1) {
            jn2.s1 s1Var = (jn2.s1) p07;
            fn2.c cVar = s1Var.f382233i;
            if (cVar != null) {
                cVar.a();
            }
            s1Var.f382233i = null;
            fn2.d dVar = fn2.d.f345775a;
            android.view.View itemView = s1Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            s1Var.f382233i = dVar.a(itemView, s1Var.f382234m.f382299e);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo864xe5e2e48d(jn2.s1 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        fn2.c cVar = holder.f382233i;
        if (cVar != null) {
            cVar.a();
        }
        holder.f382233i = null;
        java.lang.Object obj = this.f382302h.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.z22 z22Var = (r45.z22) obj;
        r45.by1 by1Var = z22Var.f473164h;
        r45.ay1 ay1Var = by1Var != null ? by1Var.f452676d : null;
        holder.f382228d.A(ay1Var != null ? ay1Var.f451884e : null, ay1Var != null ? ay1Var.f451886g : null, ay1Var != null ? ay1Var.f451887h : 0, ay1Var != null ? ay1Var.f451888i : null, z22Var.f473161e);
        int i18 = (int) z22Var.f473166m;
        java.lang.String string = this.f382299e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.efc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1548x1e28afad.p1549xaf3f29eb.C14424xe21e01a c14424xe21e01a = holder.f382228d;
        c14424xe21e01a.getClass();
        android.widget.TextView textView = c14424xe21e01a.D;
        if (i18 > 0) {
            textView.setText(string + ' ' + i18);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        holder.i(x(z22Var), true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = holder.f382229e;
        if (c22661xa3a2b3c0 != null) {
            c22661xa3a2b3c0.setOnClickListener(new jn2.u1(holder, this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = holder.f382230f;
        if (c22661xa3a2b3c02 != null) {
            c22661xa3a2b3c02.setOnClickListener(new jn2.v1(holder, this));
        }
        holder.f3639x46306858.setOnClickListener(new jn2.w1(holder, this));
        holder.f3639x46306858.setOnLongClickListener(new jn2.x1(holder, this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        jn2.s1 holder = (jn2.s1) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            mo864xe5e2e48d(holder, i17);
            return;
        }
        r45.z22 z22Var = (r45.z22) kz5.n0.a0(this.f382302h, i17);
        if (z22Var == null) {
            return;
        }
        java.util.Iterator it = payloads.iterator();
        while (it.hasNext()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.next(), "payload_sing_state")) {
                holder.i(x(z22Var), true);
            }
        }
    }
}
