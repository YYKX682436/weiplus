package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f234684a;

    public x0(java.util.Map map) {
        this.f234684a = map;
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.a1 a1Var) {
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("-?[0-9]\\d*");
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.a1 a1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.a1) this.f234684a.get(java.lang.Long.valueOf(a1Var.f234538b));
        if (a1Var2 == null) {
            a1Var.f234537a = compile.matcher(a1Var.f234537a).replaceAll("?");
            return;
        }
        a1Var.f234537a = compile.matcher(a1Var2.f234537a).replaceAll("?") + "J";
        a1Var.f234539c = a1Var2.f234539c;
    }
}
