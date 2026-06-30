package gi5;

/* loaded from: classes12.dex */
public final class g extends lf3.n implements zf3.a {

    /* renamed from: d, reason: collision with root package name */
    public mf3.k f353841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // zf3.a
    public void I(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
    }

    public final co.a V6(mf3.k kVar) {
        ai5.c cVar = kVar instanceof ai5.c ? (ai5.c) kVar : null;
        if (cVar == null) {
            return null;
        }
        int ordinal = kVar.mo2109xfb85f7b0().ordinal();
        if (ordinal == 1) {
            jd5.a aVar = new jd5.a();
            aVar.p(cVar.g());
            return aVar;
        }
        if (ordinal != 2) {
            return null;
        }
        jd5.c cVar2 = new jd5.c();
        java.lang.String h17 = cVar.h();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        cVar2.o(h17);
        cVar2.r(cVar.g());
        gg3.c a17 = cVar.a();
        cVar2.q((a17 != null ? (int) a17.f353263e : 0) / 1000);
        return cVar2;
    }

    public final void W6(java.lang.String str, java.lang.String str2, mf3.k kVar) {
        if (kVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.RecordForwardComponent", "onUserConfirmed return, data null");
            return;
        }
        int ordinal = kVar.mo2109xfb85f7b0().ordinal();
        java.util.Collection collection = kz5.p0.f395529d;
        if (ordinal == 1) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            ai5.c cVar = kVar instanceof ai5.c ? (ai5.c) kVar : null;
            r45.gp0 gp0Var = cVar != null ? cVar.f86740a : null;
            if (cVar == null || gp0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.RecordForwardComponent", "parser recordMsgInfo null");
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            java.util.List g17 = new r26.t(",").g(str, 0);
            if (!g17.isEmpty()) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1((java.lang.String[]) collection.toArray(new java.lang.String[0]));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(P1, "stringsToList(...)");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(P1)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MediaGallery.RecordForwardComponent", "want to send record msg, but toUser is null");
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(m158354x19263085(), "", m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q, "showProgressDlg(...)");
            ((ku5.t0) ku5.t0.f394148d).g(new gi5.d(P1, gp0Var, cVar, this, kVar, str2, new gi5.e(Q)));
            return;
        }
        if (ordinal != 2) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q2 = db5.e1.Q(m158354x19263085(), "", m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q2, "showProgressDlg(...)");
        gi5.f fVar = new gi5.f(Q2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        java.util.List g18 = new r26.t(",").g(str, 0);
        if (!g18.isEmpty()) {
            java.util.ListIterator listIterator2 = g18.listIterator(g18.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    break;
                }
                if (!(((java.lang.String) listIterator2.previous()).length() == 0)) {
                    collection = kz5.n0.K0(g18, listIterator2.nextIndex() + 1);
                    break;
                }
            }
        }
        java.util.ArrayList P12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1((java.lang.String[]) collection.toArray(new java.lang.String[0]));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(P12, "stringsToList(...)");
        ai5.c cVar2 = kVar instanceof ai5.c ? (ai5.c) kVar : null;
        if (cVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.RecordForwardComponent", "parser recordMediaInfo null");
            return;
        }
        java.lang.String g19 = cVar2.g();
        java.lang.String h17 = cVar2.h();
        java.util.Iterator it = P12.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            r45.gp0 gp0Var2 = cVar2.f86740a;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.j(m158354x19263085, str3, g19, h17, gp0Var2.f456981y, "", fVar, gp0Var2.f456964q2);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                ((dk5.s5) tg3.t1.a()).fj(str3, str2, c01.e2.C(str3), 0);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.c9u), null, m158354x19263085(), null, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String stringExtra;
        super.mo2273x9d4787cb(i17, i18, intent);
        java.lang.String str2 = "";
        if (intent == null || (str = intent.getStringExtra("Select_Conv_User")) == null) {
            str = "";
        }
        if (intent != null && (stringExtra = intent.getStringExtra("custom_send_text")) != null) {
            str2 = stringExtra;
        }
        if (intent != null) {
            if (!(str.length() == 0)) {
                if (1 == i17 && -1 == i18) {
                    W6(str, str2, this.f353841d);
                    return;
                } else {
                    if (1001 == i17 && -1 == i18) {
                        W6(str, str2, this.f353841d);
                        return;
                    }
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.RecordForwardComponent", "onActivityResult return, data invalid. toUsers: ".concat(str));
    }

    @Override // zf3.a
    public void z4(mf3.k mediaInfo, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f353841d = mediaInfo;
        if (!(userName.length() == 0)) {
            gi5.b bVar = new gi5.b(this, userName, mediaInfo);
            co.a V6 = V6(mediaInfo);
            if (V6 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.RecordForwardComponent", "openConfirmDialog return, model invalid");
                return;
            }
            n13.t tVar = new n13.t();
            tVar.f415666a = bVar;
            tVar.f415671f.f415672a = 9;
            dk5.y yVar = (dk5.y) i95.n0.c(dk5.y.class);
            if (yVar != null) {
                yVar.wi(m158354x19263085(), V6, userName, tVar);
                return;
            }
            return;
        }
        int ordinal = mediaInfo.mo2109xfb85f7b0().ordinal();
        if (ordinal == 1) {
            n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            co.a V62 = V6(mediaInfo);
            n13.r rVar = new n13.r();
            rVar.f415651b = 1001;
            ((dk5.b0) b0Var).Bi(m158354x19263085, V62, rVar);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        n13.b0 b0Var2 = (n13.b0) i95.n0.c(n13.b0.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        co.a V63 = V6(mediaInfo);
        n13.r rVar2 = new n13.r();
        rVar2.f415651b = 1;
        rVar2.f415653d.f415672a = 9;
        ((dk5.b0) b0Var2).Bi(m158354x192630852, V63, rVar2);
    }
}
