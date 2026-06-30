package m31;

/* loaded from: classes.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11167x3e42f9bc f404702d;

    public n(com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11167x3e42f9bc activityC11167x3e42f9bc) {
        this.f404702d = activityC11167x3e42f9bc;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/msgsubscription/ui/SubscribeMsgDetailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11167x3e42f9bc activityC11167x3e42f9bc = this.f404702d;
        android.view.View inflate = android.view.LayoutInflater.from(activityC11167x3e42f9bc).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cng, (android.view.ViewGroup) null);
        ((android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.cg7)).addView(o31.i.f424208a.a(activityC11167x3e42f9bc, activityC11167x3e42f9bc.f153392e.f153339i, 0));
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.m9l);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.bzv);
        textView.setText(activityC11167x3e42f9bc.f153392e.f153335e);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC11167x3e42f9bc);
        z2Var.k(inflate, 0, 0);
        z2Var.C();
        findViewById.setOnClickListener(new m31.m(this, z2Var));
        findViewById.setContentDescription(activityC11167x3e42f9bc.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571889so));
        yj0.a.h(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgDetailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
