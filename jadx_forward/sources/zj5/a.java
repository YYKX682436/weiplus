package zj5;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final zj5.a f554881a = new zj5.a();

    public final void a(int i17, long j17) {
        java.lang.Object obj;
        java.lang.ref.WeakReference weakReference = vb5.l.f516388q;
        vb5.l lVar = weakReference != null ? (vb5.l) weakReference.get() : null;
        if (lVar != null) {
            java.util.Iterator it = lVar.f516396o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                xj5.a aVar = (xj5.a) obj;
                if ((aVar instanceof xj5.n) && ((xj5.n) aVar).f536448u.w0().f454138f == j17) {
                    break;
                }
            }
            xj5.n nVar = obj instanceof xj5.n ? (xj5.n) obj : null;
            if (nVar == null || i17 == -1) {
                return;
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("group_msg_set_top_detach", null, kz5.c1.m(kz5.b1.e(new jz5.l("group_bar_close_scene", java.lang.Integer.valueOf(i17))), nVar.b()), 26356);
        }
    }
}
