package cv2;

/* loaded from: classes10.dex */
public final class c extends uh4.c {
    public static final void f(cv2.c cVar, uh4.a aVar, r45.kv2 kv2Var) {
        cVar.getClass();
        android.content.Context context = aVar.f509496g.getContext();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("feed_object_id", pm0.v.Z(kv2Var.m75945x2fec8307(0)));
        intent.putExtra("feed_object_nonceId", kv2Var.m75945x2fec8307(8));
        intent.putExtra("key_need_related_list", false);
        intent.putExtra("key_comment_scene", 25);
        if (kv2Var.m75939xb282bd08(5) == 11111) {
            intent.putExtra("business_type", 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        i0Var.uk(context, intent, false);
    }

    @Override // uh4.c
    public java.lang.String b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f8e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // uh4.c
    public void c(android.content.Context context, uh4.b state, uh4.a aVar) {
        java.lang.String str;
        ot0.q v17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (aVar == null) {
            return;
        }
        rt0.e eVar = (rt0.e) aVar.f509490a.y(rt0.e.class);
        boolean equals = c01.z1.r().equals(aVar.f509495f);
        if (eVar != null) {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(eVar.f480913e, "content", null);
            if (d17 == null || (str = (java.lang.String) d17.get(".content")) == null || (v17 = ot0.q.v(str)) == null) {
                return;
            }
            zy2.i iVar = (zy2.i) v17.y(zy2.i.class);
            r45.kv2 kv2Var = iVar != null ? iVar.f558944b : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAuthorizationFiller", "onFill, state:" + state + ", isWard:" + equals + ", piece.referMsg:" + eVar.f480913e);
            if (equals) {
                android.content.Context context2 = aVar.f509496g.getContext();
                int ordinal = state.ordinal();
                if (ordinal == 0) {
                    aVar.f509497h.setText(context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f7e));
                    h(aVar, kv2Var, false);
                    return;
                }
                if (ordinal == 1) {
                    aVar.f509497h.setText(context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f76));
                    h(aVar, kv2Var, false);
                    return;
                } else if (ordinal == 2) {
                    aVar.f509497h.setText(context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f7a));
                    h(aVar, kv2Var, true);
                    return;
                } else {
                    if (ordinal != 3) {
                        return;
                    }
                    aVar.f509497h.setText(context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f79));
                    h(aVar, kv2Var, false);
                    return;
                }
            }
            android.content.Context context3 = aVar.f509496g.getContext();
            int ordinal2 = state.ordinal();
            if (ordinal2 == 0) {
                aVar.f509496g.setText(context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f7d));
                aVar.f509497h.setText(context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f7c));
            } else if (ordinal2 == 1) {
                aVar.f509497h.setText(context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f76));
            } else if (ordinal2 == 2) {
                aVar.f509497h.setText(context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f7_));
            } else if (ordinal2 == 3) {
                aVar.f509497h.setText(context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f78));
            }
            if (kv2Var != null) {
                java.util.LinkedList m75941xfb821914 = kv2Var.m75941xfb821914(7);
                if (m75941xfb821914 != null) {
                    java.util.LinkedList linkedList = m75941xfb821914.isEmpty() ^ true ? m75941xfb821914 : null;
                    if (linkedList != null) {
                        java.lang.Object first = linkedList.getFirst();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "getFirst(...)");
                        n11.a.b().g(((r45.iv2) first).m75945x2fec8307(2), aVar.f509499j);
                    }
                }
                aVar.f509501l.setText(kv2Var.m75945x2fec8307(4));
                aVar.f509498i.setOnClickListener(new cv2.a(this, aVar, kv2Var));
                aVar.f509500k.setVisibility(0);
            }
        }
    }

    public final void h(uh4.a aVar, r45.kv2 kv2Var, boolean z17) {
        if (kv2Var != null) {
            java.util.LinkedList m75941xfb821914 = kv2Var.m75941xfb821914(7);
            if (m75941xfb821914 != null) {
                if (!(!m75941xfb821914.isEmpty())) {
                    m75941xfb821914 = null;
                }
                if (m75941xfb821914 != null) {
                    java.lang.Object first = m75941xfb821914.getFirst();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "getFirst(...)");
                    n11.a.b().g(((r45.iv2) first).m75945x2fec8307(2), aVar.f509499j);
                }
            }
            aVar.f509501l.setText(kv2Var.m75945x2fec8307(4));
            aVar.f509500k.setVisibility(0);
            if (z17) {
                aVar.f509498i.setOnClickListener(new cv2.b(this, aVar, kv2Var));
            }
        }
    }
}
