package z83;

/* loaded from: classes14.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6 f552261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552262e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6 activityC16160x425523e6, java.lang.String str) {
        this.f552261d = activityC16160x425523e6;
        this.f552262e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        java.lang.String str;
        android.graphics.Bitmap bitmap;
        java.lang.String str2 = this.f552262e;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6.f224672t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6 activityC16160x425523e6 = this.f552261d;
        activityC16160x425523e6.getClass();
        gm0.j1.d().a(145, activityC16160x425523e6);
        java.lang.String obj = activityC16160x425523e6.T6().f525534m.getText().toString();
        int length = obj.length() - 1;
        int i19 = 0;
        boolean z17 = false;
        while (i19 <= length) {
            boolean z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(obj.charAt(!z17 ? i19 : length), 32) <= 0;
            if (z17) {
                if (!z18) {
                    break;
                } else {
                    length--;
                }
            } else if (z18) {
                i19++;
            } else {
                z17 = true;
            }
        }
        java.lang.String h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.h(obj.subSequence(i19, length + 1).toString());
        java.lang.String str3 = activityC16160x425523e6.f224675f;
        if (str3 == null || activityC16160x425523e6.f224676g == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h17, str3) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h17, activityC16160x425523e6.f224676g)) {
            java.lang.String str4 = activityC16160x425523e6.f224675f;
            i17 = (str4 == null || (str = activityC16160x425523e6.f224676g) == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str4) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h17, activityC16160x425523e6.f224676g)) ? 0 : 2;
        } else {
            i17 = 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "checkMobileStateFun, adJust:" + i17 + ", opCode:22, " + activityC16160x425523e6.f224678i);
        ((gv.a) ((hv.e) i95.n0.c(hv.e.class))).getClass();
        h11.e eVar = new h11.e(str2, 22, "", 0, "");
        ((o45.eh) eVar.f359604d.mo47979x2d63726f()).f424455a.f454027s = activityC16160x425523e6.f224678i;
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = eVar.f359604d;
        ((o45.eh) v0Var.mo47979x2d63726f()).f424455a.f454028t = i17;
        fo3.s sVar = fo3.s.INSTANCE;
        if (sVar.wf("ie_reg")) {
            sVar.E7("ie_reg");
        }
        r45.kn5 kn5Var = new r45.kn5();
        kn5Var.f460389d = activityC16160x425523e6.T6().f525535n.getText().toString();
        if (activityC16160x425523e6.f224680n && (bitmap = activityC16160x425523e6.f224681o) != null && !bitmap.isRecycled()) {
            kn5Var.f460391f = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.a(activityC16160x425523e6.f224681o));
        }
        kn5Var.f460392g = str2;
        kn5Var.f460393h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k0();
        java.lang.String id6 = java.util.TimeZone.getDefault().getID();
        kn5Var.f460394i = id6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "%s,%s", kn5Var.f460393h, id6);
        r45.k57 k57Var = new r45.k57();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(sVar.Ph("ie_reg"));
        k57Var.f459927d = cu5Var;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(sVar.Ci("ce_reg"));
        k57Var.f459928e = cu5Var2;
        r45.cu5 cu5Var3 = new r45.cu5();
        cu5Var3.d(sVar.o3(16));
        k57Var.f459929f = cu5Var3;
        r45.cu5 cu5Var4 = new r45.cu5();
        cu5Var4.d(sVar.L9());
        k57Var.f459933m = cu5Var4;
        try {
            r45.cu5 cu5Var5 = new r45.cu5();
            cu5Var5.d(kn5Var.mo14344x5f01b1f6());
            k57Var.f459930g = cu5Var5;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KidsWatchRegGetInfoUI", e17, "convert to byte error ! %s", e17.getMessage());
        }
        eVar.R(k57Var);
        java.lang.String str5 = activityC16160x425523e6.f224673d;
        if (str5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loginUrl");
            throw null;
        }
        ((o45.eh) v0Var.mo47979x2d63726f()).f424455a.C = str5;
        gm0.j1.d().g(eVar);
        java.lang.String obj2 = activityC16160x425523e6.T6().f525534m.getText().toString();
        int length2 = obj2.length() - 1;
        int i27 = 0;
        boolean z19 = false;
        while (i27 <= length2) {
            boolean z27 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(obj2.charAt(!z19 ? i27 : length2), 32) <= 0;
            if (z19) {
                if (!z27) {
                    break;
                } else {
                    length2--;
                }
            } else if (z27) {
                i27++;
            } else {
                z19 = true;
            }
        }
        activityC16160x425523e6.f224675f = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.h(obj2.subSequence(i27, length2 + 1).toString());
        activityC16160x425523e6.f224678i++;
    }
}
