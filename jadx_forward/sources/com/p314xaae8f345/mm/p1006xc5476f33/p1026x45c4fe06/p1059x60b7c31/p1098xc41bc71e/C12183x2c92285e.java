package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/msgsubscription/GetSubscribeMsgListExecutor;", "Lcom/tencent/mm/plugin/appbrand/jsapi/msgsubscription/ISubscribeMsgCGIExecutor;", "com/tencent/mm/plugin/appbrand/jsapi/msgsubscription/e", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor */
/* loaded from: classes9.dex */
public final class C12183x2c92285e implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.InterfaceC12184xe53caf98 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12183x2c92285e> f34536x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.d();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f163828d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f163829e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f163830f;

    /* renamed from: g, reason: collision with root package name */
    public final int f163831g;

    /* renamed from: h, reason: collision with root package name */
    public o31.a f163832h = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.c.f163856a;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.e f163833i;

    /* renamed from: m, reason: collision with root package name */
    public m31.p1 f163834m;

    /* renamed from: n, reason: collision with root package name */
    public ul1.j f163835n;

    public C12183x2c92285e(java.lang.String str, java.util.List list, java.lang.String str2, int i17) {
        this.f163828d = str;
        this.f163829e = list;
        this.f163830f = str2;
        this.f163831g = i17;
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.e eVar = this.f163833i;
        if (eVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.q) eVar).f163885a.a(i17, i18, errMsg, c11158xe7d16ed5);
        }
    }

    public void b(android.content.Context context, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.util.ArrayList arrayList = result.f153318h;
        if (arrayList.size() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.e eVar = this.f163833i;
            if (eVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.q) eVar).a(this.f163828d, arrayList, null);
                return;
            }
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) it.next();
            if (c11159x8f55e6d3.f153347t) {
                arrayList2.add(new m31.a1(c11159x8f55e6d3.f153338h == 1, c11159x8f55e6d3.f153335e, c11159x8f55e6d3.f153339i, c11159x8f55e6d3.f153336f, c11159x8f55e6d3.f153349v, c11159x8f55e6d3.f153337g));
            } else if (c11159x8f55e6d3.f153350w) {
                arrayList2.add(new m31.z0(c11159x8f55e6d3.f153338h == 1, c11159x8f55e6d3.f153335e, c11159x8f55e6d3.f153339i, c11159x8f55e6d3.f153336f, c11159x8f55e6d3.f153351x, c11159x8f55e6d3.f153337g));
            } else {
                arrayList2.add(new m31.q0(c11159x8f55e6d3.f153338h == 1, c11159x8f55e6d3.f153335e, c11159x8f55e6d3.f153339i, c11159x8f55e6d3.f153336f, c11159x8f55e6d3.f153337g));
            }
        }
        boolean z17 = result.f153326s == 1;
        if (z17) {
            ((m31.q0) arrayList2.get(0)).f404733a = true;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.i(context, arrayList2, this, z17, arrayList2.size() == 1 && (arrayList2.get(0) instanceof m31.a1), result, ((com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) arrayList.get(0)).f153337g, new java.util.LinkedHashMap()));
    }

    public final m31.p1 c() {
        m31.p1 p1Var = this.f163834m;
        if (p1Var != null) {
            return p1Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("subscribeMsgRequestDialog");
        throw null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeString(this.f163828d);
        dest.writeStringList(this.f163829e);
        dest.writeString(this.f163830f);
        dest.writeInt(this.f163831g);
    }
}
