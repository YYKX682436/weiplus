package ke5;

/* loaded from: classes9.dex */
public final class i extends ke5.a {

    /* renamed from: i, reason: collision with root package name */
    public final yb5.d f388621i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f388622j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f388623k;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f388624l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f388625m;

    /* renamed from: n, reason: collision with root package name */
    public he5.f f388626n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f388627o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f388628p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yb5.d chattingContext, hd5.v loader) {
        super(chattingContext, loader);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
        this.f388621i = chattingContext;
        this.f388622j = chattingContext.x();
        this.f388628p = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) ((sb5.u1) chattingContext.f542241c.a(sb5.u1.class))).f280829g;
    }

    @Override // ke5.a, ke5.f0
    public void a(hd5.n action, boolean z17, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        if (this.f388628p && bundle == null && action == hd5.n.ACTION_ENTER) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingBizContactDataPresenter", "[onLoad] sourceArgs is null!");
        } else {
            this.f388625m = true;
            super.a(action, z17, bundle);
        }
    }

    @Override // ke5.a, ke5.f0
    public void b(hd5.n nVar, boolean z17) {
        this.f388625m = true;
        a(nVar, z17, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r1.booleanValue() != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x028a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x025a  */
    @Override // ke5.a, hd5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 r26, hd5.q r27) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke5.i.c(com.tencent.mm.ui.chatting.view.MMChattingListView, hd5.q):void");
    }

    @Override // ke5.f0
    public boolean d() {
        return true;
    }

    @Override // ke5.a
    public he5.t e(hd5.n action, android.os.Bundle bundle, hd5.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        if (this.f388626n == null) {
            java.lang.String talkUsername = this.f388622j;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(talkUsername, "talkUsername");
            this.f388626n = new he5.f(talkUsername, new ke5.g(this), this.f388621i, new ke5.h(this));
        }
        yb5.d dVar = this.f388621i;
        he5.f fVar = this.f388626n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
        return new ke5.o(dVar, fVar, action, bundle, qVar, this.f388628p);
    }

    public final boolean h(int i17, int i18) {
        java.lang.String x17 = this.f388574b.x();
        long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(x17);
        int F2 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).F2(x17, 0L, m07);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingBizContactDataPresenter", "[isShowTopAll] talker:%s createTime:%s expiredCount:%s", x17, java.lang.Long.valueOf(m07), java.lang.Integer.valueOf(F2));
        if (i18 - F2 <= i17) {
            return true;
        }
        he5.f fVar = this.f388626n;
        return fVar != null && fVar.f362463h;
    }

    @Override // ke5.f0
    /* renamed from: isLoading */
    public boolean mo142542xf18228b2() {
        return this.f388625m;
    }

    @Override // ke5.a, ke5.f0
    /* renamed from: onCancel */
    public void mo142539x3d6f0539() {
        super.mo142539x3d6f0539();
        this.f388625m = false;
        if (this.f388627o) {
            return;
        }
        this.f388627o = true;
        he5.f fVar = this.f388626n;
        if (fVar != null && !fVar.f362462g) {
            fVar.f362462g = true;
            je5.b bVar = fVar.f362460e;
            yb5.d chattingContext = fVar.f362458c;
            bVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
            synchronized (bVar) {
                if (bVar.f380855b) {
                    bVar.f380855b = false;
                    yq1.t0 t0Var = bVar.f380854a;
                    if (t0Var != null) {
                        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) chattingContext.f542241c.a(sb5.f.class))).getClass();
                        java.util.List list = yq1.u0.f546006r;
                        if (list != null) {
                            ((java.util.ArrayList) list).remove(t0Var);
                        }
                    }
                    bVar.f380854a = null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizContactMsgDataRepo", "MassSend listener unregistered successfully");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizContactMsgDataRepo", "MassSend listener not registered, skip unregister");
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvvmMsgDataSource", "ChattingBizContactDataSource destroyed and listener unregistered");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingBizContactDataPresenter", "ChattingBizContactDataPresenter destroyed");
    }
}
