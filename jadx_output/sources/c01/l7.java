package c01;

/* loaded from: classes12.dex */
public class l7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.q7 f37306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f37307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c01.m7 f37308f;

    public l7(c01.m7 m7Var, c01.q7 q7Var, int i17) {
        this.f37308f = m7Var;
        this.f37306d = q7Var;
        this.f37307e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.p7 p7Var = this.f37308f.f37330a.f37419e;
        if (p7Var != null) {
            c01.q7 q7Var = this.f37306d;
            java.lang.String str = q7Var.f37394a;
            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = (com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI) p7Var;
            if (gestureGalleryUI.f172188d != null) {
                int selectedItemPosition = gestureGalleryUI.f172190e.getSelectedItemPosition();
                int i17 = q7Var.f37397d;
                if (i17 == selectedItemPosition) {
                    java.lang.String str2 = q7Var.f37395b;
                    gestureGalleryUI.f172194g = str2;
                    gestureGalleryUI.f172192f = i17;
                    com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "onDownSucc, curFilename:%s, url:%s", str2, str);
                    gestureGalleryUI.h7();
                    if (gestureGalleryUI.O1 == 1) {
                        gestureGalleryUI.A7(true, this.f37307e);
                    }
                }
                gestureGalleryUI.f172188d.notifyDataSetChanged();
            }
        }
    }
}
