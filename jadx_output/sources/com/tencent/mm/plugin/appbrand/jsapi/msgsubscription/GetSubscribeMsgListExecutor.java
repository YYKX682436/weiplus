package com.tencent.mm.plugin.appbrand.jsapi.msgsubscription;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/msgsubscription/GetSubscribeMsgListExecutor;", "Lcom/tencent/mm/plugin/appbrand/jsapi/msgsubscription/ISubscribeMsgCGIExecutor;", "com/tencent/mm/plugin/appbrand/jsapi/msgsubscription/e", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class GetSubscribeMsgListExecutor implements com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.ISubscribeMsgCGIExecutor {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.d();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f82295d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f82296e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f82297f;

    /* renamed from: g, reason: collision with root package name */
    public final int f82298g;

    /* renamed from: h, reason: collision with root package name */
    public o31.a f82299h = com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.c.f82323a;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.e f82300i;

    /* renamed from: m, reason: collision with root package name */
    public m31.p1 f82301m;

    /* renamed from: n, reason: collision with root package name */
    public ul1.j f82302n;

    public GetSubscribeMsgListExecutor(java.lang.String str, java.util.List list, java.lang.String str2, int i17) {
        this.f82295d = str;
        this.f82296e = list;
        this.f82297f = str2;
        this.f82298g = i17;
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.e eVar = this.f82300i;
        if (eVar != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.q) eVar).f82352a.a(i17, i18, errMsg, subscribeMsgRequestResult);
        }
    }

    public void b(android.content.Context context, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult result) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(result, "result");
        java.util.ArrayList arrayList = result.f71785h;
        if (arrayList.size() == 0) {
            com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.e eVar = this.f82300i;
            if (eVar != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.q) eVar).a(this.f82295d, arrayList, null);
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
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) it.next();
            if (subscribeMsgTmpItem.f71814t) {
                arrayList2.add(new m31.a1(subscribeMsgTmpItem.f71805h == 1, subscribeMsgTmpItem.f71802e, subscribeMsgTmpItem.f71806i, subscribeMsgTmpItem.f71803f, subscribeMsgTmpItem.f71816v, subscribeMsgTmpItem.f71804g));
            } else if (subscribeMsgTmpItem.f71817w) {
                arrayList2.add(new m31.z0(subscribeMsgTmpItem.f71805h == 1, subscribeMsgTmpItem.f71802e, subscribeMsgTmpItem.f71806i, subscribeMsgTmpItem.f71803f, subscribeMsgTmpItem.f71818x, subscribeMsgTmpItem.f71804g));
            } else {
                arrayList2.add(new m31.q0(subscribeMsgTmpItem.f71805h == 1, subscribeMsgTmpItem.f71802e, subscribeMsgTmpItem.f71806i, subscribeMsgTmpItem.f71803f, subscribeMsgTmpItem.f71804g));
            }
        }
        boolean z17 = result.f71793s == 1;
        if (z17) {
            ((m31.q0) arrayList2.get(0)).f323200a = true;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.i(context, arrayList2, this, z17, arrayList2.size() == 1 && (arrayList2.get(0) instanceof m31.a1), result, ((com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) arrayList.get(0)).f71804g, new java.util.LinkedHashMap()));
    }

    public final m31.p1 c() {
        m31.p1 p1Var = this.f82301m;
        if (p1Var != null) {
            return p1Var;
        }
        kotlin.jvm.internal.o.o("subscribeMsgRequestDialog");
        throw null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.f82295d);
        dest.writeStringList(this.f82296e);
        dest.writeString(this.f82297f);
        dest.writeInt(this.f82298g);
    }
}
