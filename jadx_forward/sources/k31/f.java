package k31;

/* loaded from: classes9.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f385366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f385368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f385369g;

    public f(int i17, java.lang.String str, java.util.List list, boolean z17) {
        this.f385366d = i17;
        this.f385367e = str;
        this.f385368f = list;
        this.f385369g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        k31.h hVar = k31.h.f385372a;
        int i17 = this.f385366d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.List list = this.f385368f;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(list.size());
        boolean z17 = this.f385369g;
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(z17);
        java.lang.String str2 = this.f385367e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeStorageManager", "saveSubscribeMsgList bizUsername: %s, scene: %d, size: %d, isOpened: %b", str2, valueOf, valueOf2, valueOf3);
        if (i17 == 1) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) it.next()).f153343p = true;
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(hVar.c());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(list);
        com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7 d17 = hVar.d(str2);
        java.util.List<com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3> list2 = d17 != null ? d17.f153365d : null;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (list2 != null) {
            for (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 : list2) {
                java.util.Iterator it6 = arrayList.iterator();
                boolean z18 = false;
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d32 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) it6.next();
                    c11159x8f55e6d32.f153343p = i17 == 1;
                    if (c11159x8f55e6d3 == null || (str = c11159x8f55e6d3.f153336f) == null) {
                        str = "";
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, c11159x8f55e6d32.f153336f)) {
                        z18 = true;
                    }
                }
                if (!z18 && c11159x8f55e6d3 != null && !c11159x8f55e6d3.f153343p) {
                    arrayList2.add(c11159x8f55e6d3);
                }
            }
        }
        arrayList2.addAll(arrayList);
        com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7 c11161xb2ee02d7 = new com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7(arrayList2, z17);
        android.os.Parcel obtain = android.os.Parcel.obtain();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
        c11161xb2ee02d7.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        java.lang.String encodeToString = android.util.Base64.encodeToString(marshall, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "encodeToString(...)");
        M.putString(str2, encodeToString);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            hVar.e(str2, arrayList2);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new k31.g(str2, arrayList2));
        }
        hVar.j(str2, z17);
    }
}
