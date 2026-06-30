package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes8.dex */
public final class ti extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f205773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14917xdd637675 f205774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205775f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14917xdd637675 c14917xdd637675, java.lang.String str) {
        super(0);
        this.f205773d = z17;
        this.f205774e = c14917xdd637675;
        this.f205775f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String queryParameter;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14917xdd637675 c14917xdd637675 = this.f205774e;
        boolean z17 = this.f205773d;
        if (z17) {
            c14917xdd637675.f205032e = -1;
        }
        ya2.b2 b17 = ya2.h.f542017a.b(this.f205775f);
        c14917xdd637675.f205035h = b17;
        jz5.l lVar = null;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = b17 != null ? b17.f69300x731cac1b : null;
        if (c19780xceb4c4dc == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh  profileContact=");
            sb6.append(c14917xdd637675.f205035h != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.ProfileUiStyleUIC", sb6.toString());
        } else {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            boolean z18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderProfileCoverSettingShowEntrance", 1) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderUserApi", "isEnableSetProfileCover:" + z18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            boolean z19 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.E2).mo141623x754a37bb()).r()).intValue() == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileUiStyleUIC", "isGlobalSetCoverOpen :" + z18 + " isForceUpdateCover:" + z19 + " isHard=" + z17);
            ya2.b2 b2Var = c14917xdd637675.f205035h;
            if (b2Var != null) {
                if ((z18 && c19780xceb4c4dc.m76027x1cbb0791() == 2 && b2Var.f69305xfea08094 == 1) || z19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileUiStyleUIC", "refresh getCoverInfo");
                    java.lang.String str = b2Var.f69307x8cb53dd;
                    if (str == null) {
                        str = "";
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && c14917xdd637675.f205044t) {
                        int length = str.length() - 1;
                        if (length >= 0) {
                            while (true) {
                                int i17 = length - 1;
                                if (str.charAt(length) == '&') {
                                    break;
                                }
                                if (i17 < 0) {
                                    break;
                                }
                                length = i17;
                            }
                        }
                        length = -1;
                        if (length != -1) {
                            try {
                                android.net.Uri parse = android.net.Uri.parse(str);
                                int parseInt = (parse == null || (queryParameter = parse.getQueryParameter("bgColor")) == null) ? 0 : java.lang.Integer.parseInt(queryParameter, 16);
                                java.lang.String obj = str.subSequence(0, length).toString();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileUiStyleUIC", "getCoverInfo bgColor:" + parseInt + "  coverPath :" + obj);
                                lVar = new jz5.l(obj, java.lang.Integer.valueOf(parseInt));
                            } catch (java.lang.NullPointerException e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.ProfileUiStyleUIC", e17, "", new java.lang.Object[0]);
                            } catch (java.lang.NumberFormatException e18) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.ProfileUiStyleUIC", e18, "", new java.lang.Object[0]);
                            } catch (java.lang.Exception e19) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.ProfileUiStyleUIC", e19, "", new java.lang.Object[0]);
                            }
                        }
                    }
                    if (lVar != null) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("refresh ");
                        java.lang.String str2 = (java.lang.String) lVar.f384366d;
                        sb7.append(str2);
                        sb7.append("  ");
                        java.lang.Number number = (java.lang.Number) lVar.f384367e;
                        sb7.append(number.intValue());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileUiStyleUIC", sb7.toString());
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14917xdd637675.O6(c14917xdd637675, str2, number.intValue());
                    } else {
                        c14917xdd637675.m58695x60022348();
                    }
                } else {
                    c14917xdd637675.m58695x60022348();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
