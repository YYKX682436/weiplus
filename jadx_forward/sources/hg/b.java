package hg;

/* loaded from: classes7.dex */
public class b implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hg.h f362809a;

    public b(hg.h hVar) {
        this.f362809a = hVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3
    public void a(int i17) {
        hg.h hVar = this.f362809a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 u3Var = hVar.f362832c;
        if (u3Var == null) {
            return;
        }
        int minimumHeight = u3Var.getMinimumHeight();
        final int i18 = i17 - minimumHeight;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewExtendTextAreaClient", "OnHeightChangedListener, totalHeight: %d, lateSavedKeyboardPanelHeight: %d, currentKeyboardPanelHeight: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(hVar.f362834e), java.lang.Integer.valueOf(minimumHeight));
        if (minimumHeight == 0 || hVar.f362834e == minimumHeight) {
            return;
        }
        hVar.f362834e = minimumHeight;
        hVar.f362835f = i17;
        sf.c.f488472a.a(hVar.f362830a.a(), hVar.f362830a.b(), new sf.b(i17, hVar.c(i17), java.lang.Integer.valueOf(hVar.f362837h), new yz5.a() { // from class: hg.b$$a
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                hg.b bVar = hg.b.this;
                bVar.getClass();
                int i19 = i18;
                bVar.f362809a.m120231x88a99e47(i19 > 0, i19, false);
                return null;
            }
        }));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3
    public android.widget.EditText b() {
        return this.f362809a.f362833d;
    }
}
