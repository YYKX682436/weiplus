package fy0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final fy0.l f348722d;

    /* renamed from: e, reason: collision with root package name */
    public static final fy0.l f348723e;

    /* renamed from: f, reason: collision with root package name */
    public static final fy0.l f348724f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ fy0.l[] f348725g;

    static {
        fy0.l lVar = new fy0.l("Idle", 0);
        f348722d = lVar;
        fy0.l lVar2 = new fy0.l("DraggingItem", 1);
        f348723e = lVar2;
        fy0.l lVar3 = new fy0.l("Scaling", 2);
        f348724f = lVar3;
        fy0.l[] lVarArr = {lVar, lVar2, lVar3};
        f348725g = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static fy0.l m130547xdce0328(java.lang.String str) {
        return (fy0.l) java.lang.Enum.valueOf(fy0.l.class, str);
    }

    /* renamed from: values */
    public static fy0.l[] m130548xcee59d22() {
        return (fy0.l[]) f348725g.clone();
    }
}
