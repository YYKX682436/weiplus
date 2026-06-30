package a50;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final a50.a f82975e;

    /* renamed from: f, reason: collision with root package name */
    public static final a50.a f82976f;

    /* renamed from: g, reason: collision with root package name */
    public static final a50.a f82977g;

    /* renamed from: h, reason: collision with root package name */
    public static final a50.a f82978h;

    /* renamed from: i, reason: collision with root package name */
    public static final a50.a f82979i;

    /* renamed from: m, reason: collision with root package name */
    public static final a50.a f82980m;

    /* renamed from: n, reason: collision with root package name */
    public static final a50.a f82981n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ a50.a[] f82982o;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f82983d;

    static {
        a50.a aVar = new a50.a("ON_BIZ_INFO_CHANGE", 0, "OnBizInfoChange.onNotifyChange");
        f82975e = aVar;
        a50.a aVar2 = new a50.a("AFF_DATA_CHANGE", 1, "BoxAffBizCppToNativeManagerImpl.callOnDataChangeAsync");
        f82976f = aVar2;
        a50.a aVar3 = new a50.a("BIZ_CREATION_CENTER_INFO_UPDATE", 2, "BizCreationCenterInfoUpdateEvent.callback");
        f82977g = aVar3;
        a50.a aVar4 = new a50.a("PERSONAL_CENTER_RED_DOT", 3, "BizFlutterPersonalCenterRedDotMgr.subscribePersonalCenterEvent");
        f82978h = aVar4;
        a50.a aVar5 = new a50.a("SET_FINDER_RED_DOT", 4, "BizProcessorCommand.addFinderRedDot");
        f82979i = aVar5;
        a50.a aVar6 = new a50.a("INIT_FINDER_LIVE_DOT", 5, "BoxBizFlutterDigestHelper.initFinderLiveDot");
        f82980m = aVar6;
        a50.a aVar7 = new a50.a("AFF_FINDER_LIVE_INFO_CHANGED", 6, "BoxAffBizCppToNativeManagerImpl.callOnBizDigestFinderLiveInfoChangedAsync");
        f82981n = aVar7;
        a50.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, new a50.a("UNKNOWN", 7, com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a)};
        f82982o = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, java.lang.String str2) {
        this.f82983d = str2;
    }

    /* renamed from: valueOf */
    public static a50.a m618xdce0328(java.lang.String str) {
        return (a50.a) java.lang.Enum.valueOf(a50.a.class, str);
    }

    /* renamed from: values */
    public static a50.a[] m619xcee59d22() {
        return (a50.a[]) f82982o.clone();
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f82983d;
    }
}
