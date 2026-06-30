package id2;

/* loaded from: classes3.dex */
public final class f5 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f372100d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f372101e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f372102f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f372103g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f372104h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f372105i;

    /* renamed from: m, reason: collision with root package name */
    public r45.f82 f372106m;

    /* renamed from: n, reason: collision with root package name */
    public final id2.d5 f372107n;

    /* renamed from: o, reason: collision with root package name */
    public final kl2.g f372108o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f372104h = new java.util.HashMap();
        id2.d5 d5Var = new id2.d5(this);
        this.f372107n = d5Var;
        this.f372108o = new kl2.g(m80379x76847179(), d5Var, new id2.u4(this), null);
    }

    public static final void O6(id2.f5 f5Var, boolean z17) {
        r45.ql1 ql1Var;
        r45.f82 f82Var = f5Var.f372106m;
        if (f82Var != null && (ql1Var = (r45.ql1) f82Var.m75936x14adae67(2)) != null) {
            ql1Var.set(0, java.lang.Integer.valueOf(z17 ? 1 : 0));
            android.view.ViewGroup viewGroup = f5Var.f372101e;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsMoneyLayout");
                throw null;
            }
            viewGroup.setVisibility(z17 ? 0 : 8);
            android.widget.TextView textView = f5Var.f372103g;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("quotaTextView");
                throw null;
            }
            textView.setText(f5Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ebm, java.lang.Long.valueOf(ql1Var.m75942xfb822ef2(1))));
            f5Var.P6(ql1Var, true);
        }
        java.lang.String string = f5Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ebk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = f5Var.f372100d;
            if (viewOnClickListenerC22631x1cc07cc8 != null) {
                viewOnClickListenerC22631x1cc07cc8.setContentDescription(f5Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.efy, string));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchBtn");
                throw null;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = f5Var.f372100d;
        if (viewOnClickListenerC22631x1cc07cc82 != null) {
            viewOnClickListenerC22631x1cc07cc82.setContentDescription(f5Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.efx, string));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchBtn");
            throw null;
        }
    }

    public final void P6(r45.ql1 ql1Var, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveRemindRestric", "updateQuotaMoneySetting amount " + ql1Var.m75942xfb822ef2(1) + " enable: " + ql1Var.m75939xb282bd08(0));
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(m158354x19263085()), null, null, new id2.e5(this, ql1Var, z17, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r10 = r0.getValue();
     */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2273x9d4787cb(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            super.mo2273x9d4787cb(r10, r11, r12)
            boolean r0 = r9.f372105i
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L56
            java.util.HashMap r11 = r9.f372104h
            monitor-enter(r11)
            java.util.Set r12 = r11.entrySet()     // Catch: java.lang.Throwable -> L53
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L53
        L15:
            boolean r0 = r12.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L38
            java.lang.Object r0 = r12.next()     // Catch: java.lang.Throwable -> L53
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L53
            java.lang.Object r4 = r0.getKey()     // Catch: java.lang.Throwable -> L53
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L53
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L53
            if (r4 != r10) goto L2f
            r4 = r3
            goto L30
        L2f:
            r4 = r1
        L30:
            if (r4 == 0) goto L15
            java.lang.Object r10 = r0.getValue()     // Catch: java.lang.Throwable -> L53
            monitor-exit(r11)
            goto L3a
        L38:
            monitor-exit(r11)
            r10 = r2
        L3a:
            il2.a r10 = (il2.a) r10
            if (r10 == 0) goto La2
            androidx.appcompat.app.AppCompatActivity r11 = r9.m158354x19263085()
            kotlinx.coroutines.y0 r3 = v65.m.b(r11)
            r4 = 0
            r5 = 0
            id2.x4 r6 = new id2.x4
            r6.<init>(r9, r10, r2)
            r7 = 3
            r8 = 0
            p3325xe03a0797.p3326xc267989b.l.d(r3, r4, r5, r6, r7, r8)
            goto La2
        L53:
            r10 = move-exception
            monitor-exit(r11)
            throw r10
        L56:
            if (r11 != r3) goto La2
            if (r12 == 0) goto La2
            java.lang.String r10 = "KEY_SELECT_MOUNT"
            r4 = 0
            long r10 = r12.getLongExtra(r10, r4)
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 <= 0) goto La2
            r45.f82 r12 = r9.f372106m
            if (r12 == 0) goto La2
            r0 = 2
            com.tencent.mm.protobuf.f r12 = r12.m75936x14adae67(r0)
            r45.ql1 r12 = (r45.ql1) r12
            if (r12 == 0) goto La2
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r12.set(r3, r0)
            android.widget.TextView r0 = r9.f372103g
            if (r0 == 0) goto L9c
            android.app.Activity r2 = r9.m80379x76847179()
            android.content.res.Resources r2 = r2.getResources()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            r11 = 2131765927(0x7f102aa7, float:1.916303E38)
            java.lang.String r10 = r2.getString(r11, r10)
            r0.setText(r10)
            r9.P6(r12, r1)
            goto La2
        L9c:
            java.lang.String r10 = "quotaTextView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r10)
            throw r2
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id2.f5.mo2273x9d4787cb(int, int, android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114 A[ORIG_RETURN, RETURN] */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo47092x594b1124(android.view.View r10) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: id2.f5.mo47092x594b1124(android.view.View):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f372104h = new java.util.HashMap();
        id2.d5 d5Var = new id2.d5(this);
        this.f372107n = d5Var;
        this.f372108o = new kl2.g(m80379x76847179(), d5Var, new id2.u4(this), null);
    }
}
