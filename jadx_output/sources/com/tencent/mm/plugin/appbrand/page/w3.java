package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int[] f87195f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f87196g;

    public w3(com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.lang.String str, java.lang.String str2, int[] iArr) {
        this.f87196g = i3Var;
        this.f87193d = str;
        this.f87194e = str2;
        this.f87195f = iArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.i3 i3Var = this.f87196g;
        java.lang.String str = this.f87193d;
        java.lang.String str2 = this.f87194e;
        int[] iArr = this.f87195f;
        synchronized (i3Var.f86709o) {
            java.util.Iterator it = i3Var.f86710p.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.appbrand.page.w2) it.next()).r(str, str2, iArr);
            }
            java.util.Iterator it6 = i3Var.f86711q.iterator();
            while (it6.hasNext()) {
                ((com.tencent.mm.plugin.appbrand.page.w2) it6.next()).r(str, str2, iArr);
            }
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = i3Var.f86714t;
        if (v5Var != null && iArr != null && yo.a.a(iArr, v5Var.getComponentId())) {
            i3Var.f86714t.g(str, str2);
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var2 = i3Var.f86715u;
        if (v5Var2 != null && iArr != null && yo.a.a(iArr, v5Var2.getComponentId())) {
            i3Var.f86715u.g(str, str2);
        }
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = i3Var.f86717w;
        if (w2Var != null) {
            w2Var.r(str, str2, iArr);
        }
    }
}
