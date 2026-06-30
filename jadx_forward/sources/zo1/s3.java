package zo1;

/* loaded from: classes5.dex */
public final class s3 implements rd0.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 f556300a;

    public s3(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8) {
        this.f556300a = activityC12872x8baa24f8;
    }

    @Override // rd0.b1
    public final void a(java.util.List list) {
        wo1.v vVar = this.f556300a.f174394u;
        if (vVar == null) {
            list.clear();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
            fo1.f.b(list, new zo1.r3(vVar));
        }
    }
}
