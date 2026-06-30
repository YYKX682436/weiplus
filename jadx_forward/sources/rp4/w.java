package rp4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final rp4.w f480227d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ rp4.w[] f480228e;

    static {
        rp4.w wVar = new rp4.w("CENTER_CROP", 0);
        rp4.w wVar2 = new rp4.w("CENTER_INSIDE", 1);
        rp4.w wVar3 = new rp4.w("FIT_CENTER", 2);
        f480227d = wVar3;
        rp4.w[] wVarArr = {wVar, wVar2, wVar3};
        f480228e = wVarArr;
        rz5.b.a(wVarArr);
    }

    public w(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static rp4.w m162854xdce0328(java.lang.String str) {
        return (rp4.w) java.lang.Enum.valueOf(rp4.w.class, str);
    }

    /* renamed from: values */
    public static rp4.w[] m162855xcee59d22() {
        return (rp4.w[]) f480228e.clone();
    }
}
