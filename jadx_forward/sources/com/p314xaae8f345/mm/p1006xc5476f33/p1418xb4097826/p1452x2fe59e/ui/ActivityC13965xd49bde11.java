package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@db5.a(m123858x6ac9171 = 39)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameLivePostVerifyUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Lcom/tencent/mm/plugin/finder/live/viewmodel/b1;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostVerifyUI */
/* loaded from: classes3.dex */
public final class ActivityC13965xd49bde11 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b1 {
    public static final /* synthetic */ int A = 0;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f190816v = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.s4(this));

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f190817w = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.x4(this));

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f190818x = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.u4(this));

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f190819y = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.t4(this));

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f190820z = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.w4(this));

    public ActivityC13965xd49bde11() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            intent.getIntExtra("LANDSCAPE_TYPE", 0);
        }
    }

    public final int d7() {
        android.content.Intent intent = getIntent();
        java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("LANDSCAPE_TYPE", 0)) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            return 0;
        }
        return (valueOf != null && valueOf.intValue() == 2) ? 8 : -1;
    }

    public void e7(boolean z17, r45.j01 j01Var, r45.lk2 lk2Var, boolean z18, int i17, long j17) {
        java.lang.Object obj;
        java.lang.String str;
        if (!z17) {
            finish();
            return;
        }
        if (!z18 || ((java.lang.Boolean) ((jz5.n) this.f190818x).mo141623x754a37bb()).booleanValue()) {
            java.lang.String str2 = (java.lang.String) ((jz5.n) this.f190816v).mo141623x754a37bb();
            ke2.y yVar = new ke2.y(str2 == null ? "" : str2, 0, false, null, false, null, 60, null);
            yVar.t(this, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L);
            pq5.g l17 = yVar.l();
            l17.f(this);
            l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.v4(this, i17, j17, j01Var));
            return;
        }
        if (j01Var != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = j01Var.R;
            if (linkedList2 != null) {
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    java.util.LinkedList m75941xfb821914 = ((r45.j32) it.next()).m75941xfb821914(0);
                    if (m75941xfb821914 != null) {
                        if (!(!m75941xfb821914.isEmpty())) {
                            m75941xfb821914 = null;
                        }
                        if (m75941xfb821914 != null) {
                            linkedList.addAll(m75941xfb821914);
                        }
                    }
                }
            }
            java.util.Iterator it6 = linkedList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it6.next();
                    if ((((r45.h32) obj).m75939xb282bd08(6) & 1) == 1) {
                        break;
                    }
                }
            }
            r45.h32 h32Var = (r45.h32) obj;
            i95.m c17 = i95.n0.c(c61.ub.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.ub ubVar = (c61.ub) c17;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = j01Var.f458975i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = j01Var.f458975i;
            if (c19792x256d27252 == null || (str = c19792x256d27252.m76803x6c285d75()) == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = j01Var.f458975i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d27253);
            r45.nw1 m76794xd0557130 = c19792x256d27253.m76794xd0557130();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m76794xd0557130);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27254 = j01Var.f458975i;
            c61.ub.Rf(ubVar, this, m76784x5db1b11, str, m76794xd0557130, null, h32Var, null, null, c19792x256d27254 != null ? c19792x256d27254.m76829x97edf6c0() : null, j01Var.f458979o, new android.content.Intent(), 208, null);
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return d7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.o1.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l1.class);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        mo2550x7c2abd06(1);
        super.onCreate(bundle);
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).rk()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGameLivePostVerifyUI", "onCreate: isVisitorLiving = true, finish!");
            db5.t7.m123883x26a183b(mo55332x76847179(), mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cmy), 0).show();
            finish();
            return;
        }
        setRequestedOrientation(d7());
        m78583x85ccfe01(8);
        getWindow().addFlags(67108864);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFormat(-3);
        getWindow().setSoftInputMode(51);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l1) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l1.class)).f198742f = this;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l1) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l1.class)).f198743g = 14;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        super.mo48758x6c4bab6();
        b7(true);
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575902l8);
    }
}
