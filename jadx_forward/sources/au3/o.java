package au3;

/* loaded from: classes10.dex */
public final class o implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1991x4e5f73eb.C16999x1ee3168f f95667a;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1991x4e5f73eb.C16999x1ee3168f c16999x1ee3168f) {
        this.f95667a = c16999x1ee3168f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.g
    public final void a(boolean z17) {
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoSeekBarEditorView", "Not Supported init SegmentSeekBar failed.");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1991x4e5f73eb.C16999x1ee3168f c16999x1ee3168f = this.f95667a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 recyclerThumbSeekBar = c16999x1ee3168f.getRecyclerThumbSeekBar();
        recyclerThumbSeekBar.getViewTreeObserver().addOnPreDrawListener(new au3.n(recyclerThumbSeekBar, c16999x1ee3168f));
    }
}
