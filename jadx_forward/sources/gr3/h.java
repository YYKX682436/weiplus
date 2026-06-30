package gr3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final gr3.h f356402e;

    /* renamed from: f, reason: collision with root package name */
    public static final gr3.h f356403f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ gr3.h[] f356404g;

    /* renamed from: d, reason: collision with root package name */
    public final int f356405d;

    static {
        gr3.h hVar = new gr3.h("CHAT_AND_MOMENTS", 0, 1);
        f356402e = hVar;
        gr3.h hVar2 = new gr3.h("ONLY_CHAT", 1, 2);
        f356403f = hVar2;
        gr3.h[] hVarArr = {hVar, hVar2};
        f356404g = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17, int i18) {
        this.f356405d = i18;
    }

    /* renamed from: valueOf */
    public static gr3.h m132073xdce0328(java.lang.String str) {
        return (gr3.h) java.lang.Enum.valueOf(gr3.h.class, str);
    }

    /* renamed from: values */
    public static gr3.h[] m132074xcee59d22() {
        return (gr3.h[]) f356404g.clone();
    }
}
