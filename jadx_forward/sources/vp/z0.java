package vp;

/* loaded from: classes16.dex */
public class z0 extends vp.a {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f520407i;

    /* renamed from: j, reason: collision with root package name */
    public int f520408j;

    /* renamed from: k, reason: collision with root package name */
    public int f520409k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f520410l;

    /* renamed from: m, reason: collision with root package name */
    public wp.a[] f520411m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f520412n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f520413o;

    public z0(xp.d dVar, vp.b bVar, java.util.Comparator comparator, zp.i iVar, zp.e eVar) {
        super(dVar, bVar, comparator, iVar, eVar);
        this.f520407i = "Danmaku_R2LWindow";
        this.f520407i = dVar.f537374i + "_R2LWindow";
    }

    @Override // vp.a
    public void a() {
        for (int i17 = 0; i17 < this.f520409k; i17++) {
            this.f520411m[i17] = null;
        }
        int size = ((java.util.ArrayList) this.f520412n).size();
        for (int i18 = 0; i18 < size; i18++) {
            java.util.Iterator it = ((java.util.List) ((java.util.ArrayList) this.f520412n).get(i18)).iterator();
            while (it.hasNext()) {
                wp.a aVar = (wp.a) it.next();
                it.remove();
                this.f520254a--;
                ((java.util.LinkedList) this.f520256c).add(aVar);
            }
        }
    }

    @Override // vp.a
    public wp.a c(zp.m mVar) {
        int size = ((java.util.ArrayList) this.f520412n).size();
        for (int i17 = 0; i17 < size; i17++) {
            for (wp.a aVar : (java.util.List) ((java.util.ArrayList) this.f520412n).get(i17)) {
                aVar.getClass();
                if (xp.d.f().f537384h) {
                    android.graphics.Point point = mVar.f556456b;
                    if (aVar.k(point.x, point.y, mVar.f556457c, mVar.f556455a)) {
                        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 0) {
                            aVar.m174284x9616526c();
                            aVar.i();
                        }
                        return aVar;
                    }
                }
            }
        }
        return null;
    }

    @Override // vp.a
    public void d() {
        xp.i f17 = xp.d.f();
        this.f520408j = f17.f537378b;
        if (this.f520410l == null || this.f520409k != f17.f537379c) {
            int i17 = f17.f537379c;
            this.f520409k = i17;
            this.f520410l = new int[i17];
            wp.a[] aVarArr = new wp.a[i17];
            wp.a[] aVarArr2 = this.f520411m;
            if (aVarArr2 != null) {
                java.lang.System.arraycopy(aVarArr2, 0, aVarArr, 0, java.lang.Math.min(i17, aVarArr2.length));
            }
            this.f520411m = aVarArr;
            java.util.List list = this.f520412n;
            if (list != null) {
                int size = ((java.util.ArrayList) list).size();
                if (size >= this.f520409k) {
                    while (true) {
                        size--;
                        if (size < this.f520409k) {
                            break;
                        }
                        this.f520256c.addAll((java.util.List) ((java.util.ArrayList) this.f520412n).remove(size));
                    }
                } else {
                    while (size < this.f520409k) {
                        ((java.util.ArrayList) this.f520412n).add(new java.util.LinkedList());
                        size++;
                    }
                }
            } else {
                this.f520412n = new java.util.ArrayList(this.f520409k);
                for (int i18 = 0; i18 < this.f520409k; i18++) {
                    ((java.util.ArrayList) this.f520412n).add(new java.util.LinkedList());
                }
            }
        }
        int e17 = this.f520258e.e();
        for (int i19 = 0; i19 < this.f520409k; i19++) {
            this.f520410l[i19] = (i19 * e17) + this.f520408j;
        }
        f(this.f520412n, this.f520410l);
        f(this.f520412n, this.f520410l);
    }

    public final void e(wp.a aVar, int i17, int i18) {
        if (aVar.f529875m && xp.i.f537375v) {
            this.f520259f.getClass();
        }
        aVar.s(i18, i17, this.f520260g.f556447a, this.f520261h.f556441a);
    }

    public final void f(java.util.List list, int[] iArr) {
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.Iterator it = ((java.util.List) list.get(i17)).iterator();
            while (it.hasNext()) {
                wp.f fVar = (wp.f) ((wp.a) it.next());
                fVar.c();
                long j17 = this.f520261h.f556441a;
                int i18 = (int) fVar.D;
                fVar.f529886x = true;
                fVar.f529885w = true;
                float f17 = fVar.f529871i;
                vp.d0.b(this.f520258e, fVar);
                float h17 = (fVar.f529871i + fVar.h()) / (f17 + fVar.h());
                fVar.f529867e.f556446a = ((float) r7.f556446a) * h17;
                fVar.u(j17);
                fVar.E = iArr[i17];
                fVar.D = i18;
            }
        }
    }
}
