package com.p314xaae8f345.p3210x3857dc.p3212x5b09653;

/* renamed from: com.tencent.xweb.debug.FragmentCore */
/* loaded from: classes13.dex */
public class C27826x7bb4b22f extends p012xc85e97e9.p100xa8fcbcdb.AbstractC1149x21d497cd implements p012xc85e97e9.p100xa8fcbcdb.o {

    /* renamed from: p, reason: collision with root package name */
    public final qx5.l f301779p;

    /* renamed from: q, reason: collision with root package name */
    public final qx5.f f301780q = new qx5.f();

    public C27826x7bb4b22f(qx5.l lVar) {
        this.f301779p = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p100xa8fcbcdb.AbstractC1149x21d497cd, p012xc85e97e9.p100xa8fcbcdb.b0
    public boolean H(p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb c1146x1fce98fb) {
        by5.c4.f("FragmentCore", "onPreferenceTreeClick, key:" + c1146x1fce98fb.f93291r);
        boolean z17 = c1146x1fce98fb instanceof com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27834x1273c75e;
        qx5.l lVar = this.f301779p;
        if (z17) {
            ((qx5.m) c1146x1fce98fb).b(lVar);
        }
        if (!(c1146x1fce98fb instanceof com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27832x81f55412) && !(c1146x1fce98fb instanceof com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27833xd0a7f126)) {
            if (c1146x1fce98fb.f93293t == null) {
                return false;
            }
            mo7430x19263085();
            return false;
        }
        qx5.m mVar = (qx5.m) c1146x1fce98fb;
        qx5.a b17 = mVar.b(lVar);
        by5.c4.f("FragmentCore", "onPreferenceTreeClick, debugKey:" + mVar.h() + ", commandResult:" + b17);
        if (lVar == null) {
            return true;
        }
        lVar.e(mo7438x76847179(), b17);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p100xa8fcbcdb.o
    public boolean h0(p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb c1146x1fce98fb, java.lang.Object obj) {
        by5.c4.f("FragmentCore", "onPreferenceChange, key:" + c1146x1fce98fb.f93291r + ", newValue:" + obj);
        if (!(c1146x1fce98fb instanceof com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27830x4e7b5ac9) && !(c1146x1fce98fb instanceof com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27831x1967bfd0) && !(c1146x1fce98fb instanceof com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27834x1273c75e)) {
            return false;
        }
        qx5.m mVar = (qx5.m) c1146x1fce98fb;
        qx5.l lVar = this.f301779p;
        qx5.a a17 = mVar.a(lVar, obj);
        by5.c4.f("FragmentCore", "onPreferenceChange, debugKey:" + mVar.h() + ", commandResult:" + a17);
        if (lVar != null) {
            lVar.e(mo7438x76847179(), a17);
        }
        n0();
        return true;
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.AbstractC1149x21d497cd
    public void l0(android.os.Bundle bundle, java.lang.String str) {
        p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb j07;
        m0(com.p314xaae8f345.p3222x9cba06de.R.xml.f61420x7265e067, str);
        this.f301780q.b(this.f93308d.f93333g, this);
        if (!"com.tencent.mm".equalsIgnoreCase(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.l()) && (j07 = j0("pref_category_wechat")) != null) {
            j07.I(false);
        }
        n0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c9, code lost:
    
        if (r5 == 0) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0() {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27826x7bb4b22f.n0():void");
    }
}
