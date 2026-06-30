package cf5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final cf5.h f122511d;

    /* renamed from: e, reason: collision with root package name */
    public static final cf5.h f122512e;

    /* renamed from: f, reason: collision with root package name */
    public static final cf5.h f122513f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cf5.h[] f122514g;

    static {
        cf5.h hVar = new cf5.h("SUCCESS", 0);
        f122511d = hVar;
        cf5.h hVar2 = new cf5.h("FAIL", 1);
        f122512e = hVar2;
        cf5.h hVar3 = new cf5.h("CANCEL", 2);
        f122513f = hVar3;
        cf5.h[] hVarArr = {hVar, hVar2, hVar3};
        f122514g = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static cf5.h m14765xdce0328(java.lang.String str) {
        return (cf5.h) java.lang.Enum.valueOf(cf5.h.class, str);
    }

    /* renamed from: values */
    public static cf5.h[] m14766xcee59d22() {
        return (cf5.h[]) f122514g.clone();
    }
}
