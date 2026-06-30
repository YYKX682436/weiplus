package pm;

/* loaded from: classes11.dex */
public class g implements java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public int f438286d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final pm.d f438287e;

    /* renamed from: f, reason: collision with root package name */
    public final pm.b f438288f;

    public g(pm.e eVar) {
        pm.d dVar = new pm.d();
        this.f438287e = dVar;
        pm.b bVar = new pm.b();
        this.f438288f = bVar;
        dVar.a();
        bVar.g();
    }

    public void d(z2.n1 n1Var, int i17) {
        if (n1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Notification.Queue", "manager is null???");
        } else {
            n1Var.f551038b.cancel(null, i17);
            k(i17);
        }
    }

    public int e() {
        pm.d dVar = this.f438287e;
        if (dVar.f438284a == null) {
            dVar.a();
        }
        java.util.Iterator<com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe> it = dVar.f438284a.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += it.next().f145000p;
        }
        return i17;
    }

    public int g(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return -1;
        }
        java.util.Iterator it = this.f438288f.iterator();
        while (it.hasNext()) {
            pm.a aVar = (pm.a) it.next();
            if (aVar.f438279f.equals(str)) {
                return aVar.f438277d;
            }
        }
        return -1;
    }

    public int h(java.lang.String str, boolean z17) {
        java.lang.System.currentTimeMillis();
        java.util.Iterator it = this.f438288f.iterator();
        java.lang.String str2 = "";
        while (it.hasNext()) {
            str2 = str2 + ((pm.a) it.next()).f438277d + ",";
        }
        int i17 = z17 ? 4097 : 4102;
        while (true) {
            if (!str2.contains(i17 + "")) {
                break;
            }
            i17++;
        }
        int i18 = (i17 < 4102 || !z17) ? i17 : 4097;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && z17) {
            i18 = str.hashCode();
        }
        java.lang.System.currentTimeMillis();
        return i18;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        pm.d dVar = this.f438287e;
        if (dVar.f438284a == null) {
            dVar.a();
        }
        return dVar.f438284a.iterator();
    }

    public com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe j(com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe c10313x2dcd4ebe) {
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe c10313x2dcd4ebe2 = null;
        if (c10313x2dcd4ebe == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Notification.Queue", "notification item null when put");
            return null;
        }
        int i17 = c10313x2dcd4ebe.f144991d;
        if (i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Notification.Queue", "notification id = -1(NotificationItem.INVALID_ID) when put");
            return null;
        }
        int i18 = this.f438286d;
        if (i18 > 0) {
            if (i18 == i17) {
                k(i18);
            }
            this.f438286d = -1;
        }
        k(c10313x2dcd4ebe.f144991d);
        pm.d dVar = this.f438287e;
        if (dVar.f438284a == null) {
            dVar.a();
        }
        if (dVar.f438284a.size() >= 5) {
            int i19 = 0;
            while (true) {
                pm.d dVar2 = this.f438287e;
                if (dVar2.f438284a == null) {
                    dVar2.a();
                }
                if (i19 >= dVar2.f438284a.size()) {
                    break;
                }
                pm.d dVar3 = this.f438287e;
                if (dVar3.f438284a == null) {
                    dVar3.a();
                }
                com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe c10313x2dcd4ebe3 = dVar3.f438284a.get(i19);
                if (c10313x2dcd4ebe3.f144998n) {
                    pm.b bVar = this.f438288f;
                    bVar.getClass();
                    if (bVar.d(c10313x2dcd4ebe3.f144991d)) {
                        c10313x2dcd4ebe3.m43393x9616526c();
                    }
                    pm.d dVar4 = this.f438287e;
                    synchronized (dVar4) {
                        if (dVar4.f438284a == null) {
                            dVar4.a();
                        }
                        if (dVar4.f438284a.remove(c10313x2dcd4ebe3)) {
                            dVar4.b();
                        }
                    }
                    c10313x2dcd4ebe2 = c10313x2dcd4ebe3;
                } else {
                    i19++;
                }
            }
        }
        pm.d dVar5 = this.f438287e;
        synchronized (dVar5) {
            if (dVar5.f438284a == null) {
                dVar5.a();
            }
            if (dVar5.f438284a.add(c10313x2dcd4ebe)) {
                dVar5.b();
            }
        }
        pm.b bVar2 = this.f438288f;
        synchronized (bVar2) {
            if (bVar2.f438283d == null) {
                bVar2.g();
            }
            bVar2.d(c10313x2dcd4ebe.f144991d);
            if (!c10313x2dcd4ebe.f144998n || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c10313x2dcd4ebe.f144995h)) {
                bVar2.f438283d.add(new pm.a(c10313x2dcd4ebe.f144991d, c10313x2dcd4ebe.f144998n));
                c10313x2dcd4ebe.m43393x9616526c();
            } else {
                java.util.Iterator it = bVar2.f438283d.iterator();
                boolean z17 = true;
                while (it.hasNext()) {
                    pm.a aVar = (pm.a) it.next();
                    if (aVar.f438279f.equals(c10313x2dcd4ebe.f144995h)) {
                        int i27 = c10313x2dcd4ebe.f144991d;
                        long j17 = c10313x2dcd4ebe.f144996i;
                        java.lang.String str = c10313x2dcd4ebe.f144995h;
                        int i28 = c10313x2dcd4ebe.f144997m;
                        boolean z18 = c10313x2dcd4ebe.f144998n;
                        int i29 = c10313x2dcd4ebe.f144999o;
                        aVar.f438277d = i27;
                        aVar.f438278e = j17;
                        aVar.f438279f = str;
                        aVar.f438280g = i28;
                        aVar.f438281h = z18;
                        aVar.f438282i = i29;
                        z17 = false;
                    }
                }
                if (z17) {
                    bVar2.f438283d.add(new pm.a(c10313x2dcd4ebe.f144991d, c10313x2dcd4ebe.f144996i, c10313x2dcd4ebe.f144995h, c10313x2dcd4ebe.f144997m, c10313x2dcd4ebe.f144998n, c10313x2dcd4ebe.f144999o));
                    c10313x2dcd4ebe.m43393x9616526c();
                }
            }
            bVar2.h();
        }
        java.lang.String m43393x9616526c = c10313x2dcd4ebe.m43393x9616526c();
        pm.d dVar6 = this.f438287e;
        if (dVar6.f438284a == null) {
            dVar6.a();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Queue", "put item: %s, queuesize: %d", m43393x9616526c, java.lang.Integer.valueOf(dVar6.f438284a.size()));
        return c10313x2dcd4ebe2;
    }

    public void k(int i17) {
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe c10313x2dcd4ebe;
        this.f438288f.d(i17);
        pm.d dVar = this.f438287e;
        synchronized (dVar) {
            if (dVar.f438284a == null) {
                dVar.a();
            }
            java.util.Iterator<com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe> it = dVar.f438284a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c10313x2dcd4ebe = null;
                    break;
                } else {
                    c10313x2dcd4ebe = it.next();
                    if (c10313x2dcd4ebe.f144991d == i17) {
                        break;
                    }
                }
            }
            if (c10313x2dcd4ebe != null && dVar.f438284a.remove(c10313x2dcd4ebe)) {
                dVar.b();
            }
        }
        if (c10313x2dcd4ebe != null) {
            synchronized (c10313x2dcd4ebe) {
                android.graphics.Bitmap bitmap = c10313x2dcd4ebe.f144992e;
                if (bitmap != null && !bitmap.isRecycled()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationItem", "recycle bitmap:%s", c10313x2dcd4ebe.f144992e.toString());
                    c10313x2dcd4ebe.f144992e.recycle();
                }
                c10313x2dcd4ebe.f144993f = null;
                c10313x2dcd4ebe.f144992e = null;
                c10313x2dcd4ebe.f144994g = null;
            }
        }
    }
}
