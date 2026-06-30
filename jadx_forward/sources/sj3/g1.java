package sj3;

/* loaded from: classes11.dex */
public class g1 extends com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sj3.h1 f490051b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(sj3.h1 h1Var) {
        super(h1Var);
        this.f490051b = h1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.t, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c3b, viewGroup, false);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.s sVar = this.f490051b.f288468J;
        sVar.f288457b = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        sVar.f288458c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        sVar.f288459d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
        sVar.f288456a = inflate.findViewById(com.p314xaae8f345.mm.R.id.mjc);
        sVar.f288460e = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.mie);
        inflate.setTag(sVar);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.t, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.s sVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.s) bVar;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) dVar;
        java.lang.String str = uVar.f288352z;
        if (str == null || str.length() <= 0) {
            sVar.f288457b.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(sVar.f288457b, uVar.f288352z, null);
        }
        u50.y yVar = (u50.y) i95.n0.c(u50.y.class);
        java.lang.CharSequence charSequence = uVar.f288351y;
        android.widget.TextView textView = sVar.f288458c;
        ((s50.r0) yVar).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(charSequence, textView);
        if (!this.f490051b.f288369e) {
            sVar.f288460e.setVisibility(8);
            return;
        }
        if (z17) {
            sVar.f288460e.setChecked(true);
            sVar.f288460e.setEnabled(false);
            sVar.f288460e.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f78844x4a24e2e);
        } else {
            sVar.f288460e.setChecked(z18);
            sVar.f288460e.setEnabled(true);
            if (z18) {
                sVar.f288460e.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f78834xa20f9397);
            } else {
                sVar.f288460e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562793os);
            }
        }
        sVar.f288460e.setVisibility(0);
    }
}
