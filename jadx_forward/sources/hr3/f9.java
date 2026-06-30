package hr3;

/* loaded from: classes3.dex */
public final class f9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.j9 f365081d;

    public f9(hr3.j9 j9Var) {
        this.f365081d = j9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/FriendProfilePreference$onBindView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f365081d.f365224h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        lVar.mo146xb9724478(view);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/FriendProfilePreference$onBindView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
