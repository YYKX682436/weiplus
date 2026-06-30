package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class q2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 f263445d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var) {
        super(0);
        this.f263445d = e3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("file:///android_asset/");
        java.lang.String h17 = lp0.b.h();
        hashSet.add("file://".concat(((uv4.b) com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(0)).o()));
        hashSet.add("file://" + com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(3).l());
        hashSet.add("file://" + com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(4).h());
        hashSet.add("file://" + com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(8).h());
        hashSet.add("file://" + com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(11).h());
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(h17, "emoji/res");
        hashSet.add("file://" + r6Var.o());
        hashSet.add("file://" + lp0.b.X() + "files/liteapp/pkg");
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(lp0.b.D(), "emoji/res");
        hashSet.add("file://" + r6Var2.o());
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = this.f263445d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e3Var.o1(), "add webview UI FILE URL WHITE LIST data: %s sdcard:%s", r6Var.o(), r6Var2.o());
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e3Var.o1(), "albie: WebViewUI white list path : " + str);
        }
        return hashSet;
    }
}
