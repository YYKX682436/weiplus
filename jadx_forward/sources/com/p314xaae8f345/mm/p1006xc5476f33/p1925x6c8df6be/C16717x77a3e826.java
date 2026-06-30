package com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B;\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00070\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R/\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/mvvmlist/MapItemConvertFactory;", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "", "Ljava/lang/Class;", "map", "Ljava/util/Map;", "getMap", "()Ljava/util/Map;", "defaultConvert", "Ljava/lang/Class;", "getDefaultConvert", "()Ljava/lang/Class;", "<init>", "(Ljava/util/Map;Ljava/lang/Class;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mvvmlist.MapItemConvertFactory */
/* loaded from: classes.dex */
public final class C16717x77a3e826 implements in5.s {
    private final java.lang.Class<? extends in5.r> defaultConvert;
    private final java.util.Map<java.lang.Integer, java.lang.Class<? extends in5.r>> map;

    /* JADX WARN: Multi-variable type inference failed */
    public C16717x77a3e826(java.util.Map<java.lang.Integer, ? extends java.lang.Class<? extends in5.r>> map, java.lang.Class<? extends in5.r> defaultConvert) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultConvert, "defaultConvert");
        this.map = map;
        this.defaultConvert = defaultConvert;
    }

    /* renamed from: getDefaultConvert */
    public final java.lang.Class<? extends in5.r> m67443x9ec45128() {
        return this.defaultConvert;
    }

    @Override // in5.s
    /* renamed from: getItemConvert */
    public in5.r mo43555xf2bb75ea(int type) {
        java.lang.Class<? extends in5.r> cls = this.map.get(java.lang.Integer.valueOf(type));
        in5.r newInstance = cls != null ? cls.newInstance() : null;
        if (newInstance != null) {
            return newInstance;
        }
        in5.r newInstance2 = this.defaultConvert.newInstance();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newInstance2, "newInstance(...)");
        return newInstance2;
    }

    /* renamed from: getMap */
    public final java.util.Map<java.lang.Integer, java.lang.Class<? extends in5.r>> m67444xb5885626() {
        return this.map;
    }
}
