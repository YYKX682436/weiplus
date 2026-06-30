package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f97572a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f97573b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f97574c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f97575d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f97576e;

    public l(android.content.Context context, java.util.List groupList) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(groupList, "groupList");
        this.f97572a = context;
        this.f97573b = groupList;
        this.f97574c = "MicroMsg.EmojiGroupRemove";
        this.f97575d = kotlinx.coroutines.z0.b();
    }

    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i(this.f97574c, "removeOne: " + str);
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        z12.w wVar = new z12.w(str, 2);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = new com.tencent.mm.plugin.emoji.model.h(h0Var, wVar, this, str, rVar);
        gm0.j1.n().f273288b.a(413, (com.tencent.mm.modelbase.u0) h0Var.f310123d);
        rVar.m(new com.tencent.mm.plugin.emoji.model.i(h0Var));
        gm0.j1.n().f273288b.g(wVar);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }
}
