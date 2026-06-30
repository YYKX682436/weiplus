package sr1;

/* loaded from: classes11.dex */
public class z extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sr1.a0 f493037b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(sr1.a0 a0Var) {
        super(a0Var);
        this.f493037b = a0Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        sr1.a0 a0Var = (sr1.a0) gVar;
        sr1.y yVar = (sr1.y) eVar;
        u50.y yVar2 = (u50.y) i95.n0.c(u50.y.class);
        android.view.View view = yVar.f493032a;
        boolean z17 = this.f493037b.f505294d;
        ((s50.r0) yVar2).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.j(view, z17);
        int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561300eo);
        gk0.k kVar = new gk0.k(h17, h17);
        kVar.f353967e = com.p314xaae8f345.mm.R.C30861xcebc809e.bgo;
        kVar.f353966d = 0.5f;
        gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
        android.widget.ImageView imageView = yVar.f493033b;
        java.lang.String str = a0Var.f492984u;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        ((h83.g) n0Var).wi(imageView, str, kVar);
        if (c01.e2.R(a0Var.f492982s)) {
            java.lang.CharSequence aj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).aj(context, a0Var.f492985v);
            u50.y yVar3 = (u50.y) i95.n0.c(u50.y.class);
            android.widget.TextView textView = yVar.f493034c;
            ((s50.r0) yVar3).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(aj6, textView);
        } else {
            u50.y yVar4 = (u50.y) i95.n0.c(u50.y.class);
            java.lang.CharSequence charSequence = a0Var.f492985v;
            android.widget.TextView textView2 = yVar.f493034c;
            ((s50.r0) yVar4).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(charSequence, textView2);
        }
        u50.y yVar5 = (u50.y) i95.n0.c(u50.y.class);
        java.lang.CharSequence charSequence2 = a0Var.f492986w;
        android.widget.TextView textView3 = yVar.f493035d;
        ((s50.r0) yVar5).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(charSequence2, textView3);
        if (a0Var.f492981r.l2()) {
            yVar.f493036e.setVisibility(8);
            return;
        }
        if ((a0Var.f492981r.f1() & 512) > 0) {
            yVar.f493036e.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79909x77ca9e41, i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.aes)));
            yVar.f493036e.setVisibility(0);
            return;
        }
        if (!((a0Var.f492981r.f1() & 16) > 0)) {
            yVar.f493036e.setVisibility(8);
            return;
        }
        yVar.f493036e.m82040x7541828(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560055a3));
        yVar.f493036e.setImageResource(com.p314xaae8f345.mm.R.raw.f79909x77ca9e41);
        yVar.f493036e.setVisibility(0);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bbt, viewGroup, false);
        sr1.y yVar = this.f493037b.f492989z;
        yVar.f493033b = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        yVar.f493034c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        yVar.f493035d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
        yVar.f493032a = inflate.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        yVar.f493036e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.h6y);
        inflate.setTag(yVar);
        return inflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0379  */
    @Override // u13.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(android.content.Context r20, android.view.View r21, u13.g r22, java.lang.Object... r23) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sr1.z.d(android.content.Context, android.view.View, u13.g, java.lang.Object[]):boolean");
    }
}
