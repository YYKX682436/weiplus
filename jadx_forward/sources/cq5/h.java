package cq5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final cq5.h f303071e;

    /* renamed from: f, reason: collision with root package name */
    public static final cq5.h f303072f;

    /* renamed from: g, reason: collision with root package name */
    public static final cq5.h f303073g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cq5.h[] f303074h;

    /* renamed from: d, reason: collision with root package name */
    public final int f303075d;

    static {
        cq5.h hVar = new cq5.h("SUCCESS", 0, 0);
        f303071e = hVar;
        cq5.h hVar2 = new cq5.h("INTERRUPTION", 1, 1);
        f303072f = hVar2;
        cq5.h hVar3 = new cq5.h("USER_END", 2, 2);
        f303073g = hVar3;
        cq5.h[] hVarArr = {hVar, hVar2, hVar3};
        f303074h = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17, int i18) {
        this.f303075d = i18;
    }

    /* renamed from: valueOf */
    public static cq5.h m122485xdce0328(java.lang.String str) {
        return (cq5.h) java.lang.Enum.valueOf(cq5.h.class, str);
    }

    /* renamed from: values */
    public static cq5.h[] m122486xcee59d22() {
        return (cq5.h[]) f303074h.clone();
    }
}
