package jm4;

/* loaded from: classes11.dex */
public class s2 extends com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 implements jm4.q2 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.eq0 f381957d = bw5.eq0.m11852xcee59d22()[0];

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381958e = "";

    /* renamed from: f, reason: collision with root package name */
    public jm4.q3 f381959f = jm4.q3.f381945n;

    /* renamed from: g, reason: collision with root package name */
    public boolean f381960g;

    @Override // jm4.q2
    public void K(jm4.q3 playTaskType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playTaskType, "playTaskType");
        this.f381959f = playTaskType;
        mo105982x3f27f04a(2);
    }

    @Override // jm4.q2
    public java.lang.String M4() {
        return this.f381958e;
    }

    @Override // jm4.q2
    public void W5(boolean z17) {
        this.f381960g = z17;
        mo105982x3f27f04a(3);
    }

    @Override // jm4.q2
    public void aa(bw5.eq0 appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f381957d = appId;
        mo105982x3f27f04a(0);
    }

    @Override // jm4.q2
    /* renamed from: getAppId */
    public bw5.eq0 mo141125x74292566() {
        return this.f381957d;
    }

    @Override // jm4.q2
    public void pf(java.lang.String appName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appName, "appName");
        this.f381958e = appName;
        mo105982x3f27f04a(1);
    }

    @Override // jm4.q2
    public boolean u1() {
        return this.f381960g;
    }

    @Override // jm4.q2
    public jm4.q3 z3() {
        return this.f381959f;
    }
}
