package bp4;

/* loaded from: classes10.dex */
public final class p1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.r1 f104868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f104869e;

    public p1(bp4.r1 r1Var, ju3.d0 d0Var) {
        this.f104868d = r1Var;
        this.f104869e = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPhotoPencilPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bp4.r1 r1Var = this.f104868d;
        boolean z17 = !r1Var.f104898m;
        r1Var.f104898m = z17;
        if (z17) {
            nu3.i iVar = nu3.i.f421751a;
            nu3.i.c(iVar, "KEY_CLICK_DOODLE_COUNT_INT", 0, 2, null);
            iVar.b(7);
            android.widget.ImageView imageView = r1Var.f104896h;
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f79713xe9b1e322, imageView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq)));
            ju3.d0.k(this.f104869e, ju3.c0.I1, null, 2, null);
            cq4.n nVar = r1Var.f104895g;
            if (!nVar.f303012f) {
                nVar.f303012f = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = nVar.f303007a;
                c17043x8103c103.m68232x76bcab3c(false);
                c17043x8103c103.m68235xe80a2d76(true);
                nVar.a().m68392x19b1397b(i65.a.b(nVar.b().getContext(), 10));
                nVar.a().m68393x1a090ba0(nVar.b().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
                nVar.a().m68394x36198686(nVar.a().getRadiusNormalOuter());
                nVar.a().m68395x367158ab(nVar.b().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
                nVar.a().m68390xd1d01c5f(cq4.n.f303006h);
                nVar.a().m68396xbd98911d(2);
                nVar.a().m68391xc4967e41(new cq4.g(nVar));
                ((android.widget.ImageView) ((jz5.n) nVar.f303010d).mo141623x754a37bb()).setOnClickListener(new cq4.h(nVar));
                ((android.widget.ImageView) ((jz5.n) nVar.f303011e).mo141623x754a37bb()).setOnClickListener(new cq4.i(nVar));
            }
            r1Var.f104894f.m68236x76500a7f(true);
            cq4.f fVar = nVar.f303013g;
            if (fVar != null) {
                int f237978i = nVar.a().getF237978i();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("EDIT_PHOTO_DOODLE_PENCIL_INDEX_INT", f237978i);
                ((bp4.q1) fVar).f104885a.w(ju3.c0.P1, bundle);
            }
        } else {
            r1Var.z();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPhotoPencilPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
