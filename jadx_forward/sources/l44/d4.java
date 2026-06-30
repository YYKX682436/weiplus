package l44;

/* loaded from: classes4.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f397618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l44.e4 f397619e;

    public d4(l44.e4 e4Var, android.graphics.Bitmap bitmap) {
        this.f397619e = e4Var;
        this.f397618d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$4$1");
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.f397618d);
        l44.e4 e4Var = this.f397619e;
        float f17 = e4Var.f397653e.f84428p0;
        if (f17 <= 0.0f) {
            f17 = i65.a.b(e4Var.f397654f, 20);
        }
        int b17 = i65.a.b(e4Var.f397654f, 4);
        float measureText = b17 + f17 + e4Var.f397655g.getPaint().measureText(e4Var.f397655g.getText().toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BtnIconUpdateHelper", "btn width = " + e4Var.f397656h);
        int i17 = ((int) (((float) e4Var.f397656h) - measureText)) / 2;
        if (i17 < 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$4$1");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BtnIconUpdateHelper", "horizontalPadding = " + i17);
        e4Var.f397655g.setPadding(i17, 0, i17, 0);
        e4Var.f397655g.setIncludeFontPadding(false);
        f3.b.g(bitmapDrawable, android.graphics.Color.parseColor(e4Var.f397653e.I));
        int i18 = (int) f17;
        bitmapDrawable.setBounds(0, 0, i18, i18);
        e4Var.f397655g.setCompoundDrawables(bitmapDrawable, null, null, null);
        e4Var.f397655g.setCompoundDrawablePadding(b17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$4$1");
    }
}
