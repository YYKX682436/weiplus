package com.p314xaae8f345.p457x3304c6.p482xca9708e2;

/* renamed from: com.tencent.maas.speech.MJILinkAppRequest */
/* loaded from: classes5.dex */
public class C4197x7df5f634 {

    /* renamed from: a, reason: collision with root package name */
    public int f130085a;

    /* renamed from: b, reason: collision with root package name */
    public int f130086b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f130087c;

    /* renamed from: d, reason: collision with root package name */
    public int f130088d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f130089e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f130090f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p482xca9708e2.a f130091g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f130092h = new java.util.HashSet();

    /* renamed from: getCommandID */
    public int m34671xa618b2f0() {
        return this.f130085a;
    }

    /* renamed from: getLimitFlow */
    public boolean m34672x675fdcd3() {
        return this.f130089e;
    }

    /* renamed from: getLimitFrequency */
    public boolean m34673x88e428d7() {
        return this.f130090f;
    }

    /* renamed from: getNetType */
    public int m34674xab9ed241() {
        return this.f130091g.f130096d;
    }

    /* renamed from: getRetryCount */
    public int m34675xa8e25f3d() {
        return this.f130088d;
    }

    /* renamed from: getTimeoutMillis */
    public int m34676x43d4351() {
        return this.f130086b;
    }

    /* renamed from: getURL */
    public java.lang.String m34677xb5887239() {
        return this.f130087c;
    }

    /* renamed from: hasSet */
    public boolean m34678xb7047368(java.lang.String str) {
        java.util.Iterator it = this.f130092h.iterator();
        while (it.hasNext()) {
            if (java.util.Objects.equals((java.lang.String) it.next(), str)) {
                return true;
            }
        }
        return false;
    }
}
