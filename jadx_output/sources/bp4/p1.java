package bp4;

/* loaded from: classes10.dex */
public final class p1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.r1 f23335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f23336e;

    public p1(bp4.r1 r1Var, ju3.d0 d0Var) {
        this.f23335d = r1Var;
        this.f23336e = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPhotoPencilPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bp4.r1 r1Var = this.f23335d;
        boolean z17 = !r1Var.f23365m;
        r1Var.f23365m = z17;
        if (z17) {
            nu3.i iVar = nu3.i.f340218a;
            nu3.i.c(iVar, "KEY_CLICK_DOODLE_COUNT_INT", 0, 2, null);
            iVar.b(7);
            android.widget.ImageView imageView = r1Var.f23363h;
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_filled_duddle, imageView.getResources().getColor(com.tencent.mm.R.color.aaq)));
            ju3.d0.k(this.f23336e, ju3.c0.I1, null, 2, null);
            cq4.n nVar = r1Var.f23362g;
            if (!nVar.f221479f) {
                nVar.f221479f = true;
                com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = nVar.f221474a;
                editorPanelHolder.setCloseTouchOutside(false);
                editorPanelHolder.setOutsideTouchable(true);
                nVar.a().setRadiusNormalInner(i65.a.b(nVar.b().getContext(), 10));
                nVar.a().setRadiusNormalOuter(nVar.b().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9));
                nVar.a().setRadiusSelectInner(nVar.a().getRadiusNormalOuter());
                nVar.a().setRadiusSelectOuter(nVar.b().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
                nVar.a().setColorList(cq4.n.f221473h);
                nVar.a().setSelected(2);
                nVar.a().setColorSelectedCallback(new cq4.g(nVar));
                ((android.widget.ImageView) ((jz5.n) nVar.f221477d).getValue()).setOnClickListener(new cq4.h(nVar));
                ((android.widget.ImageView) ((jz5.n) nVar.f221478e).getValue()).setOnClickListener(new cq4.i(nVar));
            }
            r1Var.f23361f.setShow(true);
            cq4.f fVar = nVar.f221480g;
            if (fVar != null) {
                int f156445i = nVar.a().getF156445i();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("EDIT_PHOTO_DOODLE_PENCIL_INDEX_INT", f156445i);
                ((bp4.q1) fVar).f23352a.w(ju3.c0.P1, bundle);
            }
        } else {
            r1Var.z();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPhotoPencilPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
