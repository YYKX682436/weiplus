package k31;

/* loaded from: classes9.dex */
public final class h implements k31.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k31.h f385372a = new k31.h();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f385373b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f385374c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f385375d = new java.util.HashMap();

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeStorageManager", "SubscribeMsg clearStorage");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(c()).clear();
    }

    public final void b(java.lang.String str, java.util.List list, boolean z17, boolean z18, boolean z19, boolean z27) {
        boolean z28;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(c());
        com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7 d17 = d(str);
        java.util.List<com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3> list2 = d17 != null ? d17.f153365d : null;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) it.next();
                if (list2 != null) {
                    z28 = false;
                    for (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d32 : list2) {
                        if (c11159x8f55e6d32.f153336f.equals(c11159x8f55e6d3.f153336f)) {
                            if (z18) {
                                c11159x8f55e6d32.f153340m = c11159x8f55e6d3.f153340m;
                                c11159x8f55e6d32.f153348u = c11159x8f55e6d3.f153348u;
                                c11159x8f55e6d32.f153347t = c11159x8f55e6d3.f153347t;
                                c11159x8f55e6d32.f153351x = c11159x8f55e6d3.f153351x;
                                c11159x8f55e6d32.f153350w = c11159x8f55e6d3.f153350w;
                                c11159x8f55e6d32.B = c11159x8f55e6d3.B;
                                c11159x8f55e6d32.C = c11159x8f55e6d3.C;
                                c11159x8f55e6d32.f153352y = c11159x8f55e6d3.f153352y;
                                c11159x8f55e6d32.A = c11159x8f55e6d3.A;
                            }
                            if (z27) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeStorageManager", "doSaveSubscribeStatus timestamp: %s", java.lang.Long.valueOf(c11159x8f55e6d3.f153342o));
                                c11159x8f55e6d32.f153342o = c11159x8f55e6d3.f153342o;
                            }
                            z28 = true;
                        }
                    }
                } else {
                    z28 = false;
                }
                if (!z28) {
                    arrayList.add(c11159x8f55e6d3);
                }
            }
        }
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeStorageManager", "saveSubscribeMsgUiStatus finalList: %d, switchOpen: %b, needUpateSwitchOpen: %b", java.lang.Integer.valueOf(arrayList.size()), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z19));
        com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7 c11161xb2ee02d7 = new com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7(arrayList, z19 ? z17 : d17 != null ? d17.f153366e : false);
        android.os.Parcel obtain = android.os.Parcel.obtain();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
        c11161xb2ee02d7.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        java.lang.String encodeToString = android.util.Base64.encodeToString(marshall, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "encodeToString(...)");
        M.putString(str, encodeToString);
        k31.d dVar = new k31.d(list, z19, str, z17, z18, z27);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            dVar.mo152xb9724478();
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(new k31.e(dVar));
        }
    }

    public final java.lang.String c() {
        return gm0.j1.b().j() + "_subscribe_msg_storage";
    }

    public com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7 d(java.lang.String bizUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(c());
        try {
            java.lang.String string = M.getString(bizUsername, null);
            if (string == null) {
                return null;
            }
            e31.f creator = com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7.f32582x681a0c0c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(creator, "creator");
            byte[] decode = android.util.Base64.decode(string, 0);
            android.os.Parcel obtain = android.os.Parcel.obtain();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
            obtain.unmarshall(decode, 0, decode.length);
            obtain.setDataPosition(0);
            java.lang.Object createFromParcel = creator.createFromParcel(obtain);
            obtain.recycle();
            com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7 c11161xb2ee02d7 = (com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7) createFromParcel;
            java.util.List V0 = kz5.n0.V0(kz5.n0.V(c11161xb2ee02d7.f153365d));
            c11161xb2ee02d7.f153365d = V0;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                e(bizUsername, V0);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new k31.g(bizUsername, V0));
            }
            j(bizUsername, c11161xb2ee02d7.f153366e);
            return c11161xb2ee02d7;
        } catch (java.lang.Exception unused) {
            M.putString(bizUsername, null);
            return null;
        }
    }

    public final void e(java.lang.String str, java.util.List list) {
        java.util.Iterator it = ((java.util.ArrayList) kz5.n0.V(list)).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) it.next();
            f385373b.put(str + c11159x8f55e6d3.f153336f, c11159x8f55e6d3);
        }
    }

    public void f(java.lang.String bizUsername, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeStorageManager", "updateDiskImportantNotifyNum bizUsername: " + bizUsername + ", importantNotifyNum: " + i17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(c()).A("important_notify_num_".concat(bizUsername), i17);
    }

    public void g(java.lang.String bizUsername, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeStorageManager", "updateMemImportantNotifyNum bizUsername: %s, importantNotifyNum: %d", bizUsername, java.lang.Integer.valueOf(i17));
        f385375d.put(bizUsername, java.lang.Integer.valueOf(i17));
    }

    public void h(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeStorageManager", "updateSubscribeGlobalAutoNotify: " + z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(c()).G("IsSubscribeGlobalAutoNotify", z17);
    }

    public void i(java.lang.String bizUsername, java.util.List list, boolean z17, boolean z18, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = bizUsername;
        objArr[1] = list != null ? java.lang.Integer.valueOf(list.size()) : null;
        objArr[2] = java.lang.Boolean.valueOf(z17);
        objArr[3] = java.lang.Boolean.valueOf(z18);
        objArr[4] = java.lang.Boolean.valueOf(z19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeStorageManager", "saveSubscribeMsgSubscribeStatus bizUsername: %s, size: %s, switchOpened: %b, needUpdateSwitchOpen: %b, needUpdateTimestamp: %b", objArr);
        b(bizUsername, list, z17, true, z18, z19);
    }

    public final void j(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeStorageManager", "updateSwitchOpen: %b", java.lang.Boolean.valueOf(z17));
        f385374c.put(str, java.lang.Boolean.valueOf(z17));
    }
}
