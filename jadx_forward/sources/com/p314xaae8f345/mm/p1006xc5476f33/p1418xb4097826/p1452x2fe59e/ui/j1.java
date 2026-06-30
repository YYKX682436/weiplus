package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes10.dex */
public final class j1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.CloseDrawerCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13941x58ed078d f191703a;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13941x58ed078d activityC13941x58ed078d) {
        this.f191703a = activityC13941x58ed078d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.CloseDrawerCallback
    public void a(int i17, java.util.List data, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13941x58ed078d activityC13941x58ed078d = this.f191703a;
        if (activityC13941x58ed078d.F) {
            return;
        }
        activityC13941x58ed078d.F = true;
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.d5 d5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5.f213597i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c5 c5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c5(i17, data);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        intent.putExtra("COMMENT_RESULT_KEY", currentTimeMillis);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5.f213599k.put(java.lang.Long.valueOf(currentTimeMillis), c5Var);
        activityC13941x58ed078d.setResult(0, intent);
        activityC13941x58ed078d.m78513xc2a54588().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.i1(activityC13941x58ed078d), activityC13941x58ed078d.f190754u);
    }
}
