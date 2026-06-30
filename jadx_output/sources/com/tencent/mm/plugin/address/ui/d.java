package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public class d implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.AddInvoiceUI f74530d;

    public d(com.tencent.mm.plugin.address.ui.AddInvoiceUI addInvoiceUI) {
        this.f74530d = addInvoiceUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        i83.b bVar;
        java.lang.String str;
        com.tencent.mm.plugin.address.ui.AddInvoiceUI addInvoiceUI = this.f74530d;
        if (addInvoiceUI.f74377d == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14199, 3);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14199, 4);
        }
        android.widget.Button button = addInvoiceUI.f74379f;
        if (button != null && button.isActivated() && addInvoiceUI.f74383m.getText().length() == 0) {
            addInvoiceUI.W6();
            return false;
        }
        android.widget.Button button2 = addInvoiceUI.f74378e;
        if (button2 != null && button2.isActivated() && addInvoiceUI.f74384n.getText().length() == 0) {
            addInvoiceUI.W6();
            return false;
        }
        if (addInvoiceUI.f74377d != 0 && addInvoiceUI.f74384n.getText().length() == 0 && addInvoiceUI.f74383m.getText().length() == 0) {
            addInvoiceUI.W6();
            return false;
        }
        if (addInvoiceUI.f74385o.getText().length() > 100) {
            db5.e1.G(addInvoiceUI, addInvoiceUI.getString(com.tencent.mm.R.string.g2m), addInvoiceUI.getString(com.tencent.mm.R.string.f490573yv), false, null);
            return false;
        }
        if (!addInvoiceUI.T6()) {
            android.widget.Button button3 = addInvoiceUI.f74379f;
            if ((button3 != null && button3.isActivated()) || ((bVar = addInvoiceUI.f74390t) != null && (str = bVar.f289635e) != null && str.equals("0"))) {
                if (!addInvoiceUI.f74387q.b()) {
                    db5.e1.G(addInvoiceUI, addInvoiceUI.getString(com.tencent.mm.R.string.g2v), addInvoiceUI.getString(com.tencent.mm.R.string.f490573yv), false, null);
                }
                if (!addInvoiceUI.f74389s.b()) {
                    db5.e1.G(addInvoiceUI, addInvoiceUI.getString(com.tencent.mm.R.string.g2j), addInvoiceUI.getString(com.tencent.mm.R.string.f490573yv), false, null);
                }
            }
            return true;
        }
        if (addInvoiceUI.f74379f.isActivated()) {
            addInvoiceUI.f74391u.f289635e = "0";
        } else if (addInvoiceUI.f74378e.isActivated()) {
            addInvoiceUI.f74391u.f289635e = "1";
        }
        i83.b bVar2 = addInvoiceUI.f74390t;
        if (bVar2 != null) {
            addInvoiceUI.f74391u.f289635e = bVar2.f289635e;
        }
        addInvoiceUI.f74391u.f289636f = addInvoiceUI.f74383m.getText();
        addInvoiceUI.f74391u.f289637g = addInvoiceUI.f74384n.getText();
        addInvoiceUI.f74391u.f289638h = addInvoiceUI.f74385o.getText();
        i83.b bVar3 = addInvoiceUI.f74391u;
        bVar3.f289634d = addInvoiceUI.f74377d;
        bVar3.f289642o = addInvoiceUI.f74387q.getText();
        addInvoiceUI.f74391u.f289640m = addInvoiceUI.f74388r.getText();
        addInvoiceUI.f74391u.f289639i = addInvoiceUI.f74389s.getText();
        addInvoiceUI.f74391u.f289645r = addInvoiceUI.f74386p.getText();
        c01.d9.e().g(new q71.r(addInvoiceUI.f74391u));
        c01.d9.e().a(bb1.d.CTRL_INDEX, addInvoiceUI);
        if (addInvoiceUI.f74377d != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddInvoiceUI", "modify save invoice " + addInvoiceUI.f74391u.toString());
            addInvoiceUI.f74392v = db5.e1.Q(addInvoiceUI, "", "", true, true, null);
        } else {
            addInvoiceUI.f74392v = db5.e1.Q(addInvoiceUI, "", "", true, true, null);
        }
        return true;
    }
}
