package hq0;

/* loaded from: classes7.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f364564d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(hq0.b0 b0Var) {
        super(0);
        this.f364564d = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f364564d.f364504y, "exceptionListener invoke, recreate biz");
        hq0.b0 b0Var = this.f364564d;
        synchronized (b0Var) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f364504y, "recreateBiz");
            je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
            if (iVar != null) {
                je3.j.a(iVar, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37571xfbd6b551, b0Var.f364503x.f375167a, kz5.q0.f395534d);
            }
            boolean z17 = true;
            boolean z18 = !b0Var.P && (b0Var.N.isEmpty() ^ true);
            b0Var.Z1(mq0.z.f412174o, z18);
            if (z18) {
                b0Var.P = true;
            }
            int i17 = b0Var.K;
            b0Var.K = i17 + 1;
            if (i17 >= 5) {
                b0Var.K = 0;
                if (iVar != null) {
                    je3.j.a(iVar, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37572xb488f127, b0Var.f364503x.f375167a, kz5.q0.f395534d);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b0Var.f364504y, "biz reCreate too much times, destroy it.");
                b0Var.Z1(mq0.z.f412175p, !b0Var.N.isEmpty());
                java.util.Iterator it = ((java.util.HashSet) b0Var.A).iterator();
                while (it.hasNext()) {
                    ((jc3.l0) it.next()).d0(true);
                }
                b0Var.M = true;
                b0Var.mo123041x5cd39ffa();
                b0Var.M = false;
            } else {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = b0Var.F;
                boolean z19 = b0Var.f364538t;
                java.lang.ref.WeakReference weakReference = b0Var.f364502J;
                android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
                b0Var.M = true;
                b0Var.mo123041x5cd39ffa();
                if (z19) {
                    b0Var.Q1();
                    b0Var.V(activity);
                    if (b0Var.B == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b0Var.f364504y, "biz reCreate return no delegate");
                    }
                    java.util.Iterator it6 = ((java.util.HashSet) b0Var.A).iterator();
                    while (it6.hasNext()) {
                        ((jc3.l0) it6.next()).d0(false);
                    }
                    java.util.Collection<hq0.j> values = concurrentHashMap.values();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
                    for (hq0.j jVar : values) {
                        b0Var.Y1(jVar.f364541a, jVar.f364542b, jVar.f364543c, jVar.f364544d, hq0.m0.f364565d);
                    }
                    b0Var.M = false;
                } else {
                    if (iVar != null) {
                        je3.j.a(iVar, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37573xa55e21e0, b0Var.f364503x.f375167a, kz5.q0.f395534d);
                    }
                    mq0.z zVar = mq0.z.f412178s;
                    if (b0Var.P || !(!b0Var.N.isEmpty())) {
                        z17 = false;
                    }
                    b0Var.Z1(zVar, z17);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
