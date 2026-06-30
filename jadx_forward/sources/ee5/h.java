package ee5;

/* loaded from: classes5.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.j f333426d;

    public h(ee5.j jVar) {
        this.f333426d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        de5.a.f310929a.g(104);
        java.lang.String obj = gm0.j1.u().c().l(274436, "").toString();
        ee5.j jVar = this.f333426d;
        java.lang.String string = jVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gbc, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), obj, "setting", 0, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        c71.b.c(jVar.m158354x19263085(), string, 0, true);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
