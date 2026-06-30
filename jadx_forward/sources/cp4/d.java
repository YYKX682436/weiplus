package cp4;

/* loaded from: classes10.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.r f302525d;

    public d(cp4.r rVar) {
        this.f302525d = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorCaptionPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cp4.r rVar = this.f302525d;
        rVar.f302606x++;
        if (rVar.f302604v) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = rVar.f302591f;
            if (!(c17043x8103c103.f237545h != null)) {
                if (!(rVar.D().F != null)) {
                    rVar.D().m122416xeb045811(new cp4.h(rVar));
                    rVar.D().m122417x6d6f1b25(new cp4.i(rVar));
                    rVar.D().m122415x5aa7f23c(new cp4.j(rVar));
                    rVar.D().m122412x5734b631(new cp4.k(rVar));
                    rVar.D().m122413x2051c9c(new cp4.l(rVar));
                    rVar.D().m122414x9bb105c7(new cp4.m(rVar));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103.k(c17043x8103c103, rVar.D(), null, 2, null);
                c17043x8103c103.m68234x466a35c6(new cp4.q(rVar));
            }
            c17043x8103c103.m68236x76500a7f(true);
        } else {
            rVar.f302604v = true;
            rVar.E(0);
            rVar.G(0);
            cp4.r.z(rVar, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorCaptionPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
