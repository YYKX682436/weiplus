package bf4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final bf4.h f19717d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ bf4.h[] f19718e;

    static {
        bf4.h hVar = new bf4.h("FORWARD", 0, 0);
        bf4.h hVar2 = new bf4.h("BACKGROUND", 1, 1);
        f19717d = hVar2;
        bf4.h[] hVarArr = {hVar, hVar2};
        f19718e = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17, int i18) {
    }

    public static bf4.h valueOf(java.lang.String str) {
        return (bf4.h) java.lang.Enum.valueOf(bf4.h.class, str);
    }

    public static bf4.h[] values() {
        return (bf4.h[]) f19718e.clone();
    }
}
