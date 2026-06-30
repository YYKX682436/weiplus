package ko0;

/* loaded from: classes4.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ko0.b0 f391353d = new ko0.b0();

    public b0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("LiveFilterUtil_v2_kv");
        ko0.c0 c0Var = ko0.c0.f391358a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(M);
        if (!M.getBoolean(gm0.j1.b().h() + "_upgrade_done", false)) {
            M.putBoolean(gm0.j1.b().h() + "_upgrade_done", true);
            rl2.e eVar = (rl2.e) ((jz5.n) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).f148531v).mo141623x754a37bb();
            eVar.getClass();
            ce2.m mVar = new ce2.m();
            r45.n84 n84Var = new r45.n84();
            android.database.Cursor f17 = eVar.f478725e.f(eVar.f478726f + " where FinderLiveConfig.key=\"KEY_FILTER_CONFIG\"", null, 2);
            if (f17.moveToFirst()) {
                mVar.mo9015xbf5d97fd(f17);
                byte[] bArr = mVar.f67425x29f571ec;
                if (bArr != null) {
                    try {
                        n84Var.mo11468x92b714fd(bArr);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                }
                f17.close();
            } else {
                f17.close();
                n84Var = null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#upgradeFromDB key=");
            sb6.append(n84Var != null ? java.lang.Integer.valueOf(n84Var.m75939xb282bd08(0)) : null);
            sb6.append(" value={");
            sb6.append(n84Var != null ? java.lang.Integer.valueOf(n84Var.m75939xb282bd08(1)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCore.LiveFilterUtil", sb6.toString());
            if (n84Var != null) {
                int m75939xb282bd08 = n84Var.m75939xb282bd08(0);
                r45.n84 n84Var2 = m75939xb282bd08 >= 0 && m75939xb282bd08 < 10 ? n84Var : null;
                if (n84Var2 != null) {
                    switch (n84Var2.m75939xb282bd08(0)) {
                        case 1:
                            str = "white_skin";
                            break;
                        case 2:
                            str = "vitality";
                            break;
                        case 3:
                            str = "matte";
                            break;
                        case 4:
                            str = "clear";
                            break;
                        case 5:
                            str = "sunset";
                            break;
                        case 6:
                            str = "profound";
                            break;
                        case 7:
                            str = "autumn";
                            break;
                        case 8:
                            str = "delicious_food";
                            break;
                        case 9:
                            str = "blues";
                            break;
                        default:
                            str = ya.b.f77495x8b74a326;
                            break;
                    }
                    ko0.c0 c0Var2 = ko0.c0.f391358a;
                    c0Var2.f(str);
                    c0Var2.g(str, n84Var2.m75939xb282bd08(1) / 100.0d);
                }
            }
        }
        return M;
    }
}
