package hr3;

/* loaded from: classes5.dex */
public final class he extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f365147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f365148e;

    public he(hr3.pf pfVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f365147d = pfVar;
        this.f365148e = h0Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$initCommonSayHi$1$1$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        java.lang.String path = (java.lang.String) this.f365148e.f391656d;
        hr3.pf pfVar = this.f365147d;
        pfVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        android.content.Intent intent = new android.content.Intent(pfVar.m158354x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22308x8618c28d.class);
        lk5.s.e(intent, true);
        intent.putExtra("Contact_User", pfVar.m133981x6c03c64c());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(path);
        intent.putExtra("remark_image_path", arrayList2);
        intent.putExtra("selected_item", 0);
        intent.putExtra("view_only", true);
        pfVar.m158354x19263085().startActivityForResult(intent, 103);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$initCommonSayHi$1$1$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }
}
