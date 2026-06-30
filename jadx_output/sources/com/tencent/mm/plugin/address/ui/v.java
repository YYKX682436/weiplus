package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public class v implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.w f74633b;

    public v(com.tencent.mm.plugin.address.ui.w wVar, int i17) {
        this.f74633b = wVar;
        this.f74632a = i17;
    }

    @Override // db5.c1
    public void e(int i17) {
        i83.b bVar;
        synchronized (this.f74633b.f74636d.f74428g) {
            bVar = this.f74632a < this.f74633b.f74636d.f74430i.size() ? (i83.b) this.f74633b.f74636d.f74430i.get(this.f74632a) : null;
        }
        if (bVar == null) {
            return;
        }
        if (i17 == 0) {
            this.f74633b.f74636d.T6(bVar.f289634d);
            return;
        }
        if (i17 == 1) {
            q71.l lVar = new q71.l(bVar.f289634d);
            this.f74633b.f74636d.f74425d = null;
            c01.d9.e().g(lVar);
            return;
        }
        if (i17 != 2) {
            return;
        }
        com.tencent.mm.plugin.address.ui.InvoiceListUI invoiceListUI = this.f74633b.f74636d;
        invoiceListUI.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = bVar.f289635e;
        if (str == null || !str.equals("0")) {
            java.lang.String str2 = bVar.f289635e;
            if (str2 != null && str2.equals("1") && !android.text.TextUtils.isEmpty(bVar.f289637g)) {
                sb6.append(invoiceListUI.getString(com.tencent.mm.R.string.f492335g35));
                sb6.append("：");
                sb6.append(bVar.f289637g);
                sb6.append(" \n");
            }
        } else {
            if (!android.text.TextUtils.isEmpty(bVar.f289636f)) {
                sb6.append(invoiceListUI.getString(com.tencent.mm.R.string.f492335g35));
                sb6.append("：");
                sb6.append(bVar.f289636f);
                sb6.append(" \n");
            }
            if (!android.text.TextUtils.isEmpty(bVar.f289638h)) {
                sb6.append(invoiceListUI.getString(com.tencent.mm.R.string.f492330g30));
                sb6.append("：");
                sb6.append(bVar.f289638h);
                sb6.append(" \n");
            }
            if (!android.text.TextUtils.isEmpty(bVar.f289645r)) {
                sb6.append(invoiceListUI.getString(com.tencent.mm.R.string.g2n));
                sb6.append("：");
                sb6.append(bVar.f289645r);
                sb6.append(" \n");
            }
            if (!android.text.TextUtils.isEmpty(bVar.f289642o)) {
                sb6.append(invoiceListUI.getString(com.tencent.mm.R.string.g2w));
                sb6.append("：");
                sb6.append(bVar.f289642o);
                sb6.append(" \n");
            }
            if (!android.text.TextUtils.isEmpty(bVar.f289640m)) {
                sb6.append(invoiceListUI.getString(com.tencent.mm.R.string.g2g));
                sb6.append("：");
                sb6.append(bVar.f289640m);
                sb6.append(" \n");
            }
            if (!android.text.TextUtils.isEmpty(bVar.f289639i)) {
                sb6.append(invoiceListUI.getString(com.tencent.mm.R.string.g2i));
                sb6.append("：");
                sb6.append(bVar.f289639i);
                sb6.append(" \n");
            }
        }
        try {
            com.tencent.mm.sdk.platformtools.b0.d(invoiceListUI.getContext(), null, sb6.toString(), null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.InvoiceListUI", e17, "", new java.lang.Object[0]);
        }
    }
}
