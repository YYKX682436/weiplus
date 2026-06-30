package wd5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final wd5.a f526611e;

    /* renamed from: f, reason: collision with root package name */
    public static final wd5.a f526612f;

    /* renamed from: g, reason: collision with root package name */
    public static final wd5.a f526613g;

    /* renamed from: h, reason: collision with root package name */
    public static final wd5.a f526614h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ wd5.a[] f526615i;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f526616d;

    static {
        wd5.a aVar = new wd5.a("QuoteFromEmoji", 0, "handleEmojiQuoteMsgFillingFrom");
        wd5.a aVar2 = new wd5.a("QuoteFromVoice", 1, "handleVoiceQuoteMsgFillingFrom");
        f526611e = aVar2;
        wd5.a aVar3 = new wd5.a("QuoteFromImg", 2, "handleImgQuoteMsgFillingFrom");
        f526612f = aVar3;
        wd5.a aVar4 = new wd5.a("QuoteFromVideo", 3, "handleVideoQuoteMsgFillingFrom");
        f526613g = aVar4;
        wd5.a aVar5 = new wd5.a("UnKnown", 4, com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a);
        f526614h = aVar5;
        wd5.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        f526615i = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, java.lang.String str2) {
        this.f526616d = str2;
    }

    /* renamed from: valueOf */
    public static wd5.a m173565xdce0328(java.lang.String str) {
        return (wd5.a) java.lang.Enum.valueOf(wd5.a.class, str);
    }

    /* renamed from: values */
    public static wd5.a[] m173566xcee59d22() {
        return (wd5.a[]) f526615i.clone();
    }
}
