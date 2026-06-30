package com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R#\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/mvvmlist/SingleItemConvertFactory;", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "Ljava/lang/Class;", "clazz", "Ljava/lang/Class;", "getClazz", "()Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mvvmlist.SingleItemConvertFactory */
/* loaded from: classes4.dex */
public final class C16719xcd1e3852 implements in5.s {
    private final java.lang.Class<? extends in5.r> clazz;

    public C16719xcd1e3852(java.lang.Class<? extends in5.r> clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        this.clazz = clazz;
    }

    /* renamed from: getClazz */
    public final java.lang.Class<? extends in5.r> m67445x744350a2() {
        return this.clazz;
    }

    @Override // in5.s
    /* renamed from: getItemConvert */
    public in5.r mo43555xf2bb75ea(int type) {
        in5.r newInstance = this.clazz.newInstance();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newInstance, "newInstance(...)");
        return newInstance;
    }
}
