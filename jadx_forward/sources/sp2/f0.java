package sp2;

/* loaded from: classes2.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492558d;

    public f0(sp2.o2 o2Var) {
        this.f492558d = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = this.f492558d.f492688r;
        if (c22851x22587864 != null) {
            c22851x22587864.c();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshLayout");
            throw null;
        }
    }
}
