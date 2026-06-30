package lt3;

/* loaded from: classes10.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f402807d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 f402808e;

    public r(java.lang.String taskId, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        this.f402807d = taskId;
        this.f402808e = c16991x15ced046;
    }

    @Override // java.lang.Runnable
    public void run() {
        lt3.v.f402813d.remove(this);
        lt3.v.f402810a.c(lt3.n.f402793a.b(this.f402807d), this.f402808e);
    }
}
