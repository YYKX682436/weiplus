package se2;

/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb f488384a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f488385b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f488386c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f488387d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb plugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f488384a = plugin;
        this.f488385b = "BoxCommentViewCallback";
        jz5.g b17 = jz5.h.b(new se2.c0(this));
        this.f488386c = b17;
        this.f488387d = jz5.h.b(new se2.d0(this));
        java.lang.Object mo141623x754a37bb = ((jz5.n) b17).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.view.ViewGroup) mo141623x754a37bb).setOnClickListener(new se2.b0(this));
    }

    public final p012xc85e97e9.p093xedfae76a.c1 a(java.lang.Class bu6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bu6, "bu");
        return this.f488384a.S0().a(bu6);
    }

    public final void b(long j17) {
        java.lang.String string;
        jz5.g gVar = this.f488386c;
        if (j17 <= 0) {
            java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            ((android.view.ViewGroup) mo141623x754a37bb).setVisibility(8);
            return;
        }
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((android.view.ViewGroup) mo141623x754a37bb2).setVisibility(0);
        int i17 = ((mm2.e0) a(mm2.e0.class)).f410508r;
        jz5.g gVar2 = this.f488387d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb tbVar = this.f488384a;
        if (i17 > 0) {
            java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
            java.lang.String string2 = tbVar.f446856d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_j);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            ((android.widget.TextView) mo141623x754a37bb3).setText(format);
            return;
        }
        if (j17 <= 99) {
            string = java.lang.String.valueOf(j17);
        } else {
            string = tbVar.f446856d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dyj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        }
        java.lang.Object mo141623x754a37bb4 = ((jz5.n) gVar2).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        java.lang.String string3 = tbVar.f446856d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dzs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        java.lang.String format2 = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{string}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        ((android.widget.TextView) mo141623x754a37bb4).setText(format2);
    }
}
