package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class xl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 f214872d;

    public xl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 c15352x8ed10a39) {
        this.f214872d = c15352x8ed10a39;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 c15352x8ed10a39 = this.f214872d;
        if (((java.util.ArrayList) c15352x8ed10a39.m62411x5aa37cae().f213021d).size() <= 1 && c15352x8ed10a39.m62402xbc21531b().isEmpty()) {
            c15352x8ed10a39.d(false);
            return;
        }
        if (c15352x8ed10a39.isFolded) {
            c15352x8ed10a39.d(true);
            c15352x8ed10a39.m62406x74edc705().setRotation(90.0f);
            c15352x8ed10a39.m62406x74edc705().setOnClickListener(c15352x8ed10a39.getExpandListener());
        } else {
            c15352x8ed10a39.getConfig().getClass();
            c15352x8ed10a39.m62406x74edc705().setRotation(-90.0f);
            c15352x8ed10a39.m62406x74edc705().setOnClickListener(c15352x8ed10a39.getFlodListener());
            c15352x8ed10a39.d(true);
        }
    }
}
