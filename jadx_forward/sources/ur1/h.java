package ur1;

/* loaded from: classes11.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o4 f511885d;

    public h(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o4 o4Var) {
        this.f511885d = o4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ur1.j jVar = ur1.j.f511887a;
        int i17 = this.f511885d.f299968e;
        ur1.j.f511888b = i17;
        ur1.j.f511890d.A("bizLastPersonalCenterTimestamp", i17);
        java.util.LinkedList scenes = this.f511885d.f299967d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(scenes, "scenes");
        if (!scenes.isEmpty()) {
            java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n4> scenes2 = this.f511885d.f299967d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(scenes2, "scenes");
            for (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n4 n4Var : scenes2) {
                if (n4Var.f299915d == com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_TIMELINE) {
                    ur1.j.f511889c = n4Var != null ? n4Var.f299916e : 0;
                }
            }
            throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
        }
        ((ku5.t0) ku5.t0.f394148d).h(ur1.g.f511884d, "BizFlutterDigestHelper");
    }
}
