package ru3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ru3.m[] f481295d;

    static {
        ru3.m[] mVarArr = {new ru3.m("TOP_LEFT", 0, 0), new ru3.m("TOP_RIGHT", 1, 1), new ru3.m("BOTTOM_LEFT", 2, 2), new ru3.m("BOTTOM_RIGHT", 3, 3), new ru3.m("TOP_LEFT_OUT", 4, 4), new ru3.m("TOP_RIGHT_OUT", 5, 5), new ru3.m("BOTTOM_LEFT_OUT", 6, 6), new ru3.m("BOTTOM_RIGHT_OUT", 7, 7)};
        f481295d = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static ru3.m m163042xdce0328(java.lang.String str) {
        return (ru3.m) java.lang.Enum.valueOf(ru3.m.class, str);
    }

    /* renamed from: values */
    public static ru3.m[] m163043xcee59d22() {
        return (ru3.m[]) f481295d.clone();
    }
}
