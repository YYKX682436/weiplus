package com.p314xaae8f345.map.p511x696c9db.net.p515x584fd04f;

/* renamed from: com.tencent.map.tools.net.exception.NetCustomException */
/* loaded from: classes7.dex */
public class C4336xafe570a1 extends java.lang.Exception {

    /* renamed from: serialVersionUID */
    private static final long f17007x3a3ed56c = -5614711401833110994L;

    /* renamed from: exception */
    private java.lang.Exception f17008x584fd04f;

    /* renamed from: netCode */
    private int f17009x6dc9b52a;

    public C4336xafe570a1() {
    }

    /* renamed from: getException */
    public java.lang.Exception m36044x57bd4199() {
        return this.f17008x584fd04f;
    }

    /* renamed from: getNetCode */
    public int m36045xab96f0f4() {
        return this.f17009x6dc9b52a;
    }

    public C4336xafe570a1(java.lang.String str, java.lang.Exception exc, int i17) {
        super(str);
        this.f17008x584fd04f = exc;
        this.f17009x6dc9b52a = i17;
    }
}
