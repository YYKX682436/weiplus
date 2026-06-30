package k91;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final k91.a f387054e;

    /* renamed from: f, reason: collision with root package name */
    public static final k91.a f387055f;

    /* renamed from: g, reason: collision with root package name */
    public static final k91.a f387056g;

    /* renamed from: h, reason: collision with root package name */
    public static final k91.a f387057h;

    /* renamed from: i, reason: collision with root package name */
    public static final k91.a f387058i;

    /* renamed from: m, reason: collision with root package name */
    public static final k91.a f387059m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ k91.a[] f387060n;

    /* renamed from: d, reason: collision with root package name */
    public final int f387061d;

    static {
        k91.a aVar = new k91.a("ShareToWeWork", 0, 0);
        k91.a aVar2 = new k91.a("ShareToFriend", 1, 1);
        f387054e = aVar2;
        k91.a aVar3 = new k91.a("CopyShortLink", 2, 2);
        f387055f = aVar3;
        k91.a aVar4 = new k91.a("SecFlagForSinglePageMode", 3, 3);
        f387056g = aVar4;
        k91.a aVar5 = new k91.a("ShowTradeComplaint", 4, 4);
        f387057h = aVar5;
        k91.a aVar6 = new k91.a("ScreenshotJumpWxaBtn", 5, 5);
        f387058i = aVar6;
        k91.a aVar7 = new k91.a("PosterJumpWxaBtn", 6, 6);
        f387059m = aVar7;
        k91.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        f387060n = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
        this.f387061d = i18;
    }

    public static int b(k91.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 config, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getControlByte");
        }
        boolean z17 = false;
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        byte[] bArr = config.f158875y1;
        if (!(bArr == null)) {
            int length = bArr.length - 1;
            int i19 = aVar.f387061d;
            if (length >= i19) {
                byte b17 = bArr[i19];
                if (b17 >= 0 && b17 < 4) {
                    z17 = true;
                }
                if (z17) {
                    i17 = b17;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActionSheetControlIndex", "getControlByte for " + aVar.name() + " [" + i17 + ']');
        return i17;
    }

    /* renamed from: valueOf */
    public static k91.a m142132xdce0328(java.lang.String str) {
        return (k91.a) java.lang.Enum.valueOf(k91.a.class, str);
    }

    /* renamed from: values */
    public static k91.a[] m142133xcee59d22() {
        return (k91.a[]) f387060n.clone();
    }

    public final int a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        return b(this, config, 0, 2, null);
    }
}
