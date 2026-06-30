package ym5;

/* loaded from: classes5.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.h f544944d;

    public k(ym5.h hVar) {
        this.f544944d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int bottom;
        android.graphics.Rect rect = new android.graphics.Rect();
        ym5.h hVar = this.f544944d;
        hVar.getWindowVisibleDisplayFrame(rect);
        boolean z17 = hVar.getBottom() - rect.bottom >= 300;
        hVar.getResources().getDisplayMetrics();
        if (z17) {
            bottom = (hVar.getBottom() - com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getInt("com.tencent.mm.compatible.util.keybord.height", 0)) - ((int) hVar.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561784sk));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseDrawingView", "[onKeyboardChanged] height:%s", java.lang.Integer.valueOf(bottom));
        } else {
            bottom = hVar.getBottom() - ((int) hVar.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561784sk));
        }
        if (hVar.f544890t.getHeight() != bottom) {
            hVar.f544890t.setHeight(bottom);
        }
        hVar.getViewTreeObserver().removeOnGlobalLayoutListener(hVar);
        hVar.getViewTreeObserver().addOnGlobalLayoutListener(hVar);
    }
}
