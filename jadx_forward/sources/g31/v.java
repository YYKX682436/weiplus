package g31;

/* loaded from: classes9.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f349656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g31.y f349657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f349658f;

    public v(java.util.List list, g31.y yVar, java.util.List list2) {
        this.f349656d = list;
        this.f349657e = yVar;
        this.f349658f = list2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List list;
        java.util.List<com.p314xaae8f345.mm.p965xc41bc71e.C11155xafcbdcb0> list2 = this.f349656d;
        g31.y yVar = this.f349657e;
        for (com.p314xaae8f345.mm.p965xc41bc71e.C11155xafcbdcb0 c11155xafcbdcb0 : list2) {
            k31.a aVar = yVar.f349662a;
            if (aVar != null) {
                java.lang.String bizUsername = c11155xafcbdcb0.f153300d;
                boolean z17 = c11155xafcbdcb0.f153301e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeStorageManager", "updateDiskSubscribeSwitchOpened bizUsername: " + bizUsername + ", switchOpened: " + z17);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(((k31.h) aVar).c());
                com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7 c11161xb2ee02d7 = null;
                java.lang.String string = M.getString(bizUsername, null);
                if (string != null) {
                    try {
                        e31.f creator = com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7.f32582x681a0c0c;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(creator, "creator");
                        byte[] decode = android.util.Base64.decode(string, 0);
                        android.os.Parcel obtain = android.os.Parcel.obtain();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
                        obtain.unmarshall(decode, 0, decode.length);
                        obtain.setDataPosition(0);
                        java.lang.Object createFromParcel = creator.createFromParcel(obtain);
                        obtain.recycle();
                        c11161xb2ee02d7 = (com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7) createFromParcel;
                    } catch (java.lang.Exception unused) {
                        M.W(bizUsername);
                    }
                }
                com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7 c11161xb2ee02d72 = new com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7((c11161xb2ee02d7 == null || (list = c11161xb2ee02d7.f153365d) == null) ? new java.util.ArrayList() : kz5.n0.V0(kz5.n0.V(list)), z17);
                try {
                    android.os.Parcel obtain2 = android.os.Parcel.obtain();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain2, "obtain(...)");
                    c11161xb2ee02d72.writeToParcel(obtain2, 0);
                    byte[] marshall = obtain2.marshall();
                    obtain2.recycle();
                    java.lang.String encodeToString = android.util.Base64.encodeToString(marshall, 0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "encodeToString(...)");
                    M.putString(bizUsername, encodeToString);
                } catch (java.lang.Exception unused2) {
                    M.W(bizUsername);
                }
            }
            k31.a aVar2 = yVar.f349662a;
            if (aVar2 != null) {
                ((k31.h) aVar2).f(c11155xafcbdcb0.f153300d, c11155xafcbdcb0.f153302f);
            }
        }
        ((ku5.t0) ku5.t0.f394148d).B(new g31.u(this.f349656d, this.f349658f, this.f349657e));
    }
}
