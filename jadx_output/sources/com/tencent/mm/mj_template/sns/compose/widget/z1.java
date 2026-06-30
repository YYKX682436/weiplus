package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.t2 f70342d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.mj_template.sns.compose.widget.t2 t2Var) {
        super(2);
        this.f70342d = t2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        androidx.lifecycle.y lifecycleOwner = (androidx.lifecycle.y) obj;
        androidx.lifecycle.m event = (androidx.lifecycle.m) obj2;
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(event, "event");
        androidx.lifecycle.m mVar = androidx.lifecycle.m.ON_PAUSE;
        com.tencent.mm.mj_template.sns.compose.widget.t2 t2Var = this.f70342d;
        if (event == mVar) {
            t2Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicSearchPanel", "pausePlay: ");
            gz0.h hVar = t2Var.f70245r;
            if (hVar != null) {
                hVar.a();
            }
        } else if (event == androidx.lifecycle.m.ON_RESUME) {
            t2Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicSearchPanel", "startPlay: ");
            gz0.h hVar2 = t2Var.f70245r;
            if (hVar2 != null) {
                hVar2.b();
            }
        }
        return jz5.f0.f302826a;
    }
}
