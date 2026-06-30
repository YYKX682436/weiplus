package ee5;

/* loaded from: classes5.dex */
public final class j extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f333463d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f333464e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f333465f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public static final void O6(ee5.j jVar) {
        jVar.getClass();
        de5.a.f310929a.g(101);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(jVar.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bmc, (android.view.ViewGroup) null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(jVar.m158354x19263085(), 0, 0, false, false);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.czv)).setTextColor(jVar.m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cza)).setTextColor(jVar.m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c));
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565620cz2);
        textView.setTextColor(jVar.m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565621cz3);
        textView2.setTextColor(jVar.m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
        ((android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.czi)).setVisibility(8);
        ((android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.czr)).setVisibility(8);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.gfr);
        button.setVisibility(0);
        android.widget.Button button2 = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.gfs);
        button2.setVisibility(0);
        ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.czg)).setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c69);
        z2Var.j(inflate);
        z2Var.C();
        button.setOnClickListener(new ee5.f(z2Var));
        button2.setOnClickListener(new ee5.g(z2Var, jVar));
        textView.setOnClickListener(new ee5.h(jVar));
        textView2.setOnClickListener(new ee5.i(jVar, z2Var));
    }
}
