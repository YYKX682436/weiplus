package xs2;

/* loaded from: classes3.dex */
public final class q0 extends xs2.e {

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f537901h;

    /* renamed from: i, reason: collision with root package name */
    public final gk2.e f537902i;

    /* renamed from: j, reason: collision with root package name */
    public final xs2.f0 f537903j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f537904k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.view.View bulletView, gk2.e buContext, xs2.f0 danmakuConfig) {
        super(bulletView, buContext, danmakuConfig);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bulletView, "bulletView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(danmakuConfig, "danmakuConfig");
        this.f537901h = bulletView;
        this.f537902i = buContext;
        this.f537903j = danmakuConfig;
        this.f537904k = "ReplayBulletManager";
    }

    @Override // xs2.e, xs2.o
    public void a(int i17) {
        long j17 = i17 * 1000;
        boolean z17 = this.f537852f;
        java.lang.String str = this.f537904k;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "no attach seek seek: timeStamp = " + i17);
            m(j17);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seek: timeStamp = ");
        sb6.append(i17);
        sb6.append(",currentTime:");
        sb6.append(this.f537851e);
        sb6.append(", ");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) this.f537902i.a(mm2.c1.class)).f410379n;
        sb6.append(c19792x256d2725 != null ? cm2.a.f124861a.x(c19792x256d2725, -1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        i().f520385d.mo172414x35ce78(j17);
        m(j17);
        i().f520385d.U4();
    }

    @Override // xs2.e, xs2.o
    public vp.x b() {
        return i();
    }

    @Override // xs2.o
    public void c(java.util.List list, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f537904k, "before addReplayDanmaku, size:" + i().f520385d.E6() + "; add size = " + list.size() + ", source = " + source + '!');
        vp.x i17 = i();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof r45.z12) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            int i18 = 0;
            if (!it.hasNext()) {
                i17.f520385d.k1(arrayList2, false, false);
                return;
            }
            r45.z12 z12Var = (r45.z12) it.next();
            wp.a f57 = i().f5(0, z12Var);
            xp.a aVar = this.f537903j.f537861c;
            f57.f529878p = aVar != null ? aVar.f537342g : 3000;
            r45.t12 t12Var = (r45.t12) z12Var.m75936x14adae67(0);
            if (t12Var != null) {
                i18 = t12Var.m75939xb282bd08(17);
            }
            f57.f529868f = i18 * 1000;
            arrayList2.add(f57);
        }
    }

    @Override // xs2.e, xs2.o
    public void d(java.util.List list) {
        super.d(list);
        if (this.f537851e >= 0) {
            i().n(0L);
        }
    }

    @Override // xs2.e, xs2.o
    public void e(float f17, boolean z17) {
        int a17 = this.f537903j.a(!z17, f17);
        xp.d.f().f537377a = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f537904k, "changeSpeed: duration=" + a17 + ", ratio=" + f17 + ", isLandscape=" + z17);
        i().j5();
    }

    @Override // xs2.e, xs2.o
    public void f(long j17, long j18) {
        if (this.f537852f) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) this.f537902i.a(mm2.c1.class)).f410379n;
            if (c19792x256d2725 != null) {
                cm2.a.f124861a.x(c19792x256d2725, -1);
            }
            if (this.f537851e == -1) {
                i().n(j17);
            }
            m(j17);
        }
    }

    @Override // xs2.e, xs2.o
    public void g(java.util.List list, long j17, boolean z17) {
        if (!this.f537852f || i().m172424xc00617a4()) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("restart: timeStamp = ");
        sb6.append(j17);
        sb6.append(", ");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) this.f537902i.a(mm2.c1.class)).f410379n;
        sb6.append(c19792x256d2725 != null ? cm2.a.f124861a.x(c19792x256d2725, -1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f537904k, sb6.toString());
        if (list != null) {
            c(list, "restart");
        }
        i().n(j17);
        if (z17) {
            i().f(false);
        }
    }

    @Override // xs2.e
    public java.lang.String j() {
        return this.f537904k;
    }

    @Override // xs2.e, xs2.o
    /* renamed from: onDetach */
    public void mo175869x3f5eee52() {
        super.mo175869x3f5eee52();
    }
}
