package com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a;

/* renamed from: com.tencent.mm.pluginsdk.event.OnSceneEndProxy */
/* loaded from: classes11.dex */
public abstract class AbstractC19582xb4d96f40<T extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1> extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<T> implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f270230e = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f270231d;

    static {
        new java.util.HashMap();
    }

    public AbstractC19582xb4d96f40() {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f270231d = 0;
    }

    public void c() {
        if (this.f270231d == 0) {
            gm0.j1.d().a(h(), this);
        }
        this.f270231d++;
    }

    public abstract com.p314xaae8f345.mm.p944x882e457a.m1 d(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1);

    public abstract com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1);

    public void f(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p944x882e457a.m1 d17 = d(abstractC20979x809547d1);
        if (d17 != null) {
            gm0.j1.d().g(d17);
            f270230e.put(d17, abstractC20979x809547d1);
        }
    }

    public abstract int h();

    public void i() {
        int i17 = this.f270231d;
        if (i17 == 0) {
            return;
        }
        int i18 = i17 - 1;
        this.f270231d = i18;
        if (i18 == 0) {
            gm0.j1.d().q(h(), this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1;
        if (h() != m1Var.mo808xfb85f7b0() || (abstractC20979x809547d1 = (com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1) f270230e.remove(m1Var)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5735xa11db20a c5735xa11db20a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5735xa11db20a();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 e17 = e(i17, i18, str, m1Var, abstractC20979x809547d1);
        am.wk wkVar = c5735xa11db20a.f136058g;
        wkVar.f89828d = e17;
        wkVar.f89825a = i17;
        wkVar.f89826b = i18;
        wkVar.f89827c = str;
        c5735xa11db20a.e();
    }
}
