package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class u0 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 f207406g;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160) {
        this.f207406g = activityC14945x8c20f160;
    }

    @Override // fc2.d
    public void G0(fc2.a event) {
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!(event instanceof fc2.t)) {
            return;
        }
        fc2.t tVar = (fc2.t) event;
        int i19 = tVar.f342518d;
        if ((i19 != 5 && i19 != 0 && i19 != 1) || (i17 = tVar.f342520f) > (i18 = tVar.f342522h)) {
            return;
        }
        while (true) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160 = this.f207406g;
            if (i17 < activityC14945x8c20f160.C.size() && i17 >= 0) {
                activityC14945x8c20f160.d7(((so2.j5) activityC14945x8c20f160.C.get(i17)).mo2128x1ed62e84(), i17, 2);
            }
            if (i17 == i18) {
                return;
            } else {
                i17++;
            }
        }
    }
}
