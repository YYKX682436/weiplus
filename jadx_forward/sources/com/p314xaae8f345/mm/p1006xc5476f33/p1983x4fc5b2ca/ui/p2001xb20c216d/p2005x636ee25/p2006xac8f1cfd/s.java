package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes5.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0 f237844d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0 e0Var) {
        this.f237844d = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Boolean bool;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent$initMuteOrigin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0 e0Var = this.f237844d;
        java.lang.Boolean bool2 = (java.lang.Boolean) e0Var.F.get(2);
        boolean booleanValue = bool2 == null ? false : bool2.booleanValue();
        fv3.c cVar = e0Var.f348515d;
        if (!booleanValue) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("key_boolean", e0Var.s(2));
            bundle.putInt("key_option_type", 2);
            cVar.j(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.i0.f237788r, bundle);
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent$initMuteOrigin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 icon = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) e0Var.f237732n).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(icon, "icon");
        java.util.HashMap hashMap = e0Var.E;
        if (hashMap.containsKey(2) && (bool = (java.lang.Boolean) hashMap.get(2)) != null) {
            bool.booleanValue();
            boolean z17 = !bool.booleanValue();
            e0Var.J(2, z17);
            if (z17) {
                e0Var.z(icon, z17);
            } else {
                e0Var.z(icon, z17);
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("key_boolean", z17);
            cVar.j(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.i0.f237784n, bundle2);
        }
        e0Var.I(e0Var.u(), e0Var.v().getText().toString(), e0Var.s(2));
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent$initMuteOrigin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
