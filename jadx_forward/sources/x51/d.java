package x51;

/* loaded from: classes11.dex */
public class d implements wu5.h {

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f533510i = new byte[0];

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f533511m = new x51.c(android.os.Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f533512d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f533513e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f533514f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f533515g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.i8 f533516h;

    public d(x51.a aVar) {
    }

    public final java.util.List a(int i17, java.util.List list) {
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddrBookSyncHelper", "sync address book failed, null info list");
            return new java.util.LinkedList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String[] strArr = (java.lang.String[]) it.next();
            if (strArr != null) {
                java.lang.String str = strArr[0];
                java.lang.String str2 = strArr[1];
                java.lang.String str3 = strArr[2];
                java.lang.String str4 = strArr[3];
                long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(strArr[4]);
                if (str3 != null) {
                    if (!str3.equals("")) {
                        java.lang.String g17 = i17 == 1 ? kk.k.g(str3.getBytes()) : "";
                        if (i17 == 0) {
                            java.lang.String a17 = o25.b.a(str3);
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                                java.lang.String g18 = kk.k.g(a17.getBytes());
                                if (!com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddrBookSyncHelper", "convertAddr m:%s md5:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(a17), g18);
                                }
                                g17 = g18;
                            }
                        }
                        r61.a aVar = new r61.a();
                        aVar.f474322e = str2;
                        aVar.f474323f = x51.k.b(str2);
                        aVar.f474324g = x51.k.a(str2);
                        aVar.f474320c = str;
                        aVar.f474333p = str4;
                        aVar.f474319b = g17;
                        aVar.f474318a = r61.a.d(g17);
                        aVar.N = E1;
                        aVar.f474337t = aVar.a();
                        if (i17 == 1) {
                            aVar.f474331n = str3;
                        }
                        if (i17 == 0) {
                            aVar.f474330m = str3;
                        }
                        aVar.f474329l = i17;
                        aVar.O = 1095798;
                        arrayList.add(aVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public final void b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i8 i8Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i8("MicroMsg.AddrBookSyncHelper", "delete");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = this.f533513e.iterator();
        while (it.hasNext()) {
            linkedList.add(((java.lang.String[]) it.next())[2]);
        }
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        android.database.Cursor f17 = m61.k.wi().f474352d.f("select addr_upload2.moblie , addr_upload2.md5 from addr_upload2 where addr_upload2.type = 0", null, 2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (f17.moveToNext()) {
            arrayList2.add(new java.lang.String[]{f17.getString(0), f17.getString(1)});
        }
        f17.close();
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            java.lang.String[] strArr = (java.lang.String[]) it6.next();
            java.lang.String str = strArr[0];
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = strArr[1];
            if (str2 == null) {
                str2 = "";
            }
            if (!str.equals("") && !linkedList.contains(str)) {
                arrayList.add(str2);
            }
        }
        if (arrayList.size() > 0) {
            ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
            m61.k.wi().g(arrayList);
            r61.q0.d(arrayList);
        }
        i8Var.a("end");
        i8Var.b();
    }

    public final java.util.List c(java.util.List list, int i17, int i18) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (i17 < i18) {
            linkedList.add((r61.a) list.get(i17));
            i17++;
        }
        return linkedList;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "AddrBookSyncHelper_addrBookRead";
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List c17;
        java.util.List c18;
        synchronized (f533510i) {
            java.util.HashSet hashSet = x51.e.f533522a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putInt("ADDRBOOK_HAD_UPDATE_KEY", 1);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.i8 i8Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i8("MicroMsg.AddrBookSyncHelper", "sync addrBook");
            this.f533516h = i8Var;
            i8Var.a("sync begin");
            this.f533512d = new java.util.LinkedList();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddrBookSyncHelper", "sync address book email size: " + this.f533512d.size());
            this.f533515g = a(1, this.f533512d);
            this.f533513e = o25.b.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddrBookSyncHelper", "sync address book mobile size: " + this.f533513e.size());
            this.f533514f = a(0, this.f533513e);
            if (this.f533512d != null && this.f533515g.size() > 0) {
                int i17 = 0;
                while (i17 < this.f533515g.size()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddrBookSyncHelper", "sync email index: " + i17);
                    int i18 = i17 + 100;
                    if (i18 < this.f533515g.size()) {
                        c18 = c(this.f533515g, i17, i18);
                    } else {
                        java.util.List list = this.f533515g;
                        c18 = c(list, i17, list.size());
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddrBookSyncHelper", "sync email listToSync size: " + c18.size());
                    r61.q0.m(1, c18);
                    i17 = i18;
                }
            }
            java.util.List list2 = this.f533514f;
            if (list2 != null && list2.size() != 0) {
                int i19 = 0;
                while (i19 < this.f533514f.size()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddrBookSyncHelper", "sync mobile index: " + i19);
                    if (!gm0.j1.a()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddrBookSyncHelper", "account not ready, stop sync");
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = f533511m;
                        android.os.Message mo50288x733c63a2 = n3Var.mo50288x733c63a2();
                        mo50288x733c63a2.obj = java.lang.Boolean.FALSE;
                        n3Var.mo50308x2936bf5f(mo50288x733c63a2);
                        return;
                    }
                    int i27 = i19 + 100;
                    if (i27 < this.f533514f.size()) {
                        c17 = c(this.f533514f, i19, i27);
                    } else {
                        java.util.List list3 = this.f533514f;
                        c17 = c(list3, i19, list3.size());
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddrBookSyncHelper", "sync mobile listToSync size: " + c17.size());
                    r61.q0.m(0, c17);
                    i19 = i27;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddrBookSyncHelper", "sync ok");
                if (!gm0.j1.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddrBookSyncHelper", "account not ready, exit");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = f533511m;
                    android.os.Message mo50288x733c63a22 = n3Var2.mo50288x733c63a2();
                    mo50288x733c63a22.obj = java.lang.Boolean.FALSE;
                    n3Var2.mo50308x2936bf5f(mo50288x733c63a22);
                    return;
                }
                b();
                java.lang.System.currentTimeMillis();
                this.f533516h.a("sync ok");
                this.f533516h.b();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var3 = f533511m;
                android.os.Message mo50288x733c63a23 = n3Var3.mo50288x733c63a2();
                mo50288x733c63a23.obj = java.lang.Boolean.TRUE;
                n3Var3.mo50308x2936bf5f(mo50288x733c63a23);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddrBookSyncHelper", "mobile list null stop service");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var4 = f533511m;
            android.os.Message mo50288x733c63a24 = n3Var4.mo50288x733c63a2();
            mo50288x733c63a24.obj = java.lang.Boolean.FALSE;
            n3Var4.mo50308x2936bf5f(mo50288x733c63a24);
        }
    }
}
