package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes11.dex */
public class g implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.h f288403a;

    public g(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.h hVar) {
        this.f288403a = hVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = i65.a.D(context) ? android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ck7, viewGroup, false) : android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ck6, viewGroup, false);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.h hVar = this.f288403a;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.f fVar = hVar.G;
        fVar.f288398b = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        fVar.f288399c = textView;
        textView.setMaxWidth(i65.a.b(context, 200));
        fVar.f288401e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
        fVar.f288400d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o_q);
        fVar.f288397a = inflate.findViewById(com.p314xaae8f345.mm.R.id.mjc);
        fVar.f288402f = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.mie);
        if (hVar.f288373i) {
            fVar.f288397a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562843q6);
        }
        inflate.setTag(fVar);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public boolean b(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.h hVar = this.f288403a;
        if (hVar.C == null) {
            return false;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).xj(hVar.f288381q, hVar.C, 1);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.f fVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.f) bVar;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.h hVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.h) dVar;
        java.lang.String str = hVar.f288352z;
        if (str == null || str.length() <= 0) {
            fVar.f288398b.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(fVar.f288398b, hVar.f288352z, 0.1f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(hVar.f288351y, fVar.f288399c);
        if (c01.e2.R(hVar.f288352z)) {
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80791xd2795aeb);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            fVar.f288399c.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
        } else {
            fVar.f288399c.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(hVar.E, fVar.f288401e);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(hVar.D, fVar.f288400d);
        if (!this.f288403a.f288369e) {
            fVar.f288402f.setVisibility(8);
            return;
        }
        if (z17) {
            fVar.f288402f.setChecked(true);
            fVar.f288402f.setEnabled(false);
            fVar.f288402f.setBackgroundResource(com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f78844x4a24e2e : com.p314xaae8f345.mm.R.raw.f78843x2ecb5687);
        } else {
            fVar.f288402f.setChecked(z18);
            fVar.f288402f.setEnabled(true);
        }
        fVar.f288402f.setVisibility(0);
    }
}
