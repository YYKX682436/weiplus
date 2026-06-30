package c61;

@j95.b
/* loaded from: classes3.dex */
public final class d8 extends i95.w implements zy2.c8 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f38940d = "FinderFluentSwitchServi";

    public void Ai(r45.g92 finderLiveShareObject, long j17, android.view.View v17, android.widget.ImageView thumbView, ez2.a scene, yz5.p onAnimationEndCallback) {
        kotlin.jvm.internal.o.g(finderLiveShareObject, "finderLiveShareObject");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(thumbView, "thumbView");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        int i17 = c61.dc.f38947a;
        boolean wh6 = ((pg2.j0) i95.n0.c(pg2.j0.class)).wh();
        com.tencent.mars.xlog.Log.i("ILiveEnterAnimStrategy", "createLiveEnterAnimImpl isSupport=" + wh6);
        c61.dc c8Var = wh6 ? new c61.c8() : c61.y7.f39429b;
        android.content.Context context = v17.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
        java.lang.String string = finderLiveShareObject.getString(1);
        java.lang.String str = string == null ? "" : string;
        java.lang.String string2 = finderLiveShareObject.getString(12);
        java.lang.String str2 = string2 == null ? "" : string2;
        r45.nw1 nw1Var = (r45.nw1) finderLiveShareObject.getCustom(24);
        java.lang.String string3 = finderLiveShareObject.getString(25);
        c8Var.b(v17, appCompatActivity, new zy2.nc(str, j17, str2, nw1Var, "", string3 == null ? "" : string3, thumbView, null, 128, null), scene, onAnimationEndCallback);
    }

    public void Bi(zy2.nc feedData, long j17, android.view.View v17, ez2.a scene, yz5.p onAnimationEndCallback) {
        kotlin.jvm.internal.o.g(feedData, "feedData");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        int i17 = c61.dc.f38947a;
        boolean wh6 = ((pg2.j0) i95.n0.c(pg2.j0.class)).wh();
        com.tencent.mars.xlog.Log.i("ILiveEnterAnimStrategy", "createLiveEnterAnimImpl isSupport=" + wh6);
        c61.dc c8Var = wh6 ? new c61.c8() : c61.y7.f39429b;
        android.content.Context context = v17.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        c8Var.b(v17, (androidx.appcompat.app.AppCompatActivity) context, feedData, scene, onAnimationEndCallback);
    }

    public boolean Di() {
        ae2.in inVar = ae2.in.f3688a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.L).getValue()).r()).intValue() == 1;
    }

    public boolean Ni() {
        ae2.b2 b2Var = ae2.b2.f3461a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f3489w).getValue()).r()).intValue() != 1) {
            return false;
        }
        ae2.b2 b2Var2 = ae2.b2.f3461a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f3460J).getValue()).r()).intValue() == 1 && !com.tencent.mm.ui.bk.Q() && !com.tencent.mm.ui.bk.d0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ez2.b Ri(android.content.Context r21, ez2.c r22) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.d8.Ri(android.content.Context, ez2.c):ez2.b");
    }

    public ez2.c wi(ez2.a fluentScene, long j17, android.view.ViewGroup parentView, android.view.View imageView, java.lang.String liveUrl, boolean z17, r45.nw1 nw1Var, java.lang.String str) {
        kotlin.jvm.internal.o.g(fluentScene, "fluentScene");
        kotlin.jvm.internal.o.g(parentView, "parentView");
        kotlin.jvm.internal.o.g(imageView, "imageView");
        kotlin.jvm.internal.o.g(liveUrl, "liveUrl");
        java.lang.String d17 = ko0.t.f309903a.d(liveUrl);
        if (d17 == null) {
            d17 = "";
        }
        return new zz2.a(fluentScene, j17, parentView, imageView, liveUrl, z17, nw1Var, new mn0.l0(d17, str == null ? "NULL" : str, nw1Var != null ? nw1Var.getLong(0) : 0L, j17, android.os.SystemClock.elapsedRealtime(), nw1Var));
    }
}
