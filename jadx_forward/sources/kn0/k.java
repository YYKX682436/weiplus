package kn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final kn0.k f391099d;

    /* renamed from: e, reason: collision with root package name */
    public static final kn0.k f391100e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kn0.k[] f391101f;

    static {
        kn0.k kVar = new kn0.k("NORMAL_MODE", 0);
        f391099d = kVar;
        kn0.k kVar2 = new kn0.k("AUDIO_MODE", 1);
        f391100e = kVar2;
        kn0.k[] kVarArr = {kVar, kVar2};
        f391101f = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static kn0.k m143753xdce0328(java.lang.String str) {
        return (kn0.k) java.lang.Enum.valueOf(kn0.k.class, str);
    }

    /* renamed from: values */
    public static kn0.k[] m143754xcee59d22() {
        return (kn0.k[]) f391101f.clone();
    }
}
