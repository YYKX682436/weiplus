package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class c2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.d2 f103013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.x80 f103015f;

    public c2(com.tencent.mm.plugin.finder.convert.d2 d2Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.storage.x80 x80Var) {
        this.f103013d = d2Var;
        this.f103014e = s0Var;
        this.f103015f = x80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert$updateProgress$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.storage.x80 x80Var = this.f103015f;
        x80Var.getClass();
        this.f103013d.getClass();
        long j17 = x80Var.field_localId;
        com.tencent.mm.plugin.finder.storage.a90.f126393a.a(j17);
        java.lang.String u17 = pm0.v.u(j17);
        android.content.Context context = this.f103014e.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.f4.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.profile.uic.f4.a7((com.tencent.mm.plugin.finder.profile.uic.f4) a17, "draftdelete", 1, u17, 0, null, 24, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert$updateProgress$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
