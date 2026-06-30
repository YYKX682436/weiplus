package yl2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final yl2.h f544547d;

    /* renamed from: e, reason: collision with root package name */
    public static final yl2.h f544548e;

    /* renamed from: f, reason: collision with root package name */
    public static final yl2.h f544549f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ yl2.h[] f544550g;

    static {
        yl2.h hVar = new yl2.h("SUCCESS", 0);
        f544547d = hVar;
        yl2.h hVar2 = new yl2.h("FAILED", 1);
        f544548e = hVar2;
        yl2.h hVar3 = new yl2.h("NEED_REFRESH", 2);
        f544549f = hVar3;
        yl2.h[] hVarArr = {hVar, hVar2, hVar3};
        f544550g = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static yl2.h m177255xdce0328(java.lang.String str) {
        return (yl2.h) java.lang.Enum.valueOf(yl2.h.class, str);
    }

    /* renamed from: values */
    public static yl2.h[] m177256xcee59d22() {
        return (yl2.h[]) f544550g.clone();
    }
}
