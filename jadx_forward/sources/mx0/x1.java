package mx0;

/* loaded from: classes5.dex */
public final class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.q2 f413959d;

    public x1(mx0.q2 q2Var) {
        this.f413959d = q2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f413959d.getClass();
        mx0.q2 q2Var = this.f413959d;
        if (!q2Var.d().f303887d) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) q2Var.f413768f;
            c10977x8e40eced.getClass();
            yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.h2(m7Var, null), 3, null);
            c10977x8e40eced.h1(false);
            p3325xe03a0797.p3326xc267989b.l.d(c10977x8e40eced.getScope(), null, null, new mx0.y8(c10977x8e40eced, null), 3, null);
            mx0.k3 d17 = q2Var.d();
            if (!d17.f303887d) {
                mx0.n3 o17 = d17.o();
                if (!o17.mo68187xb9a8b747()) {
                    o17.mo68201x76500a7f(true);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
