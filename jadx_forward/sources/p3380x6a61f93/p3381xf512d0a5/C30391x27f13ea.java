package p3380x6a61f93.p3381xf512d0a5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\n"}, d2 = {"Lurgen/ur_0025/URS_C44D;", "", "", "parameter", "Lcom/tencent/unit_rc/BaseObjectDef;", "callback", "Ljz5/f0;", "UR_1C2B", "<init>", "()V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: urgen.ur_0025.URS_C44D */
/* loaded from: classes11.dex */
public final class C30391x27f13ea {

    /* renamed from: INSTANCE */
    public static final p3380x6a61f93.p3381xf512d0a5.C30391x27f13ea f76988x4fbc8495 = new p3380x6a61f93.p3381xf512d0a5.C30391x27f13ea();

    private C30391x27f13ea() {
    }

    /* renamed from: UR_1C2B */
    public static final void m168507x21b11064(byte[] parameter, com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca759055) {
        jm4.v1 v1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameter, "parameter");
        bw5.ep0 ep0Var = (bw5.ep0) jm4.r5.d(parameter, new bw5.ep0());
        jm4.w1 w1Var = jm4.x1.f381973r;
        jm4.k1 k1Var = (jm4.k1) interfaceC26826xca759055;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = null;
        if (k1Var == null) {
            v1Var = null;
        } else {
            if (k1Var instanceof jm4.x1) {
            }
            v1Var = new jm4.v1(k1Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinServiceStatic", "startConsume called");
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.app.w.INSTANCE.f135419h;
        android.content.Context context = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (context instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) {
            activityC1102x9ee2d9f = (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Current activity is not a FragmentActivity: ");
            sb6.append(context != null ? context.getClass().getName() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeCoinServiceStatic", sb6.toString());
        }
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f2 = activityC1102x9ee2d9f;
        if (activityC1102x9ee2d9f2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeCoinServiceStatic", "Failed to get current FragmentActivity");
            throw new java.lang.IllegalStateException("No current FragmentActivity available. Please call startConsume from a FragmentActivity context.");
        }
        pr4.l lVar = new pr4.l(ep0Var.f108518d, activityC1102x9ee2d9f2, new jm4.f6(v1Var), new jm4.g6(v1Var), new jm4.h6(v1Var));
        boolean[] zArr = ep0Var.f108526o;
        lVar.f439559g = (zArr[2] ? ep0Var.f108519e : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b).g();
        boolean z17 = zArr[8];
        if (z17) {
            bw5.hr0 hr0Var = z17 ? ep0Var.f108525n : bw5.hr0.TingWCCoinConsumeModeUnknown;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hr0Var, "getConsumeMode(...)");
            int ordinal = hr0Var.ordinal();
            lVar.f439558f = ordinal != 1 ? ordinal != 2 ? pr4.k.f439549d : pr4.k.f439550e : pr4.k.f439549d;
        }
        boolean z18 = zArr[3];
        if (z18) {
            java.lang.String str = z18 ? ep0Var.f108520f : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getProductTitle(...)");
            lVar.f439560h = str;
        }
        boolean z19 = zArr[4];
        if (z19) {
            java.lang.String str2 = z19 ? ep0Var.f108521g : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getProductTitleInsufficient(...)");
            lVar.f439561i = str2;
        }
        if (zArr[5]) {
            lVar.f439562j = ep0Var.f108522h;
        }
        boolean z27 = zArr[6];
        if (z27) {
            java.lang.String str3 = z27 ? ep0Var.f108523i : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getConsumeButtonTitle(...)");
            lVar.f439565m = str3;
        }
        boolean z28 = zArr[7];
        if (z28) {
            java.lang.String str4 = z28 ? ep0Var.f108524m : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getConsumeButtonTitleInsufficient(...)");
            lVar.f439566n = str4;
        }
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).getClass();
        new ls4.u(lVar).f();
    }
}
