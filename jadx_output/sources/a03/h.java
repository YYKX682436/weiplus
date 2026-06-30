package a03;

/* loaded from: classes7.dex */
public abstract class h {
    public static final java.lang.String a() {
        return "flutter_revision:" + b();
    }

    public static final java.lang.String b() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193118n;
        if (str == null || str.length() == 0) {
            return "";
        }
        java.lang.String FLUTTER_SDK_VERSION = com.tencent.mm.sdk.platformtools.z.f193118n;
        kotlin.jvm.internal.o.f(FLUTTER_SDK_VERSION, "FLUTTER_SDK_VERSION");
        java.util.List f07 = r26.n0.f0(FLUTTER_SDK_VERSION, new java.lang.String[]{"-"}, false, 0, 6, null);
        return f07.size() > 1 ? (java.lang.String) f07.get(1) : "";
    }
}
