package com.p314xaae8f345.p3210x3857dc.p3216x65baef3;

/* renamed from: com.tencent.xweb.pinus.PSCoreWrapper */
/* loaded from: classes13.dex */
public class C27842xafdfb9f1 extends com.p314xaae8f345.p3210x3857dc.C27819x59d3fe78 {

    /* renamed from: BRIDGE_PACKAGE */
    public static final java.lang.String f61134x9d9e6570 = "com.tencent.xweb.pinus";
    private static final java.lang.String TAG = "PSCoreWrapper";

    /* renamed from: sInstance */
    private static com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1 f61135xbfaed628;

    public C27842xafdfb9f1() {
        f61135xbfaed628 = this;
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1 m120281x9cf0d20b() {
        return f61135xbfaed628;
    }

    /* renamed from: handleRuntimeError */
    public static void m120282x5101ff58(java.lang.Exception exc) {
        by5.c4.c(TAG, "This API is incompatible with the XWeb Pinus runtime library");
        by5.c4.c(TAG, "stack trace: " + android.util.Log.getStackTraceString(exc));
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27819x59d3fe78
    /* renamed from: getBridgePackageName */
    public java.lang.String mo120200x5633bbf2() {
        return f61134x9d9e6570;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27819x59d3fe78
    /* renamed from: getWebViewCoreClassLoader */
    public java.lang.ClassLoader mo120202xd8834429() {
        return vx5.k.f522907a.b();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27819x59d3fe78, tx5.h
    /* renamed from: hasFeature */
    public boolean mo120203x3ec63efc(int i17) {
        java.lang.Object g17 = vx5.k.f522907a.g(80003, new java.lang.Object[]{java.lang.Integer.valueOf(i17)});
        if (g17 instanceof java.lang.Boolean) {
            return ((java.lang.Boolean) g17).booleanValue();
        }
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27819x59d3fe78, tx5.h
    /* renamed from: invokeNativeChannel */
    public boolean mo120204x9bf4bb54(int i17, java.lang.Object[] objArr) {
        vx5.l lVar = vx5.k.f522907a;
        try {
            by5.c4.f("PinusStandAloneChannel", "invokeNativeChannel, funid:" + i17);
            new by5.i0(lVar.a("PSViewDelegate"), "invokeNativeChannel", java.lang.Integer.TYPE, java.lang.Object[].class).b(java.lang.Integer.valueOf(i17), objArr);
            return true;
        } catch (java.lang.ClassCircularityError e17) {
            by5.c4.c("PinusStandAloneChannel", "invokeNativeChannel ClassCircularityError:" + e17);
            by5.s0.e(938L, 90L, 1L);
            return false;
        } catch (java.lang.RuntimeException e18) {
            by5.c4.c("PinusStandAloneChannel", "invokeNativeChannel RuntimeException:" + e18);
            by5.s0.e(938L, 89L, 1L);
            return false;
        } catch (java.lang.Throwable th6) {
            by5.c4.d("PinusStandAloneChannel", "invokeNativeChannel error", th6);
            by5.s0.e(938L, 91L, 1L);
            return false;
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27819x59d3fe78, tx5.h
    /* renamed from: invokeRuntimeChannel */
    public java.lang.Object mo120205xb04520a3(int i17, java.lang.Object[] objArr) {
        return vx5.k.f522907a.g(i17, objArr);
    }
}
