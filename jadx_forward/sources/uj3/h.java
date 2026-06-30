package uj3;

/* loaded from: classes14.dex */
public final class h implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.i f509814d;

    public h(uj3.i iVar) {
        this.f509814d = iVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.widget.FrameLayout frameLayout;
        ct0.b bVar = new ct0.b(null, null, false, 0, 0, null, null, 0, 0, null, null, null, false, null, null, 0, 65535, null);
        uj3.i iVar = this.f509814d;
        if (iVar.m168145xf166e8d5() == 0) {
            android.widget.FrameLayout m168147x1cab64eb = iVar.m168147x1cab64eb();
            if ((m168147x1cab64eb != null && iVar.m168145xf166e8d5() == m168147x1cab64eb.getMeasuredWidth()) && iVar.m168144x21a737f8() == 0) {
                android.widget.FrameLayout m168147x1cab64eb2 = iVar.m168147x1cab64eb();
                if (m168147x1cab64eb2 != null && iVar.m168144x21a737f8() == m168147x1cab64eb2.getMeasuredHeight()) {
                    return;
                }
            }
        }
        android.view.ViewTreeObserver viewTreeObserver = iVar.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        android.widget.FrameLayout m168147x1cab64eb3 = iVar.m168147x1cab64eb();
        iVar.m168167xccfcf549(m168147x1cab64eb3 != null ? m168147x1cab64eb3.getMeasuredWidth() : 0);
        android.widget.FrameLayout m168147x1cab64eb4 = iVar.m168147x1cab64eb();
        iVar.m168166xb8d2ba04(m168147x1cab64eb4 != null ? m168147x1cab64eb4.getMeasuredHeight() : 0);
        android.widget.FrameLayout m168147x1cab64eb5 = iVar.m168147x1cab64eb();
        int measuredWidth = m168147x1cab64eb5 != null ? m168147x1cab64eb5.getMeasuredWidth() : 0;
        android.widget.FrameLayout m168147x1cab64eb6 = iVar.m168147x1cab64eb();
        bVar.f303751o = new android.graphics.Rect(0, 0, measuredWidth, m168147x1cab64eb6 != null ? m168147x1cab64eb6.getMeasuredHeight() : 0);
        bVar.f303752p = iVar.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560051a0);
        uj3.c m168151xd74835c8 = iVar.m168151xd74835c8();
        if (m168151xd74835c8 != null) {
            m168151xd74835c8.b(bVar, null);
        }
        uj3.c m168151xd74835c82 = iVar.m168151xd74835c8();
        if (m168151xd74835c82 != null && (frameLayout = m168151xd74835c82.f509775a) != null) {
            frameLayout.setVisibility(0);
        }
        uj3.c m168151xd74835c83 = iVar.m168151xd74835c8();
        if (m168151xd74835c83 != null) {
            m168151xd74835c83.f509777c = iVar.m168144x21a737f8();
        }
        uj3.c m168151xd74835c84 = iVar.m168151xd74835c8();
        if (m168151xd74835c84 != null) {
            m168151xd74835c84.f509776b = iVar.m168145xf166e8d5();
        }
        uj3.c m168151xd74835c85 = iVar.m168151xd74835c8();
        if (m168151xd74835c85 != null) {
            m168151xd74835c85.c(1.0f, 0, 0, false, false);
        }
        iVar.s(true);
    }
}
