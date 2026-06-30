package xn5;

/* loaded from: classes13.dex */
public final class x0 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f537264d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f537265e;

    public x0(java.lang.String taskId, int i17, java.lang.String activityName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityName, "activityName");
        this.f537264d = i17;
        this.f537265e = activityName;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Iterator it = xn5.e1.f537197b.entrySet().iterator();
        while (it.hasNext()) {
            if (r26.i0.A((java.lang.String) ((java.util.Map.Entry) it.next()).getKey(), java.lang.String.valueOf(this.f537264d), false, 2, null)) {
                it.remove();
            }
        }
        xn5.h0 h0Var = (xn5.h0) xn5.q0.f537244j.get(this.f537265e);
        if (h0Var != null) {
            new xn5.z0(h0Var.f537210a).a();
        }
        return jz5.f0.f384359a;
    }
}
