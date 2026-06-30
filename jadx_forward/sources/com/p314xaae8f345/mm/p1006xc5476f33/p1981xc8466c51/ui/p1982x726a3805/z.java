package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805;

/* loaded from: classes12.dex */
public class z implements com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final bt3.a3 f237120a = new bt3.a3();

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16974xc8e7af77 f237121b;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g0
    public android.view.View a(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570918cd3, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16974xc8e7af77) inflate.findViewById(com.p314xaae8f345.mm.R.id.p5y)).m67870x591869be(this.f237120a);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g0
    public void b(android.view.View view, int i17, et3.b bVar, java.lang.Object obj) {
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.lp8);
        this.f237121b = (com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16974xc8e7af77) view.findViewById(com.p314xaae8f345.mm.R.id.p5y);
        r45.gp0 gp0Var = bVar.f338123a;
        if (gp0Var != null) {
            int i18 = gp0Var.f456981y;
            java.lang.String string = textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572133zm);
            ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).getClass();
            textView.setText(java.lang.String.format("%s %s\"", string, java.lang.Integer.valueOf((int) w21.x0.m(i18))));
        } else {
            textView.setText(textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572133zm));
        }
        int i19 = bVar.f338127e;
        if (i19 == 0) {
            this.f237121b.setVisibility(8);
            textView.setVisibility(0);
            return;
        }
        if (i19 == 1) {
            textView.setVisibility(8);
            this.f237121b.setVisibility(0);
            java.lang.String b17 = bt3.z0.b(bVar);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
            am.z9 z9Var = c5432x35bb364f.f135776g;
            z9Var.f90061a = 17;
            z9Var.f90066f = bVar.f338123a;
            c5432x35bb364f.e();
            int i27 = c5432x35bb364f.f135777h.f87667a;
            if (!com.p314xaae8f345.mm.vfs.w6.j(b17)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f338123a.f456967s)) {
                    textView.setVisibility(0);
                    this.f237121b.setVisibility(8);
                } else {
                    long j17 = bVar.f338124b.f67645x88be67a1;
                    java.lang.String str = bVar.f338123a.f456967s;
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
                    am.z9 z9Var2 = c5432x35bb364f2.f135776g;
                    z9Var2.f90061a = 16;
                    z9Var2.f90065e = bVar.f338124b.f67645x88be67a1;
                    c5432x35bb364f2.e();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16974xc8e7af77 c16974xc8e7af77 = this.f237121b;
            int i28 = bVar.f338123a.f456981y;
            c16974xc8e7af77.getClass();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (b17 == null) {
                b17 = "";
            }
            c16974xc8e7af77.f236871m = b17;
            c16974xc8e7af77.f236872n = i27;
            if (c16974xc8e7af77.f236870i != i28) {
                c16974xc8e7af77.f236870i = i28;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).getClass();
                sb6.append((int) w21.x0.m(i28));
                sb6.append("''");
                c16974xc8e7af77.setText(sb6.toString());
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g0
    /* renamed from: destroy */
    public void mo67872x5cd39ffa() {
        bt3.a3 a3Var = this.f237120a;
        a3Var.c();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = bt3.a3.f105728p;
        if (c21000x8b2f716 != null) {
            c21000x8b2f716.a();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 s7Var = a3Var.f105734i;
        if (s7Var != null) {
            s7Var.b();
        }
        bt3.a3.f105728p = null;
        ((java.util.LinkedList) a3Var.f105737o).clear();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g0
    /* renamed from: pause */
    public void mo67873x65825f6() {
        bt3.a3 a3Var = this.f237120a;
        if (a3Var != null) {
            java.util.List list = a3Var.f105737o;
            if (((java.util.LinkedList) list).size() > 0) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16974xc8e7af77 c16974xc8e7af77 = (com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16974xc8e7af77) ((bt3.z2) it.next());
                    c16974xc8e7af77.c();
                    c16974xc8e7af77.f236869h.c();
                }
            }
        }
    }
}
