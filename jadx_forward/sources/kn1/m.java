package kn1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final kn1.m f391165e;

    /* renamed from: f, reason: collision with root package name */
    public static final kn1.m f391166f;

    /* renamed from: g, reason: collision with root package name */
    public static final kn1.m f391167g;

    /* renamed from: h, reason: collision with root package name */
    public static final kn1.m f391168h;

    /* renamed from: i, reason: collision with root package name */
    public static final kn1.m f391169i;

    /* renamed from: m, reason: collision with root package name */
    public static final kn1.m f391170m;

    /* renamed from: n, reason: collision with root package name */
    public static final kn1.m f391171n;

    /* renamed from: o, reason: collision with root package name */
    public static final kn1.m f391172o;

    /* renamed from: p, reason: collision with root package name */
    public static final kn1.m f391173p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ kn1.m[] f391174q;

    /* renamed from: d, reason: collision with root package name */
    public final int f391175d;

    static {
        kn1.m mVar = new kn1.m("kAction_Unknown", 0, -1);
        f391165e = mVar;
        kn1.m mVar2 = new kn1.m("kAction_Start", 1, 0);
        f391166f = mVar2;
        kn1.m mVar3 = new kn1.m("kAction_Connect", 2, 1);
        f391167g = mVar3;
        kn1.m mVar4 = new kn1.m("kAction_Handshake", 3, 2);
        f391168h = mVar4;
        kn1.m mVar5 = new kn1.m("kAction_Prepare", 4, 3);
        f391169i = mVar5;
        kn1.m mVar6 = new kn1.m("kAction_DataTransfer", 5, 4);
        kn1.m mVar7 = new kn1.m("kAction_DataTransferContinue", 6, 5);
        kn1.m mVar8 = new kn1.m("kAction_DataQuickTransfer", 7, 6);
        kn1.m mVar9 = new kn1.m("kAction_Success", 8, 7);
        f391170m = mVar9;
        kn1.m mVar10 = new kn1.m("kAction_Failed", 9, 8);
        kn1.m mVar11 = new kn1.m("kAction_Stop", 10, 9);
        kn1.m mVar12 = new kn1.m("kAction_Pause", 11, 10);
        kn1.m mVar13 = new kn1.m("kAction_Other", 12, 11);
        kn1.m mVar14 = new kn1.m("kAction_Merge_Success", 13, 12);
        f391171n = mVar14;
        kn1.m mVar15 = new kn1.m("kAction_Transfer_And_Merge", 14, 13);
        kn1.m mVar16 = new kn1.m("kAction_MsgBackup", 15, 100);
        f391172o = mVar16;
        kn1.m mVar17 = new kn1.m("kAction_MsgRestore", 16, 101);
        f391173p = mVar17;
        kn1.m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, mVar16, mVar17};
        f391174q = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17, int i18) {
        this.f391175d = i18;
    }

    /* renamed from: valueOf */
    public static kn1.m m143777xdce0328(java.lang.String str) {
        return (kn1.m) java.lang.Enum.valueOf(kn1.m.class, str);
    }

    /* renamed from: values */
    public static kn1.m[] m143778xcee59d22() {
        return (kn1.m[]) f391174q.clone();
    }
}
