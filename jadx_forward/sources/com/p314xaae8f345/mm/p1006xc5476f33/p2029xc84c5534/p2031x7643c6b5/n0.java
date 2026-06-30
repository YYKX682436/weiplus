package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* loaded from: classes5.dex */
public class n0 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f239823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f239824e;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var, java.util.Map map, java.lang.String str) {
        this.f239823d = map;
        this.f239824e = str;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.util.Map map = this.f239823d;
        return new org.json.JSONArray().put((map == null ? new org.json.JSONObject() : new org.json.JSONObject(map)).put("info", this.f239824e));
    }
}
