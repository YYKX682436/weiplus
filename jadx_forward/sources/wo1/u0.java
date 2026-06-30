package wo1;

/* loaded from: classes5.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f529567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f529568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f529569f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(wo1.a1 a1Var, qo1.j0 j0Var, po1.d dVar) {
        super(0);
        this.f529567d = a1Var;
        this.f529568e = j0Var;
        this.f529569f = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f529567d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        qo1.f0 task = (qo1.f0) this.f529568e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        po1.d device = this.f529569f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BackupUIUtils", "show bottom sheet switch to usb, pkgId=" + task.f447016i + ", isRestore=" + (task instanceof qo1.c1));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570245dq3, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.s8y)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mfs));
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cyy);
        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bu9);
        imageView.setOnClickListener(new uo1.j(y1Var));
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.riz);
        button.setOnClickListener(new uo1.l(device, y1Var));
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a c12844xf7745c1a = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a.f174086a;
        jz5.l a17 = c12844xf7745c1a.a();
        button.setEnabled(a17.f384366d != null && ((java.lang.Boolean) a17.f384367e).booleanValue());
        uo1.o oVar = new uo1.o(button);
        y1Var.f293570s = new uo1.m(oVar);
        c12844xf7745c1a.d(oVar);
        y1Var.k(inflate);
        y1Var.s();
        return jz5.f0.f384359a;
    }
}
