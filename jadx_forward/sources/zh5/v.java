package zh5;

/* loaded from: classes12.dex */
public final class v extends lf3.n implements zf3.a {

    /* renamed from: d, reason: collision with root package name */
    public mf3.k f554605d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // zf3.a
    public void I(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_kemdia_path", mediaInfo.g());
        intent.putExtra("Ksnsupload_type", 0);
        j45.l.j(m80379x76847179(), "sns", ".ui.SnsUploadUI", intent, null);
    }

    public final co.a V6(mf3.k kVar) {
        int ordinal = kVar.mo2109xfb85f7b0().ordinal();
        if (ordinal == 1) {
            jd5.a aVar = new jd5.a();
            java.lang.String g17 = kVar.g();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            aVar.p(g17 != null ? g17 : "");
            return aVar;
        }
        if (ordinal != 2) {
            return null;
        }
        gg3.c a17 = kVar.a();
        jd5.c cVar = new jd5.c();
        java.lang.String str = a17 != null ? a17.f353260b : null;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        cVar.o(str);
        java.lang.String g18 = kVar.g();
        cVar.r(g18 != null ? g18 : "");
        cVar.q((a17 != null ? (int) a17.f353263e : 0) / 1000);
        return cVar;
    }

    public final void W6(java.lang.String str, java.lang.String str2, mf3.k kVar) {
        java.lang.String str3;
        if (kVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.CommonForwardComponent", "onUserConfirmed return, data null");
            return;
        }
        int ordinal = kVar.mo2109xfb85f7b0().ordinal();
        java.util.Collection collection = kz5.p0.f395529d;
        if (ordinal == 1) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
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
            java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
            if (strArr.length == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MediaGallery.CommonForwardComponent", "want to send record msg, but toUser is null");
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(m158354x19263085(), "", m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q, "showProgressDlg(...)");
            ((ku5.t0) ku5.t0.f394148d).g(new zh5.s(strArr, this, kVar, str2, new zh5.t(Q)));
            return;
        }
        if (ordinal != 2) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q2 = db5.e1.Q(m158354x19263085(), "", m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q2, "showProgressDlg(...)");
        zh5.u uVar = new zh5.u(Q2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
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
        java.lang.String[] strArr2 = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
        zh5.j0 j0Var = kVar instanceof zh5.j0 ? (zh5.j0) kVar : null;
        if (j0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.CommonForwardComponent", "media info is not IForwardMediaInfo, send failed");
            return;
        }
        for (java.lang.String str4 : strArr2) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            java.lang.String g19 = kVar.g();
            sf3.g e17 = kVar.e();
            if (e17 == null || (str3 = e17.c()) == null) {
                str3 = "";
            }
            java.lang.String str5 = str3;
            gg3.c a17 = kVar.a();
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.j(m158354x19263085, str4, g19, str5, a17 != null ? ((int) a17.f353263e) / 1000 : 0, "", uVar, j0Var.b());
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                ((dk5.s5) tg3.t1.a()).fj(str4, str2, c01.e2.C(str4), 0);
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
                    W6(str, str2, this.f554605d);
                    return;
                } else {
                    if (1001 == i17 && -1 == i18) {
                        W6(str, str2, this.f554605d);
                        return;
                    }
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.CommonForwardComponent", "onActivityResult return, data invalid. toUsers: ".concat(str));
    }

    @Override // zf3.a
    public void z4(mf3.k mediaInfo, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f554605d = mediaInfo;
        if (!(userName.length() == 0)) {
            zh5.q qVar = new zh5.q(this, userName, mediaInfo);
            co.a V6 = V6(mediaInfo);
            if (V6 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.CommonForwardComponent", "openConfirmDialog return, model invalid");
                return;
            }
            n13.t tVar = new n13.t();
            tVar.f415666a = qVar;
            tVar.f415671f.f415672a = 8;
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
