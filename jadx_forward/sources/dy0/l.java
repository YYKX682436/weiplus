package dy0;

/* loaded from: classes13.dex */
public final class l extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C11000x3d0b60a9 f326090a;

    public l(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C11000x3d0b60a9 c11000x3d0b60a9) {
        this.f326090a = c11000x3d0b60a9;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        if (view == null || outline == null) {
            return;
        }
        outline.setRoundRect(new android.graphics.Rect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight()), this.f326090a.f151224f);
    }
}
