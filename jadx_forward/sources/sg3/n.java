package sg3;

/* loaded from: classes.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f489512f;

    public n(sg3.r rVar, java.lang.String str, java.lang.String str2, android.content.Context context) {
        this.f489510d = str;
        this.f489511e = str2;
        this.f489512f = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/messenger/PluginMessenger$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f489510d);
        intent.putExtra("AntispamTicket", this.f489511e);
        j45.l.n(this.f489512f, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/messenger/PluginMessenger$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
