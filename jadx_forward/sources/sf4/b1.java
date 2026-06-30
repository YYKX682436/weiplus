package sf4;

/* loaded from: classes4.dex */
public final class b1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 f488951d;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502) {
        this.f488951d = c18497x85806502;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502.f253618l1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("delete click and click cancel it ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f488951d;
        sb6.append(c18497x85806502.f253635u);
        sb6.append(' ');
        sb6.append(c18497x85806502.f253636v);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryGalleryView", sb6.toString());
        lf4.l lVar = c18497x85806502.A;
        if (lVar != null) {
            lVar.a(c18497x85806502.f253635u, c18497x85806502.f253636v);
        }
    }
}
