package uf5;

/* loaded from: classes10.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f508761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22352x7cb33d67 f508762e;

    public f2(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22352x7cb33d67 activityC22352x7cb33d67, java.util.List list) {
        this.f508762e = activityC22352x7cb33d67;
        this.f508761d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        int i17 = 0;
        while (true) {
            java.util.List list = this.f508761d;
            int size = list.size();
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22352x7cb33d67 activityC22352x7cb33d67 = this.f508762e;
            if (i17 >= size) {
                activityC22352x7cb33d67.A = true;
                activityC22352x7cb33d67.l7();
                return;
            } else {
                java.lang.String str2 = (java.lang.String) list.get(i17);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) list.get(i17)) && !str.equals(list.get(i17))) {
                    activityC22352x7cb33d67.f288633d.remove(str2);
                }
                i17++;
            }
        }
    }
}
