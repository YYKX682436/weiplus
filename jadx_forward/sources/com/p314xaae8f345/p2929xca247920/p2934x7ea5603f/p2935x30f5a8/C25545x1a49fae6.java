package com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.shadow.dynamic.host.LoaderImplLoader */
/* loaded from: classes13.dex */
public final class C25545x1a49fae6 extends ut5.e {

    /* renamed from: sInterfaces */
    private static final java.lang.String[] f46713xfa46632d = {"com.tencent.shadow.core.runtime.container", "com.tencent.shadow.dynamic.host", "com.tencent.shadow.core.common"};

    /* renamed from: sLoaderFactoryImplClassName */
    private static final java.lang.String f46714x20987c7f = "com.tencent.shadow.dynamic.loader.impl.LoaderFactoryImpl";

    @Override // ut5.e
    /* renamed from: getCustomWhiteList */
    public java.lang.String[] mo95588x273269c0() {
        return f46713xfa46632d;
    }

    /* renamed from: load */
    public com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25549x41da3086 m95589x32c4e6(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 c25507x83693462, java.lang.String str, android.content.Context context, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        try {
            return ((com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25544xdfae1d57) com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25544xdfae1d57.class.cast(ut5.b.a(c25507x83693462, m170523xe1753221(c25507x83693462), parcelFileDescriptor).loadClass(f46714x20987c7f).newInstance())).m95586x7a16d821(c25507x83693462, str, context);
        } catch (java.lang.ClassCastException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException e17) {
            throw new java.lang.Exception(e17);
        }
    }
}
