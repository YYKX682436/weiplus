package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes10.dex */
public final class qc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14033xa41f223 f191985d;

    public qc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14033xa41f223 activityC14033xa41f223) {
        this.f191985d = activityC14033xa41f223;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14033xa41f223.F;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14033xa41f223 activityC14033xa41f223 = this.f191985d;
        activityC14033xa41f223.getClass();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        arrayList.addAll(activityC14033xa41f223.D);
        android.content.Intent intent = new android.content.Intent();
        intent.putStringArrayListExtra("KEY_LUCKY_MONEY_CHAT_ROOM_USERNAME", arrayList);
        activityC14033xa41f223.setResult(-1, intent);
        activityC14033xa41f223.finish();
        activityC14033xa41f223.x7();
        activityC14033xa41f223.b7().notifyDataSetChanged();
        return true;
    }
}
