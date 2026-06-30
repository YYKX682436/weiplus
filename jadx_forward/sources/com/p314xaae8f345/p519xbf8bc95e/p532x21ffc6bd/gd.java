package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class gd<T extends com.tencent.mapsdk.internal.gd.a> {

    /* renamed from: c, reason: collision with root package name */
    private static final int f131099c = 50;

    /* renamed from: e, reason: collision with root package name */
    private static final int f131100e = 40;

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft f131101a;

    /* renamed from: b, reason: collision with root package name */
    private final int f131102b;

    /* renamed from: d, reason: collision with root package name */
    private java.util.Set<T> f131103d;

    /* renamed from: f, reason: collision with root package name */
    private java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gd<T>> f131104f;

    /* loaded from: classes13.dex */
    public interface a {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a();
    }

    private gd(double d17, double d18, double d19, double d27) {
        this(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft(d17, d18, d19, d27));
    }

    private boolean b(T t17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a17 = t17.a();
        if (!this.f131101a.a(a17.f131000a, a17.f131001b)) {
            return false;
        }
        double d17 = a17.f131000a;
        double d18 = a17.f131001b;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gd<T> gdVar = this;
        while (true) {
            java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gd<T>> list = gdVar.f131104f;
            if (list == null) {
                break;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft ftVar = gdVar.f131101a;
            if (d18 < ftVar.f130999f) {
                if (d17 < ftVar.f130998e) {
                    gdVar = list.get(0);
                } else {
                    gdVar = list.get(1);
                }
            } else if (d17 < ftVar.f130998e) {
                gdVar = list.get(2);
            } else {
                gdVar = list.get(3);
            }
        }
        java.util.Set<T> set = gdVar.f131103d;
        if (set == null) {
            return false;
        }
        return set.remove(t17);
    }

    public final void a(T t17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a17 = t17.a();
        if (this.f131101a.a(a17.f131000a, a17.f131001b)) {
            a(a17.f131000a, a17.f131001b, t17);
        }
    }

    public gd(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft ftVar) {
        this(ftVar, 0);
    }

    private gd(double d17, double d18, double d19, double d27, int i17) {
        this(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft(d17, d18, d19, d27), i17);
    }

    private gd(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft ftVar, int i17) {
        this.f131104f = null;
        this.f131101a = ftVar;
        this.f131102b = i17;
    }

    private void a(double d17, double d18, T t17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gd<T> gdVar = this;
        while (true) {
            java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gd<T>> list = gdVar.f131104f;
            if (list == null) {
                break;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft ftVar = gdVar.f131101a;
            if (d18 < ftVar.f130999f) {
                if (d17 < ftVar.f130998e) {
                    gdVar = list.get(0);
                } else {
                    gdVar = list.get(1);
                }
            } else if (d17 < ftVar.f130998e) {
                gdVar = list.get(2);
            } else {
                gdVar = list.get(3);
            }
        }
        if (gdVar.f131103d == null) {
            gdVar.f131103d = new java.util.HashSet();
        }
        gdVar.f131103d.add(t17);
        if (gdVar.f131103d.size() <= 50 || gdVar.f131102b >= 40) {
            return;
        }
        gdVar.a();
    }

    private boolean b(double d17, double d18, T t17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gd<T> gdVar = this;
        while (true) {
            java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gd<T>> list = gdVar.f131104f;
            if (list == null) {
                break;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft ftVar = gdVar.f131101a;
            if (d18 < ftVar.f130999f) {
                if (d17 < ftVar.f130998e) {
                    gdVar = list.get(0);
                } else {
                    gdVar = list.get(1);
                }
            } else if (d17 < ftVar.f130998e) {
                gdVar = list.get(2);
            } else {
                gdVar = list.get(3);
            }
        }
        java.util.Set<T> set = gdVar.f131103d;
        if (set == null) {
            return false;
        }
        return set.remove(t17);
    }

    private void a() {
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        this.f131104f = arrayList;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft ftVar = this.f131101a;
        arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gd(ftVar.f130994a, ftVar.f130998e, ftVar.f130995b, ftVar.f130999f, this.f131102b + 1));
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gd<T>> list = this.f131104f;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft ftVar2 = this.f131101a;
        list.add(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gd<>(ftVar2.f130998e, ftVar2.f130996c, ftVar2.f130995b, ftVar2.f130999f, this.f131102b + 1));
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gd<T>> list2 = this.f131104f;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft ftVar3 = this.f131101a;
        list2.add(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gd<>(ftVar3.f130994a, ftVar3.f130998e, ftVar3.f130999f, ftVar3.f130997d, this.f131102b + 1));
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gd<T>> list3 = this.f131104f;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft ftVar4 = this.f131101a;
        list3.add(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gd<>(ftVar4.f130998e, ftVar4.f130996c, ftVar4.f130999f, ftVar4.f130997d, this.f131102b + 1));
        java.util.Set<T> set = this.f131103d;
        this.f131103d = null;
        for (T t17 : set) {
            a(t17.a().f131000a, t17.a().f131001b, t17);
        }
    }

    private void b() {
        this.f131104f = null;
        java.util.Set<T> set = this.f131103d;
        if (set != null) {
            set.clear();
        }
    }

    public final java.util.Collection<T> a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft ftVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a(ftVar, arrayList);
        return arrayList;
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft ftVar, java.util.Collection<T> collection) {
        if (this.f131101a.a(ftVar)) {
            java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gd<T>> list = this.f131104f;
            if (list != null) {
                java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gd<T>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(ftVar, collection);
                }
                return;
            }
            java.util.Set<T> set = this.f131103d;
            if (set != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ft ftVar2 = this.f131101a;
                if (ftVar2.f130994a >= ftVar.f130994a && ftVar2.f130996c <= ftVar.f130996c && ftVar2.f130995b >= ftVar.f130995b && ftVar2.f130997d <= ftVar.f130997d) {
                    collection.addAll(set);
                    return;
                }
                for (T t17 : set) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a17 = t17.a();
                    if (ftVar.a(a17.f131000a, a17.f131001b)) {
                        collection.add(t17);
                    }
                }
            }
        }
    }
}
