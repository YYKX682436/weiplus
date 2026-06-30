package e23;

/* loaded from: classes12.dex */
public class o1 extends e23.o0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p1 f328456c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(e23.p1 p1Var) {
        super(p1Var);
        this.f328456c = p1Var;
    }

    @Override // e23.o0, u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate;
        e23.n0 n0Var = this.f328456c.f328467z;
        if (e23.p0.A) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSTalkerMessageDataItem", "fts multi_msg_show_details enabled");
            inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.efh, viewGroup, false);
            n0Var.f328441b = inflate.findViewById(com.p314xaae8f345.mm.R.id.mem);
            n0Var.f328445f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rte);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSTalkerMessageDataItem", "fts multi_msg_show_details disabled");
            inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcg, viewGroup, false);
        }
        n0Var.f328442c = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        n0Var.f328443d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kbq);
        n0Var.f328444e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jue);
        n0Var.f328440a = inflate.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        n0Var.f328447h = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o7z);
        n0Var.f328442c.getLayoutParams().width = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.it);
        n0Var.f328442c.getLayoutParams().height = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.it);
        n0Var.f328446g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hhi);
        n0Var.f328448i = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hhr);
        inflate.setTag(n0Var);
        return inflate;
    }

    @Override // e23.o0, u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).hj(this.f328456c.f505291a).b(context, view, gVar, objArr);
    }
}
