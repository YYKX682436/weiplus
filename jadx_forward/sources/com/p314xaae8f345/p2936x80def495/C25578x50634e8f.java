package com.p314xaae8f345.p2936x80def495;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J&\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007J\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u001a\u0010\r\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J&\u0010\r\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007J\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/tencent/skyline/SkylineLog;", "", "Lcom/tencent/skyline/ISkylineLog;", "cb", "Ljz5/f0;", "initLogCallBack", "", "tag", "msg", "f", "", "tr", "e", "w", "i", "d", org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V, "mLogCallback", "Lcom/tencent/skyline/ISkylineLog;", "<init>", "()V", "skyline_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.skyline.SkylineLog */
/* loaded from: classes7.dex */
public final class C25578x50634e8f {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.p2936x80def495.C25578x50634e8f f46807x4fbc8495 = new com.p314xaae8f345.p2936x80def495.C25578x50634e8f();
    private static com.p314xaae8f345.p2936x80def495.InterfaceC25566xc59a4798 mLogCallback;

    private C25578x50634e8f() {
    }

    public static final void d(java.lang.String str, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p2936x80def495.InterfaceC25566xc59a4798 interfaceC25566xc59a4798 = mLogCallback;
        if (interfaceC25566xc59a4798 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC25566xc59a4798);
            interfaceC25566xc59a4798.d(str, msg);
        }
    }

    public static final void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        com.p314xaae8f345.p2936x80def495.InterfaceC25566xc59a4798 interfaceC25566xc59a4798 = mLogCallback;
        if (interfaceC25566xc59a4798 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC25566xc59a4798);
            interfaceC25566xc59a4798.e(str, str2);
        }
    }

    public static final void f(java.lang.String str, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p2936x80def495.InterfaceC25566xc59a4798 interfaceC25566xc59a4798 = mLogCallback;
        if (interfaceC25566xc59a4798 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC25566xc59a4798);
            interfaceC25566xc59a4798.e(str, msg);
        }
    }

    public static final void i(java.lang.String str, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p2936x80def495.InterfaceC25566xc59a4798 interfaceC25566xc59a4798 = mLogCallback;
        if (interfaceC25566xc59a4798 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC25566xc59a4798);
            interfaceC25566xc59a4798.i(str, msg);
        }
    }

    /* renamed from: initLogCallBack */
    public static final void m95753xf9559099(com.p314xaae8f345.p2936x80def495.InterfaceC25566xc59a4798 interfaceC25566xc59a4798) {
        mLogCallback = interfaceC25566xc59a4798;
    }

    public static final void v(java.lang.String str, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p2936x80def495.InterfaceC25566xc59a4798 interfaceC25566xc59a4798 = mLogCallback;
        if (interfaceC25566xc59a4798 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC25566xc59a4798);
            interfaceC25566xc59a4798.v(str, msg);
        }
    }

    public static final void w(java.lang.String str, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p2936x80def495.InterfaceC25566xc59a4798 interfaceC25566xc59a4798 = mLogCallback;
        if (interfaceC25566xc59a4798 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC25566xc59a4798);
            interfaceC25566xc59a4798.w(str, msg);
        }
    }

    public static final void e(java.lang.String str, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p2936x80def495.InterfaceC25566xc59a4798 interfaceC25566xc59a4798 = mLogCallback;
        if (interfaceC25566xc59a4798 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC25566xc59a4798);
            interfaceC25566xc59a4798.e(str, msg);
        }
    }

    public static final void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        com.p314xaae8f345.p2936x80def495.InterfaceC25566xc59a4798 interfaceC25566xc59a4798 = mLogCallback;
        if (interfaceC25566xc59a4798 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC25566xc59a4798);
            interfaceC25566xc59a4798.w(str, str2);
        }
    }
}
