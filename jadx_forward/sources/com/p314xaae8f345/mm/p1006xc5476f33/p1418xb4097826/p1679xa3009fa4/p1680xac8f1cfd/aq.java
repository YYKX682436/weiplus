package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class aq extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f215329a;

    /* renamed from: b, reason: collision with root package name */
    public long f215330b;

    public aq(java.lang.ref.WeakReference rUIC) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rUIC, "rUIC");
        this.f215329a = rUIC;
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jq jqVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNegativeFeedBackUIC", "onRefreshBegin refreshType=" + i17 + ",extInfo=" + aVar + ",loaderId=" + this.f215330b);
        boolean z18 = false;
        if (aVar != null) {
            if (aVar.f479504a == this.f215330b) {
                z18 = true;
            }
        }
        if (z18 || (jqVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jq) this.f215329a.get()) == null) {
            return;
        }
        jqVar.R6("onRefreshBegin_" + i17);
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jq jqVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jq) this.f215329a.get();
        if (jqVar == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNegativeFeedBackUIC", "onRefreshEnd actionType=" + reason.f545049a + ",cur TabType=" + jqVar.O6() + ",loaderId=" + this.f215330b);
        ey2.l lVar = (ey2.l) pf5.u.f435469a.e(c61.l7.class).a(ey2.l.class);
        long j17 = this.f215330b;
        java.util.HashSet hashSet = lVar.f338954e;
        java.lang.Object obj = null;
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((rn5.a) next).f479504a == j17) {
                    obj = next;
                    break;
                }
            }
            obj = (rn5.a) obj;
        }
        if (obj != null) {
            java.util.HashSet hashSet2 = lVar.f338954e;
            if (hashSet2 != null) {
                pm0.v.c0(hashSet2, new ey2.k(j17));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCgiEndVM", "remove ext info id=" + j17 + '!');
        }
        if (obj != null) {
            jqVar.R6("onCgiEnd_" + this.f215330b);
        }
    }
}
