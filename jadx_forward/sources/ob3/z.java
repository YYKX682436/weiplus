package ob3;

/* loaded from: classes9.dex */
public class z implements mb3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ob3.a0 f425626a;

    public z(ob3.a0 a0Var) {
        this.f425626a = a0Var;
    }

    @Override // mb3.d
    public void a(int i17, android.content.Intent intent) {
        android.content.Intent intent2 = new android.content.Intent();
        ob3.a0 a0Var = this.f425626a;
        android.content.Intent putExtra = intent2.putExtra("sendId", a0Var.f425578f.f465759e);
        if (i17 == -1) {
            putExtra.putExtra("result_share_msg", true);
        } else {
            putExtra.putExtra("result_share_msg", false);
        }
        a0Var.f425579g = false;
        java.lang.Object obj = a0Var.f425576d;
        if (obj == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d abstractActivityC16322x2b9a639d = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d) obj;
        abstractActivityC16322x2b9a639d.setResult(-1, putExtra);
        abstractActivityC16322x2b9a639d.finish();
    }
}
