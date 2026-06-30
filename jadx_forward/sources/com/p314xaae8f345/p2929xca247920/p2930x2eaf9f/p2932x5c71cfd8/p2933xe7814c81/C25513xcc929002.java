package com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81;

/* renamed from: com.tencent.shadow.core.runtime.container.DelegateProviderHolder */
/* loaded from: classes14.dex */
public class C25513xcc929002 {

    /* renamed from: DEFAULT_KEY */
    public static final java.lang.String f46651x665bbb21 = "DEFAULT_KEY";

    /* renamed from: delegateProviderMap */
    private static java.util.Map<java.lang.String, com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25512x3df936b6> f46652xa1932ae6 = new java.util.HashMap();

    /* renamed from: sCustomPid */
    public static long f46653x947e1d27 = android.os.SystemClock.elapsedRealtime();

    /* renamed from: getDelegateProvider */
    public static com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25512x3df936b6 m94658x180d5a0c(java.lang.String str) {
        return f46652xa1932ae6.get(str);
    }

    /* renamed from: setDelegateProvider */
    public static void m94659xbc09ef18(java.lang.String str, com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2932x5c71cfd8.p2933xe7814c81.InterfaceC25512x3df936b6 interfaceC25512x3df936b6) {
        f46652xa1932ae6.put(str, interfaceC25512x3df936b6);
    }
}
