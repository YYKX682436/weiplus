package cf5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final cf5.h f40978d;

    /* renamed from: e, reason: collision with root package name */
    public static final cf5.h f40979e;

    /* renamed from: f, reason: collision with root package name */
    public static final cf5.h f40980f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cf5.h[] f40981g;

    static {
        cf5.h hVar = new cf5.h("SUCCESS", 0);
        f40978d = hVar;
        cf5.h hVar2 = new cf5.h("FAIL", 1);
        f40979e = hVar2;
        cf5.h hVar3 = new cf5.h("CANCEL", 2);
        f40980f = hVar3;
        cf5.h[] hVarArr = {hVar, hVar2, hVar3};
        f40981g = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    public static cf5.h valueOf(java.lang.String str) {
        return (cf5.h) java.lang.Enum.valueOf(cf5.h.class, str);
    }

    public static cf5.h[] values() {
        return (cf5.h[]) f40981g.clone();
    }
}
