package yn5;

/* loaded from: classes13.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f545568a;

    /* renamed from: b, reason: collision with root package name */
    public long f545569b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f545570c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f545571d;

    public l(java.lang.String actName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actName, "actName");
        this.f545568a = actName;
        this.f545570c = new java.util.ArrayList();
        this.f545571d = jz5.h.b(new yn5.i(this));
    }

    public final yn5.f a() {
        java.util.Iterator it = new java.util.ArrayList(this.f545570c).iterator();
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (it.hasNext()) {
            yn5.g gVar = (yn5.g) it.next();
            if (gVar != null) {
                i17++;
                long j27 = gVar.f545563b;
                j17 += j27;
                if (gVar.f545564c) {
                    i19++;
                    j19 += j27;
                } else {
                    i18++;
                    j18 += j27;
                }
            }
        }
        return new yn5.f(j17, j18, j19, i17, i18, i19, ((float) j18) / ((float) j17), i18 / i17);
    }

    public final java.lang.String b() {
        return "act:" + this.f545568a + " startTime:" + this.f545569b + "ms \n" + a() + "\n sortInfo:" + c();
    }

    public final java.lang.String c() {
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            for (yn5.g gVar : new java.util.ArrayList(this.f545570c)) {
                if (gVar != null) {
                    java.util.HashMap hashMap3 = gVar.f545564c ? hashMap : hashMap2;
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(gVar.f545562a);
                    java.lang.Object obj = hashMap3.get(valueOf);
                    if (obj == null) {
                        obj = new yn5.h(0L, 0, 3, null);
                        hashMap3.put(valueOf, obj);
                    }
                    yn5.h hVar = (yn5.h) obj;
                    hVar.f545565a += gVar.f545563b;
                    hVar.f545566b++;
                }
            }
            java.util.Set entrySet = hashMap.entrySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
            java.util.List<java.util.Map.Entry> F0 = kz5.n0.F0(entrySet, new yn5.j());
            java.util.Set entrySet2 = hashMap2.entrySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet2, "<get-entries>(...)");
            java.util.List<java.util.Map.Entry> F02 = kz5.n0.F0(entrySet2, new yn5.k());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("---- mainThread uniqueCnt:" + F0.size() + '\n');
            for (java.util.Map.Entry entry : F0) {
                android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
                java.lang.Object key = entry.getKey();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "<get-key>(...)");
                sb6.append(resources.getResourceEntryName(((java.lang.Number) key).intValue()) + ' ' + entry.getValue() + '\n');
            }
            sb6.append("---- asyncThread uniqueCnt:" + F02.size() + '\n');
            for (java.util.Map.Entry entry2 : F02) {
                android.content.res.Resources resources2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
                java.lang.Object key2 = entry2.getKey();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key2, "<get-key>(...)");
                sb6.append(resources2.getResourceEntryName(((java.lang.Number) key2).intValue()) + ' ' + entry2.getValue() + '\n');
            }
            java.lang.String sb7 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
            return sb7;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("InflateXMLInfo", th6, "getSortResult err", new java.lang.Object[0]);
            return "";
        }
    }

    /* renamed from: toString */
    public java.lang.String m177422x9616526c() {
        return "act:" + this.f545568a + " startTime:" + this.f545569b + "ms \n" + ((yn5.f) ((jz5.n) this.f545571d).mo141623x754a37bb());
    }
}
