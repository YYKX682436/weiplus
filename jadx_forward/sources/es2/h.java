package es2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final es2.h f337897d;

    /* renamed from: e, reason: collision with root package name */
    public static final es2.h f337898e;

    /* renamed from: f, reason: collision with root package name */
    public static final es2.h f337899f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ es2.h[] f337900g;

    static {
        es2.h hVar = new es2.h("RESULT_REJECT", 0);
        f337897d = hVar;
        es2.h hVar2 = new es2.h("RESULT_AGREE", 1);
        f337898e = hVar2;
        es2.h hVar3 = new es2.h("RESULT_SUCCESS", 2);
        f337899f = hVar3;
        es2.h[] hVarArr = {hVar, hVar2, hVar3};
        f337900g = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static es2.h m128080xdce0328(java.lang.String str) {
        return (es2.h) java.lang.Enum.valueOf(es2.h.class, str);
    }

    /* renamed from: values */
    public static es2.h[] m128081xcee59d22() {
        return (es2.h[]) f337900g.clone();
    }
}
