package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* renamed from: com.tencent.mm.plugin.appbrand.o6$$q */
/* loaded from: classes7.dex */
public final /* synthetic */ class C12462x63548ea implements java.util.function.Consumer {
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.f167695n3;
        android.app.Activity activity = (android.app.Activity) ((java.lang.ref.WeakReference) obj).get();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        activity.finish();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeWC", "Manual finish activity " + activity);
    }
}
