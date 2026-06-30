package tn3;

/* loaded from: classes9.dex */
public class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.q {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.q
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageManager, "getPackageManager(...)");
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN", (android.net.Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage("com.tencent.wetype");
        return !(packageManager.resolveActivity(intent, 0) != null);
    }
}
