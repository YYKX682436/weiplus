package ae2;

/* loaded from: classes.dex */
public final class n7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.n7 f4045d = new ae2.n7();

    public n7() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        com.tencent.mm.sdk.platformtools.o4.M("_finder_live_mmkv" + gm0.j1.b().h()).putInt("finder_live_fast_comment_guide_show_cnt", 0);
        if (activity != null) {
            db5.t7.makeText(activity, "已清除，可重新测试", 0).show();
        }
        return jz5.f0.f302826a;
    }
}
