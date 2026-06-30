package w82;

/* loaded from: classes12.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w82.b0 f525481d;

    public z(w82.b0 b0Var) {
        this.f525481d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        w82.b0 b0Var = this.f525481d;
        int i17 = b0Var.f525356n;
        if (i17 == 1 || i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavHeaderView", "click clear fav item");
            if (b0Var.f525351f != null) {
                int i18 = b0Var.f525356n;
                if (i18 == 1) {
                    str = b0Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ntz, o72.x1.O((float) (b0Var.f525355m.longValue() - o72.x1.K())));
                } else if (i18 == 3) {
                    str = b0Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573274nu0, o72.x1.O((float) o72.x1.K()));
                } else {
                    str = "";
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a) b0Var.f525351f).s7(str);
            }
        }
        b0Var.c("view_clk");
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
