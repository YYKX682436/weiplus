package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class oc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14030x53172658 f191905d;

    public oc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14030x53172658 activityC14030x53172658) {
        this.f191905d = activityC14030x53172658;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14030x53172658 activityC14030x53172658 = this.f191905d;
        long j17 = 0;
        int i17 = 0;
        for (java.lang.Object obj : activityC14030x53172658.f190942v) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.lc lcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.lc) obj;
            if (lcVar.f191801b) {
                j17 = lcVar.f191800a;
            }
            i17 = i18;
        }
        activityC14030x53172658.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_SELECT_MOUNT", j17);
        activityC14030x53172658.setResult(1, intent);
        activityC14030x53172658.finish();
        return true;
    }
}
