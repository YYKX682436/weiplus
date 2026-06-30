package e33;

/* loaded from: classes10.dex */
public class v3 implements e33.g5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 f329049a;

    public v3(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561) {
        this.f329049a = activityC15656x6f26b561;
    }

    public void a(android.view.View view, int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = this.f329049a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewUI", "[onItemClick] position:%s %s", valueOf, java.lang.Boolean.valueOf(activityC15656x6f26b561.f220127p));
        e33.h5 h5Var = (e33.h5) activityC15656x6f26b561.f220114f.mo7946xf939df19();
        h5Var.f328801s = i17;
        h5Var.f328800r = i17;
        activityC15656x6f26b561.f220110d.b(i17, false);
        if (activityC15656x6f26b561.f220127p) {
            t23.p0.f496756o = true;
        } else {
            t23.p0.f496758q = true;
        }
    }

    public void b(int i17, int i18, int i19) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = this.f329049a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewUIChangelcai", "[onItemMoved] fromPos:%s, toPos:%s,visiblePos:%s, mPosition:%s", valueOf, valueOf2, valueOf3, activityC15656x6f26b561.f220126o);
        if (activityC15656x6f26b561.f220127p) {
            j33.d0.r(activityC15656x6f26b561.f220124m, i17, i18);
            t23.p0.f496755n = true;
            return;
        }
        j33.d0.r(activityC15656x6f26b561.f220116g, i17, i18);
        e33.v2 v2Var = activityC15656x6f26b561.f220112e;
        int intValue = activityC15656x6f26b561.f220126o.intValue();
        v2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "[swapPosition]from:%s to:%s curPos:%s visiblePos:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(i19));
        if (!v2Var.f329036n) {
            j33.d0.r(v2Var.f329034i, i17, i18);
            v2Var.f329038p = i19;
            android.util.SparseArray sparseArray = v2Var.f310004f;
            android.view.View view = (android.view.View) sparseArray.get(intValue);
            v2Var.f329039q = view;
            ((java.util.LinkedList) v2Var.f310002d).remove(view);
            v2Var.f310003e.clear();
            sparseArray.clear();
            v2Var.f329040r = true;
            v2Var.mo8343xced61ae5();
            v2Var.f329044v = i19;
        }
        activityC15656x6f26b561.f220110d.b(i19, false);
        e33.h5 h5Var = (e33.h5) activityC15656x6f26b561.f220114f.mo7946xf939df19();
        h5Var.f328801s = i19;
        h5Var.f328800r = i19;
        t23.p0.f496757p = true;
    }
}
