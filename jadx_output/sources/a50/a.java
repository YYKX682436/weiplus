package a50;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final a50.a f1442e;

    /* renamed from: f, reason: collision with root package name */
    public static final a50.a f1443f;

    /* renamed from: g, reason: collision with root package name */
    public static final a50.a f1444g;

    /* renamed from: h, reason: collision with root package name */
    public static final a50.a f1445h;

    /* renamed from: i, reason: collision with root package name */
    public static final a50.a f1446i;

    /* renamed from: m, reason: collision with root package name */
    public static final a50.a f1447m;

    /* renamed from: n, reason: collision with root package name */
    public static final a50.a f1448n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ a50.a[] f1449o;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f1450d;

    static {
        a50.a aVar = new a50.a("ON_BIZ_INFO_CHANGE", 0, "OnBizInfoChange.onNotifyChange");
        f1442e = aVar;
        a50.a aVar2 = new a50.a("AFF_DATA_CHANGE", 1, "BoxAffBizCppToNativeManagerImpl.callOnDataChangeAsync");
        f1443f = aVar2;
        a50.a aVar3 = new a50.a("BIZ_CREATION_CENTER_INFO_UPDATE", 2, "BizCreationCenterInfoUpdateEvent.callback");
        f1444g = aVar3;
        a50.a aVar4 = new a50.a("PERSONAL_CENTER_RED_DOT", 3, "BizFlutterPersonalCenterRedDotMgr.subscribePersonalCenterEvent");
        f1445h = aVar4;
        a50.a aVar5 = new a50.a("SET_FINDER_RED_DOT", 4, "BizProcessorCommand.addFinderRedDot");
        f1446i = aVar5;
        a50.a aVar6 = new a50.a("INIT_FINDER_LIVE_DOT", 5, "BoxBizFlutterDigestHelper.initFinderLiveDot");
        f1447m = aVar6;
        a50.a aVar7 = new a50.a("AFF_FINDER_LIVE_INFO_CHANGED", 6, "BoxAffBizCppToNativeManagerImpl.callOnBizDigestFinderLiveInfoChangedAsync");
        f1448n = aVar7;
        a50.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, new a50.a("UNKNOWN", 7, com.eclipsesource.mmv8.Platform.UNKNOWN)};
        f1449o = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, java.lang.String str2) {
        this.f1450d = str2;
    }

    public static a50.a valueOf(java.lang.String str) {
        return (a50.a) java.lang.Enum.valueOf(a50.a.class, str);
    }

    public static a50.a[] values() {
        return (a50.a[]) f1449o.clone();
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f1450d;
    }
}
