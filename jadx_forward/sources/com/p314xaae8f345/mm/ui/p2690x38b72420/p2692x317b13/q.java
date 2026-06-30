package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes11.dex */
public class q extends com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.r f288452b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.r rVar) {
        super(rVar);
        this.f288452b = rVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b0, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar, boolean z17, boolean z18) {
        super.c(context, bVar, dVar, z17, z18);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a0 a0Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a0) bVar;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.r rVar = this.f288452b;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(rVar.G)) {
            a0Var.f288355c.setVisibility(8);
            return;
        }
        a0Var.f288355c.setVisibility(0);
        rVar.G = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, rVar.G, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        android.widget.TextView textView = a0Var.f288355c;
        textView.setText(textView.getContext().getResources().getString(rVar.H ? com.p314xaae8f345.mm.R.C30867xcad56011.f572489bd0 : com.p314xaae8f345.mm.R.C30867xcad56011.bcz, rVar.G));
    }
}
