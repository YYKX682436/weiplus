package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes10.dex */
public final class y {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.v f189998e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.v(null);

    /* renamed from: a, reason: collision with root package name */
    public long f189999a;

    /* renamed from: b, reason: collision with root package name */
    public long f190000b;

    /* renamed from: c, reason: collision with root package name */
    public so2.z0 f190001c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f190002d = new java.util.ArrayList();

    public final int a(so2.y0 item) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentLoader", "addItem " + item.mo2128x1ed62e84());
        long t07 = item.f492236d.t0();
        java.util.ArrayList arrayList = this.f190002d;
        if (t07 == 0) {
            java.util.Iterator it = arrayList.iterator();
            i17 = 0;
            while (it.hasNext()) {
                if (((so2.y0) it.next()).f492236d.f68961xf609be94 == item.f492236d.f68961xf609be94) {
                    break;
                }
                i17++;
            }
            i17 = -1;
        } else {
            java.util.Iterator it6 = arrayList.iterator();
            i17 = 0;
            while (it6.hasNext()) {
                if (((so2.y0) it6.next()).f492236d.t0() == item.f492236d.t0()) {
                    break;
                }
                i17++;
            }
            i17 = -1;
        }
        if (i17 >= 0) {
            arrayList.set(i17, item);
            return i17;
        }
        if (item.f492236d.Y0() != 0) {
            int g17 = g(item.f492236d.Y0(), true);
            arrayList.add(g17, item);
            return g17;
        }
        int size = arrayList.size();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = item.f492236d;
        if (yj0Var.f68965x29d3a50c == -1 || yj0Var.f209929x0 || hc2.c0.c(yj0Var.z0())) {
            size = this.f190001c != null ? 1 : 0;
        }
        arrayList.add(size, item);
        return size;
    }

    public final void b(java.util.List itemList, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemList, "itemList");
        java.util.List d17 = d(itemList);
        int size = itemList.size() - ((java.util.ArrayList) d17).size();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reduce size: ");
        sb6.append(size);
        sb6.append(", data size: ");
        java.util.ArrayList arrayList = this.f190002d;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentLoader", sb6.toString());
        if (z17) {
            arrayList.addAll(this.f190001c == null ? 0 : 1, d17);
        } else if (z18) {
            arrayList.addAll(arrayList.size(), d17);
        }
    }

    public final jz5.l c(long j17) {
        java.util.ArrayList arrayList = this.f190002d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i17 = -1;
        int i18 = 0;
        for (java.lang.Object obj : arrayList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.y0 y0Var = (so2.y0) obj;
            if (y0Var.f492236d.t0() == j17) {
                i17 = i18;
            }
            if (y0Var.f492236d.t0() == j17 || y0Var.f492236d.Y0() == j17) {
                arrayList2.add(obj);
            }
            i18 = i19;
        }
        int size = arrayList2.size();
        arrayList.removeAll(arrayList2);
        return new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(size));
    }

    public final java.util.List d(java.util.List list) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            so2.y0 y0Var = (so2.y0) it.next();
            java.util.ArrayList arrayList2 = this.f190002d;
            java.util.Iterator it6 = arrayList2.iterator();
            int i18 = 0;
            while (true) {
                i17 = -1;
                if (!it6.hasNext()) {
                    i18 = -1;
                    break;
                }
                if (((so2.y0) it6.next()).f492236d.t0() == y0Var.f492236d.t0()) {
                    break;
                }
                i18++;
            }
            java.util.Iterator it7 = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                if (((so2.y0) it7.next()).f492236d.t0() == y0Var.f492236d.t0()) {
                    i17 = i19;
                    break;
                }
                i19++;
            }
            if (i18 >= 0) {
                arrayList2.set(i18, y0Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentLoader", "filter1:" + y0Var.f492236d.t0() + ", " + y0Var.f492236d.m60786xb1ff73bc());
            } else if (i17 >= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentLoader", "filter2:" + y0Var.f492236d.t0());
            } else {
                arrayList.add(y0Var);
            }
        }
        return arrayList;
    }

    public final int e(long j17) {
        java.util.Iterator it = this.f190002d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (((so2.y0) it.next()).f492236d.t0() == j17) {
                return i17;
            }
            i17++;
        }
        return -1;
    }

    public final so2.y0 f(int i17) {
        java.lang.Object obj = this.f190002d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return (so2.y0) obj;
    }

    public final int g(long j17, boolean z17) {
        int i17;
        java.util.ArrayList arrayList = this.f190002d;
        java.util.Iterator it = arrayList.iterator();
        int i18 = 0;
        while (true) {
            i17 = -1;
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            if (((so2.y0) it.next()).f492236d.t0() == j17) {
                break;
            }
            i18++;
        }
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            if (((so2.y0) listIterator.previous()).f492236d.Y0() == j17) {
                i17 = listIterator.nextIndex();
                break;
            }
        }
        return (z17 && i17 >= 0) ? i17 + 1 : i18 + 1;
    }

    public final int h() {
        return this.f190002d.size();
    }

    public final boolean i(so2.y0 comment1, so2.y0 comment2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment1, "comment1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment2, "comment2");
        return comment1.f492236d.Y0() != 0 && comment1.f492236d.Y0() == comment2.f492236d.Y0();
    }
}
