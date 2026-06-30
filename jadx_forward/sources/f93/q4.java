package f93;

/* loaded from: classes11.dex */
public final class q4 implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f93.s4 f341973a;

    public q4(f93.s4 s4Var) {
        this.f341973a = s4Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a2h, viewGroup, false);
        f93.s4 s4Var = this.f341973a;
        f93.o4 o4Var = s4Var.E;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(o4Var, "null cannot be cast to non-null type com.tencent.mm.plugin.label.ui.HeaderAddDataItem.HeaderAddViewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567001hs1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((android.widget.LinearLayout) findViewById).setOnClickListener(new f93.p4(s4Var));
        inflate.setTag(o4Var);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public boolean b(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar, boolean z17, boolean z18) {
    }
}
