package je4;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final je4.a f380848a = new je4.a();

    public final void a(android.app.Activity activity, int i17, byte[] finderObjectBytes, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enterSnsCoverFinderPreviewUI", "com.tencent.mm.plugin.sns.util.SetSnsBgFromFinderUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObjectBytes, "finderObjectBytes");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("SELECT_OBJECT", finderObjectBytes);
        intent.putExtra("SELECT_TAB_TYPE", i18);
        intent.putExtra("KEY_ENTER_SOURCE", i19);
        intent.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2159x2f6e0a.ActivityC17853xb21c8b97.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/util/SetSnsBgFromFinderUtils", "enterSnsCoverFinderPreviewUI", "(Landroid/app/Activity;I[BII)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enterSnsCoverFinderPreviewUI", "com.tencent.mm.plugin.sns.util.SetSnsBgFromFinderUtils");
    }
}
