package gv2;

/* loaded from: classes10.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f357577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gv2.n0 f357578e;

    public m0(in5.s0 s0Var, gv2.n0 n0Var) {
        this.f357577d = s0Var;
        this.f357578e = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.graphics.drawable.Drawable e17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$refreshAwesomeIv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.ImageView");
        android.widget.ImageView imageView = (android.widget.ImageView) view;
        in5.s0 s0Var = this.f357577d;
        jv2.i iVar = (jv2.i) s0Var.f374658i;
        ev2.n nVar = ev2.n.f338454f;
        ev2.n nVar2 = ev2.n.f338454f;
        gv2.n0 n0Var = this.f357578e;
        boolean b17 = nVar2.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3) n0Var.f357580e).m().a(), iVar.f383756d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3) n0Var.f357580e).f211905i);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3) n0Var.f357580e).f211919z) {
            if (b17) {
                db5.t7.m123882x26a183b(s0Var.f374654e, com.p314xaae8f345.mm.R.C30867xcad56011.m7l, 0).show();
            } else {
                db5.t7.m123882x26a183b(s0Var.f374654e, com.p314xaae8f345.mm.R.C30867xcad56011.m7j, 0).show();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$refreshAwesomeIv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean z17 = !b17;
        if (z17) {
            android.content.Context context = s0Var.f374654e;
            e17 = com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79525x33edc30c, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77890x91ab89a5));
        } else {
            android.content.Context context2 = s0Var.f374654e;
            e17 = com.p314xaae8f345.mm.ui.uk.e(context2, com.p314xaae8f345.mm.R.raw.f79562xfeb10c8c, context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
        }
        imageView.setImageDrawable(e17);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3) n0Var.f357580e).R(imageView, s0Var.m8183xf806b362());
        int a17 = nVar2.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3) n0Var.f357580e).m().a(), iVar.f383756d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3) n0Var.f357580e).f211905i);
        if (a17 > 0) {
            s0Var.w(com.p314xaae8f345.mm.R.id.f564845aa0, 0);
            s0Var.s(com.p314xaae8f345.mm.R.id.f564845aa0, java.lang.String.valueOf(a17));
        } else {
            s0Var.w(com.p314xaae8f345.mm.R.id.f564845aa0, 8);
            s0Var.s(com.p314xaae8f345.mm.R.id.f564845aa0, "");
        }
        if (z17) {
            ((android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f564845aa0)).setTextColor(s0Var.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77890x91ab89a5));
        } else {
            ((android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f564845aa0)).setTextColor(s0Var.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
        }
        if (z17) {
            uw2.h0.o(uw2.h0.f513207a, imageView, 0L, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$refreshAwesomeIv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
