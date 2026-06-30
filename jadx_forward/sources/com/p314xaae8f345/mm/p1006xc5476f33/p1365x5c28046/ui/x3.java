package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes9.dex */
public final class x3 implements sr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13322x119d0e55 f180089a;

    public x3(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13322x119d0e55 activityC13322x119d0e55) {
        this.f180089a = activityC13322x119d0e55;
    }

    @Override // sr.b
    public void a(int i17) {
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13322x119d0e55 activityC13322x119d0e55 = this.f180089a;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = activityC13322x119d0e55.f179396h;
            if (c22661xa3a2b3c0 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("doneBtn");
                throw null;
            }
            c22661xa3a2b3c0.setEnabled(true);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = activityC13322x119d0e55.f179395g;
            if (c22661xa3a2b3c02 != null) {
                c22661xa3a2b3c02.setEnabled(true);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sendBtn");
                throw null;
            }
        }
    }
}
