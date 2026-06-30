package ub3;

/* loaded from: classes15.dex */
public class f implements ub3.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 f507633a;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a404) {
        this.f507633a = activityC16330x45b4a404;
    }

    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a404 = this.f507633a;
        if (i18 != 8) {
            activityC16330x45b4a404.H.a("select_card.m4a");
            return;
        }
        activityC16330x45b4a404.H.a("music" + (i17 + 1) + ".m4a");
    }

    public void b(int i17, int i18) {
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404.G1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a404 = this.f507633a;
        activityC16330x45b4a404.X6();
        if (i18 == 8) {
            int[] iArr = activityC16330x45b4a404.V;
            iArr[5] = iArr[5] + 1;
        } else {
            activityC16330x45b4a404.H.a("select_card.m4a");
            int[] iArr2 = activityC16330x45b4a404.V;
            iArr2[3] = iArr2[3] + 1;
        }
    }
}
