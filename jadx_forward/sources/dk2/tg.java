package dk2;

/* loaded from: classes5.dex */
public final class tg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.tg f315668d = new dk2.tg();

    public tg() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MakeupSuitDataManager");
        dk2.ug ugVar = dk2.ug.f315751a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(M);
        if (!M.getBoolean(gm0.j1.b().h() + "_upgrade_done", false)) {
            M.putBoolean(gm0.j1.b().h() + "_upgrade_done", true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MMKV_KEY_SUIT_ID_");
            sb6.append(gm0.j1.b().h());
            int i17 = M.getInt(sb6.toString(), 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MakeupSuitDataManager", "#upgradeFromOldKey oldSelect=" + i17);
            switch (i17) {
                case 1:
                    str = "baitao";
                    break;
                case 2:
                    str = "chulian";
                    break;
                case 3:
                    str = "hanxi";
                    break;
                case 4:
                    str = "nvtuan";
                    break;
                case 5:
                    str = "roubai";
                    break;
                case 6:
                    str = "zhongxing";
                    break;
                case 7:
                    str = "dianzhi";
                    break;
                case 8:
                    str = "qinglengzhuang";
                    break;
                case 9:
                    str = "taizhuang";
                    break;
                default:
                    str = "original";
                    break;
            }
            ugVar.g(str);
        }
        return M;
    }
}
