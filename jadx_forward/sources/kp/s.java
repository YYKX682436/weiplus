package kp;

@j95.b
/* loaded from: classes7.dex */
public final class s extends i95.w implements gz.l {

    /* renamed from: d, reason: collision with root package name */
    public gz.k f392364d;

    public s() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d dVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d.f298891c;
        dVar.k("NearConnectionService@Connected", new kp.o(this));
        dVar.l("NearConnectionService@Disconnected", new kp.p(this));
        dVar.j("NearConnectionService@ConnectFailed", new kp.q(this));
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.g.f298894a = kp.r.f392354a;
    }

    public bw5.yf0 wi(java.lang.String bizName, bw5.ge0 userInfo, bw5.zf0 sessionInfo, bw5.wd0 wd0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userInfo, "userInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionInfo, "sessionInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NearConnectionService", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            throw new java.lang.RuntimeException("initialize should NOT be called in main thread");
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d.f298891c.i(sessionInfo);
        if (wd0Var != null && wd0Var.f116195d.isEmpty()) {
            bw5.yf0 yf0Var = new bw5.yf0();
            yf0Var.f117004g = 100901;
            boolean[] zArr = yf0Var.f117006i;
            zArr[4] = true;
            yf0Var.f117005h = "IllegalArgument: empty addr info";
            zArr[5] = true;
            return yf0Var;
        }
        if (wd0Var == null) {
            wd0Var = new bw5.wd0();
        }
        java.util.LinkedList linkedList = wd0Var.f116195d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getAddrInfo(...)");
        int i17 = 0;
        for (java.lang.Object obj : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            bw5.vd0 vd0Var = (bw5.vd0) obj;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init AddrInfo[");
            sb6.append(i17);
            sb6.append("]: ip = ");
            sb6.append(vd0Var.f115873g[1] ? vd0Var.f115870d : "");
            sb6.append(", port = ");
            sb6.append(vd0Var.f115871e);
            sb6.append(", addr_type = ");
            sb6.append(vd0Var.f115873g[3] ? vd0Var.f115872f : bw5.u.ADDR_TYPE_WIFI);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NearConnectionService", sb6.toString());
            i17 = i18;
        }
        bw5.yf0 e17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d.f298891c.e(bizName, userInfo, wd0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "initialize(...)");
        return e17;
    }
}
