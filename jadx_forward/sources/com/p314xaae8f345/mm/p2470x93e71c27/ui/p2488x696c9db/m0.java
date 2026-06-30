package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f273302a = new java.util.ArrayList();

    public m0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l0 l0Var) {
    }

    public void a(java.lang.String str) {
        this.f273302a = new java.util.ArrayList();
        if (str == null || str.length() == 0) {
            return;
        }
        for (java.lang.String str2 : str.split(";")) {
            this.f273302a.add(str2);
        }
    }

    public java.lang.String b() {
        java.util.List list = this.f273302a;
        if (list == null || list.size() == 0) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Iterator it = this.f273302a.iterator();
        while (it.hasNext()) {
            stringBuffer.append((java.lang.String) it.next());
            stringBuffer.append(";");
        }
        return stringBuffer.toString();
    }
}
