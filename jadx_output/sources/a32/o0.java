package a32;

/* loaded from: classes10.dex */
public final class o0 implements u22.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView f1034a;

    public o0(com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView moreStickerView) {
        this.f1034a = moreStickerView;
    }

    @Override // u22.c
    public void a(int i17, int i18) {
        this.f1034a.f98685y.notifyItemRangeChanged(i17, i18);
    }

    @Override // u22.c
    public void b(java.util.List lensList) {
        kotlin.jvm.internal.o.g(lensList, "lensList");
        com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView moreStickerView = this.f1034a;
        z22.f fVar = moreStickerView.f98685y;
        fVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreStickerAdapter", "update: " + lensList.size());
        java.util.ArrayList arrayList = fVar.f469717d;
        arrayList.clear();
        arrayList.addAll(lensList);
        if (moreStickerView.C) {
            moreStickerView.f98683w.postDelayed(new a32.n0(moreStickerView), 300L);
            moreStickerView.C = false;
        }
    }

    @Override // u22.c
    public void c(int i17, int i18) {
        this.f1034a.f98685y.notifyItemRangeInserted(i17, i18);
    }

    @Override // u22.c
    public void d(int i17, int i18) {
        this.f1034a.f98685y.notifyItemRangeRemoved(i17, i18);
    }

    @Override // u22.c
    public void onMove(int i17, int i18) {
        this.f1034a.f98685y.notifyItemMoved(i17, i18);
    }
}
