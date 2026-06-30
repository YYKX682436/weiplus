package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class of implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104173d;

    public of(in5.s0 s0Var) {
        this.f104173d = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f104173d.itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = (com.tencent.mm.plugin.finder.viewmodel.component.pt) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.pt.class);
        if (ptVar.f135616q == null || ptVar.getContext().getResources().getConfiguration().orientation != 2) {
            return;
        }
        ptVar.f135624y = com.tencent.mm.plugin.finder.viewmodel.component.js.f134891i;
        ptVar.U6(0);
    }
}
