package wp1;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f529910a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Stack f529911b;

    public a(int i17, java.lang.String baseActivityName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseActivityName, "baseActivityName");
        this.f529910a = baseActivityName;
        this.f529911b = new java.util.Stack();
    }

    public final r45.f83 a() {
        java.util.Stack stack = this.f529911b;
        if (stack.isEmpty()) {
            return null;
        }
        return (r45.f83) stack.peek();
    }

    public final r45.f83 b(long j17, android.content.Intent intent) {
        java.util.Stack stack = this.f529911b;
        if (stack.isEmpty()) {
            return null;
        }
        r45.f83 f83Var = (r45.f83) stack.peek();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f83Var.f455619e);
        sb6.append(" out stack, size = ");
        sb6.append(stack.size() - 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityStackManager", sb6.toString());
        vp1.i.f520422a.b0(f83Var, j17, intent);
        return (r45.f83) stack.pop();
    }

    public final void c(r45.f83 f83Var, long j17, android.content.Intent intent) {
        f83Var.f455629r = this.f529910a;
        java.util.Stack stack = this.f529911b;
        stack.push(f83Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityStackManager", f83Var.f455619e + "  in stack, size = " + stack.size());
        vp1.i iVar = vp1.i.f520422a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleMonitor", "inStack [" + f83Var.f455619e + "] " + java.lang.Integer.valueOf(f83Var.f455623i));
        java.util.Iterator it = vp1.i.f520430i.iterator();
        while (it.hasNext()) {
            ((up1.a) it.next()).d(f83Var, intent, j17);
        }
    }
}
