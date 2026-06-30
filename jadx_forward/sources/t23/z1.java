package t23;

/* loaded from: classes10.dex */
public final class z1 {

    /* renamed from: d, reason: collision with root package name */
    public static final t23.z1 f496846d = t23.y1.f496843a;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f496847a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f496848b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public t23.p1 f496849c = t23.p1.f496780d;

    public z1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(t23.o1 preload) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preload, "preload");
        this.f496847a.add(preload);
    }

    public final void b(t23.p1 state, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (this.f496849c != state) {
            this.f496849c = state;
        }
        java.util.Iterator it = this.f496847a.iterator();
        while (it.hasNext()) {
            t23.o1 o1Var = (t23.o1) it.next();
            if (t23.p1.f496780d == state && o1Var.a()) {
                c(o1Var.b(state, this.f496849c, i17, i18, i19));
            }
            if (!o1Var.a()) {
                c(o1Var.b(state, this.f496849c, i17, i18, i19));
            }
        }
    }

    public final void c(java.util.Set set) {
        java.util.ArrayList arrayList = this.f496848b;
        arrayList.size();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            if (intValue < arrayList.size()) {
                t23.j h17 = t23.p0.h();
                java.lang.String o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(intValue)).o();
                int mo63659xfb85f7b0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(intValue)).mo63659xfb85f7b0();
                java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(intValue)).f219963e;
                long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(intValue)).f219967i;
                long j18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(intValue)).f219968m;
                h17.getClass();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CacheService", "trySubmitPreDecodeTask, file path is invalid.");
                } else {
                    j33.d0.d(o17, null, -1);
                    android.graphics.Bitmap a17 = h17.f496719a.a(j33.d0.c(o17, null, j18));
                    if (a17 == null || a17.isRecycled()) {
                        t23.f1 f1Var = h17.f496724f;
                        if (f1Var.size() > 82) {
                            java.lang.String str2 = ((t23.h) f1Var.d()).f496691d;
                        }
                        f1Var.add(new t23.h(h17, o17, mo63659xfb85f7b0, str, j17, 12288, j18));
                        h17.j();
                    }
                }
            }
        }
    }

    public final void d(java.util.List mediaItems) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaItems, "mediaItems");
        mediaItems.size();
        java.util.ArrayList arrayList = this.f496848b;
        arrayList.clear();
        arrayList.addAll(mediaItems);
    }
}
