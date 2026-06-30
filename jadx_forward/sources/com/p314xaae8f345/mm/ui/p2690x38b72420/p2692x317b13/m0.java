package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes11.dex */
public class m0 implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 f288427a;

    public m0(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var) {
        this.f288427a = n0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ck9, viewGroup, false);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var = this.f288427a;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.l0 l0Var = n0Var.A;
        l0Var.f288424a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gzf);
        inflate.setTag(l0Var);
        if (n0Var.f288367c) {
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.gzg);
            if (findViewById != null) {
                findViewById.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u);
            }
            android.widget.TextView textView = l0Var.f288424a;
            textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
        }
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public boolean b(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar, boolean z17, boolean z18) {
        java.lang.String str = ((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0) dVar).f288436y;
        android.widget.TextView textView = ((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.l0) bVar).f288424a;
        if (textView == null) {
            return;
        }
        if (str == null || str.length() == 0) {
            textView.setVisibility(8);
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = textView.getContext();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, str, textSize));
        textView.setVisibility(0);
    }
}
