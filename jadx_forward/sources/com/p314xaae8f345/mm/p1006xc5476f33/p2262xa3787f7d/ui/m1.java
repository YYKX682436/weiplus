package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes10.dex */
public class m1 extends uh4.d0 {
    @Override // uh4.c
    public java.lang.String b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l7a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // uh4.c
    public void c(android.content.Context context, uh4.b state, uh4.a aVar) {
        android.content.Context context2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (aVar == null) {
            return;
        }
        android.widget.LinearLayout linearLayout = aVar.f509498i;
        if (linearLayout == null || (context2 = linearLayout.getContext()) == null) {
            context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
        h(context2, state, aVar, true);
        f(context2, state, aVar, true);
    }

    public final void f(android.content.Context context, uh4.b state, uh4.a aVar, boolean z17) {
        java.util.Map d17;
        java.lang.String str;
        ot0.q v17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (aVar == null) {
            return;
        }
        ot0.q qVar = aVar.f509490a;
        rt0.e eVar = qVar != null ? (rt0.e) qVar.y(rt0.e.class) : null;
        if (eVar == null || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(eVar.f480913e, "content", null)) == null || (str = (java.lang.String) d17.get(".content")) == null || (v17 = ot0.q.v(str)) == null) {
            return;
        }
        java.lang.String str2 = v17.f430187f;
        android.widget.TextView textView = aVar.f509501l;
        boolean z18 = true;
        if (str2 == null || r26.n0.N(str2)) {
            str2 = context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572123zb : com.p314xaae8f345.mm.R.C30867xcad56011.f572122za);
        }
        textView.setText(str2);
        java.lang.String str3 = v17.f430267z;
        java.lang.String str4 = v17.f430207k;
        aVar.f509499j.setImageResource(com.p314xaae8f345.mm.R.raw.f78435x7b83bce4);
        aVar.f509499j.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        if (!(str3 == null || r26.n0.N(str3))) {
            n11.a b17 = n11.a.b();
            android.widget.ImageView imageView = aVar.f509499j;
            o11.f fVar = new o11.f();
            fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78435x7b83bce4;
            fVar.f423631v = true;
            fVar.f423611b = true;
            fVar.f423615f = tv.a.b(str3);
            fVar.f423619j = 132;
            fVar.f423620k = 132;
            b17.h(str3, imageView, fVar.a());
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f509491b)) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            aVar.f509499j.setImageBitmap(m11.b1.Di().m0(null, aVar.f509491b, i65.a.g(context), false));
        }
        float b18 = i65.a.b(context, 4);
        i95.m c17 = i95.n0.c(vv.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        fq1.e.f347040a.g(aVar.f509499j, b18, true, true);
        if (!aVar.a() && state != uh4.b.AUTHORIZED) {
            z18 = false;
        }
        if (!z18) {
            aVar.f509498i.setOnClickListener(null);
            return;
        }
        if (z17) {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).d(str4, -1, 3, new java.lang.Object[0]);
        }
        aVar.f509498i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.l1(z17, str4, context));
    }

    public final void h(android.content.Context context, uh4.b state, uh4.a aVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (aVar == null) {
            return;
        }
        if (aVar.a()) {
            int ordinal = state.ordinal();
            if (ordinal == 0) {
                aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqw));
                return;
            }
            if (ordinal == 1) {
                aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqx));
                return;
            } else if (ordinal == 2) {
                aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqv));
                return;
            } else {
                if (ordinal != 3) {
                    return;
                }
                aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqu));
                return;
            }
        }
        int ordinal2 = state.ordinal();
        if (ordinal2 == 0) {
            aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574855jr0));
            return;
        }
        if (ordinal2 == 1) {
            aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574856jr1));
        } else if (ordinal2 == 2) {
            aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqz));
        } else {
            if (ordinal2 != 3) {
                return;
            }
            aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqy));
        }
    }
}
