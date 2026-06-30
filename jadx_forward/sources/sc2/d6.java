package sc2;

/* loaded from: classes2.dex */
public abstract class d6 extends ad2.h {
    public static final java.lang.Object A = new java.lang.Object();
    public static final java.lang.Object B = new java.lang.Object();

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f487369w = jz5.h.b(sc2.x5.f487899d);

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1455xac8f1cfd.C13828x8c002bfd f487370x;

    /* renamed from: y, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f487371y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f487372z;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.feed.component.FinderBaseCarouseCardJumperObserver$feedChangeListener$1] */
    public d6() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f487370x = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.component.FinderBaseCarouseCardJumperObserver$feedChangeListener$1
            {
                this.f39173x3fe91575 = 439877283;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3) {
                xc2.p0 p0Var;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 event = c5445x963cab3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.ia iaVar = event.f135785g;
                if (iaVar.f88452b == 11) {
                    c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                    java.lang.String username = iaVar.f88457g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "username");
                    for (java.lang.String str : ((b92.d1) zbVar).vj(username)) {
                        sc2.d6 d6Var = sc2.d6.this;
                        xc2.p0 p0Var2 = d6Var.f84680h;
                        if (((p0Var2 == null || (c19786x6a1e2862 = p0Var2.f534767a) == null || (m76506x42318aa0 = c19786x6a1e2862.m76506x42318aa0()) == null || m76506x42318aa0.m77224x4236b52c() != 34) ? false : true) && (p0Var = d6Var.f84680h) != null) {
                            c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
                            java.lang.String m75945x2fec8307 = d6Var.O(str, p0Var).m75945x2fec8307(4);
                            if (m75945x2fec8307 == null) {
                                m75945x2fec8307 = "";
                            }
                            r45.h32 bj6 = ((b92.d1) zbVar2).bj(str, m75945x2fec8307);
                            if (bj6 != null) {
                                pm0.v.X(new sc2.l5(d6Var, bj6, p0Var));
                            }
                        }
                    }
                }
                return true;
            }
        };
    }

    public static final void T(r45.h32 h32Var, java.lang.String str, sc2.d6 d6Var, xc2.p0 p0Var, android.content.Context context, int i17, android.view.View view) {
        int i18;
        h32Var.set(1, java.lang.Integer.valueOf(i17 == 1 ? 0 : 1));
        i95.m c17 = i95.n0.c(c61.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec8307);
        gm0.j1.d().g(c61.zb.x3((c61.zb) c17, str, m75945x2fec8307, i17, null, null, 11, null, null, null, null, null, null, null, 8144, null));
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(4);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        if (((b92.d1) zbVar).bj(str, m75945x2fec83072) == null) {
            c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String m75945x2fec83073 = h32Var.m75945x2fec8307(4);
            ((b92.d1) zbVar2).Ai(str, m75945x2fec83073 != null ? m75945x2fec83073 : "", h32Var);
            i18 = 1;
        } else {
            c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String m75945x2fec83074 = h32Var.m75945x2fec8307(4);
            r45.h32 bj6 = ((b92.d1) zbVar3).bj(str, m75945x2fec83074 != null ? m75945x2fec83074 : "");
            i18 = 1;
            if (bj6 != null) {
                bj6.set(1, java.lang.Integer.valueOf(h32Var.m75939xb282bd08(1)));
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((te2.e4) ((zy2.g8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.g8.class))).f499507d.M0(str);
        d6Var.U(h32Var, p0Var, view);
        if (h32Var.m75939xb282bd08(i18) == 0) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0j);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            db5.t7.m(context, string);
        }
    }

    @Override // ad2.h
    public void C(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        mo48814x2efc64();
        super.C(holder);
    }

    public final void G(android.view.View jumpView, r45.i55 i55Var, r45.i55 i55Var2) {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        if (i55Var == null || i55Var2 == null || (viewGroup = (android.view.ViewGroup) jumpView.findViewById(com.p314xaae8f345.mm.R.id.ft_)) == null || (viewGroup2 = (android.view.ViewGroup) jumpView.findViewById(com.p314xaae8f345.mm.R.id.ft8)) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(viewGroup2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "originalExpandAnimate", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewGroup2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(viewGroup2, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "originalExpandAnimate", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(viewGroup2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "originalExpandAnimate", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        viewGroup2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(viewGroup2, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "originalExpandAnimate", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        pm0.v.b(viewGroup2, new sc2.u5(this, jumpView, viewGroup, viewGroup2));
    }

    public final void H(android.view.View view, float f17, float f18, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(f17, f18).setDuration(j17);
        duration.setInterpolator(new android.view.animation.LinearInterpolator());
        duration.addUpdateListener(new sc2.h5(view));
        duration.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0660  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r35, in5.s0 r36, android.view.View r37, xc2.p0 r38, java.lang.String r39, r45.i55 r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 2354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.d6.I(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0, android.view.View, xc2.p0, java.lang.String, r45.i55, boolean):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:13|(1:15)(1:114)|16|(1:18)(2:104|(21:106|(1:108)(2:110|(1:112))|109|22|23|24|(1:26)(1:98)|27|(1:29)(1:97)|30|(1:32)(1:96)|33|(1:95)(1:37)|(1:39)(3:91|(1:93)|94)|(3:41|(1:43)|(1:45))|46|(1:90)(1:50)|(1:52)(3:77|(1:89)(1:81)|(5:83|(1:85)(1:88)|(1:87)|54|(7:56|(1:58)|59|(1:61)|(1:63)|(1:65)|(2:67|68)(1:69))(3:70|(1:72)|(2:74|75)(1:76))))|53|54|(0)(0))(1:113))|(1:20)(2:101|(1:103))|21|22|23|24|(0)(0)|27|(0)(0)|30|(0)(0)|33|(1:35)|95|(0)(0)|(0)|46|(1:48)|90|(0)(0)|53|54|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02a1, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r10, r0, "parse color crash2, button_bg_color=" + r40.m75945x2fec8307(4) + "， button_font_color=" + r40.m75945x2fec8307(7), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02a0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0253 A[Catch: all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:24:0x0249, B:26:0x0253, B:27:0x026d, B:29:0x0277, B:97:0x028e, B:98:0x025f), top: B:23:0x0249 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0277 A[Catch: all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:24:0x0249, B:26:0x0253, B:27:0x026d, B:29:0x0277, B:97:0x028e, B:98:0x025f), top: B:23:0x0249 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028e A[Catch: all -> 0x02a0, TRY_LEAVE, TryCatch #0 {all -> 0x02a0, blocks: (B:24:0x0249, B:26:0x0253, B:27:0x026d, B:29:0x0277, B:97:0x028e, B:98:0x025f), top: B:23:0x0249 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025f A[Catch: all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:24:0x0249, B:26:0x0253, B:27:0x026d, B:29:0x0277, B:97:0x028e, B:98:0x025f), top: B:23:0x0249 }] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r36, in5.s0 r37, android.view.View r38, xc2.p0 r39, r45.i55 r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 1692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.d6.J(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0, android.view.View, xc2.p0, r45.i55, java.lang.String):void");
    }

    public final void K(xc2.p0 jumpInfoEx, android.view.View jumpView) {
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfoEx, "jumpInfoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        if (Q(jumpInfoEx)) {
            android.widget.TextView textView = (android.widget.TextView) jumpView.findViewById(com.p314xaae8f345.mm.R.id.eex);
            android.view.View findViewById = jumpView.findViewById(com.p314xaae8f345.mm.R.id.eet);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) jumpView.findViewById(com.p314xaae8f345.mm.R.id.lte);
            r45.i55 M = M(jumpInfoEx);
            java.lang.String m75945x2fec83072 = M != null ? M.m75945x2fec8307(4) : null;
            if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
                findViewById.setBackgroundColor(jumpView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
            }
            m75945x2fec8307 = M != null ? M.m75945x2fec8307(7) : null;
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                c22699x3dcdb352.m82040x7541828(jumpView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
                textView.setTextColor(jumpView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
                return;
            }
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) jumpView.findViewById(com.p314xaae8f345.mm.R.id.eew);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) jumpView.findViewById(com.p314xaae8f345.mm.R.id.ltf);
        android.view.View findViewById2 = jumpView.findViewById(com.p314xaae8f345.mm.R.id.ees);
        r45.i55 P = P(jumpInfoEx);
        java.lang.String m75945x2fec83073 = P != null ? P.m75945x2fec8307(4) : null;
        if (m75945x2fec83073 == null || m75945x2fec83073.length() == 0) {
            findViewById2.setBackgroundColor(jumpView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        }
        m75945x2fec8307 = P != null ? P.m75945x2fec8307(7) : null;
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            c22699x3dcdb3522.m82040x7541828(jumpView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            textView2.setTextColor(jumpView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
        }
    }

    public final java.lang.String L(android.content.Context context, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        long j18 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c;
        long j19 = j17 / j18;
        long j27 = 3600000;
        long j28 = (j17 % j18) / j27;
        long j29 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        long j37 = (j17 % j27) / j29;
        long j38 = (j17 % j29) / 1000;
        java.lang.String str = "";
        if (j19 > 0) {
            str = "" + context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.db8, java.lang.String.valueOf(j19));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        java.lang.String format = java.lang.String.format("%02d:%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j37), java.lang.Long.valueOf(j38)}, 3));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        sb6.append(format);
        return sb6.toString();
    }

    public final r45.i55 M(xc2.p0 infoEx) {
        java.lang.Object obj;
        r45.bg0 bg0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = infoEx.f534767a.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).m75939xb282bd08(2) == 24) {
                break;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var == null || (bg0Var = (r45.bg0) wf6Var.m75936x14adae67(32)) == null) {
            return null;
        }
        return (r45.i55) bg0Var.m75936x14adae67(1);
    }

    public final int N(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return (int) ((com.p314xaae8f345.mm.ui.bh.a(context).f278668a * 0.6d) - context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561262dl));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.h32 O(java.lang.String r9, xc2.p0 r10) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.d6.O(java.lang.String, xc2.p0):r45.h32");
    }

    public final r45.i55 P(xc2.p0 infoEx) {
        java.lang.Object obj;
        r45.bg0 bg0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = infoEx.f534767a.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).m75939xb282bd08(2) == 24) {
                break;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var == null || (bg0Var = (r45.bg0) wf6Var.m75936x14adae67(32)) == null) {
            return null;
        }
        return (r45.i55) bg0Var.m75936x14adae67(0);
    }

    public final boolean Q(xc2.p0 jumpInfoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfoEx, "jumpInfoEx");
        sc2.q8 q8Var = jumpInfoEx.f534766J;
        return q8Var != null && q8Var.f487712c == 2;
    }

    public final void R(java.lang.String str, android.view.View iconLayout, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 iconView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconLayout, "iconLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconView, "iconView");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(iconLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            iconLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(iconLayout, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(iconLayout, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        iconLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(iconLayout, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mn2.g1 g1Var = mn2.g1.f411508a;
        wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), g1Var.h(mn2.f1.B));
        sc2.n5 n5Var = new sc2.n5(this, iconLayout);
        b17.getClass();
        b17.f529406d = n5Var;
        b17.f529412j = new sc2.o5(this, iconLayout);
        b17.f529411i = new sc2.p5(this, iconLayout);
        b17.c(iconView);
    }

    public final void S(xc2.p0 jumpInfoEx, android.view.View jumpView, java.lang.String username, r45.h32 liveNoticeInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfoEx, "jumpInfoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveNoticeInfo, "liveNoticeInfo");
        if (liveNoticeInfo.m75939xb282bd08(1) == 0) {
            android.content.Context context = jumpView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            sc2.q5 q5Var = new sc2.q5(jumpView, liveNoticeInfo, username, this, jumpInfoEx);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
            k0Var.f293405n = new sc2.r5(context);
            k0Var.f293414s = new sc2.s5(jumpInfoEx, this, jumpView, q5Var);
            k0Var.v();
            return;
        }
        android.content.Context context2 = jumpView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        T(liveNoticeInfo, username, this, jumpInfoEx, context2, 1, jumpView);
        r45.h32 O = O(username, jumpInfoEx);
        i95.m c17 = i95.n0.c(c50.c1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c50.c1 c1Var = (c50.c1) c17;
        ml2.i5 i5Var = ml2.i5.f409104f;
        android.content.Context context3 = jumpView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String valueOf = java.lang.String.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n);
        java.lang.String m75945x2fec8307 = O.m75945x2fec8307(3);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String str = m75945x2fec8307;
        java.lang.String m75945x2fec83072 = O.m75945x2fec8307(4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = jumpInfoEx.f534777f;
        long mo2128x1ed62e84 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L;
        android.content.Context context4 = jumpView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context4, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        c50.c1.l9(c1Var, i5Var, username, 0L, 0, valueOf, null, null, null, null, str, null, m75945x2fec83072, null, mo2128x1ed62e84, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context4).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6().m75939xb282bd08(5), null, 38368, null);
    }

    public final void U(r45.h32 h32Var, xc2.p0 p0Var, android.view.View view) {
        android.view.View findViewById = Q(p0Var) ? view.findViewById(com.p314xaae8f345.mm.R.id.lte) : view.findViewById(com.p314xaae8f345.mm.R.id.ltf);
        android.widget.TextView textView = Q(p0Var) ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.eex) : (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.eew);
        if (h32Var.m75939xb282bd08(1) == 0) {
            textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cs7));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "refreshBtnStatus", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "refreshBtnStatus", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (Q(p0Var)) {
            textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dkt));
        } else {
            textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cs6));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "refreshBtnStatus", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver", "refreshBtnStatus", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x01f8, code lost:
    
        if (r7 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01fa, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0201, code lost:
    
        if (r7 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0434, code lost:
    
        if (r0 == null) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0235, code lost:
    
        if ((r3 == null || r3.length() == 0) == false) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String V(android.content.Context r29, android.widget.TextView r30, android.widget.LinearLayout r31, xc2.p0 r32, int r33) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.d6.V(android.content.Context, android.widget.TextView, android.widget.LinearLayout, xc2.p0, int):java.lang.String");
    }

    public final void W(android.widget.TextView textView, java.lang.CharSequence charSequence, boolean z17) {
        if (textView == null) {
            return;
        }
        if (z17) {
            zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
            if (charSequence == null) {
                charSequence = "";
            }
            charSequence = ((ht2.y0) s6Var).mj(charSequence, (int) textView.getTextSize(), true);
        }
        textView.setText(charSequence);
        textView.setVisibility(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(textView.getText()) ? 8 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void X(in5.s0 s0Var, android.view.View view, java.lang.String str) {
        r45.wf6 wf6Var;
        xc2.p0 p0Var = this.f84680h;
        if (p0Var == null) {
            sc2.k2 k2Var = (sc2.k2) this;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startAsyncLodPolling: jump info is null, source=");
            sb6.append(str);
            sb6.append(", feedId=");
            java.lang.Object obj = s0Var.f374658i;
            so2.j5 j5Var = obj instanceof so2.j5 ? (so2.j5) obj : null;
            sb6.append(pm0.v.u(j5Var != null ? j5Var.mo2128x1ed62e84() : 0L));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(k2Var.C, sb6.toString());
            return;
        }
        r45.wf6 wf6Var2 = this.f84682m;
        if (wf6Var2 == null) {
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = p0Var.f534767a.m76521x7528c3fb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
            java.util.Iterator it = m76521x7528c3fb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    wf6Var = 0;
                    break;
                } else {
                    wf6Var = it.next();
                    if (((r45.wf6) wf6Var).m75939xb282bd08(2) == 24) {
                        break;
                    }
                }
            }
            wf6Var2 = wf6Var;
        }
        r45.wf6 wf6Var3 = wf6Var2;
        if (wf6Var3 != null) {
            java.lang.String str2 = "startAsyncLodPolling: source=" + str + ", async_load_info_time_interval=" + wf6Var3.m75939xb282bd08(35);
            java.lang.String str3 = ((sc2.k2) this).C;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
            if (wf6Var3.m75939xb282bd08(35) <= 0) {
                return;
            }
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            sc2.a8 a8Var = (sc2.a8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(sc2.a8.class);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = a8Var != null ? a8Var.f487742e : null;
            java.lang.Object obj2 = B;
            if (n3Var != null) {
                n3Var.mo50302x6b17ad39(obj2);
            }
            java.lang.Object obj3 = s0Var.f374658i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj3 : null;
            if (abstractC14490x69736cb5 == null) {
                return;
            }
            this.f487372z = true;
            long m75939xb282bd08 = (wf6Var3.m75939xb282bd08(35) * 1000) - (android.os.SystemClock.elapsedRealtime() - p0Var.f534769b);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = n3Var;
            sc2.b6 b6Var = new sc2.b6(p0Var, abstractC14490x69736cb5, wf6Var3, view, this, s0Var, wf6Var3, str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "startAsyncLodPolling: source=" + str + ", postDelay=" + m75939xb282bd08 + ", scene=" + wf6Var3.m75939xb282bd08(36));
            if (m75939xb282bd08 <= 0) {
                b6Var.run();
                return;
            }
            long uptimeMillis = android.os.SystemClock.uptimeMillis() + m75939xb282bd08;
            if (n3Var2 != null) {
                n3Var2.mo50296x41bd0e60(b6Var, obj2, uptimeMillis);
            }
        }
    }

    public void Y(in5.s0 holder, android.view.View jumpView, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        xc2.p0 p0Var = this.f84680h;
        if (p0Var == null) {
            sc2.k2 k2Var = (sc2.k2) this;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startCarouselDesc: jump info is null, source=");
            sb6.append(source);
            sb6.append(", feedId=");
            java.lang.Object obj = holder.f374658i;
            so2.j5 j5Var = obj instanceof so2.j5 ? (so2.j5) obj : null;
            sb6.append(pm0.v.u(j5Var != null ? j5Var.mo2128x1ed62e84() : 0L));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(k2Var.C, sb6.toString());
            return;
        }
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sc2.a8 a8Var = (sc2.a8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(sc2.a8.class);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = a8Var != null ? a8Var.f487742e : null;
        java.lang.Object obj2 = A;
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(obj2);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) jumpView.findViewById(com.p314xaae8f345.mm.R.id.ft8);
        if (viewGroup == null) {
            return;
        }
        if (viewGroup.getVisibility() != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(((sc2.k2) this).C, "startCarouselDesc: has not shown big card, source=".concat(source));
            return;
        }
        int size = p0Var.f534772c0.size();
        if (size >= 2) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis() + 3000;
            if (n3Var != null) {
                n3Var.mo50296x41bd0e60(new sc2.c6(this, holder, jumpView, source), obj2, uptimeMillis);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(((sc2.k2) this).C, "startCarouselDesc: descSize=" + size + ", source=" + source);
    }

    public final void Z(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(((sc2.k2) this).C, "stopAsyncLoadPolling: source=" + str);
        this.f487372z = false;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sc2.a8 a8Var = (sc2.a8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(sc2.a8.class);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = a8Var != null ? a8Var.f487742e : null;
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(B);
        }
    }

    public void a0(android.content.Context context, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(((sc2.k2) this).C, "stopCarouselDesc: source=".concat(source));
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sc2.a8 a8Var = (sc2.a8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(sc2.a8.class);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = a8Var != null ? a8Var.f487742e : null;
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(A);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f487371y;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r4.getUseRfx() == true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(android.view.View r3, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L1b
            com.tencent.mm.plugin.finder.storage.t70 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a
            jz5.g r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Jg
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.mo141623x754a37bb()
            lb2.j r0 = (lb2.j) r0
            java.lang.Object r0 = r0.r()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4.o(r0)
        L1b:
            if (r4 == 0) goto L25
            boolean r0 = r4.getUseRfx()
            r1 = 1
            if (r0 != r1) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            java.lang.String r0 = "finder_live_promoting_tiny.pag"
            if (r1 == 0) goto L3a
            android.content.Context r3 = r3.getContext()
            android.content.res.AssetManager r3 = r3.getAssets()
            com.tencent.mm.rfx.RfxPagFile r3 = com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77390x243906(r3, r0)
            r4.mo82566x3e3ac3e8(r3)
            goto L4b
        L3a:
            if (r4 == 0) goto L4b
            android.content.Context r3 = r3.getContext()
            android.content.res.AssetManager r3 = r3.getAssets()
            org.libpag.PAGFile r3 = org.p3363xbe4143f1.C29690xfae77312.m154715x243906(r3, r0)
            r4.mo82568x3e3ac3e8(r3)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.d6.b0(android.view.View, com.tencent.mm.view.MMPAGView):void");
    }

    @Override // ad2.h
    public gs2.a j(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return info.m76480xe2ee1ca3() == 2 ? info.m76490xf00280e() == 3 ? gs2.a.f356585h : gs2.a.f356587m : super.j(info);
    }

    @Override // ad2.h
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        in5.c cVar = (in5.c) holder.f374658i;
        java.lang.String str = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar : null;
        if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null) {
            str = feedObject.f66949xdec927b;
        }
        java.lang.String str2 = str == null ? "" : str;
        r45.h32 O = O(str2, infoEx);
        i95.m c17 = i95.n0.c(c50.c1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c50.c1 c1Var = (c50.c1) c17;
        ml2.i5 i5Var = ml2.i5.f409103e;
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String valueOf = java.lang.String.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n);
        java.lang.String m75945x2fec8307 = O.m75945x2fec8307(3);
        java.lang.String str3 = m75945x2fec8307 != null ? m75945x2fec8307 : "";
        java.lang.String m75945x2fec83072 = O.m75945x2fec8307(4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = infoEx.f534777f;
        long mo2128x1ed62e84 = abstractC14490x69736cb52 != null ? abstractC14490x69736cb52.mo2128x1ed62e84() : 0L;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        c50.c1.l9(c1Var, i5Var, str2, 0L, 0, valueOf, null, null, null, null, str3, null, m75945x2fec83072, null, mo2128x1ed62e84, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6().m75939xb282bd08(5), null, 38368, null);
    }

    @Override // ad2.h
    public void v(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        android.content.Context context = holder.f374654e;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = null;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        boolean z17 = false;
        if (abstractActivityC21394xb3d2c0cf != null && !abstractActivityC21394xb3d2c0cf.mo78538xecd98af8()) {
            z17 = true;
        }
        if (z17) {
            mo48813x58998cd();
        }
        super.v(holder, jumpView, infoEx);
        Y(holder, jumpView, "onJumpViewFocus");
        X(holder, jumpView, "onJumpViewFocus");
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f487371y;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = holder.f374653d;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            r2Var = p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new sc2.t5(this, jumpView, holder, null), 2, null);
        }
        this.f487371y = r2Var;
    }

    @Override // ad2.h
    public void w(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        mo48814x2efc64();
        super.w(holder, jumpView, infoEx);
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        a0(context, "onJumpViewUnFocus");
        android.content.Context context2 = jumpView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        Z(context2, "onJumpViewUnFocus");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f487371y;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // ad2.h
    public void x(android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        mo48814x2efc64();
        super.x(jumpView, infoEx);
        android.content.Context context = jumpView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        a0(context, "onPause");
        android.content.Context context2 = jumpView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        Z(context2, "onPause");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f487371y;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }
}
