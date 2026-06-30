package jg1;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jg1.b f381174d;

    public a(jg1.b bVar) {
        this.f381174d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKeyBoardComponentView", "clear all views runnable");
        jg1.b bVar = this.f381174d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia iaVar = bVar.f381179g;
        if (iaVar != null) {
            iaVar.h();
        }
        android.widget.LinearLayout linearLayout = bVar.f381177e;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
    }
}
