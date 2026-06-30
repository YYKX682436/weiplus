package bk4;

/* loaded from: classes11.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f103016a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f103017b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f103018c;

    static {
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f102626a;
        f103016a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_text_state_icon_resource_switch_and, bm5.h0.RepairerConfig_TextStatus_UseOldIconStrategy_Int, 0) == 1;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f103017b = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd>(a0Var) { // from class: com.tencent.mm.plugin.textstatus.util.IStatusIconHelperKt$checkResUpdateCacheFileEventIListener$1
            {
                this.f39173x3fe91575 = 905296653;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd event = c5255x5f3208fd;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.r2 r2Var = event.f135586g;
                if (r2Var.f89292a != 86 || r2Var.f89293b != 2) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusIconHelper", "checkResUpdateCacheFileEvent " + r2Var.f89294c);
                pm0.v.O("TextStatusThread", new bk4.g(event));
                return false;
            }
        };
        f103018c = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8>(a0Var) { // from class: com.tencent.mm.plugin.textstatus.util.IStatusIconHelperKt$localCheckResUpdateCacheFileEventIListener$1
            {
                this.f39173x3fe91575 = 1381597624;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8 c5688x8d5069c8) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8 event = c5688x8d5069c8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.dj djVar = event.f136013g;
                if (djVar.f88004a != 86 || djVar.f88005b != 2) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusIconHelper", "localCheckResUpdateCacheFileEvent " + djVar.f88006c);
                pm0.v.O("TextStatusThread", new bk4.h(event));
                return false;
            }
        };
    }

    public static final bk4.f a() {
        return f103016a ? bk4.y.f103151a : bk4.f0.f102998a;
    }
}
