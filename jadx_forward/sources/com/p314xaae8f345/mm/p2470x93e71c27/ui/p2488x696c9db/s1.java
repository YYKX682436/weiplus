package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes12.dex */
public abstract class s1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 f273416d;

    /* renamed from: e, reason: collision with root package name */
    public int f273417e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f273418f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f273419g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f273420h;

    /* renamed from: i, reason: collision with root package name */
    public int f273421i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f273422m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f f273423n;

    public s1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        this.f273423n = activityC19730xa7b9756f;
        this.f273416d = adapter;
        this.f273417e = 100;
        java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(synchronizedList, "synchronizedList(...)");
        this.f273418f = synchronizedList;
        java.util.List synchronizedList2 = java.util.Collections.synchronizedList(new java.util.ArrayList());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(synchronizedList2, "synchronizedList(...)");
        this.f273419g = synchronizedList2;
        java.lang.String r17 = c01.z1.r();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
        this.f273422m = r17;
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.String string;
        java.lang.String r17 = c01.z1.r();
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f = this.f273423n;
        if (K0 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, r17)) {
            string = activityC19730xa7b9756f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h5m);
        } else {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            string = c01.a2.e(str);
        }
        java.lang.String string2 = activityC19730xa7b9756f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572424b65, string);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string2;
    }

    public final java.lang.CharSequence b(java.lang.String str, java.lang.CharSequence charSequence) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.text.SpannableString spannableString = new android.text.SpannableString(charSequence);
        int I = r26.n0.I(charSequence, str, 0, true);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.c.f219556a), I, str.length() + I, 33);
        spannableStringBuilder.append((java.lang.CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public final java.util.List c(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.List list = this.f273419g;
        list.clear();
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(key);
        java.util.List<com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d2> list2 = this.f273418f;
        if (K0) {
            for (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d2 d2Var : list2) {
                d2Var.f273096g = java.lang.String.valueOf(d2Var.f273096g);
                java.lang.String obj = d2Var.f273097h.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "<set-?>");
                d2Var.f273097h = obj;
                list.add(d2Var.a());
            }
        } else {
            for (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d2 d2Var2 : list2) {
                java.lang.CharSequence charSequence = d2Var2.f273096g;
                if (charSequence == null) {
                    charSequence = "";
                }
                boolean B = r26.n0.B(d2Var2.f273097h, key, true);
                boolean B2 = r26.n0.B(charSequence, key, true);
                if (B || B2) {
                    if (B) {
                        d2Var2.f273097h = b(key, d2Var2.f273097h);
                    }
                    if (B2) {
                        d2Var2.f273096g = b(key, charSequence);
                    }
                    list.add(d2Var2);
                }
            }
        }
        return list;
    }
}
