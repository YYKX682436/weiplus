package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class w extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f72861d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f72862e;

    /* renamed from: f, reason: collision with root package name */
    public int f72863f;

    public w(android.content.Context context, int i17) {
        this.f72862e = context;
        this.f72863f = i17;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f72861d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return ((java.util.ArrayList) this.f72861d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.content.Context context = this.f72862e;
        if (view == null) {
            view = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f487870a7, viewGroup, false);
            view.setTag(new com.tencent.mm.plugin.aa.ui.v(this, view));
        }
        com.tencent.mm.plugin.aa.ui.v vVar = (com.tencent.mm.plugin.aa.ui.v) view.getTag();
        r45.p pVar = (r45.p) getItem(i17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(pVar.f382639n)) {
            vVar.f72840a.setImageResource(com.tencent.mm.R.raw.aa_record_default_icon);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(vVar.f72840a, pVar.f382639n, 0.1f);
        }
        android.widget.TextView textView = vVar.f72842c;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = pVar.f382633e;
        float textSize = vVar.f72842c.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str2 = pVar.f382639n;
        ((sg3.a) v0Var).getClass();
        java.lang.String e17 = c01.a2.e(str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(e17) || e17.endsWith("@chatroom")) {
            e17 = context.getString(com.tencent.mm.R.string.f489722v);
        }
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView2 = vVar.f72841b;
        float textSize2 = textView2.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, e17, textSize2));
        int i18 = this.f72863f;
        android.widget.TextView textView3 = vVar.f72843d;
        if (i18 == 2) {
            textView3.setText(pVar.f382640o);
        } else {
            textView3.setText(pVar.f382635g);
        }
        java.lang.String format = java.lang.String.format("%s%s", context.getString(com.tencent.mm.R.string.f489770b7), new java.math.BigDecimal(h61.o.r(pVar.f382634f)).setScale(2, 4).toString());
        android.widget.TextView textView4 = vVar.f72844e;
        textView4.setText(format);
        com.tencent.mm.ui.bk.r0(textView4.getPaint(), 0.8f);
        android.widget.TextView textView5 = vVar.f72845f;
        textView5.setVisibility(0);
        if (this.f72863f == 2) {
            int i19 = pVar.f382636h;
            if (i19 == 1) {
                textView5.setText(com.tencent.mm.R.string.f489738ab);
                textView5.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478560au));
            } else if (i19 != 2) {
                textView5.setVisibility(4);
            } else {
                textView5.setText(com.tencent.mm.R.string.a_);
                textView5.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478560au));
            }
        } else {
            int i27 = pVar.f382636h;
            if (i27 == 1) {
                textView5.setText(com.tencent.mm.R.string.f489737aa);
                textView5.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478560au));
            } else if (i27 == 2) {
                textView5.setText(com.tencent.mm.R.string.f489736a9);
                textView5.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478502m));
            } else if (i27 == 3) {
                textView5.setText(com.tencent.mm.R.string.f489734a7);
                textView5.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.Red_100));
            } else if (i27 != 4) {
                textView5.setVisibility(4);
            } else {
                textView5.setText(com.tencent.mm.R.string.f489735a8);
                textView5.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.Red_100));
            }
        }
        return view;
    }
}
