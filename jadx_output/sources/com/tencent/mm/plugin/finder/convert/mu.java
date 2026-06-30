package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public abstract class mu extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f104048e = jz5.h.b(com.tencent.mm.plugin.finder.convert.lu.f103948d);

    public final java.lang.String n(int i17) {
        if (((java.lang.Boolean) ((jz5.n) this.f104048e).getValue()).booleanValue()) {
            java.lang.String string = i17 < 10000 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lge, java.lang.Integer.valueOf(i17)) : i17 < 100000 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lga, java.lang.Double.valueOf(((i17 * 1.0f) / 10000) - 0.05d)) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lgc, 10);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        if (i17 < 10000) {
            return java.lang.String.valueOf(i17);
        }
        if (i17 < 100000) {
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lgb, java.lang.Double.valueOf(((i17 * 1.0f) / 1000) - 0.05d));
            kotlin.jvm.internal.o.d(string2);
            return string2;
        }
        java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lgd, 100);
        kotlin.jvm.internal.o.d(string3);
        return string3;
    }
}
