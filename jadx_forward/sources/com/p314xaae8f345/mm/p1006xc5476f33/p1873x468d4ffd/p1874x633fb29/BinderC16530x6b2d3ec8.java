package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29;

/* renamed from: com.tencent.mm.plugin.mmsight.model.CaptureMMProxy */
/* loaded from: classes10.dex */
public class BinderC16530x6b2d3ec8 extends k55.b implements r90.i {

    /* renamed from: g, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8 f230366g = null;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f230367h = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f230368f;

    public BinderC16530x6b2d3ec8(k55.k kVar) {
        super(kVar);
        this.f230368f = false;
    }

    /* renamed from: createProxy */
    public static void m66801xe1c076d2(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8 binderC16530x6b2d3ec8) {
        f230366g = binderC16530x6b2d3ec8;
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8 m66802x9cf0d20b() {
        return f230366g;
    }

    /* renamed from: checkUseMMVideoPlayer */
    public boolean m66803xe1dd347d() {
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("checkUseMMVideoPlayerInMM", new java.lang.Object[0]);
        if (m142014x6c2fab7 == null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "checkUseMMVideoPlayer[%b]", m142014x6c2fab7);
        return ((java.lang.Boolean) m142014x6c2fab7).booleanValue();
    }

    @k55.m
    /* renamed from: checkUseMMVideoPlayerInMM */
    public boolean m66804x8f2783a2() {
        d11.s.fj();
        d11.s.Ai();
        return true;
    }

    /* renamed from: clearArtistCache */
    public void m66805xfb9b43ee() {
        m142014x6c2fab7("clearArtistCacheInMM", new java.lang.Object[0]);
    }

    @k55.m
    /* renamed from: clearArtistCacheInMM */
    public void m66806x737e7293() {
        ((wb0.e) ((xb0.e) i95.n0.c(xb0.e.class))).getClass();
        new rj.l().a();
    }

    @Override // k55.b
    public android.os.Bundle d(java.lang.Object... objArr) {
        android.os.Bundle bundle = new android.os.Bundle();
        int length = objArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj = objArr[i17];
            if (obj instanceof android.os.Bundle) {
                bundle.putBundle("" + i17, (android.os.Bundle) objArr[i17]);
            } else if (obj instanceof android.os.Parcelable) {
                bundle.putParcelable("" + i17, (android.os.Parcelable) objArr[i17]);
            } else if (obj instanceof com.p314xaae8f345.mm.p2621x8fb0427b.u3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "objectsToBundle: %s", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.u3) obj).ordinal()));
                bundle.putInt("" + i17, ((com.p314xaae8f345.mm.p2621x8fb0427b.u3) objArr[i17]).ordinal());
            } else {
                bundle.putSerializable("" + i17, (java.io.Serializable) objArr[i17]);
            }
        }
        return bundle;
    }

    public java.lang.Object get(com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var, java.lang.Object obj) {
        if (!this.f230368f || gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "get %s %s", u3Var, obj);
            java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("getConfigStorage", u3Var, obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "get %s %s and get val %s", u3Var, obj, m142014x6c2fab7);
            return m142014x6c2fab7 == null ? obj : m142014x6c2fab7;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "account not ready, return getBoolean default: " + obj);
        return obj;
    }

    /* renamed from: getAccVideoPath */
    public java.lang.String m66807x1efd7235() {
        java.lang.String str;
        if (!this.f230368f || gm0.j1.b().m()) {
            str = (java.lang.String) m142014x6c2fab7("getAccVideoPathInMM", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "getAccVideoPathInMM " + str + " accVideoPath: " + f230367h);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "account not ready, use temp getAccVideoPath: ");
            str = lp0.b.h0("/temp_capture_video").o();
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            f230367h = str;
        }
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f230367h) ? f230367h : str;
    }

    @k55.m
    /* renamed from: getAccVideoPathInMM */
    public java.lang.String m66808xa202255a() {
        return t21.o2.Bi().Ai();
    }

    /* renamed from: getBoolean */
    public boolean m66809x41a8a7f2(com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var, boolean z17) {
        if (!this.f230368f || gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "getBoolean %s %s", u3Var, java.lang.Boolean.valueOf(z17));
            java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("getConfigStorage", u3Var, java.lang.Boolean.valueOf(z17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "getBoolean %s %s and get val %s", u3Var, java.lang.Boolean.valueOf(z17), m142014x6c2fab7);
            return m142014x6c2fab7 == null ? z17 : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(m142014x6c2fab7.toString(), z17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "account not ready, return getBoolean default: " + z17);
        return z17;
    }

    @k55.m
    /* renamed from: getConfigStorage */
    public java.lang.Object m66810x2e2d4523(int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = ((com.p314xaae8f345.mm.p2621x8fb0427b.u3[]) com.p314xaae8f345.mm.p2621x8fb0427b.u3.class.getEnumConstants())[i17];
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "getConfigStorage, %s %s", u3Var, obj);
        gm0.j1.i();
        return gm0.j1.u().c().m(u3Var, obj);
    }

    /* renamed from: getDeviceInfoConfig */
    public java.lang.String m66811xad307fc() {
        java.lang.String str = (java.lang.String) m142014x6c2fab7("getDeviceInfoConfigInMM", new java.lang.Object[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "getDeviceInfoConfig return: %s", str);
        return str;
    }

    @k55.m
    /* renamed from: getDeviceInfoConfigInMM */
    public java.lang.String m66812xd9f97fa1() {
        gm0.j1.i();
        return gm0.j1.u().j().n0(77825);
    }

    @Override // r90.i
    /* renamed from: getDynamicConfig */
    public java.lang.String mo66813xbfca20ab(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) m142014x6c2fab7("getDynamicConfigInMM", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "getDynamicConfig, key: %s, value: %s", str, str2);
        return str2;
    }

    @k55.m
    /* renamed from: getDynamicConfigInMM */
    public java.lang.String m66814x9746a8d0(java.lang.String str) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(str);
    }

    /* renamed from: getGameVideoTransPara */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d m66815x4ef4c6f5(int i17) {
        android.os.Parcelable parcelable = (android.os.Parcelable) m142014x6c2fab7("getGameVideoTransParaInMM", java.lang.Integer.valueOf(i17));
        java.util.Objects.toString(parcelable);
        return (com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d) parcelable;
    }

    @k55.m
    /* renamed from: getGameVideoTransParaInMM */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d m66816xa8c11a1a(int i17) {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d mj6 = d11.s.fj().mj(i17);
        mj6.m48124x9616526c();
        return mj6;
    }

    /* renamed from: getInt */
    public int m66817xb58848b9(com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var, int i17) {
        if (!this.f230368f || gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "getInt %s %s", u3Var, java.lang.Integer.valueOf(i17));
            java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("getConfigStorage", u3Var, java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "getInt %s %s and get val %s", u3Var, java.lang.Integer.valueOf(i17), m142014x6c2fab7);
            return m142014x6c2fab7 == null ? i17 : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(m142014x6c2fab7.toString(), i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "account not ready, return default: " + i17);
        return i17;
    }

    /* renamed from: getSnsAlbumVideoTransPara */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d m66818xc616d71a() {
        android.os.Parcelable parcelable = (android.os.Parcelable) m142014x6c2fab7("getSnsAlbumVideoTransParaInMM", new java.lang.Object[0]);
        java.util.Objects.toString(parcelable);
        return (com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d) parcelable;
    }

    @k55.m
    /* renamed from: getSnsAlbumVideoTransParaInMM */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d m66819xa2648fbf() {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d nj6 = d11.s.fj().nj();
        nj6.m48124x9616526c();
        return nj6;
    }

    /* renamed from: getSubCoreImageFullPath */
    public java.lang.String m66820xd5833e86(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) m142014x6c2fab7("getSubCoreImageFullPathInMM", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "getSubCoreImageFullPath " + str2);
        return str2;
    }

    @k55.m
    /* renamed from: getSubCoreImageFullPathInMM */
    public java.lang.String m66821xcd37612b(java.lang.String str) {
        return ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).Zi(null, bm5.f0.f104094f, str);
    }

    /* renamed from: getWeixinMeta */
    public byte[] m66822x1c0ac37d() {
        byte[] bArr = (byte[]) m142014x6c2fab7("getWeixinMetaDataInMM", new java.lang.Object[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "getWeixinMeta result: %s", bArr);
        return bArr;
    }

    @k55.m
    /* renamed from: getWeixinMetaDataInMM */
    public byte[] m66823x667a3aec() {
        return d11.s.fj().sj();
    }

    @Override // k55.b, k55.e
    /* renamed from: onCallback */
    public void mo66824x9ad64344(java.lang.String str, android.os.Bundle bundle, boolean z17) {
        java.lang.reflect.Method method;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "class:%s, method:%s, clientCall:%B", getClass().getName(), str, java.lang.Boolean.valueOf(z17));
        try {
            java.lang.reflect.Method[] methods = getClass().getMethods();
            int length = methods.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    method = null;
                    break;
                }
                method = methods[i17];
                if (method.getName().equalsIgnoreCase(str)) {
                    break;
                } else {
                    i17++;
                }
            }
            if (method != null) {
                if (method.isAnnotationPresent(z17 ? k55.l.class : k55.m.class)) {
                    java.lang.Object invoke = method.invoke(this, m142015xfb7d3953(bundle));
                    if (method.getReturnType() != java.lang.Void.TYPE) {
                        if (invoke instanceof android.os.Parcelable) {
                            bundle.putParcelable("result_key", (android.os.Parcelable) invoke);
                            return;
                        }
                        if ("getConfigStorage".equals(str)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "put result as Serializable: %s", (java.io.Serializable) invoke);
                        }
                        bundle.putSerializable("result_key", (java.io.Serializable) invoke);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CaptureMMProxy", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    public boolean set(com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var, java.lang.Object obj) {
        if (!this.f230368f || gm0.j1.b().m()) {
            return ((java.lang.Boolean) m142014x6c2fab7("setConfigStorage", u3Var, obj)).booleanValue();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "account not ready, abort set: " + u3Var + " -> " + obj);
        return false;
    }

    /* renamed from: setCompatNotLogin */
    public void m66825x46f4afa(boolean z17) {
        this.f230368f = z17;
    }

    @k55.m
    /* renamed from: setConfigStorage */
    public boolean m66826xc103ab97(int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = ((com.p314xaae8f345.mm.p2621x8fb0427b.u3[]) com.p314xaae8f345.mm.p2621x8fb0427b.u3.class.getEnumConstants())[i17];
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "setConfigStorage, %s %s", u3Var, obj);
        gm0.j1.i();
        gm0.j1.u().c().x(u3Var, obj);
        return true;
    }

    /* renamed from: useMediaRecordNew */
    public boolean m66827x4d14172() {
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("useMediaRecordNewInMM", new java.lang.Object[0]);
        if (m142014x6c2fab7 == null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptureMMProxy", "useMediaRecordNewInMM[%b]", m142014x6c2fab7);
        return ((java.lang.Boolean) m142014x6c2fab7).booleanValue();
    }

    @k55.m
    /* renamed from: useMediaRecordNewInMM */
    public java.lang.Boolean m66828xceb20e17() {
        return java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_jump_to_record_media, true));
    }
}
