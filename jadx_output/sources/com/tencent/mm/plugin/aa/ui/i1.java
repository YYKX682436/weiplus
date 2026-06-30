package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes11.dex */
public class i1 implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.j1 f72680a;

    public i1(com.tencent.mm.plugin.aa.ui.j1 j1Var) {
        this.f72680a = j1Var;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f487875ac, viewGroup, false);
        com.tencent.mm.plugin.aa.ui.g1 g1Var = this.f72680a.D;
        g1Var.f72649a = inflate.findViewById(com.tencent.mm.R.id.mjb);
        g1Var.f72650b = inflate.findViewById(com.tencent.mm.R.id.mjc);
        g1Var.f72655g = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.mie);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        g1Var.f72651c = imageView;
        imageView.setImportantForAccessibility(2);
        g1Var.f72652d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ovg);
        g1Var.f72653e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487164nr3);
        g1Var.f72654f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
        inflate.setTag(g1Var);
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
        com.tencent.mm.plugin.aa.ui.g1 g1Var = (com.tencent.mm.plugin.aa.ui.g1) bVar;
        com.tencent.mm.plugin.aa.ui.j1 j1Var = (com.tencent.mm.plugin.aa.ui.j1) dVar;
        java.lang.String str = j1Var.f206819z;
        if (str == null || str.length() <= 0) {
            g1Var.f72651c.setImageResource(com.tencent.mm.R.drawable.bhm);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(g1Var.f72651c, j1Var.f206819z, 0.1f);
        }
        if (com.tencent.mm.sdk.platformtools.t8.J0(j1Var.f206818y)) {
            g1Var.f72652d.setVisibility(8);
        } else {
            g1Var.f72652d.setText(j1Var.f206818y);
            g1Var.f72652d.setVisibility(0);
            g1Var.f72652d.setSingleLine(false);
        }
        com.tencent.mm.plugin.aa.ui.j1 j1Var2 = this.f72680a;
        if (j1Var2.f206836e) {
            if (z17) {
                g1Var.f72655g.setChecked(true);
                g1Var.f72655g.setEnabled(false);
                g1Var.f72655g.setBackgroundResource(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.checkbox_selected_grey_dark : com.tencent.mm.R.raw.checkbox_selected_grey);
            } else if (com.tencent.mm.plugin.aa.ui.j1.g(j1Var2, j1Var)) {
                g1Var.f72655g.setChecked(false);
                g1Var.f72655g.setEnabled(false);
            } else {
                g1Var.f72655g.setChecked(z18);
                g1Var.f72655g.setEnabled(true);
            }
            g1Var.f72655g.setVisibility(0);
        } else {
            g1Var.f72655g.setVisibility(8);
        }
        if (j1Var2.f206840i) {
            g1Var.f72649a.setBackgroundResource(com.tencent.mm.R.drawable.f481310q6);
        } else {
            g1Var.f72649a.setBackgroundResource(com.tencent.mm.R.drawable.f480666u);
        }
        g1Var.f72654f.post(new com.tencent.mm.plugin.aa.ui.h1(this, g1Var, context));
        java.lang.String str2 = j1Var2.f206837f;
        if (j1Var.B.F0() == 1) {
            g1Var.f72654f.setVisibility(0);
            g1Var.f72654f.setText(context.getString(com.tencent.mm.R.string.f489715o));
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            g1Var.f72654f.setVisibility(8);
        } else {
            g1Var.f72654f.setVisibility(0);
            g1Var.f72654f.setText(str2);
        }
        if (!com.tencent.mm.plugin.aa.ui.j1.g(j1Var2, j1Var)) {
            g1Var.f72652d.setAlpha(1.0f);
            g1Var.f72654f.setAlpha(1.0f);
            g1Var.f72651c.setAlpha(1.0f);
            g1Var.f72653e.setVisibility(4);
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactDataItem", "data.username：%s", j1Var.f206819z);
            return;
        }
        g1Var.f72652d.setAlpha(0.3f);
        g1Var.f72654f.setAlpha(0.3f);
        g1Var.f72651c.setAlpha(0.3f);
        java.lang.String a17 = t41.g.a(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(j1Var.f206819z, true));
        g1Var.f72653e.setVisibility(0);
        g1Var.f72653e.setText(a17);
        g1Var.f72653e.setTextSize(12.0f);
        g1Var.f72653e.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0m));
        g1Var.f72653e.setAlpha(0.3f);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactDataItem", "data.username：%s,subName:%s", j1Var.f206819z, a17);
    }
}
