package mx0;

/* loaded from: classes5.dex */
public final class u3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f413901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413902e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(android.content.Context context, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced) {
        super(0);
        this.f413901d = context;
        this.f413902e = c10977x8e40eced;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f413901d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 1, 0, false);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413902e;
        z2Var.m(c10977x8e40eced.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571906t6), c10977x8e40eced.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571540i9));
        z2Var.o(0);
        z2Var.v(c10977x8e40eced.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        mx0.s3 s3Var = new mx0.s3(z2Var);
        mx0.t3 t3Var = new mx0.t3(z2Var, c10977x8e40eced);
        z2Var.D = s3Var;
        z2Var.E = t3Var;
        z2Var.f293596o = true;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571000eo4, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.vhf);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        z2Var.j(inflate);
        return z2Var;
    }
}
