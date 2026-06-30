package com.tencent.mm.feature.finder.live;

/* loaded from: classes.dex */
public final class j4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.finder.live.j4 f66788d = new com.tencent.mm.feature.finder.live.j4();

    public j4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            java.lang.String str = gm0.j1.u().h() + "oly/";
            if (com.tencent.mm.vfs.w6.j(str)) {
                com.tencent.mm.vfs.w6.f(str);
                com.tencent.mars.xlog.Log.i("Finder.OlympicsLiveRoomUtil", "clearOlympicFiles succ");
            }
        } catch (java.lang.Throwable unused) {
        }
        return jz5.f0.f302826a;
    }
}
