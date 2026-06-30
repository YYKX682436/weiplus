package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes.dex */
public final class c1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi5.z f290811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.h1 f290812e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f290813f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f290814g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f290815h;

    public c1(wi5.z zVar, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.h1 h1Var, java.util.List list, java.util.HashMap hashMap, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var) {
        this.f290811d = zVar;
        this.f290812e = h1Var;
        this.f290813f = list;
        this.f290814g = hashMap;
        this.f290815h = i2Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p13.v vVar = (p13.v) obj;
        wi5.z zVar = this.f290811d;
        boolean z17 = zVar.f527902d;
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.h1 h1Var = this.f290812e;
        java.util.List list = this.f290813f;
        if (z17) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            for (java.lang.String str : zVar.f527901c) {
                android.text.SpannableString spannableString = new android.text.SpannableString(str);
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.c.f219556a), 0, str.length(), 33);
                spannableStringBuilder.append((java.lang.CharSequence) spannableString);
                spannableStringBuilder.append((java.lang.CharSequence) "、");
            }
            java.lang.CharSequence concat = android.text.TextUtils.concat(h1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.nm8), spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1), h1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572912nm4));
            java.lang.String string = h1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ffp);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            list.addAll(h1Var.U6(1, false, vVar, string, true, concat));
        } else {
            java.lang.String string2 = h1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ffp);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            list.addAll(h1Var.U6(1, false, vVar, string2, false, null));
        }
        this.f290814g.put(new java.lang.Integer(1), vVar);
        java.lang.Object mo771x2f8fd3 = this.f290815h.mo771x2f8fd3(list, interfaceC29045xdcb5ca57);
        return mo771x2f8fd3 == pz5.a.f440719d ? mo771x2f8fd3 : jz5.f0.f384359a;
    }
}
