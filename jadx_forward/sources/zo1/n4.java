package zo1;

/* loaded from: classes5.dex */
public final class n4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e f556239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f556240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f556241f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e, java.util.ArrayList arrayList, yz5.l lVar) {
        super(0);
        this.f556239d = activityC12873xf94c39e;
        this.f556240e = arrayList;
        this.f556241f = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e = this.f556239d;
        if (!activityC12873xf94c39e.isFinishing() && !activityC12873xf94c39e.isDestroyed()) {
            zo1.m4 m4Var = new zo1.m4(activityC12873xf94c39e);
            java.util.ArrayList arrayList = this.f556240e;
            kz5.g0.t(arrayList, m4Var);
            zo1.k4 k4Var = activityC12873xf94c39e.f174402h;
            k4Var.getClass();
            int i17 = 0;
            if (arrayList.size() == 1) {
                k4Var.B(((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) arrayList.get(0)).f297362d);
            }
            k4Var.f556207e = arrayList;
            k4Var.m8146xced61ae5();
            if (activityC12873xf94c39e.f174404m.length() > 0) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) it.next()).f297365g.f297522e, activityC12873xf94c39e.f174404m)) {
                        break;
                    }
                    i17++;
                }
                if (i17 != -1) {
                    k4Var.x(((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) arrayList.get(i17)).f297362d);
                }
            } else {
                long j17 = activityC12873xf94c39e.f174405n;
                if (j17 >= 0) {
                    k4Var.x(j17);
                }
            }
            activityC12873xf94c39e.f174404m = "";
            activityC12873xf94c39e.f174405n = -1L;
            yz5.l lVar = this.f556241f;
            if (lVar != null) {
                lVar.mo146xb9724478(arrayList);
            }
        }
        return jz5.f0.f384359a;
    }
}
