package dk2;

/* loaded from: classes5.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.c f314796d = new dk2.c();

    public c() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("BeautySuitDataManager");
        dk2.d dVar = dk2.d.f314834a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(M);
        if (M.getBoolean(gm0.j1.b().h() + "_upgrade_done_v1", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BeautySuitDataManager", "#upgradeFromOldKeyV1 ignore upgrade");
        } else {
            M.putBoolean(gm0.j1.b().h() + "_upgrade_done_v1", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BeautySuitDataManager", "#upgradeFromOldKeyV1 start upgrade");
            for (int i17 = 0; i17 < 3; i17++) {
                for (int i18 = 0; i18 < 22; i18++) {
                    java.lang.String i19 = dk2.d.i(i17, java.lang.String.valueOf(i18));
                    if (M.f(i19)) {
                        switch (i18) {
                            case 0:
                                str = "smooth";
                                break;
                            case 1:
                            case 20:
                                str = "zhailian";
                                break;
                            case 2:
                                str = "bright";
                                break;
                            case 3:
                                str = "rosy";
                                break;
                            case 4:
                            default:
                                str = "";
                                break;
                            case 5:
                                str = "eyebright";
                                break;
                            case 6:
                                str = "removeeyepouch";
                                break;
                            case 7:
                                str = "smilefold";
                                break;
                            case 8:
                                str = "sharpen";
                                break;
                            case 9:
                                str = "teethbright";
                                break;
                            case 10:
                                str = "smallhead";
                                break;
                            case 11:
                                str = "cheekbone";
                                break;
                            case 12:
                                str = "lowerjowbone";
                                break;
                            case 13:
                                str = "wingofnose";
                                break;
                            case 14:
                                str = "eyebigger";
                                break;
                            case 15:
                                str = "chin";
                                break;
                            case 16:
                                str = "mouthmorph";
                                break;
                            case 17:
                                str = "hairline";
                                break;
                            case 18:
                                str = "malethin";
                                break;
                            case 19:
                                str = "femalethin";
                                break;
                            case 21:
                                str = "liti";
                                break;
                        }
                        int i27 = M.getInt(i19, 0);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BeautySuitDataManager", "#upgradeFromOldKeyV1 suitId=" + i17 + " oldBeautyId=" + i18 + " oldBeautyKey=" + i19 + " newBeautyId=" + str + " value=" + i27);
                        if (str.length() > 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BeautySuitDataManager", "#setBeauty suitId=" + i17 + " beautyId=" + str + " beautyValue" + i27);
                            M.putInt(dk2.d.i(i17, str), i27);
                        }
                    }
                }
            }
        }
        return M;
    }
}
