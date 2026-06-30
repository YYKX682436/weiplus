package com.tencent.maas.speech;

/* loaded from: classes5.dex */
public class MJILinkAppRequest {

    /* renamed from: a, reason: collision with root package name */
    public int f48552a;

    /* renamed from: b, reason: collision with root package name */
    public int f48553b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f48554c;

    /* renamed from: d, reason: collision with root package name */
    public int f48555d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f48556e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f48557f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.maas.speech.a f48558g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f48559h = new java.util.HashSet();

    public int getCommandID() {
        return this.f48552a;
    }

    public boolean getLimitFlow() {
        return this.f48556e;
    }

    public boolean getLimitFrequency() {
        return this.f48557f;
    }

    public int getNetType() {
        return this.f48558g.f48563d;
    }

    public int getRetryCount() {
        return this.f48555d;
    }

    public int getTimeoutMillis() {
        return this.f48553b;
    }

    public java.lang.String getURL() {
        return this.f48554c;
    }

    public boolean hasSet(java.lang.String str) {
        java.util.Iterator it = this.f48559h.iterator();
        while (it.hasNext()) {
            if (java.util.Objects.equals((java.lang.String) it.next(), str)) {
                return true;
            }
        }
        return false;
    }
}
