package cw1;

/* loaded from: classes12.dex */
public final class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d f304632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f304633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f304634f;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d, java.util.List list, java.util.ArrayList arrayList) {
        this.f304632d = activityC13111x890e232d;
        this.f304633e = list;
        this.f304634f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d = this.f304632d;
        activityC13111x890e232d.f177225g = this.f304633e;
        cw1.o0 o0Var = activityC13111x890e232d.f177223e;
        if (o0Var != null) {
            o0Var.g(3, this.f304634f);
        }
    }
}
