package c01;

/* loaded from: classes12.dex */
public class l7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.q7 f118839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f118840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c01.m7 f118841f;

    public l7(c01.m7 m7Var, c01.q7 q7Var, int i17) {
        this.f118841f = m7Var;
        this.f118839d = q7Var;
        this.f118840e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.p7 p7Var = this.f118841f.f118863a.f118952e;
        if (p7Var != null) {
            c01.q7 q7Var = this.f118839d;
            java.lang.String str = q7Var.f118927a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.ActivityC18509x4a85de3d activityC18509x4a85de3d = (com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2247xf44c7752.ActivityC18509x4a85de3d) p7Var;
            if (activityC18509x4a85de3d.f253721d != null) {
                int selectedItemPosition = activityC18509x4a85de3d.f253723e.getSelectedItemPosition();
                int i17 = q7Var.f118930d;
                if (i17 == selectedItemPosition) {
                    java.lang.String str2 = q7Var.f118928b;
                    activityC18509x4a85de3d.f253727g = str2;
                    activityC18509x4a85de3d.f253725f = i17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureGalleryUI", "onDownSucc, curFilename:%s, url:%s", str2, str);
                    activityC18509x4a85de3d.h7();
                    if (activityC18509x4a85de3d.O1 == 1) {
                        activityC18509x4a85de3d.A7(true, this.f118840e);
                    }
                }
                activityC18509x4a85de3d.f253721d.notifyDataSetChanged();
            }
        }
    }
}
