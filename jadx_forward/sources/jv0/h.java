package jv0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final jv0.h f383724d;

    /* renamed from: e, reason: collision with root package name */
    public static final jv0.h f383725e;

    /* renamed from: f, reason: collision with root package name */
    public static final jv0.h f383726f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ jv0.h[] f383727g;

    static {
        jv0.h hVar = new jv0.h("NORMAL", 0);
        f383724d = hVar;
        jv0.h hVar2 = new jv0.h("TRIMMING", 1);
        f383725e = hVar2;
        jv0.h hVar3 = new jv0.h("MOVING", 2);
        f383726f = hVar3;
        jv0.h[] hVarArr = {hVar, hVar2, hVar3};
        f383727g = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static jv0.h m141437xdce0328(java.lang.String str) {
        return (jv0.h) java.lang.Enum.valueOf(jv0.h.class, str);
    }

    /* renamed from: values */
    public static jv0.h[] m141438xcee59d22() {
        return (jv0.h[]) f383727g.clone();
    }
}
