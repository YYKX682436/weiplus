package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes11.dex */
public class t implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c {

    /* renamed from: a, reason: collision with root package name */
    public final rd0.y0 f288466a;

    public t(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar) {
        ((qd0.e) ((rd0.x0) i95.n0.c(rd0.x0.class))).getClass();
        this.f288466a = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.z(uVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar = ((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.z) this.f288466a).f288482a;
        android.view.View inflate = (uVar == null || !uVar.f288375k) ? i65.a.D(context) ? android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ck7, viewGroup, false) : android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ck6, viewGroup, false) : android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569409ad, viewGroup, false);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.s sVar = uVar.f288468J;
        sVar.f288457b = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        sVar.f288458c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        sVar.f288459d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
        sVar.f288456a = inflate.findViewById(com.p314xaae8f345.mm.R.id.mjc);
        if (uVar.f288375k) {
            sVar.f288464i = inflate.findViewById(com.p314xaae8f345.mm.R.id.mjb);
        }
        sVar.f288460e = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.mie);
        sVar.f288461f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mk7);
        sVar.f288462g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kjo);
        sVar.f288463h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565425cd3);
        inflate.setTag(sVar);
        if (uVar.f288367c) {
            android.content.res.Resources resources = sVar.f288458c.getContext().getResources();
            sVar.f288456a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562841q4);
            sVar.f288458c.setTextColor(resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
            sVar.f288459d.setTextColor(resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
            sVar.f288460e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.awt);
        }
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public boolean b(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.z zVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.z) this.f288466a;
        zVar.getClass();
        if (dVar.f288375k && zVar.a(dVar)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar = zVar.f288482a;
        if (uVar.C == null) {
            return false;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).xj(uVar.f288381q, uVar.C, 1);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.z zVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.z) this.f288466a;
        zVar.getClass();
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.s sVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.s) bVar;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) dVar;
        java.lang.String str = uVar.f288352z;
        if (str == null || str.length() <= 0) {
            sVar.f288457b.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(sVar.f288457b, uVar.f288352z, 0.1f);
        }
        if (dVar.f288375k && c01.z1.r().equals(uVar.f288352z)) {
            uVar.f288351y = ((java.lang.Object) uVar.f288351y) + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ieq);
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar2 = zVar.f288482a;
        uVar2.getClass();
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(uVar.f288352z) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uVar.E)) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(uVar.f288351y, sVar.f288458c);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(uVar.D, sVar.f288459d);
        if (uVar2.f288369e) {
            if (uVar2.f288367c) {
                sVar.f288460e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aoh);
            } else {
                sVar.f288460e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aoe);
            }
            if (z17) {
                sVar.f288460e.setChecked(true);
                sVar.f288460e.setEnabled(false);
            } else if ((dVar.f288375k && zVar.a(uVar)) || uVar.f288380p) {
                sVar.f288460e.setChecked(false);
                sVar.f288460e.setEnabled(false);
            } else {
                sVar.f288460e.setChecked(z18);
                sVar.f288460e.setEnabled(true);
            }
            sVar.f288460e.setVisibility(0);
        } else if (uVar2.f288371g) {
            sVar.f288460e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.axu);
            if (z17) {
                sVar.f288460e.setChecked(true);
                sVar.f288460e.setEnabled(false);
            } else {
                sVar.f288460e.setChecked(z18);
                sVar.f288460e.setEnabled(true);
            }
            sVar.f288460e.setVisibility(0);
        } else if (uVar2.f288372h) {
            sVar.f288460e.setVisibility(8);
            android.widget.ImageView imageView = sVar.f288461f;
            if (imageView != null) {
                if (z18) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
            }
        } else {
            sVar.f288460e.setVisibility(8);
        }
        if (uVar2.F) {
            sVar.f288460e.setVisibility(8);
            android.widget.ImageView imageView2 = sVar.f288461f;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        if (uVar2.f288373i) {
            if (dVar.f288375k) {
                sVar.f288464i.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562198t);
            } else {
                sVar.f288456a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562843q6);
            }
        } else if (dVar.f288375k) {
            sVar.f288464i.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562198t);
        } else {
            sVar.f288456a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
        }
        if (uVar.B.F0() == 1) {
            sVar.f288459d.setVisibility(0);
            sVar.f288459d.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ieo));
        }
        if (dVar.f288375k) {
            sVar.f288459d.post(new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.w(zVar, sVar, context));
            java.lang.String str2 = dVar.f288370f;
            if (uVar.B.F0() == 1) {
                sVar.f288459d.setVisibility(0);
                sVar.f288459d.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ieo));
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                sVar.f288459d.setVisibility(8);
            } else {
                sVar.f288459d.setVisibility(0);
                sVar.f288459d.setText(str2);
            }
        }
        android.widget.TextView textView = sVar.f288462g;
        if (textView != null) {
            textView.setVisibility(8);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(uVar.f288352z) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uVar.E)) {
                sVar.f288458c.post(new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.x(zVar, sVar, uVar, context));
            }
            if (sVar.f288463h != null) {
                if (!uVar2.G || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uVar.f288352z)) {
                    sVar.f288463h.setVisibility(8);
                } else {
                    sVar.f288463h.setVisibility(0);
                    sVar.f288463h.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.y(zVar, uVar, context));
                }
            }
        }
        if ((dVar.f288375k && zVar.a(uVar)) || uVar.f288380p) {
            sVar.f288457b.setAlpha(0.3f);
            sVar.f288458c.setAlpha(0.3f);
            sVar.f288459d.setAlpha(0.3f);
            sVar.f288460e.setAlpha(0.3f);
            android.widget.ImageView imageView3 = sVar.f288463h;
            if (imageView3 != null) {
                imageView3.setAlpha(0.3f);
            }
            android.widget.TextView textView2 = sVar.f288462g;
            if (textView2 != null) {
                textView2.setAlpha(0.3f);
                return;
            }
            return;
        }
        sVar.f288457b.setAlpha(1.0f);
        sVar.f288458c.setAlpha(1.0f);
        sVar.f288459d.setAlpha(1.0f);
        sVar.f288460e.setAlpha(1.0f);
        android.widget.ImageView imageView4 = sVar.f288463h;
        if (imageView4 != null) {
            imageView4.setAlpha(1.0f);
        }
        android.widget.TextView textView3 = sVar.f288462g;
        if (textView3 != null) {
            textView3.setAlpha(1.0f);
        }
    }
}
