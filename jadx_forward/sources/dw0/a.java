package dw0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final dw0.a f325611e;

    /* renamed from: f, reason: collision with root package name */
    public static final dw0.a f325612f;

    /* renamed from: g, reason: collision with root package name */
    public static final dw0.a f325613g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ dw0.a[] f325614h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f325615d;

    static {
        dw0.a aVar = new dw0.a("ORIGIN_TIMBRE", 0, "OriginTimbre");
        f325611e = aVar;
        dw0.a aVar2 = new dw0.a("TTS", 1, "publisher_tts_");
        f325612f = aVar2;
        dw0.a aVar3 = new dw0.a("SPEECH_ENHANCE", 2, "publisher_speech_enhance_");
        f325613g = aVar3;
        dw0.a[] aVarArr = {aVar, aVar2, aVar3};
        f325614h = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, java.lang.String str2) {
        this.f325615d = str2;
    }

    /* renamed from: valueOf */
    public static dw0.a m126313xdce0328(java.lang.String str) {
        return (dw0.a) java.lang.Enum.valueOf(dw0.a.class, str);
    }

    /* renamed from: values */
    public static dw0.a[] m126314xcee59d22() {
        return (dw0.a[]) f325614h.clone();
    }
}
