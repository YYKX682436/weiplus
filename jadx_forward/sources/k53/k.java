package k53;

/* loaded from: classes8.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 f385900d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 activityC15919x390706d3) {
        this.f385900d = activityC15919x390706d3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 activityC15919x390706d3 = this.f385900d;
        p33.l x17 = activityC15919x390706d3.f221649f.x(activityC15919x390706d3.f221657q);
        if (x17 != null) {
            android.os.Bundle V6 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3.V6(activityC15919x390706d3, activityC15919x390706d3.f221657q);
            V6.putBoolean("game_straight_to_publish", activityC15919x390706d3.f221661u);
            if (com.p314xaae8f345.mm.vfs.w6.j(x17.f433150v)) {
                ((i53.x3) ((m33.v1) i95.n0.c(m33.v1.class))).Ai(activityC15919x390706d3.f221647d, activityC15919x390706d3.f221658r, x17.f433147s, x17.f433150v, null, null, 19722, V6, activityC15919x390706d3.f221662v);
            } else {
                ((i53.x3) ((m33.v1) i95.n0.c(m33.v1.class))).Ai(activityC15919x390706d3.f221647d, activityC15919x390706d3.f221658r, x17.f433147s, null, x17.f433140i, x17.f433139h, 19722, V6, activityC15919x390706d3.f221662v);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
