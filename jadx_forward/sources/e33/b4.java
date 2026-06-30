package e33;

/* loaded from: classes10.dex */
public class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f328691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e33.c4 f328692e;

    public b4(e33.c4 c4Var, java.lang.String str) {
        this.f328692e = c4Var;
        this.f328691d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        e33.c4 c4Var = this.f328692e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = c4Var.f328724c;
        e33.v2 v2Var = activityC15656x6f26b561.f220112e;
        java.util.ArrayList arrayList = activityC15656x6f26b561.f220116g;
        java.util.ArrayList arrayList2 = v2Var.f329034i;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        v2Var.h();
        v2Var.mo8343xced61ae5();
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b5612 = c4Var.f328724c;
        e33.h5 h5Var = (e33.h5) activityC15656x6f26b5612.f220114f.mo7946xf939df19();
        java.util.ArrayList arrayList3 = activityC15656x6f26b5612.f220116g;
        java.util.ArrayList arrayList4 = h5Var.f328793h;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        h5Var.m8146xced61ae5();
        java.util.ArrayList<java.lang.String> stringArrayListExtra = c4Var.f328722a.getStringArrayListExtra("preview_select_image_list");
        activityC15656x6f26b5612.f220124m.clear();
        if (stringArrayListExtra != null) {
            activityC15656x6f26b5612.f220124m.addAll(stringArrayListExtra);
        }
        activityC15656x6f26b5612.Q1.Y0(activityC15656x6f26b5612.e7());
        activityC15656x6f26b5612.f220136w.setText(activityC15656x6f26b5612.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573715fj0));
        if (t21.d3.s() && (((i17 = activityC15656x6f26b5612.L) == 3 || i17 == 16) && activityC15656x6f26b5612.f220130q)) {
            activityC15656x6f26b5612.s7();
        } else {
            activityC15656x6f26b5612.f220137x.setVisibility(8);
        }
        if (activityC15656x6f26b5612.f220124m.contains(j33.d0.g(this.f328691d))) {
            java.lang.String stringExtra = activityC15656x6f26b5612.getIntent().getStringExtra("GalleryUI_ToUser");
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 k17 = activityC15656x6f26b5612.f220112e.k(activityC15656x6f26b5612.f220126o.intValue());
            if (k17 != null) {
                j33.d0.k(k17.f219967i, k17.f219963e, stringExtra, activityC15656x6f26b5612.K || !activityC15656x6f26b5612.f220130q, 0, true, k17);
                j33.d0.p(activityC15656x6f26b5612, k17.f219967i, k17.f219963e, stringExtra, activityC15656x6f26b5612.K || !activityC15656x6f26b5612.f220130q, 0, true);
            }
        } else {
            activityC15656x6f26b5612.D.performClick();
        }
        if (activityC15656x6f26b5612.M) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewUI", "skipPreviewToEdit, handlePhotoEditResult, invoke onSendItemClick");
            activityC15656x6f26b5612.p7();
        }
    }
}
