package gp4;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp4.j f355927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f355928e;

    public c(gp4.j jVar, ju3.d0 d0Var) {
        this.f355927d = jVar;
        this.f355928e = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/timeedit/MultiEditItemContainerPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = view instanceof zu3.b0;
        gp4.j jVar = this.f355927d;
        ju3.d0 d0Var = this.f355928e;
        if (z17) {
            zu3.b0 b0Var = (zu3.b0) view;
            b0Var.m179514x29ddc82e(false);
            b0Var.setVisibility(4);
            zu3.a mo122948x9174bead = b0Var.mo122948x9174bead();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo122948x9174bead, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.item.TextItem");
            zu3.a0 a0Var = (zu3.a0) mo122948x9174bead;
            jVar.f355946g = a0Var;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", a0Var.f557297g);
            bundle.putInt("PARAM_EDIT_TEXT_COLOR", a0Var.f557298h);
            bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", a0Var.f557299i);
            bundle.putString("PARAM_EDIT_TEXT_FONT", a0Var.f557301k);
            d0Var.w(ju3.c0.P, bundle);
        } else if (view instanceof wu3.h) {
            wu3.h hVar = (wu3.h) view;
            hVar.setVisibility(4);
            r45.is m174465xb0c3d723 = hVar.m174465xb0c3d723();
            zu3.a mo122948x9174bead2 = hVar.mo122948x9174bead();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo122948x9174bead2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.item.CaptionItem");
            zu3.d dVar = (zu3.d) mo122948x9174bead2;
            if (m174465xb0c3d723 != null) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putByteArray("PARAM_1_BYTEARRAY", m174465xb0c3d723.mo14344x5f01b1f6());
                bundle2.putInt("PARAM_EDIT_TEXT_COLOR", dVar.f557326h);
                bundle2.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", dVar.f557327i);
                bundle2.putString("PARAM_EDIT_TEXT_FONT", dVar.f557328j);
                d0Var.w(ju3.c0.f383435s2, bundle2);
            }
        } else if (view instanceof zu3.x) {
            zu3.x xVar = (zu3.x) view;
            xVar.setVisibility(4);
            zu3.a mo122948x9174bead3 = xVar.mo122948x9174bead();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo122948x9174bead3, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.item.PagStickerItem");
            jVar.f355946g = xVar.mo122948x9174bead();
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putCharSequence("PARAM_EDIT_TEXT_CONTENT", ((zu3.y) mo122948x9174bead3).f557400i);
            d0Var.w(ju3.c0.f383451y2, bundle3);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/timeedit/MultiEditItemContainerPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
