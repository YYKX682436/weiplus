package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/storage/FinderConfigDynamicData;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/DynamicConfigUpdatedEvent;", "<init>", "()V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.storage.FinderConfigDynamicData */
/* loaded from: classes3.dex */
public final class C14991xce12a441 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80> {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f207901d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f207902e;

    public C14991xce12a441() {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f207901d = "FinderConfigDynamicData";
        this.f207902e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.v70.f209709d);
        mo48813x58998cd();
        this.f39173x3fe91575 = -443124368;
    }

    public final java.util.concurrent.ConcurrentHashMap c() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f207902e).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80 c5313xa7be6d80) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80 event = c5313xa7be6d80;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.concurrent.ConcurrentHashMap c17 = c();
        synchronized (c17) {
            for (java.util.Map.Entry entry : c17.entrySet()) {
                java.lang.Object d17 = d((java.lang.String) entry.getKey(), entry.getValue());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f207901d, "dynamic config " + ((java.lang.String) entry.getKey()) + " update to " + d17);
            }
        }
        return false;
    }

    public final java.lang.Object d(java.lang.String str, java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.String str2 = this.f207901d;
        try {
            if (gm0.j1.s(c25.e.class) != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b() != null) {
                if (obj instanceof java.lang.Integer) {
                    ip.j b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
                    obj3 = java.lang.Integer.valueOf(b17.b(str, ((java.lang.Integer) obj).intValue()));
                } else if (obj instanceof java.lang.Long) {
                    ip.j b18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
                    obj3 = (java.lang.Long) java.lang.Integer.valueOf(b18.b(str, ((java.lang.Integer) obj).intValue()));
                } else if (obj instanceof java.lang.String) {
                    obj3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(str);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                    java.lang.String str3 = (java.lang.String) obj;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (obj3 == null) {
                        obj3 = str3;
                    }
                } else {
                    obj3 = obj;
                }
                java.lang.Object obj4 = obj3 == null ? null : obj3;
                if (obj4 != null) {
                    c().put(str, obj4);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "update finderDynamicConfValue " + str + " result=" + obj3 + " defaultValue=" + obj);
                return obj3;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "update finderDynamicConfValue keyName:" + str + ", return default " + obj);
            return obj;
        } catch (c01.c e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "updateValue " + str + " err,defaultValue=" + obj + ", " + e17.getMessage());
            obj2 = obj != null ? obj : null;
            if (obj2 != null) {
                c().put(str, obj2);
            }
            return obj;
        } catch (java.lang.IllegalStateException e18) {
            obj2 = obj != null ? obj : null;
            if (obj2 != null) {
                c().put(str, obj2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "updateValue " + str + " err,defaultValue=" + obj + ", " + e18.getMessage());
            return obj;
        }
    }
}
