package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes10.dex */
public final class d3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 f207565d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 l3Var) {
        super(0);
        this.f207565d = l3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3 l3Var = this.f207565d;
        try {
            java.util.Set set = l3Var.f207666s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(set, "access$getEnterFinderActivity$p(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : set) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) obj;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activityC0065xcd7aa112);
                if (l3Var.Di(activityC0065xcd7aa112)) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa1122 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) it.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskService", "checkClearFinderTask: clear exceptional finder ui, ui = " + activityC0065xcd7aa1122.getClass().getSimpleName());
                activityC0065xcd7aa1122.setResult(0);
                activityC0065xcd7aa1122.finishAffinity();
            }
            java.util.Set<android.app.Activity> set2 = l3Var.f207670w;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(set2, "access$getEnteredNonFinderActivity$p(...)");
            for (android.app.Activity activity : set2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskService", "checkClearFinderTask: clear exceptional non finder ui, ui = " + activity.getClass().getSimpleName());
                activity.setResult(0);
                activity.finishAffinity();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMultiTaskService", "checkClearFinderTask2: crash,", th6);
            pm0.z.b(xy2.b.f539688b, "clearFinderTaskCrash2", false, null, null, false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.c3(th6), 60, null);
        }
        return jz5.f0.f384359a;
    }
}
