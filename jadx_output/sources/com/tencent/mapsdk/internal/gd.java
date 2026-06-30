package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class gd<T extends com.tencent.mapsdk.internal.gd.a> {

    /* renamed from: c, reason: collision with root package name */
    private static final int f49566c = 50;

    /* renamed from: e, reason: collision with root package name */
    private static final int f49567e = 40;

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.ft f49568a;

    /* renamed from: b, reason: collision with root package name */
    private final int f49569b;

    /* renamed from: d, reason: collision with root package name */
    private java.util.Set<T> f49570d;

    /* renamed from: f, reason: collision with root package name */
    private java.util.List<com.tencent.mapsdk.internal.gd<T>> f49571f;

    /* loaded from: classes13.dex */
    public interface a {
        com.tencent.mapsdk.internal.fu a();
    }

    private gd(double d17, double d18, double d19, double d27) {
        this(new com.tencent.mapsdk.internal.ft(d17, d18, d19, d27));
    }

    private boolean b(T t17) {
        com.tencent.mapsdk.internal.fu a17 = t17.a();
        if (!this.f49568a.a(a17.f49467a, a17.f49468b)) {
            return false;
        }
        double d17 = a17.f49467a;
        double d18 = a17.f49468b;
        com.tencent.mapsdk.internal.gd<T> gdVar = this;
        while (true) {
            java.util.List<com.tencent.mapsdk.internal.gd<T>> list = gdVar.f49571f;
            if (list == null) {
                break;
            }
            com.tencent.mapsdk.internal.ft ftVar = gdVar.f49568a;
            if (d18 < ftVar.f49466f) {
                if (d17 < ftVar.f49465e) {
                    gdVar = list.get(0);
                } else {
                    gdVar = list.get(1);
                }
            } else if (d17 < ftVar.f49465e) {
                gdVar = list.get(2);
            } else {
                gdVar = list.get(3);
            }
        }
        java.util.Set<T> set = gdVar.f49570d;
        if (set == null) {
            return false;
        }
        return set.remove(t17);
    }

    public final void a(T t17) {
        com.tencent.mapsdk.internal.fu a17 = t17.a();
        if (this.f49568a.a(a17.f49467a, a17.f49468b)) {
            a(a17.f49467a, a17.f49468b, t17);
        }
    }

    public gd(com.tencent.mapsdk.internal.ft ftVar) {
        this(ftVar, 0);
    }

    private gd(double d17, double d18, double d19, double d27, int i17) {
        this(new com.tencent.mapsdk.internal.ft(d17, d18, d19, d27), i17);
    }

    private gd(com.tencent.mapsdk.internal.ft ftVar, int i17) {
        this.f49571f = null;
        this.f49568a = ftVar;
        this.f49569b = i17;
    }

    private void a(double d17, double d18, T t17) {
        com.tencent.mapsdk.internal.gd<T> gdVar = this;
        while (true) {
            java.util.List<com.tencent.mapsdk.internal.gd<T>> list = gdVar.f49571f;
            if (list == null) {
                break;
            }
            com.tencent.mapsdk.internal.ft ftVar = gdVar.f49568a;
            if (d18 < ftVar.f49466f) {
                if (d17 < ftVar.f49465e) {
                    gdVar = list.get(0);
                } else {
                    gdVar = list.get(1);
                }
            } else if (d17 < ftVar.f49465e) {
                gdVar = list.get(2);
            } else {
                gdVar = list.get(3);
            }
        }
        if (gdVar.f49570d == null) {
            gdVar.f49570d = new java.util.HashSet();
        }
        gdVar.f49570d.add(t17);
        if (gdVar.f49570d.size() <= 50 || gdVar.f49569b >= 40) {
            return;
        }
        gdVar.a();
    }

    private boolean b(double d17, double d18, T t17) {
        com.tencent.mapsdk.internal.gd<T> gdVar = this;
        while (true) {
            java.util.List<com.tencent.mapsdk.internal.gd<T>> list = gdVar.f49571f;
            if (list == null) {
                break;
            }
            com.tencent.mapsdk.internal.ft ftVar = gdVar.f49568a;
            if (d18 < ftVar.f49466f) {
                if (d17 < ftVar.f49465e) {
                    gdVar = list.get(0);
                } else {
                    gdVar = list.get(1);
                }
            } else if (d17 < ftVar.f49465e) {
                gdVar = list.get(2);
            } else {
                gdVar = list.get(3);
            }
        }
        java.util.Set<T> set = gdVar.f49570d;
        if (set == null) {
            return false;
        }
        return set.remove(t17);
    }

    private void a() {
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        this.f49571f = arrayList;
        com.tencent.mapsdk.internal.ft ftVar = this.f49568a;
        arrayList.add(new com.tencent.mapsdk.internal.gd(ftVar.f49461a, ftVar.f49465e, ftVar.f49462b, ftVar.f49466f, this.f49569b + 1));
        java.util.List<com.tencent.mapsdk.internal.gd<T>> list = this.f49571f;
        com.tencent.mapsdk.internal.ft ftVar2 = this.f49568a;
        list.add(new com.tencent.mapsdk.internal.gd<>(ftVar2.f49465e, ftVar2.f49463c, ftVar2.f49462b, ftVar2.f49466f, this.f49569b + 1));
        java.util.List<com.tencent.mapsdk.internal.gd<T>> list2 = this.f49571f;
        com.tencent.mapsdk.internal.ft ftVar3 = this.f49568a;
        list2.add(new com.tencent.mapsdk.internal.gd<>(ftVar3.f49461a, ftVar3.f49465e, ftVar3.f49466f, ftVar3.f49464d, this.f49569b + 1));
        java.util.List<com.tencent.mapsdk.internal.gd<T>> list3 = this.f49571f;
        com.tencent.mapsdk.internal.ft ftVar4 = this.f49568a;
        list3.add(new com.tencent.mapsdk.internal.gd<>(ftVar4.f49465e, ftVar4.f49463c, ftVar4.f49466f, ftVar4.f49464d, this.f49569b + 1));
        java.util.Set<T> set = this.f49570d;
        this.f49570d = null;
        for (T t17 : set) {
            a(t17.a().f49467a, t17.a().f49468b, t17);
        }
    }

    private void b() {
        this.f49571f = null;
        java.util.Set<T> set = this.f49570d;
        if (set != null) {
            set.clear();
        }
    }

    public final java.util.Collection<T> a(com.tencent.mapsdk.internal.ft ftVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a(ftVar, arrayList);
        return arrayList;
    }

    private void a(com.tencent.mapsdk.internal.ft ftVar, java.util.Collection<T> collection) {
        if (this.f49568a.a(ftVar)) {
            java.util.List<com.tencent.mapsdk.internal.gd<T>> list = this.f49571f;
            if (list != null) {
                java.util.Iterator<com.tencent.mapsdk.internal.gd<T>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(ftVar, collection);
                }
                return;
            }
            java.util.Set<T> set = this.f49570d;
            if (set != null) {
                com.tencent.mapsdk.internal.ft ftVar2 = this.f49568a;
                if (ftVar2.f49461a >= ftVar.f49461a && ftVar2.f49463c <= ftVar.f49463c && ftVar2.f49462b >= ftVar.f49462b && ftVar2.f49464d <= ftVar.f49464d) {
                    collection.addAll(set);
                    return;
                }
                for (T t17 : set) {
                    com.tencent.mapsdk.internal.fu a17 = t17.a();
                    if (ftVar.a(a17.f49467a, a17.f49468b)) {
                        collection.add(t17);
                    }
                }
            }
        }
    }
}
