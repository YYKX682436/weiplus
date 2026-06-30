package bg2;

/* loaded from: classes12.dex */
public final class z6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f102242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.j7 f102243e;

    public z6(java.util.List list, bg2.j7 j7Var) {
        this.f102242d = list;
        this.f102243e = j7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List list = this.f102242d;
        if (list.isEmpty()) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyCmdIds ");
        bg2.j7 j7Var = this.f102243e;
        sb6.append(j7Var.e(list));
        sb6.append(' ');
        sb6.append(j7Var.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePollingService", sb6.toString());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            if (!((java.util.LinkedList) j7Var.f101748e).contains(java.lang.Integer.valueOf(intValue))) {
                ((java.util.LinkedList) j7Var.f101748e).add(java.lang.Integer.valueOf(intValue));
            }
            j7Var.f(intValue, false, true);
        }
        bg2.j7.b(j7Var);
    }
}
