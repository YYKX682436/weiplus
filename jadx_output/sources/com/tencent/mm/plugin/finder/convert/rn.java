package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class rn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.yn f104494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104495e;

    public rn(com.tencent.mm.plugin.finder.convert.yn ynVar, in5.s0 s0Var) {
        this.f104494d = ynVar;
        this.f104495e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$onCreateViewHolder$onAvatarClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.qe.B(this.f104494d, this.f104495e, 5, false, 0, 8, null);
        in5.s0 s0Var = this.f104495e;
        if (s0Var.getAdapterPosition() == 0) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            zu2.q qVar = ((zu2.a0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(zu2.a0.class)).f475694f;
            if (qVar != null) {
                qVar.a();
                qVar.d("headimage");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$onCreateViewHolder$onAvatarClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
