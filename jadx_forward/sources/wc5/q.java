package wc5;

/* loaded from: classes10.dex */
public final class q extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f526155d;

    /* renamed from: e, reason: collision with root package name */
    public long f526156e;

    /* renamed from: f, reason: collision with root package name */
    public long f526157f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 f526158g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f526159h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f526160i;

    /* renamed from: m, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f526161m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f526162n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Runnable f526163o;

    /* renamed from: p, reason: collision with root package name */
    public ed5.m f526164p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 baseActivity) {
        super(baseActivity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseActivity, "baseActivity");
        this.f526155d = baseActivity;
    }

    public static final void T6(wc5.q qVar, int i17) {
        ed5.m mVar = qVar.f526164p;
        if (mVar != null) {
            android.animation.AnimatorSet animatorSet = mVar.f332901b;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            mVar.f332901b = null;
            mVar.c();
        }
        ed5.m mVar2 = new ed5.m(qVar.m173460x4905e9fa());
        qVar.f526164p = mVar2;
        long uptimeMillis = 300 - (android.os.SystemClock.uptimeMillis() - qVar.f526157f);
        if (uptimeMillis > 0) {
            qVar.m173460x4905e9fa().postDelayed(new wc5.a(mVar2, i17), uptimeMillis);
        } else {
            mVar2.b(i17);
        }
    }

    public final void U6() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 h2Var = this.f526158g;
        if (h2Var != null && (mo7946xf939df19 = m173460x4905e9fa().mo7946xf939df19()) != null) {
            mo7946xf939df19.mo8165x48eac7b3(h2Var);
        }
        this.f526158g = null;
    }

    public final void V6() {
        java.lang.Runnable runnable = this.f526163o;
        if (runnable != null) {
            m173460x4905e9fa().removeCallbacks(runnable);
        }
        this.f526163o = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = this.f526162n;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        this.f526162n = null;
    }

    public final int W6(long j17) {
        xm3.t0 b17 = xm3.u0.b(m173460x4905e9fa());
        if (b17 == null) {
            return -1;
        }
        java.util.List m82898xfb7e5820 = b17.m82898xfb7e5820();
        int size = m82898xfb7e5820.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.Object obj = m82898xfb7e5820.get(i17);
            uc5.h0 h0Var = obj instanceof uc5.h0 ? (uc5.h0) obj : null;
            if (h0Var != null && h0Var.f508027d.p().m124847x74d37ac6() == j17) {
                return i17;
            }
        }
        return -1;
    }

    public final uc5.r X6() {
        android.view.LayoutInflater.Factory factory = this.f526155d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(factory, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryController");
        return (uc5.r) factory;
    }

    public final void Y6() {
        if (this.f526160i) {
            return;
        }
        this.f526160i = true;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f526159h;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f526159h = null;
        U6();
        long j17 = this.f526156e;
        if (j17 == 0) {
            V6();
            return;
        }
        if (j17 == 0) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(W6(j17));
        if (!(valueOf.intValue() >= 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryInitialLoadUIC", "startLocateLoad: targetMsgId=" + j17 + " found in initial data at position=" + intValue);
            V6();
            Z6(intValue);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryInitialLoadUIC", "startLocateLoad: targetMsgId=" + j17 + " not in initial data, start paging");
        if (this.f526163o == null && this.f526162n == null) {
            wc5.c cVar = new wc5.c(this);
            this.f526163o = cVar;
            m173460x4905e9fa().postDelayed(cVar, 300L);
        }
        this.f526161m = v65.i.b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) X6()).k7(), null, new wc5.p(this, j17, null), 1, null);
    }

    public final void Z6(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m173460x4905e9fa().getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/ui/chatting/history/components/MsgHistoryGalleryInitialLoadUIC", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1162x665295de, "com/tencent/mm/ui/chatting/history/components/MsgHistoryGalleryInitialLoadUIC", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            m173460x4905e9fa().post(new wc5.e(this, c1162x665295de, i17));
        } else {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m173460x4905e9fa = m173460x4905e9fa();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m173460x4905e9fa, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/components/MsgHistoryGalleryInitialLoadUIC", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            m173460x4905e9fa.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m173460x4905e9fa, "com/tencent/mm/ui/chatting/history/components/MsgHistoryGalleryInitialLoadUIC", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            m173460x4905e9fa().post(new wc5.f(this, i17));
        }
        this.f526156e = 0L;
    }

    /* renamed from: getRecyclerView */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m173460x4905e9fa() {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) X6()).m7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        U6();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f526161m;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f526161m = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f526159h;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        this.f526159h = null;
        V6();
        ed5.m mVar = this.f526164p;
        if (mVar != null) {
            android.animation.AnimatorSet animatorSet = mVar.f332901b;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            mVar.f332901b = null;
            mVar.c();
        }
        this.f526164p = null;
        super.mo13982x7cf2e371();
    }
}
