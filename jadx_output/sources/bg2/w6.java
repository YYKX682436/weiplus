package bg2;

/* loaded from: classes12.dex */
public final class w6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f20606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.j7 f20607e;

    public w6(java.util.List list, bg2.j7 j7Var) {
        this.f20606d = list;
        this.f20607e = j7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        java.util.List list = this.f20606d;
        int size = list.size();
        bg2.j7 j7Var = this.f20607e;
        if (size == ((java.util.LinkedList) j7Var.f20215e).size()) {
            java.util.Iterator it = list.iterator();
            z17 = true;
            while (it.hasNext()) {
                if (!((java.util.LinkedList) j7Var.f20215e).contains(java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue()))) {
                    z17 = false;
                }
            }
        } else {
            z17 = false;
        }
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.LivePollingService", "enableCmdIds old: " + j7Var.e(j7Var.f20215e) + " new:" + j7Var.e(list) + ' ' + j7Var.c());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            int intValue = ((java.lang.Number) obj).intValue();
            if (!((java.util.LinkedList) j7Var.f20215e).contains(java.lang.Integer.valueOf(intValue))) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            j7Var.f(((java.lang.Number) it6.next()).intValue(), false, true);
        }
        java.util.List list2 = j7Var.f20215e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list2) {
            if (!list.contains(java.lang.Integer.valueOf(((java.lang.Number) obj2).intValue()))) {
                arrayList2.add(obj2);
            }
        }
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            j7Var.f(((java.lang.Number) it7.next()).intValue(), true, false);
        }
        ((java.util.LinkedList) j7Var.f20215e).clear();
        ((java.util.LinkedList) j7Var.f20215e).addAll(list);
        bg2.j7.b(j7Var);
    }
}
