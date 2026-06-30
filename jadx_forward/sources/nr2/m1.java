package nr2;

/* loaded from: classes2.dex */
public class m1 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.di7;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        nr2.m item = (nr2.m) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.qey);
        boolean z18 = item.c().length() == 0;
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (z18) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28);
        } else {
            vo0.d e17 = g1Var.e();
            mn2.q3 q3Var = new mn2.q3(item.c(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            e17.c(q3Var, imageView, g1Var.h(mn2.f1.f411496q));
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565987qf1);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String k17 = item.k();
        ((ke0.e) xVar).getClass();
        android.content.Context context = holder.f374654e;
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, k17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (item.p()) {
            sb6.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572851lq0));
            if (item.f() != 0) {
                sb6.append(" ");
                sb6.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572852lq1, java.lang.String.valueOf(item.f())));
            }
        } else {
            sb6.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mgv));
            if (item.f() != 0) {
                sb6.append(" ");
                sb6.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mgw, java.lang.String.valueOf(item.f())));
            }
        }
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565986qf0)).setText(sb6);
        vo0.d a17 = g1Var.a();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa b17 = item.b();
        java.lang.String m76175x6d346f39 = b17 != null ? b17.m76175x6d346f39() : null;
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (m76175x6d346f39 == null) {
            m76175x6d346f39 = "";
        }
        mn2.n nVar = new mn2.n(m76175x6d346f39, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.X);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.qew);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        a17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f411490h));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f542044a;
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.qev);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) p18;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa b18 = item.b();
        zy2.tb.a(m1Var, imageView2, b18 != null ? b18.m76160xd133dfec() : null, 0, 4, null);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.qex);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa b19 = item.b();
        java.lang.String m76184x8010e5e4 = b19 != null ? b19.m76184x8010e5e4() : null;
        ((ke0.e) xVar2).getClass();
        textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m76184x8010e5e4));
    }
}
