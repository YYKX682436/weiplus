package bg2;

/* loaded from: classes12.dex */
public final class z6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f20709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.j7 f20710e;

    public z6(java.util.List list, bg2.j7 j7Var) {
        this.f20709d = list;
        this.f20710e = j7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List list = this.f20709d;
        if (list.isEmpty()) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyCmdIds ");
        bg2.j7 j7Var = this.f20710e;
        sb6.append(j7Var.e(list));
        sb6.append(' ');
        sb6.append(j7Var.c());
        com.tencent.mars.xlog.Log.i("Finder.LivePollingService", sb6.toString());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            if (!((java.util.LinkedList) j7Var.f20215e).contains(java.lang.Integer.valueOf(intValue))) {
                ((java.util.LinkedList) j7Var.f20215e).add(java.lang.Integer.valueOf(intValue));
            }
            j7Var.f(intValue, false, true);
        }
        bg2.j7.b(j7Var);
    }
}
