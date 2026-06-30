package os3;

/* loaded from: classes8.dex */
public class s4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.u4 f429731d;

    public s4(os3.u4 u4Var) {
        this.f429731d = u4Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        os3.u4 u4Var = this.f429731d;
        if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11288, 20);
            db5.e1.p(u4Var.f429752d.mo55332x76847179(), u4Var.f429752d.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p5t), 0, u4Var.f429752d.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hrr), u4Var.f429752d.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.apj), new os3.q4(this), new os3.r4(this));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(u4Var.f429752d, com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86.class);
        intent.putExtra("mailid", u4Var.f429752d.f236460f.f393159a);
        intent.putExtra("subject", u4Var.f429752d.f236460f.f393161c);
        java.lang.String[] m67776x4f96ea2a = u4Var.f429752d.f236464m.m67776x4f96ea2a();
        java.lang.String[] m67776x4f96ea2a2 = u4Var.f429752d.f236466o.m67776x4f96ea2a();
        java.lang.String[] m67776x4f96ea2a3 = u4Var.f429752d.f236465n.m67776x4f96ea2a();
        if (i17 == 0) {
            intent.putExtra("composeType", 2);
            intent.putExtra("toList", m67776x4f96ea2a);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11288, 16);
        } else if (i17 == 1) {
            intent.putExtra("composeType", 2);
            java.lang.String[] strArr = new java.lang.String[m67776x4f96ea2a.length + m67776x4f96ea2a2.length];
            int length = m67776x4f96ea2a.length;
            int i18 = 0;
            int i19 = 0;
            while (i18 < length) {
                strArr[i19] = m67776x4f96ea2a[i18];
                i18++;
                i19++;
            }
            int length2 = m67776x4f96ea2a2.length;
            int i27 = 0;
            while (i27 < length2) {
                strArr[i19] = m67776x4f96ea2a2[i27];
                i27++;
                i19++;
            }
            intent.putExtra("toList", strArr);
            intent.putExtra("ccList", m67776x4f96ea2a3);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11288, 17);
        } else {
            if (i17 != 2) {
                return;
            }
            intent.putExtra("mail_content", u4Var.f429752d.f236460f.f393167i);
            intent.putExtra("mail_attach", u4Var.f429752d.f236460f.f393165g);
            intent.putExtra("mail_mode", 21);
            intent.putExtra("composeType", 3);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11288, 18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1 = u4Var.f429752d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(viewOnCreateContextMenuListenerC16941x4db497e1, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$7$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        viewOnCreateContextMenuListenerC16941x4db497e1.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(viewOnCreateContextMenuListenerC16941x4db497e1, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$7$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
