package bt1;

@j95.b
/* loaded from: classes4.dex */
public final class d extends i95.w implements ct1.u, ct1.t {

    /* renamed from: d, reason: collision with root package name */
    public bt1.l f24147d;

    public void Ai(boolean z17) {
        com.tencent.mars.xlog.Log.i("Byp.BypService", "paybyp selector enable is : " + z17);
        if (!z17) {
            java.util.List list = bt1.a.f24143a;
            java.util.ArrayList arrayList = bt1.a.f24144b;
            if (arrayList.contains(11)) {
                arrayList.remove((java.lang.Object) 11);
                return;
            }
            return;
        }
        java.util.List list2 = bt1.a.f24143a;
        java.util.ArrayList arrayList2 = bt1.a.f24144b;
        if (!arrayList2.contains(11)) {
            arrayList2.add(11);
        }
        bt1.l lVar = this.f24147d;
        if (lVar != null) {
            bt1.l.b(lVar, kz5.b0.c(11), bt1.g.f24157m, false, 0, 12, null);
        } else {
            kotlin.jvm.internal.o.o("syncExtension");
            throw null;
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        synchronized (et1.o.f256573a) {
            for (et1.m config : et1.o.f256574b) {
                synchronized (et1.o.f256573a) {
                    kotlin.jvm.internal.o.g(config, "config");
                }
            }
            java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(et1.n.class)).all()).iterator();
            while (it.hasNext()) {
                et1.l lVar = (et1.n) ((fs.q) it.next()).get();
                if (lVar != null) {
                    ((et1.a) lVar).n();
                }
            }
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f24147d = new bt1.l();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("Byp.BypService", "[configure]");
            en1.k kVar = (en1.k) i95.n0.c(en1.k.class);
            ((dn1.i) kVar).f241874d.v(new bt1.c(this));
        }
    }

    public void wi(int i17) {
        bt1.l lVar = this.f24147d;
        if (lVar != null) {
            lVar.f24171a.remove(java.lang.Integer.valueOf(i17));
        } else {
            kotlin.jvm.internal.o.o("syncExtension");
            throw null;
        }
    }
}
