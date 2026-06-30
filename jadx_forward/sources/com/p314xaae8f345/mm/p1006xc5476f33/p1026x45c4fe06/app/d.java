package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d f156578a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.d();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f156579b = new java.util.LinkedList();

    public final void a() {
        java.util.Iterator it = f156579b.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            cf.a aVar = (cf.a) next;
            if (aVar.f122351d) {
                android.app.Activity activity = (android.app.Activity) aVar.f122349b.get();
                if (activity != null) {
                    activity.finish();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ActivityCrossProcessManager", "finishActivityAfterLaunchUICreate " + activity + ' ');
                }
                it.remove();
            }
        }
    }

    public final void b(com.p314xaae8f345.p425x1ea3c036.sdk.p446x694ecd10.C3953x860c60d1 popActivityRecord) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(popActivityRecord, "popActivityRecord");
        java.util.Iterator it = f156579b.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            cf.a aVar = (cf.a) next;
            if (aVar.f122350c == popActivityRecord.f129235d && aVar.f122348a > popActivityRecord.f129236e) {
                android.app.Activity activity = (android.app.Activity) aVar.f122349b.get();
                if (activity != null) {
                    activity.finish();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ActivityCrossProcessManager", "popActivityAfterCreateTime " + activity + ' ');
                }
                it.remove();
            }
        }
    }
}
