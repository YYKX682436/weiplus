package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes12.dex */
public class w1 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.y6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f283062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f283063b;

    public w1(boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f283062a = z17;
        this.f283063b = f9Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.y6
    public void b(com.p314xaae8f345.mm.sdk.p2603x2137b148.a7 a7Var) {
        java.lang.String str = a7Var.f273995c;
        boolean z17 = this.f283062a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f283063b;
        if (!z17) {
            h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
            h90.a[] aVarArr = h90.a.f361204d;
            ((g90.u) wVar).Ui(f9Var, 5, str, null);
            ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Zi(f9Var.Q0(), f9Var.m124847x74d37ac6(), 5);
            return;
        }
        int intValue = ((java.lang.Integer) ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Di(f9Var).f384366d).intValue();
        if (intValue != 3 && intValue != 2) {
            h90.w wVar2 = (h90.w) i95.n0.c(h90.w.class);
            h90.a[] aVarArr2 = h90.a.f361204d;
            ((g90.u) wVar2).Ui(f9Var, 5, str, null);
            ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Zi(f9Var.Q0(), f9Var.m124847x74d37ac6(), 5);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryAdapter", "insert DeviceFileExtInfo, %s, %s, %s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), f9Var.Q0(), str);
        h90.w wVar3 = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr3 = h90.a.f361204d;
        ((g90.u) wVar3).Ui(f9Var, 2, str, null);
        ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Zi(f9Var.Q0(), f9Var.m124847x74d37ac6(), 2);
        android.net.Uri uri = a7Var.f273994b;
        if (uri != null) {
            ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).aj(f9Var.Q0(), f9Var.m124847x74d37ac6(), android.content.ContentUris.parseId(uri), 2);
        }
    }
}
