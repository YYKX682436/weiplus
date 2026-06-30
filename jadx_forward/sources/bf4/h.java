package bf4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final bf4.h f101250d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ bf4.h[] f101251e;

    static {
        bf4.h hVar = new bf4.h("FORWARD", 0, 0);
        bf4.h hVar2 = new bf4.h("BACKGROUND", 1, 1);
        f101250d = hVar2;
        bf4.h[] hVarArr = {hVar, hVar2};
        f101251e = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static bf4.h m10334xdce0328(java.lang.String str) {
        return (bf4.h) java.lang.Enum.valueOf(bf4.h.class, str);
    }

    /* renamed from: values */
    public static bf4.h[] m10335xcee59d22() {
        return (bf4.h[]) f101251e.clone();
    }
}
