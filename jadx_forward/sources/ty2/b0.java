package ty2;

/* loaded from: classes9.dex */
public final class b0 extends ty2.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f504594d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.content.Context context, ty2.z config) {
        super(context, ty2.q.f504639f, config);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextSize(14.0f);
        textView.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        textView.setMaxLines(2);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.f504594d = textView;
    }

    @Override // ty2.b
    public android.view.View b(bw5.q5 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ty2.c cVar = this.f504593c.f504664f;
        ty2.a0 a0Var = cVar instanceof ty2.a0 ? (ty2.a0) cVar : null;
        if (a0Var == null) {
            a0Var = new ty2.a0(1, 0.0f);
        }
        android.widget.TextView textView = this.f504594d;
        if (a0Var.f504589a == 2) {
            textView.setMaxLines(2);
            textView.setMinLines(2);
        } else {
            int i17 = item.Y;
            textView.setMaxLines(i17 > 0 ? i17 : 2);
            textView.setMinLines(0);
        }
        textView.setLineSpacing(i65.a.a(this.f504591a, a0Var.f504590b), 1.0f);
        i95.m c17 = i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        java.util.LinkedList<bw5.l5> linkedList = item.V;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getIconImgs(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            java.lang.String str = "";
            if (!it.hasNext()) {
                break;
            }
            bw5.l5 l5Var = (bw5.l5) it.next();
            if (l5Var.f111175g[1]) {
                str = l5Var.f111172d;
            }
            arrayList.add(str);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        for (bw5.l5 l5Var2 : linkedList) {
            arrayList2.add(java.lang.Float.valueOf((l5Var2.f111173e * 1.0f) / l5Var2.f111174f));
        }
        java.lang.String m12792x7531c8a2 = item.m12792x7531c8a2();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).zk(textView, arrayList, arrayList2, m12792x7531c8a2 == null ? "" : m12792x7531c8a2, i65.a.b(textView.getContext(), 16), true);
        i95.m c18 = i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        s40.w0 w0Var2 = (s40.w0) c18;
        java.lang.String a17 = a();
        p3325xe03a0797.p3326xc267989b.y0 a18 = v65.m.a(textView);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        for (bw5.l5 l5Var3 : linkedList) {
            arrayList3.add(l5Var3.f111175g[1] ? l5Var3.f111172d : "");
        }
        java.lang.String m12792x7531c8a22 = item.m12792x7531c8a2();
        s40.w0.X4(w0Var2, a17, a18, textView, arrayList3, m12792x7531c8a22 == null ? "" : m12792x7531c8a22, true, false, true, true, 0, 0, null, null, 7680, null);
        return textView;
    }
}
