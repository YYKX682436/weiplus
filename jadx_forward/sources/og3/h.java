package og3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final og3.h f426697d;

    /* renamed from: e, reason: collision with root package name */
    public static final og3.h f426698e;

    /* renamed from: f, reason: collision with root package name */
    public static final og3.h f426699f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ og3.h[] f426700g;

    static {
        og3.h hVar = new og3.h("MediaRemuxError", 0);
        f426697d = hVar;
        og3.h hVar2 = new og3.h("MediaRemuxSuccess", 1);
        f426698e = hVar2;
        og3.h hVar3 = new og3.h("MediaRemuxIgnore", 2);
        f426699f = hVar3;
        og3.h[] hVarArr = {hVar, hVar2, hVar3};
        f426700g = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static og3.h m151263xdce0328(java.lang.String str) {
        return (og3.h) java.lang.Enum.valueOf(og3.h.class, str);
    }

    /* renamed from: values */
    public static og3.h[] m151264xcee59d22() {
        return (og3.h[]) f426700g.clone();
    }
}
