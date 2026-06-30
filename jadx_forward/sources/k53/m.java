package k53;

/* loaded from: classes8.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 f385904d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 activityC15919x390706d3) {
        this.f385904d = activityC15919x390706d3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 activityC15919x390706d3 = this.f385904d;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(activityC15919x390706d3.f221647d, 87, 8768, 0, 2, activityC15919x390706d3.f221662v, lj0.a.a(activityC15919x390706d3.f221658r, null));
        android.view.View inflate = android.view.LayoutInflater.from(activityC15919x390706d3.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bf_, (android.view.ViewGroup) null, false);
        y9.i iVar = new y9.i(activityC15919x390706d3.mo55332x76847179(), 0);
        iVar.setContentView(inflate);
        ((android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.gmo)).setOnClickListener(new k53.l(this, iVar));
        iVar.show();
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
