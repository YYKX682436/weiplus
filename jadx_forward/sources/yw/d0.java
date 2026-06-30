package yw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final yw.d0 f547824e;

    /* renamed from: f, reason: collision with root package name */
    public static final yw.d0 f547825f;

    /* renamed from: g, reason: collision with root package name */
    public static final yw.d0 f547826g;

    /* renamed from: h, reason: collision with root package name */
    public static final yw.d0 f547827h;

    /* renamed from: i, reason: collision with root package name */
    public static final yw.d0 f547828i;

    /* renamed from: m, reason: collision with root package name */
    public static final yw.d0 f547829m;

    /* renamed from: n, reason: collision with root package name */
    public static final yw.d0 f547830n;

    /* renamed from: o, reason: collision with root package name */
    public static final yw.d0 f547831o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ yw.d0[] f547832p;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f547833d;

    static {
        yw.d0 d0Var = new yw.d0("ON_BIZ_INFO_CHANGE", 0, "OnBizInfoChange.onNotifyChange");
        f547824e = d0Var;
        yw.d0 d0Var2 = new yw.d0("AFF_DATA_CHANGE", 1, "AffBizCppToNativeManagerImpl.callOnDataChangeAsync");
        f547825f = d0Var2;
        yw.d0 d0Var3 = new yw.d0("BIZ_CREATION_CENTER_INFO_UPDATE", 2, "BizCreationCenterInfoUpdateEvent.callback");
        f547826g = d0Var3;
        yw.d0 d0Var4 = new yw.d0("PERSONAL_CENTER_RED_DOT", 3, "BizFlutterPersonalCenterRedDotMgr.subscribePersonalCenterEvent");
        f547827h = d0Var4;
        yw.d0 d0Var5 = new yw.d0("SET_FINDER_RED_DOT", 4, "BizProcessorCommand.addFinderRedDot");
        f547828i = d0Var5;
        yw.d0 d0Var6 = new yw.d0("INIT_FINDER_LIVE_DOT", 5, "BizFlutterDigestHelper.initFinderLiveDot");
        f547829m = d0Var6;
        yw.d0 d0Var7 = new yw.d0("AFF_FINDER_LIVE_INFO_CHANGED", 6, "AffBizCppToNativeManagerImpl.callOnBizDigestFinderLiveInfoChangedAsync");
        f547830n = d0Var7;
        yw.d0 d0Var8 = new yw.d0("UNKNOWN", 7, com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a);
        f547831o = d0Var8;
        yw.d0[] d0VarArr = {d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8};
        f547832p = d0VarArr;
        rz5.b.a(d0VarArr);
    }

    public d0(java.lang.String str, int i17, java.lang.String str2) {
        this.f547833d = str2;
    }

    /* renamed from: valueOf */
    public static yw.d0 m177837xdce0328(java.lang.String str) {
        return (yw.d0) java.lang.Enum.valueOf(yw.d0.class, str);
    }

    /* renamed from: values */
    public static yw.d0[] m177838xcee59d22() {
        return (yw.d0[]) f547832p.clone();
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f547833d;
    }
}
