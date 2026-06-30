package oo4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final oo4.a f428723e;

    /* renamed from: f, reason: collision with root package name */
    public static final oo4.a f428724f;

    /* renamed from: g, reason: collision with root package name */
    public static final oo4.a f428725g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ oo4.a[] f428726h;

    /* renamed from: d, reason: collision with root package name */
    public final int f428727d;

    static {
        oo4.a aVar = new oo4.a("None", 0, 0);
        f428723e = aVar;
        oo4.a aVar2 = new oo4.a("Auto", 1, 1);
        f428724f = aVar2;
        oo4.a aVar3 = new oo4.a("Manual", 2, 2);
        f428725g = aVar3;
        oo4.a[] aVarArr = {aVar, aVar2, aVar3};
        f428726h = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
        this.f428727d = i18;
    }

    /* renamed from: valueOf */
    public static oo4.a m152096xdce0328(java.lang.String str) {
        return (oo4.a) java.lang.Enum.valueOf(oo4.a.class, str);
    }

    /* renamed from: values */
    public static oo4.a[] m152097xcee59d22() {
        return (oo4.a[]) f428726h.clone();
    }
}
