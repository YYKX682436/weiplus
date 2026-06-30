package tx2;

/* loaded from: classes3.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15420x768bf212 f504134d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15420x768bf212 c15420x768bf212) {
        this.f504134d = c15420x768bf212;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15420x768bf212 c15420x768bf212 = this.f504134d;
        android.text.Layout layout = c15420x768bf212.f214263e.getLayout();
        boolean z17 = false;
        if (layout != null && layout.getEllipsisCount(0) == c15420x768bf212.f214263e.getText().length()) {
            z17 = true;
        }
        if (z17) {
            c15420x768bf212.f214263e.setVisibility(8);
        }
    }
}
