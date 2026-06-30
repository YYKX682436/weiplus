package l41;

@j95.b
/* loaded from: classes4.dex */
public class q2 extends i95.w implements j41.b0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f397439d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final db5.n f397440e = new l41.l2(this);

    /* renamed from: f, reason: collision with root package name */
    public final db5.n f397441f = new l41.m2(this);

    public q2() {
        com.p314xaae8f345.mm.vfs.w6.u("wcf://openim/");
        u41.c cVar = new u41.c();
        cVar.f68188x28d46377 = "3552365301";
        cVar.f68189xbd959cfd = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        cVar.f68190x5334f55 = 0;
        ((i41.l) i95.n0.c(i41.l.class)).Ai().get(cVar, "appid", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, "subType");
        if (cVar.f72763xa3c65b86 == -1) {
            wi("3552365301", com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), "", 0);
        }
    }

    public java.lang.String Ai(l75.w0 w0Var, java.lang.String str, java.lang.String str2) {
        if (w0Var == null) {
            return "";
        }
        java.lang.Object obj = w0Var.f398509d;
        if (!(obj instanceof u41.k)) {
            return "";
        }
        u41.k kVar = (u41.k) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.OpenImResourceMgr", "checkMatchOpenIMDescWording, openImAppId: %s, input openImAppId: %s, wordingId: %s, input wordingId: %s, wording: %s", kVar.f69018x28d46377, str, kVar.f69024xd0366ace, str2, kVar.f69023xcf77aa53);
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(kVar.f69018x28d46377, str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(kVar.f69024xd0366ace, str2)) ? kVar.f69023xcf77aa53 : "";
    }

    public void Bi(java.lang.String str, java.lang.String str2, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        u41.c cVar = new u41.c();
        cVar.f68188x28d46377 = str;
        cVar.f68189xbd959cfd = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        cVar.f68190x5334f55 = i17;
        ((i41.l) i95.n0.c(i41.l.class)).Ai().get(cVar, "appid", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, "subType");
        stringBuffer.append(java.lang.String.format("openIMAppIdinfo.field_updateTime %s | ", java.lang.Long.valueOf(cVar.f68191xa783a79b)));
        boolean z17 = true;
        boolean z18 = cVar.f72763xa3c65b86 == -1 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(cVar.f68191xa783a79b) > 172800;
        if (!z18 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            u41.k kVar = new u41.k();
            kVar.f69018x28d46377 = str;
            kVar.f69019xbd959cfd = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            kVar.f69024xd0366ace = str2;
            ((i41.l) i95.n0.c(i41.l.class)).Ui().get(kVar, "appid", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, "wordingId");
            if (kVar.f72763xa3c65b86 != -1 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(kVar.f69022xa783a79b) <= 172800) {
                z17 = z18;
            }
            stringBuffer.append(java.lang.String.format("wordingInfo.field_updateTime %s | ", java.lang.Long.valueOf(kVar.f69022xa783a79b)));
            z18 = z17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.OpenImResourceMgr", "checkRecUpdate openimAppId %s wordingId %s needUpdate %s subType: %s, logBuffer: %s", str, str2, java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i17), stringBuffer.toString());
        if (z18) {
            wi(str, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), str2, i17);
        }
    }

    public void Di() {
        ((i41.l) i95.n0.c(i41.l.class)).Ai().f506158d.mo70514xb06685ab("OpenIMAppIdInfo", null, null);
        ((i41.l) i95.n0.c(i41.l.class)).wi().f506155d.mo70514xb06685ab("OpenIMAccTypeInfo", null, null);
        ((i41.l) i95.n0.c(i41.l.class)).Ui().f506170d.mo70514xb06685ab("OpenIMWordingInfo", null, null);
    }

    public java.lang.String Ni(java.lang.String str, java.lang.String str2, j41.a0 a0Var) {
        u41.c cVar = new u41.c();
        cVar.f68188x28d46377 = str;
        cVar.f68190x5334f55 = 0;
        ((i41.l) i95.n0.c(i41.l.class)).Ai().get(cVar, "appid", "subType");
        if (cVar.f72763xa3c65b86 == -1) {
            wi(str, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), "", 0);
            return null;
        }
        java.lang.String Ui = Ui(cVar.f68186x5a0dd04d, str2, a0Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        return Ui == null ? Ui(cVar.f68186x5a0dd04d, str2, a0Var, "en") : Ui;
    }

    public java.lang.String Ri(java.lang.String str, java.lang.String str2, j41.a0 a0Var) {
        java.lang.String Ui = Ui(str, str2, a0Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        return Ui == null ? Ui(str, str2, a0Var, "en") : Ui;
    }

    public final java.lang.String Ui(java.lang.String str, java.lang.String str2, j41.a0 a0Var, java.lang.String str3) {
        u41.a aVar = new u41.a();
        aVar.f68055x5a0dd04d = str;
        aVar.f68056xbd959cfd = str3;
        ((i41.l) i95.n0.c(i41.l.class)).wi().get(aVar, "acctTypeId", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68);
        if (aVar.f72763xa3c65b86 == -1) {
            return null;
        }
        if (a0Var == j41.a0.TYPE_WORDING) {
            java.util.Iterator it = aVar.f68054xfbe59f9a.f459021e.iterator();
            while (it.hasNext()) {
                r45.l15 l15Var = (r45.l15) it.next();
                if (str2.equals(l15Var.f460607d)) {
                    return l15Var.f460608e;
                }
            }
            return null;
        }
        java.util.Iterator it6 = aVar.f68054xfbe59f9a.f459022f.iterator();
        while (it6.hasNext()) {
            r45.j15 j15Var = (r45.j15) it6.next();
            if (str2.equals(j15Var.f459027d)) {
                return j15Var.f459028e;
            }
        }
        return null;
    }

    public java.lang.String Vi(java.lang.String str, java.lang.String str2, j41.a0 a0Var, int i17) {
        java.lang.String Zi = Zi(str, str2, a0Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), i17);
        return Zi == null ? Zi(str, str2, a0Var, "en", i17) : Zi;
    }

    public final java.lang.String Zi(java.lang.String str, java.lang.String str2, j41.a0 a0Var, java.lang.String str3, int i17) {
        u41.c cVar = new u41.c();
        cVar.f68188x28d46377 = str;
        cVar.f68189xbd959cfd = str3;
        cVar.f68190x5334f55 = i17;
        ((i41.l) i95.n0.c(i41.l.class)).Ai().get(cVar, "appid", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, "subType");
        if (cVar.f72763xa3c65b86 == -1) {
            wi(str, str3, "", i17);
            return null;
        }
        if (a0Var == j41.a0.TYPE_WORDING) {
            java.util.Iterator it = cVar.f68187xf1b7b594.f471384e.iterator();
            while (it.hasNext()) {
                r45.l15 l15Var = (r45.l15) it.next();
                if (str2.equals(l15Var.f460607d)) {
                    return l15Var.f460608e;
                }
            }
            return null;
        }
        java.util.Iterator it6 = cVar.f68187xf1b7b594.f471385f.iterator();
        while (it6.hasNext()) {
            r45.j15 j15Var = (r45.j15) it6.next();
            if (str2.equals(j15Var.f459027d)) {
                return j15Var.f459028e;
            }
        }
        return null;
    }

    public java.lang.CharSequence aj(android.content.Context context, java.lang.CharSequence charSequence) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(charSequence)) {
            charSequence = "";
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((java.lang.CharSequence) " ");
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80791xd2795aeb);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        spannableStringBuilder.setSpan(new android.text.style.ImageSpan(drawable), charSequence.length(), charSequence.length() + 1, 33);
        return spannableStringBuilder;
    }

    public int bj(java.lang.String str, int i17) {
        u41.c cVar = new u41.c();
        cVar.f68188x28d46377 = str;
        cVar.f68190x5334f55 = i17;
        ((i41.l) i95.n0.c(i41.l.class)).Ai().get(cVar, "appid", "subType");
        if (cVar.f72763xa3c65b86 != -1) {
            return cVar.f68187xf1b7b594.f471383d;
        }
        wi(str, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), "", i17);
        return 0;
    }

    public android.graphics.Bitmap cj(java.lang.String str) {
        l41.o2 o2Var = new l41.o2(this, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        o11.f fVar = new o11.f();
        fVar.f423611b = true;
        fVar.f423615f = "wcf://openim/" + kk.k.g(str.getBytes());
        m11.b1.Bi().i(str, null, fVar.a(), new l41.n2(this, o2Var));
        return o2Var.f397422a;
    }

    public java.lang.String fj(java.lang.String str, java.lang.String str2) {
        java.lang.String hj6 = hj(str, str2, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        return hj6 == null ? hj(str, str2, "en") : hj6;
    }

    public final java.lang.String hj(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        u41.k kVar = new u41.k();
        kVar.f69018x28d46377 = str;
        kVar.f69019xbd959cfd = str3;
        kVar.f69024xd0366ace = str2;
        ((i41.l) i95.n0.c(i41.l.class)).Ui().get(kVar, "appid", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, "wordingId");
        if (kVar.f72763xa3c65b86 != -1) {
            return kVar.f69023xcf77aa53;
        }
        wi(str, str3, str2, 0);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void ij(android.content.Context context, android.widget.TextView textView, java.lang.CharSequence charSequence, java.lang.String str, java.lang.String str2, int i17) {
        android.text.SpannableString spannableString;
        if (textView instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21473x5d116ff) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21473x5d116ff c21473x5d116ff = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21473x5d116ff) textView;
            java.lang.String fj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(str, str2);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fj6)) {
                fj6 = "";
            } else if ("3552365301".equals(str)) {
                fj6 = "@" + fj6;
            }
            c21473x5d116ff.m78881x600eea91(this.f397440e);
            c21473x5d116ff.b(charSequence, fj6, com.p314xaae8f345.mm.R.C30859x5a72f63.a0j, i17);
            return;
        }
        java.lang.String fj7 = fj(str, str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fj7)) {
            spannableString = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, charSequence);
        } else {
            if ("3552365301".equals(str)) {
                fj7 = " @" + fj7;
            }
            android.text.SpannableString i18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, charSequence);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) i18);
            android.text.SpannableString spannableString2 = new android.text.SpannableString(fj7);
            android.content.res.ColorStateList e17 = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.a0j);
            spannableString2.setSpan(new android.text.style.TextAppearanceSpan(null, 0, i17, e17, e17), 0, fj7.length(), 33);
            spannableStringBuilder.append((java.lang.CharSequence) spannableString2);
            spannableString = spannableStringBuilder;
        }
        textView.setText(spannableString);
    }

    public final void wi(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.OpenImResourceMgr", "try checkDoSceneGetRec openimAppId %s language %s wordingid %s, subType: %s", str, str2, str3, java.lang.Integer.valueOf(i17));
        java.lang.String str4 = str + str2 + i17;
        java.util.HashMap hashMap = this.f397439d;
        if (!hashMap.containsKey(str4)) {
            l41.p2 p2Var = new l41.p2(this, null);
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3);
            java.util.LinkedList linkedList = p2Var.f397431b;
            if (!K0) {
                linkedList.add(str3);
            }
            hashMap.put(str + str2 + i17, p2Var);
            gm0.j1.n().f354821b.g(new l41.z(str, str2, linkedList, i17));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return;
        }
        l41.p2 p2Var2 = (l41.p2) hashMap.get(str + str2 + i17);
        if (p2Var2.f397430a.contains(str3) || p2Var2.f397431b.contains(str3)) {
            return;
        }
        p2Var2.f397430a.add(str3);
    }
}
