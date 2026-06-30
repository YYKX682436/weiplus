package s14;

/* loaded from: classes3.dex */
public final class b extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.AbstractActivityC17490x3b7be062 f483675d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.AbstractActivityC17490x3b7be062 abstractActivityC17490x3b7be062) {
        this.f483675d = abstractActivityC17490x3b7be062;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI$initDesc$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6991x7b759967 c6991x7b759967 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6991x7b759967();
        c6991x7b759967.f143055d = 101L;
        c6991x7b759967.k();
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        j35.u.g(this.f483675d);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI$initDesc$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f483675d.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5));
    }
}
