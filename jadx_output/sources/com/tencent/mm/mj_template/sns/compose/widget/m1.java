package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f70065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(androidx.paging.compose.e eVar) {
        super(0);
        this.f70065d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.w("MicroMsg.MusicSearchPanel", "MusicList: load error, user retry");
        g4.y4 y4Var = this.f70065d.f11718c.f268512b;
        if (y4Var != null) {
            y4Var.a();
        }
        return jz5.f0.f302826a;
    }
}
