package al2;

/* loaded from: classes3.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ al2.f f87365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f87366b;

    public e(al2.f fVar, java.lang.Runnable runnable) {
        this.f87365a = fVar;
        this.f87366b = runnable;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        al2.f fVar2 = this.f87365a;
        if (i17 != 0 || fVar.f152149b != 0) {
            fVar2.f87369c.mo7808x76db6cb1(new al2.g(fVar.f152149b, 1, null, null, null, fVar.f152150c, 28, null));
            return f0Var;
        }
        java.util.LinkedList m75941xfb821914 = ((r45.jg1) fVar.f152151d).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getPromote_info_list(...)");
        fVar2.f87370d = m75941xfb821914;
        fVar2.f87369c.mo7808x76db6cb1(new al2.g(fVar.f152149b, 1, new java.util.LinkedList(fVar2.f87370d), null, (r45.jg1) fVar.f152151d, null, 32, null));
        java.lang.Runnable runnable = this.f87366b;
        if (runnable == null) {
            return null;
        }
        pm0.v.W(runnable);
        return f0Var;
    }
}
