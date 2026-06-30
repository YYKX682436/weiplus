package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes10.dex */
public final class b extends uh4.d0 {
    @Override // uh4.c
    public java.lang.String b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572147a00);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // uh4.c
    public void c(android.content.Context context, uh4.b state, uh4.a aVar) {
        java.util.Map d17;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (aVar == null || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(((rt0.e) aVar.f509490a.y(rt0.e.class)).f480913e, "content", null)) == null || (str = (java.lang.String) d17.get(".content")) == null) {
            return;
        }
        ot0.q v17 = ot0.q.v(str);
        boolean a17 = aVar.a();
        boolean z17 = a17 || state == uh4.b.AUTHORIZED;
        if (v17 != null) {
            aVar.f509501l.setText(v17.f430187f);
            n11.a b17 = n11.a.b();
            java.lang.String str2 = v17.f430267z;
            android.widget.ImageView imageView = aVar.f509499j;
            o11.f fVar = new o11.f();
            fVar.f423629t = true;
            fVar.f423626q = com.p314xaae8f345.mm.R.C30861xcebc809e.bpu;
            b17.h(str2, imageView, fVar.a());
        }
        if (a17) {
            aVar.f509502m.setVisibility(0);
            int ordinal = state.ordinal();
            if (ordinal == 0) {
                aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqw));
            } else if (ordinal == 1) {
                aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqx));
            } else if (ordinal == 2) {
                aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqv));
            } else if (ordinal == 3) {
                aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqu));
            }
        } else {
            aVar.f509502m.setVisibility(8);
            int ordinal2 = state.ordinal();
            if (ordinal2 == 0) {
                aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574855jr0));
            } else if (ordinal2 == 1) {
                aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574856jr1));
            } else if (ordinal2 == 2) {
                aVar.f509502m.setVisibility(0);
                aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqz));
            } else if (ordinal2 == 3) {
                aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqy));
            }
        }
        if (z17) {
            aVar.f509498i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.a(v17, context));
        } else {
            aVar.f509498i.setOnClickListener(null);
        }
    }
}
