package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes15.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f226112e;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w wVar, java.lang.String str, java.util.Map map) {
        this.f226111d = str;
        this.f226112e = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226046p).iterator();
        while (it.hasNext()) {
            ((q80.a0) it.next()).mo51024x295aba8a(this.f226111d, this.f226112e);
        }
    }
}
