package vp;

/* loaded from: classes16.dex */
public class y0 extends vp.x0 {

    /* renamed from: p, reason: collision with root package name */
    public static final int f520395p = (int) (((i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 168.0f) * 1.0f) * j65.f.g()) / 400.0f);

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f520396g;

    /* renamed from: h, reason: collision with root package name */
    public int f520397h;

    /* renamed from: i, reason: collision with root package name */
    public int f520398i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f520399j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f520400k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f520401l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f520402m;

    /* renamed from: n, reason: collision with root package name */
    public int f520403n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f520404o;

    public y0(xp.d dVar, vp.b bVar, zp.i iVar, zp.e eVar) {
        super(dVar, bVar, iVar, eVar);
        this.f520396g = "Danmaku_PreLayoutR2LWindow";
        this.f520396g = dVar.f537374i + "_PreLayoutR2LWindow";
    }

    @Override // vp.x0
    public void a() {
        java.util.List list;
        int size = ((java.util.ArrayList) this.f520400k).size();
        int i17 = 0;
        while (true) {
            list = this.f520387b;
            if (i17 >= size) {
                break;
            }
            java.util.Iterator it = ((java.util.List) ((java.util.ArrayList) this.f520400k).get(i17)).iterator();
            while (it.hasNext()) {
                wp.a aVar = (wp.a) it.next();
                it.remove();
                this.f520386a--;
                ((java.util.LinkedList) list).add(aVar);
                aVar.x(false);
            }
            i17++;
        }
        if (this.f520401l == null) {
            return;
        }
        for (int i18 = 0; i18 < ((java.util.ArrayList) this.f520401l).size(); i18++) {
            java.util.Iterator it6 = ((java.util.List) ((java.util.ArrayList) this.f520401l).get(i18)).iterator();
            while (it6.hasNext()) {
                wp.a aVar2 = (wp.a) it6.next();
                it6.remove();
                this.f520386a--;
                ((java.util.LinkedList) list).add(aVar2);
                aVar2.x(false);
            }
        }
    }

    @Override // vp.x0
    public wp.a d(zp.m mVar) {
        int size = ((java.util.ArrayList) this.f520400k).size();
        for (int i17 = 0; i17 < size; i17++) {
            for (wp.a aVar : (java.util.List) ((java.util.ArrayList) this.f520400k).get(i17)) {
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

    @Override // vp.x0
    public void e() {
        xp.i f17 = xp.d.f();
        this.f520397h = f17.f537378b;
        this.f520398i = f17.f537379c;
        xp.i f18 = xp.d.f();
        java.util.LinkedList linkedList = f18.f537396t;
        java.util.List list = f18.f537397u;
        int i17 = this.f520398i;
        boolean z17 = f18.f537392p;
        java.lang.String str = this.f520396g;
        int i18 = f520395p;
        if (list != null && !list.isEmpty() && z17) {
            int m75939xb282bd08 = ((r45.f43) list.get(0)).m75939xb282bd08(4);
            if (m75939xb282bd08 <= 0) {
                m75939xb282bd08 = this.f520398i;
            }
            int e17 = this.f520389d.e();
            i17 = java.lang.Math.max(1, java.lang.Math.min(m75939xb282bd08, i18 / e17));
            f18.f537394r = i17;
            int[] iArr = this.f520399j;
            if (iArr == null || iArr.length != i17) {
                this.f520399j = new int[i17];
            }
            for (int i19 = 0; i19 < i17; i19++) {
                this.f520399j[i19] = (i19 * e17) + this.f520397h;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "relayoutDanmakuLines: followInfo maxLineCount=%d, actualLineCount=%d, lineHeight=%d, maxHeight=%d", java.lang.Integer.valueOf(m75939xb282bd08), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(i18));
        } else if (linkedList == null || linkedList.isEmpty() || !z17) {
            int i27 = this.f520398i;
            f18.f537394r = i27;
            int[] iArr2 = this.f520399j;
            if (iArr2 == null || iArr2.length != i27) {
                this.f520399j = new int[i27];
            }
            int e18 = this.f520389d.e();
            for (int i28 = 0; i28 < this.f520398i; i28++) {
                this.f520399j[i28] = (i28 * e18) + this.f520397h;
            }
        } else {
            java.util.LinkedList linkedList2 = new java.util.LinkedList(linkedList);
            linkedList2.sort(java.util.Comparator.comparingInt(new vp.C30657x6bf79aa()));
            int[] iArr3 = this.f520399j;
            if (iArr3 == null || iArr3.length != this.f520398i) {
                this.f520399j = new int[this.f520398i];
            }
            int e19 = this.f520389d.e();
            int i29 = 0;
            while (true) {
                if (i29 >= this.f520398i) {
                    break;
                }
                int i37 = i29 > 0 ? this.f520399j[i29 - 1] + e19 : this.f520397h;
                int i38 = i37 + e19;
                for (int i39 = 0; i39 < linkedList2.size(); i39++) {
                    android.graphics.Rect rect = (android.graphics.Rect) linkedList2.get(i39);
                    int i47 = rect.top;
                    int i48 = rect.bottom;
                    if (i37 >= i48 || i38 <= i47) {
                        if (i38 < i47) {
                            break;
                        }
                    } else {
                        i38 = i48 + e19;
                        i37 = i48;
                    }
                }
                if (i37 + e19 > i18) {
                    i17 = java.lang.Math.max(1, i29);
                    f18.f537394r = i17;
                    break;
                } else {
                    this.f520399j[i29] = i37;
                    i29++;
                }
            }
        }
        java.util.List list2 = this.f520400k;
        java.util.List list3 = this.f520387b;
        if (list2 != null) {
            int size = ((java.util.ArrayList) list2).size();
            if (size < i17) {
                for (int size2 = ((java.util.ArrayList) this.f520400k).size(); size2 < i17; size2++) {
                    ((java.util.ArrayList) this.f520400k).add(new java.util.LinkedList());
                }
            } else {
                for (int i49 = size - 1; i49 >= i17; i49--) {
                    list3.addAll((java.util.List) ((java.util.ArrayList) this.f520400k).remove(i49));
                }
            }
        } else {
            this.f520400k = new java.util.ArrayList(i17);
            for (int i57 = 0; i57 < i17; i57++) {
                ((java.util.ArrayList) this.f520400k).add(new java.util.LinkedList());
            }
        }
        f(this.f520400k, this.f520399j);
        xp.i f19 = xp.d.f();
        java.util.List list4 = f19.f537397u;
        boolean z18 = f19.f537392p;
        if (list4 == null || list4.isEmpty() || !z18) {
            java.util.List list5 = this.f520401l;
            if (list5 != null) {
                java.util.Iterator it = ((java.util.ArrayList) list5).iterator();
                while (it.hasNext()) {
                    java.util.List<wp.a> list6 = (java.util.List) it.next();
                    for (wp.a aVar : list6) {
                        list3.add(aVar);
                        aVar.x(false);
                    }
                    list6.clear();
                }
            }
            this.f520403n = 0;
            this.f520402m = null;
        } else {
            int m75939xb282bd082 = ((r45.f43) list4.get(0)).m75939xb282bd08(4);
            if (m75939xb282bd082 <= 0) {
                m75939xb282bd082 = this.f520398i;
            }
            int e27 = this.f520389d.e();
            int min = java.lang.Math.min(m75939xb282bd082, i18 / e27);
            this.f520403n = min;
            int max = java.lang.Math.max(1, min);
            this.f520403n = max;
            int[] iArr4 = this.f520402m;
            if (iArr4 == null || iArr4.length != max) {
                this.f520402m = new int[max];
            }
            for (int i58 = 0; i58 < this.f520403n; i58++) {
                this.f520402m[i58] = (i58 * e27) + this.f520397h;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "relayoutFollowDanmakuLines: maxLineCount=%d, actualLineCount=%d, lineHeight=%d, maxHeight=%d", java.lang.Integer.valueOf(m75939xb282bd082), java.lang.Integer.valueOf(this.f520403n), java.lang.Integer.valueOf(e27), java.lang.Integer.valueOf(i18));
        }
        java.util.List list7 = this.f520401l;
        if (list7 != null) {
            int size3 = ((java.util.ArrayList) list7).size();
            int i59 = this.f520403n;
            if (size3 < i59) {
                while (size3 < this.f520403n) {
                    ((java.util.ArrayList) this.f520401l).add(new java.util.LinkedList());
                    size3++;
                }
            } else if (size3 > i59) {
                for (int i66 = size3 - 1; i66 >= this.f520403n; i66--) {
                    list3.addAll((java.util.List) ((java.util.ArrayList) this.f520401l).remove(i66));
                }
            }
        } else {
            this.f520401l = new java.util.ArrayList(this.f520403n);
            for (int i67 = 0; i67 < this.f520403n; i67++) {
                ((java.util.ArrayList) this.f520401l).add(new java.util.LinkedList());
            }
        }
        f(this.f520401l, this.f520402m);
    }

    public final void f(java.util.List list, int[] iArr) {
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.Iterator it = ((java.util.List) list.get(i17)).iterator();
            while (it.hasNext()) {
                wp.f fVar = (wp.f) ((wp.a) it.next());
                fVar.c();
                long j17 = this.f520391f.f556441a;
                int i18 = (int) fVar.D;
                fVar.f529886x = true;
                fVar.f529885w = true;
                float f17 = fVar.f529871i;
                vp.d0.b(this.f520389d, fVar);
                float h17 = (fVar.f529871i + fVar.h()) / (f17 + fVar.h());
                fVar.f529867e.f556446a = ((float) r7.f556446a) * h17;
                fVar.u(j17);
                fVar.E = iArr[i17];
                fVar.D = i18;
            }
        }
    }
}
