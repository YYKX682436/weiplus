package kd0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final kd0.a f388128e;

    /* renamed from: f, reason: collision with root package name */
    public static final kd0.a f388129f;

    /* renamed from: g, reason: collision with root package name */
    public static final kd0.a f388130g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kd0.a[] f388131h;

    /* renamed from: d, reason: collision with root package name */
    public final int f388132d;

    static {
        kd0.a aVar = new kd0.a("LONG_PRESS_IMAGE_SCAN_CODE", 0, 1);
        f388128e = aVar;
        kd0.a aVar2 = new kd0.a("OCR_REPORT_FOR_SCAN_CODE", 1, 2);
        f388129f = aVar2;
        kd0.a aVar3 = new kd0.a("OCR_FOR_WORD_DETECT", 2, 2);
        f388130g = aVar3;
        kd0.a[] aVarArr = {aVar, aVar2, aVar3};
        f388131h = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
        this.f388132d = i18;
    }

    /* renamed from: valueOf */
    public static kd0.a m142425xdce0328(java.lang.String str) {
        return (kd0.a) java.lang.Enum.valueOf(kd0.a.class, str);
    }

    /* renamed from: values */
    public static kd0.a[] m142426xcee59d22() {
        return (kd0.a[]) f388131h.clone();
    }
}
