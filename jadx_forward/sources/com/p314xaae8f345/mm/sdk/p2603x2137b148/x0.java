package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f274602a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.StringBuffer f274603b;

    public x0(java.lang.String str) {
        this.f274602a = "";
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        this.f274603b = stringBuffer;
        this.f274602a = str;
        stringBuffer.append("<" + str + ">");
    }

    public void a(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuffer stringBuffer = this.f274603b;
        stringBuffer.append("<" + str + ">");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            stringBuffer.append("");
        } else if (str2.contains("]]>")) {
            stringBuffer.append("<![CDATA[" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(str2) + "]]>");
        } else {
            stringBuffer.append("<![CDATA[" + str2 + "]]>");
        }
        stringBuffer.append("</" + str + ">");
    }
}
