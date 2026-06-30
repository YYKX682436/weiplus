package ub3;

/* loaded from: classes9.dex */
public class c0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tb3.c f507628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16331x46dfff95 f507629e;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16331x46dfff95 activityC16331x46dfff95, tb3.c cVar) {
        this.f507629e = activityC16331x46dfff95;
        this.f507628d = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f507628d.f498535x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16331x46dfff95 activityC16331x46dfff95 = this.f507629e;
        if (gVar == null || gVar.f273689a.length <= 0) {
            activityC16331x46dfff95.finish();
        } else {
            activityC16331x46dfff95.m66165x5406100e(new tb3.c(activityC16331x46dfff95.f226632n, gVar), true);
        }
    }
}
