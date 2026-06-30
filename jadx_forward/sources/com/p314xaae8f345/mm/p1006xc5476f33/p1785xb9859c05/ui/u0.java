package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class u0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16130xc9e2940f f224550a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16130xc9e2940f activityC16130xc9e2940f, android.os.Looper looper) {
        super(looper);
        this.f224550a = activityC16130xc9e2940f;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16130xc9e2940f activityC16130xc9e2940f = this.f224550a;
        if (i17 != 1) {
            if (i17 == 2) {
                if (activityC16130xc9e2940f.f224085g.getCount() == 0) {
                    activityC16130xc9e2940f.f224090o.setVisibility(0);
                } else {
                    activityC16130xc9e2940f.f224090o.setVisibility(8);
                }
                if (activityC16130xc9e2940f.f224085g.getCount() == 0 || !activityC16130xc9e2940f.f224097v) {
                    return;
                }
                activityC16130xc9e2940f.f224085g.notifyDataSetChanged();
                return;
            }
            return;
        }
        android.app.ProgressDialog progressDialog = activityC16130xc9e2940f.f224083e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        activityC16130xc9e2940f.f224086h.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.w wVar = activityC16130xc9e2940f.f224085g;
        java.util.HashMap hashMap = s83.b.f486400b;
        wVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.w.f224578x = hashMap;
        activityC16130xc9e2940f.f224085g.q();
        activityC16130xc9e2940f.f224085g.notifyDataSetChanged();
        activityC16130xc9e2940f.f224084f.invalidateViews();
        activityC16130xc9e2940f.f224088m.m65173xa56faafd(activityC16130xc9e2940f.f224085g.getCount());
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.c.f223969e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.c.f223969e = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.c.f223969e.a();
    }
}
