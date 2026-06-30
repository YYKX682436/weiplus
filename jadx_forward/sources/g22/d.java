package g22;

/* loaded from: classes12.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g22.e f349333d;

    public d(g22.e eVar) {
        this.f349333d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        g22.a aVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreDesignerSingleViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        g22.e eVar = this.f349333d;
        r45.ri0 ri0Var = eVar.f349338g;
        if (ri0Var != null && (aVar = eVar.f349336e) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ri0Var);
            eVar.m8186xceeefb69();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12787, 1, 0, ri0Var.f466419d, "", ri0Var.f466422g, ri0Var.f466425m, 6);
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13360x55a0f4be.f179944d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13360x55a0f4be c13360x55a0f4be = ((g22.c) aVar).f349331a;
            android.content.Context m7550xf0c4608a = c13360x55a0f4be.m7550xf0c4608a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7550xf0c4608a, "requireContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(m7550xf0c4608a instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.a) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) m7550xf0c4608a).a(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.a.class)).f179882e.f137563f++;
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 i18 = n22.m.i(ri0Var);
            n22.f fVar = n22.f.f415823a;
            android.content.Context mo7438x76847179 = c13360x55a0f4be.mo7438x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7438x76847179);
            n22.f.d(fVar, mo7438x76847179, i18, false, null, null, "", 0, 0L, 6, 5, 0L, null, null, null, null, 31744, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreDesignerSingleViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
