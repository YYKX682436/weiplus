package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes5.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f236964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f236965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4 f236966f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16975xd7ad480a f236967g;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16975xd7ad480a c16975xd7ad480a, java.lang.String str, int i17, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4 c6178x705b8fc4) {
        this.f236967g = c16975xd7ad480a;
        this.f236964d = str;
        this.f236965e = i17;
        this.f236966f = c6178x705b8fc4;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        boolean find;
        java.lang.String str = this.f236964d;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4 c6178x705b8fc4 = this.f236966f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16975xd7ad480a c16975xd7ad480a = this.f236967g;
        try {
            bt3.f3 a17 = c16975xd7ad480a.f236873d.a(new java.lang.Integer(str).intValue());
            int i18 = this.f236965e;
            if (i18 != 0) {
                if (i18 == 3) {
                    android.content.Context context = c16975xd7ad480a.f236873d.f236975a;
                    db5.e1.T(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6n));
                } else if (i18 != 5) {
                    android.content.Context context2 = c16975xd7ad480a.f236873d.f236975a;
                    db5.e1.T(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6c));
                }
                c16975xd7ad480a.f236873d.f236976b.notifyDataSetChanged();
                return;
            }
            java.lang.String str2 = c6178x705b8fc4.f136438g.f88728c;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str2);
            a17.f105799f = str2;
            java.lang.String str3 = c6178x705b8fc4.f136438g.f88732g;
            if (str3 == null) {
                str3 = "";
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str3);
            a17.f105800g = str3;
            byte[] bArr = c6178x705b8fc4.f136438g.f88733h;
            if (bArr == null) {
                bArr = new byte[0];
            }
            a17.f105801h = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr);
            a17.f105802i = c6178x705b8fc4.f136438g.f88734i;
            a17.f105798e = 2;
            c16975xd7ad480a.f236873d.f236976b.notifyDataSetChanged();
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2 l2Var = c16975xd7ad480a.f236873d;
            if (!l2Var.f236978d || (i17 = a17.f105797d + 1) >= l2Var.f236977c.f236875a.size()) {
                return;
            }
            java.lang.String str4 = ((r45.gp0) c16975xd7ad480a.f236873d.f236977c.f236875a.get(i17)).f456941f;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                find = false;
            } else {
                int indexOf = str4.indexOf(58);
                if (indexOf != -1) {
                    str4 = str4.substring(indexOf + 1);
                }
                find = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() ? com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2.f236971h.matcher(str4).find() : com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2.f236972i.matcher(str4).find();
            }
            if (find) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.j2(this, i17));
            }
        } catch (java.lang.Exception e17) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            objArr[0] = str != null ? str : "";
            objArr[1] = e17.getClass().getSimpleName();
            objArr[2] = e17.getMessage();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TranslateHelper", "translateListener id:%s Exception:%s %s", objArr);
        }
    }
}
