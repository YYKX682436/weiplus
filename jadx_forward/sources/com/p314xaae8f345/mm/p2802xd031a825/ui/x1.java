package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes11.dex */
public class x1 implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.y1 f295802a;

    public x1(com.p314xaae8f345.mm.p2802xd031a825.ui.y1 y1Var) {
        this.f295802a = y1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d8b, viewGroup, false);
        com.p314xaae8f345.mm.p2802xd031a825.ui.y1 y1Var = this.f295802a;
        com.p314xaae8f345.mm.p2802xd031a825.ui.w1 w1Var = y1Var.B;
        w1Var.f295794a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gzf);
        w1Var.f295795b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.gyt);
        inflate.setTag(w1Var);
        if (y1Var.f288367c) {
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.gzg);
            if (findViewById != null) {
                findViewById.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u);
            }
            android.widget.TextView textView = w1Var.f295794a;
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
        com.p314xaae8f345.mm.p2802xd031a825.ui.w1 w1Var = (com.p314xaae8f345.mm.p2802xd031a825.ui.w1) bVar;
        java.lang.String str = ((com.p314xaae8f345.mm.p2802xd031a825.ui.y1) dVar).f295804y;
        android.widget.TextView textView = w1Var.f295794a;
        if (textView != null) {
            if (str == null || str.length() == 0) {
                textView.setVisibility(8);
            } else {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context2 = textView.getContext();
                float textSize = textView.getTextSize();
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, str, textSize));
                textView.setVisibility(0);
            }
        }
        if (this.f295802a.f295805z) {
            w1Var.f295795b.setVisibility(0);
        } else {
            w1Var.f295795b.setVisibility(8);
        }
    }
}
