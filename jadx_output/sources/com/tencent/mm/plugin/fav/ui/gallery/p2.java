package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public final class p2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.q2 f101048d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.tencent.mm.plugin.fav.ui.gallery.q2 q2Var) {
        super(0);
        this.f101048d = q2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = this.f101048d.f101052d.getSystemService("vibrator");
        if (systemService instanceof android.os.Vibrator) {
            return (android.os.Vibrator) systemService;
        }
        return null;
    }
}
