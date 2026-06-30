package ic;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f371814k = 0;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f371815a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f371816b;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p332xf5bc2045.InterfaceC2917x949fc30f f371820f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p332xf5bc2045.InterfaceC2916x7b7d8c75 f371821g;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 f371823i;

    /* renamed from: j, reason: collision with root package name */
    public volatile pc.p f371824j;

    /* renamed from: c, reason: collision with root package name */
    public boolean f371817c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f371818d = false;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0 f371819e = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NONE;

    /* renamed from: h, reason: collision with root package name */
    public boolean f371822h = false;

    static {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("huiyanandroidsdk");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/cloud/huiyan/api/c", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/cloud/huiyan/api/c", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        } catch (java.lang.Throwable unused) {
        }
    }

    public final android.content.Context a() {
        java.lang.ref.WeakReference weakReference = this.f371815a;
        if (weakReference == null) {
            return null;
        }
        return (android.content.Context) weakReference.get();
    }

    public final void b(int i17, java.lang.String str) {
        this.f371818d = true;
        mc.q qVar = mc.p.f407064a;
        qVar.b("HuiYanBaseApi", "releaseLivenessSDK!");
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.api.C2914x9e22cdb9.m21752xf6e0f4e5();
        qVar.e("HuiYanBaseApi", "huiyan failed, code: " + i17 + " msg:" + str);
        if (this.f371821g != null) {
            if (qVar.f407068d != null && qVar.f407070f != null) {
                android.os.Message obtainMessage = qVar.f407070f.obtainMessage();
                obtainMessage.what = 2;
                qVar.f407070f.sendMessage(obtainMessage);
            }
            this.f371821g.m21766xc399519d(i17, str);
        } else {
            qVar.e("HuiYanBaseApi", "sdk cb2 is null!");
        }
        qVar.e("HuiYanBaseApi", "sdk cb4 is null!");
        qVar.b("HuiYanBaseApi", "after doOnFail call releaseCallBack!");
        f();
        qVar.b("HuiYanBaseApi", "closeCurrentCheckIsHaveResultPage!");
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f52 = this.f371823i;
        if (c2920x9dce3f52 == null) {
            qVar.b("HuiYanBaseApi", "want closeCurrentUi!");
            pc.f.b();
        } else {
            if (c2920x9dce3f52.m21846x7ea72bdf()) {
                return;
            }
            qVar.b("HuiYanBaseApi", "isHaveResultFragment close ui!");
            qVar.b("HuiYanBaseApi", "want closeCurrentUi!");
            pc.f.b();
        }
    }

    public final void c(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508 enumC2924x2fe19508) {
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p332xf5bc2045.InterfaceC2917x949fc30f interfaceC2917x949fc30f = this.f371820f;
        if (interfaceC2917x949fc30f != null) {
            interfaceC2917x949fc30f.m21768x53d02ab3(enumC2924x2fe19508);
        }
    }

    public final void d(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0 enumC2925x4120adb0, boolean z17) {
        java.util.HashMap hashMap;
        int intValue;
        if (enumC2925x4120adb0 == null || enumC2925x4120adb0 == com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NONE) {
            return;
        }
        if (z17) {
            if (this.f371819e == enumC2925x4120adb0) {
                return;
            } else {
                this.f371819e = enumC2925x4120adb0;
            }
        }
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p332xf5bc2045.InterfaceC2917x949fc30f interfaceC2917x949fc30f = this.f371820f;
        if (interfaceC2917x949fc30f != null) {
            interfaceC2917x949fc30f.m21769xfb2675db(enumC2925x4120adb0);
        }
        if (this.f371824j != null) {
            pc.r rVar = (pc.r) this.f371824j;
            rVar.getClass();
            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f52 = ic.c.f371813a.f371823i;
            if (c2920x9dce3f52 == null ? false : c2920x9dce3f52.m21853xa0c225a2()) {
                if (rVar.f434756a == null || (hashMap = rVar.f434757b) == null) {
                    mc.p.f407064a.b("SoundPoolHelper", "soundPool or eventIdWithResMap is null");
                } else if (hashMap.containsKey(enumC2925x4120adb0) && (intValue = ((java.lang.Integer) rVar.f434757b.get(enumC2925x4120adb0)).intValue()) != rVar.f434758c) {
                    rVar.f434758c = intValue;
                    com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2909xd19c2288.m21726x9cf0d20b().m21727xbb8b7b52(new pc.q(rVar, intValue));
                }
            }
        }
    }

    public final com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde e() {
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f52 = this.f371823i;
        if (c2920x9dce3f52 != null) {
            return c2920x9dce3f52.m21825xedb2eb34();
        }
        mc.p.f407064a.e("HuiYanBaseApi", "huiYanSdkConfig is null!");
        return null;
    }

    public final void f() {
        if (this.f371821g != null) {
            this.f371821g = null;
        }
        this.f371818d = true;
        this.f371819e = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NONE;
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.api.C2914x9e22cdb9.m21752xf6e0f4e5();
        if (this.f371824j == null) {
            mc.p.f407064a.e("HuiYanBaseApi", "soundPlayInterface is null!");
            return;
        }
        pc.r rVar = (pc.r) this.f371824j;
        rVar.getClass();
        mc.p.f407064a.b("SoundPoolHelper", "call release");
        android.media.SoundPool soundPool = rVar.f434756a;
        if (soundPool != null) {
            soundPool.release();
            rVar.f434756a = null;
        }
        rVar.f434758c = -1;
    }
}
