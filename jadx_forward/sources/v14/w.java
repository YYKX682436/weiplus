package v14;

/* loaded from: classes.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v14.y f514122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(v14.y yVar) {
        super(0);
        this.f514122d = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        v14.y yVar = this.f514122d;
        yVar.getClass();
        java.lang.Object l17 = gm0.j1.u().c().l(5, null);
        java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
        android.content.Intent intent = new android.content.Intent(yVar.m80379x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hb.class);
        lk5.s.e(intent, true);
        intent.putExtra("BINDED_EMAIL", str);
        pf5.j0.a(intent, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.k8.class);
        android.app.Activity m80379x76847179 = yVar.m80379x76847179();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(1);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(m80379x76847179, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/uic/SettingsUserInfoStatusUIC", "handleEmailVerifiedSuccess", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        return jz5.f0.f384359a;
    }
}
