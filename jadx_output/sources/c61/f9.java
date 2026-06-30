package c61;

/* loaded from: classes10.dex */
public final class f9 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c61.h9 f38980d;

    public f9(c61.h9 h9Var) {
        this.f38980d = h9Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.xs2 xs2Var;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[observeForeverWithNotify] isShow=");
        sb6.append(z9Var != null ? java.lang.Boolean.valueOf(z9Var.f105327a) : null);
        sb6.append(' ');
        sb6.append(z9Var.f105329c);
        com.tencent.mars.xlog.Log.i("Finder.SnsDeliveryBubbleService", sb6.toString());
        if (z9Var.f105327a) {
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = z9Var.f105329c;
            long j17 = (jbVar == null || (xs2Var = jbVar.N) == null) ? 0L : xs2Var.getLong(3);
            c61.h9 h9Var = this.f38980d;
            c61.e9 e9Var = new c61.e9(z9Var, h9Var);
            if (!h9Var.Ni() || bu2.j.f24534a.h(j17) != null) {
                e9Var.invoke();
            } else {
                kotlin.jvm.internal.o.d(jbVar);
                new db2.g4(j17, "", 0, 2, "", true, null, null, 0L, null, false, false, null, null, 0, null, false, h9Var.Ai(jbVar), null, null, null, null, 0, 0, null, null, false, null, null, 536731584, null).l().q(new c61.d9(e9Var));
            }
        }
    }
}
