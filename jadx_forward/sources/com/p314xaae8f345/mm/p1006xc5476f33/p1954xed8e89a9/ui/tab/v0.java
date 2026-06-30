package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes11.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q11.b f236151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.w0 f236152e;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.w0 w0Var, q11.b bVar) {
        this.f236152e = w0Var;
        this.f236151d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.w0 w0Var = this.f236152e;
        int i17 = w0Var.f236211a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = w0Var.f236213c;
        if (i17 != m0Var.S) {
            return;
        }
        q11.b bVar = this.f236151d;
        if (bVar == null || bVar.f441064a != 0 || (bitmap = bVar.f441067d) == null) {
            m0Var.f235989h.mo54450xbf7c1df6(w0Var.f236212b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactWidgetTabBizHeaderController", "Avatar load failed, fallback to text title: " + w0Var.f236212b);
            return;
        }
        java.lang.String str = w0Var.f236212b;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m0Var.f235989h;
        f3.i iVar = new f3.i(abstractActivityC21394xb3d2c0cf.getResources(), bitmap);
        iVar.b(true);
        int dimensionPixelSize = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        iVar.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        al5.w wVar = new al5.w(iVar, 1);
        android.text.SpannableString spannableString = new android.text.SpannableString("  " + str);
        spannableString.setSpan(wVar, 0, 1, 33);
        w0Var.f236213c.f235989h.mo56583xbf7c1df6(spannableString);
    }
}
