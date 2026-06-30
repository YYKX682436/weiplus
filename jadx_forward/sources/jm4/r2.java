package jm4;

/* loaded from: classes11.dex */
public class r2 extends com.p314xaae8f345.p3118xeeebfacc.C26830xc629eb9c implements jm4.q2 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f381949d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.eq0 f381950e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381951f;

    /* renamed from: g, reason: collision with root package name */
    public jm4.q3 f381952g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f381953h;

    public r2() {
        boolean[] zArr = new boolean[4];
        for (int i17 = 0; i17 < 4; i17++) {
            zArr[i17] = false;
        }
        this.f381949d = zArr;
        this.f381950e = bw5.eq0.m11852xcee59d22()[0];
        this.f381951f = "";
        this.f381952g = jm4.q3.f381945n;
    }

    @Override // jm4.q2
    public void K(jm4.q3 playTaskType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playTaskType, "playTaskType");
        p3380x6a61f93.p3381xf512d0a5.C30517x21ba6869.m169529x21b31a50(m105978x2737f10(), playTaskType.f381947d);
    }

    @Override // jm4.q2
    public java.lang.String M4() {
        synchronized (this) {
            if (this.f381949d[1]) {
                return this.f381951f;
            }
            java.lang.String m169524x21b05fba = p3380x6a61f93.p3381xf512d0a5.C30517x21ba6869.m169524x21b05fba(m105978x2737f10());
            synchronized (this) {
                this.f381951f = m169524x21b05fba;
                this.f381949d[1] = true;
            }
            return m169524x21b05fba;
        }
    }

    @Override // jm4.q2
    public void W5(boolean z17) {
        p3380x6a61f93.p3381xf512d0a5.C30517x21ba6869.m169525x21b0e578(m105978x2737f10(), z17);
    }

    @Override // jm4.q2
    public void aa(bw5.eq0 appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3380x6a61f93.p3381xf512d0a5.C30517x21ba6869.m169527x21b18c55(m105978x2737f10(), appId.f108558d);
    }

    @Override // jm4.q2
    /* renamed from: getAppId */
    public bw5.eq0 mo141125x74292566() {
        synchronized (this) {
            if (this.f381949d[0]) {
                return this.f381950e;
            }
            bw5.eq0 a17 = bw5.eq0.a(p3380x6a61f93.p3381xf512d0a5.C30517x21ba6869.m169531x21b98132(m105978x2737f10()));
            synchronized (this) {
                this.f381950e = a17;
                this.f381949d[0] = true;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            return a17;
        }
    }

    @Override // com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190, com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055
    /* renamed from: notifyFieldUpdated */
    public void mo105982x3f27f04a(int i17) {
        synchronized (this) {
            this.f381949d[i17] = false;
        }
    }

    @Override // jm4.q2
    public void pf(java.lang.String appName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appName, "appName");
        p3380x6a61f93.p3381xf512d0a5.C30517x21ba6869.m169526x21b0e947(m105978x2737f10(), appName);
    }

    @Override // jm4.q2
    public boolean u1() {
        synchronized (this) {
            if (this.f381949d[3]) {
                return this.f381953h;
            }
            boolean m169532x21ba5d39 = p3380x6a61f93.p3381xf512d0a5.C30517x21ba6869.m169532x21ba5d39(m105978x2737f10());
            synchronized (this) {
                this.f381953h = m169532x21ba5d39;
                this.f381949d[3] = true;
            }
            return m169532x21ba5d39;
        }
    }

    @Override // jm4.q2
    public jm4.q3 z3() {
        synchronized (this) {
            if (this.f381949d[2]) {
                return this.f381952g;
            }
            jm4.q3 a17 = jm4.q3.f381939e.a(p3380x6a61f93.p3381xf512d0a5.C30517x21ba6869.m169528x21b267de(m105978x2737f10()));
            synchronized (this) {
                this.f381952g = a17;
                this.f381949d[2] = true;
            }
            return a17;
        }
    }
}
