package com.p314xaae8f345.p3121x37984a.p3122x2e06d1;

/* renamed from: com.tencent.wcdb.base.CppObject */
/* loaded from: classes12.dex */
public class C26899xf18c2aa2 implements com.p314xaae8f345.p3121x37984a.p3122x2e06d1.InterfaceC26900x5572883 {

    /* renamed from: _hellAccFlag_ */
    private byte f57825x7f11beae;

    /* renamed from: cppObj */
    protected long f57826xaf4e2c54 = 0;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("WCDB");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/wcdb/base/CppObject", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/wcdb/base/CppObject", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static long get(com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2 c26899xf18c2aa2) {
        if (c26899xf18c2aa2 == null) {
            return 0L;
        }
        return c26899xf18c2aa2.f57826xaf4e2c54;
    }

    /* renamed from: releaseCPPObject */
    public static native void m106351xd06d167b(long j17);

    @Override // com.p314xaae8f345.p3121x37984a.p3122x2e06d1.InterfaceC26900x5572883
    /* renamed from: asCppObject */
    public com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2 mo106352x1931b6b0() {
        return this;
    }

    /* renamed from: finalize */
    public void m106353xd764dc1e() {
        long j17 = this.f57826xaf4e2c54;
        this.f57826xaf4e2c54 = 0L;
        if (j17 != 0) {
            m106351xd06d167b(j17);
        }
        super.finalize();
    }

    public static long get(com.p314xaae8f345.p3121x37984a.p3122x2e06d1.InterfaceC26900x5572883 interfaceC26900x5572883) {
        if (interfaceC26900x5572883 == null) {
            return 0L;
        }
        return interfaceC26900x5572883.mo106352x1931b6b0().f57826xaf4e2c54;
    }
}
