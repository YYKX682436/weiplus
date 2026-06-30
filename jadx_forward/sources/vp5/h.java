package vp5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final vp5.h f520644d;

    /* renamed from: e, reason: collision with root package name */
    public static final vp5.h f520645e;

    /* renamed from: f, reason: collision with root package name */
    public static final vp5.h f520646f;

    /* renamed from: g, reason: collision with root package name */
    public static final vp5.h f520647g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ vp5.h[] f520648h;

    static {
        vp5.h hVar = new vp5.h("Foreground", 0);
        f520644d = hVar;
        vp5.h hVar2 = new vp5.h("Background", 1);
        f520645e = hVar2;
        vp5.h hVar3 = new vp5.h("Suspended", 2);
        f520646f = hVar3;
        vp5.h hVar4 = new vp5.h("Destroyed", 3);
        f520647g = hVar4;
        vp5.h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
        f520648h = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static vp5.h m172465xdce0328(java.lang.String str) {
        return (vp5.h) java.lang.Enum.valueOf(vp5.h.class, str);
    }

    /* renamed from: values */
    public static vp5.h[] m172466xcee59d22() {
        return (vp5.h[]) f520648h.clone();
    }
}
