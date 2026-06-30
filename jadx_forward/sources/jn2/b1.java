package jn2;

/* loaded from: classes10.dex */
public final class b1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements hn2.l {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f382090m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1548x1e28afad.p1549xaf3f29eb.C14424xe21e01a f382091d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f382092e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f382093f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 f382094g;

    /* renamed from: h, reason: collision with root package name */
    public jn2.u0 f382095h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ jn2.c1 f382096i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(jn2.c1 c1Var, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f382096i = c1Var;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.v9l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1548x1e28afad.p1549xaf3f29eb.C14424xe21e01a c14424xe21e01a = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1548x1e28afad.p1549xaf3f29eb.C14424xe21e01a) findViewById;
        this.f382091d = c14424xe21e01a;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.slp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f382092e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.opx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f382093f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.ree);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f382094g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) findViewById4;
        this.f382095h = jn2.u0.f382244d;
        c14424xe21e01a.B();
    }

    @Override // hn2.l
    /* renamed from: getAuditionBackgroundView */
    public android.view.View getF201314w() {
        return this.f382091d.getF201314w();
    }

    @Override // hn2.l
    /* renamed from: getAuditionPlayView */
    public android.view.View mo10748xe32858dc() {
        return this.f382091d.mo10748xe32858dc();
    }

    @Override // hn2.l
    /* renamed from: getAuditionPlayingAnim */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b mo10749x89e0979c() {
        return this.f382091d.mo10749x89e0979c();
    }

    @Override // hn2.l
    /* renamed from: getAuditionProgressView */
    public android.view.View getF201316y() {
        return this.f382091d.getF201316y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        if (r3 == true) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(jn2.w0 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "songData"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r2)
            r45.ay1 r2 = r1.f382273a
            java.lang.String r3 = r2.f451883d
            if (r3 != 0) goto L12
            java.lang.String r3 = ""
        L12:
            boolean r4 = r2.f451893q
            jn2.c1 r5 = r0.f382096i
            sf2.x r5 = r5.f382101e
            if (r5 == 0) goto L2f
            java.lang.Class<mm2.j5> r6 = mm2.j5.class
            androidx.lifecycle.c1 r5 = r5.m56788xbba4bfc0(r6)
            mm2.j5 r5 = (mm2.j5) r5
            kotlinx.coroutines.flow.f3 r5 = r5.f410715g
            if (r5 == 0) goto L2f
            kotlinx.coroutines.flow.h3 r5 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r5
            java.lang.Object r5 = r5.mo144003x754a37bb()
            nm2.a r5 = (nm2.a) r5
            goto L30
        L2f:
            r5 = 0
        L30:
            hn2.i r6 = hn2.i.f364064a
            r45.cy1 r1 = r1.f382274b
            hn2.d r1 = r6.a(r2, r1)
            r45.zr5 r1 = r1.b()
            r6 = 0
            if (r1 == 0) goto L41
            r1 = 1
            goto L42
        L41:
            r1 = r6
        L42:
            com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView r7 = r0.f382091d
            android.view.View r7 = r7.getF201314w()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.lang.ThreadLocal r8 = zj0.c.f554818a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r15.add(r8)
            java.util.Collections.reverse(r15)
            java.lang.Object[] r9 = r15.toArray()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListAdapter$SongViewHolder"
            java.lang.String r11 = "updateAuditionUI"
            java.lang.String r12 = "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListAdapter$SongItemData;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r8 = r7
            r2 = r15
            r15 = r16
            yj0.a.d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r2 = r2.get(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r7.setVisibility(r2)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListAdapter$SongViewHolder"
            java.lang.String r10 = "updateAuditionUI"
            java.lang.String r11 = "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListAdapter$SongItemData;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            yj0.a.f(r8, r9, r10, r11, r12, r13, r14)
            hn2.a r2 = hn2.a.f364031a
            if (r5 == 0) goto L9c
            boolean r3 = r5.c(r3, r4)
            r4 = 1
            if (r3 != r4) goto L9c
            goto L9d
        L9c:
            r4 = r6
        L9d:
            r2.a(r0, r1, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jn2.b1.i(jn2.w0):void");
    }

    public final void j(jn2.u0 u0Var) {
        this.f382095h = u0Var;
        int ordinal = u0Var.ordinal();
        jn2.c1 c1Var = this.f382096i;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f382094g;
        android.widget.TextView textView = this.f382093f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = this.f382092e;
        if (ordinal == 0) {
            c22627xa933f8e4.setVisibility(8);
            textView.setVisibility(8);
            c22661xa3a2b3c0.setVisibility(0);
            c22661xa3a2b3c0.setText(c1Var.f382100d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d5g));
            return;
        }
        if (ordinal == 1) {
            c22661xa3a2b3c0.setVisibility(8);
            textView.setVisibility(8);
            c22627xa933f8e4.setVisibility(0);
        } else {
            if (ordinal != 2) {
                return;
            }
            c22661xa3a2b3c0.setVisibility(8);
            c22627xa933f8e4.setVisibility(8);
            textView.setVisibility(0);
            textView.setText(c1Var.f382100d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575229op0));
        }
    }
}
