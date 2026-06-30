package cj4;

/* loaded from: classes11.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.k f41935d;

    public h(cj4.k kVar) {
        this.f41935d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cj4.k kVar = this.f41935d;
        kVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", kVar.f41978g);
        int i17 = kVar.f41975d.f21067g;
        intent.putExtra("CONTACT_INFO_UI_SOURCE", i17 == 2 ? 52 : i17 == 8 ? 59 : 51);
        j45.l.n(kVar.j(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, 213);
        qj4.s sVar = qj4.s.f363958a;
        qj4.s.m(sVar, kVar.j(), 22L, null, kVar.H, 0L, 0L, 0L, 0L, null, null, 12L, 1012, null);
        mj4.h hVar = kVar.H;
        java.lang.String h17 = hVar != null ? ((mj4.k) hVar).h() : "";
        java.lang.String str = kVar.f41978g;
        mj4.h hVar2 = kVar.H;
        java.lang.String str2 = hVar2 != null ? xe0.j0.a(hVar2, false, 1, null).f355218i : null;
        mj4.h hVar3 = kVar.H;
        qj4.s.n(sVar, 7L, h17, 0, str, null, null, 0, 0L, 0L, str2, hVar3 != null ? java.lang.Integer.valueOf(xe0.j0.a(hVar3, false, 1, null).f355225s) : null, null, null, null, 14836, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
