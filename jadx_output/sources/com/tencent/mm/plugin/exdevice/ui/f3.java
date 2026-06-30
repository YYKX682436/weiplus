package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class f3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI f99454d;

    public f3(com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI exdeviceLikeUI) {
        this.f99454d = exdeviceLikeUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList = this.f99454d.f99283d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f99454d.f99283d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.exdevice.ui.e3 e3Var;
        android.widget.TextView textView;
        com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI exdeviceLikeUI = this.f99454d;
        r32.e eVar = (r32.e) exdeviceLikeUI.f99283d.get(i17);
        if (view == null) {
            view = exdeviceLikeUI.f99285f ? android.view.LayoutInflater.from(exdeviceLikeUI).inflate(com.tencent.mm.R.layout.a9v, viewGroup, false) : android.view.LayoutInflater.from(exdeviceLikeUI).inflate(com.tencent.mm.R.layout.a9u, viewGroup, false);
            e3Var = new com.tencent.mm.plugin.exdevice.ui.e3(this);
            e3Var.f99440a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.diu);
            e3Var.f99441b = (com.tencent.mm.ui.base.NoMeasuredTextView) view.findViewById(com.tencent.mm.R.id.djl);
            e3Var.f99442c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.djf);
            e3Var.f99443d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dje);
            e3Var.f99441b.i(0, exdeviceLikeUI.getResources().getDimension(com.tencent.mm.R.dimen.f479897ia));
            e3Var.f99441b.setTextColor(exdeviceLikeUI.getResources().getColor(com.tencent.mm.R.color.a0c));
            e3Var.f99441b.setSingleLine(true);
            e3Var.f99441b.setShouldEllipsize(true);
            view.setTag(e3Var);
        } else {
            e3Var = (com.tencent.mm.plugin.exdevice.ui.e3) view.getTag();
        }
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        android.widget.ImageView imageView = e3Var.f99440a;
        java.lang.String str = eVar.field_username;
        ((com.tencent.mm.feature.avatar.w) zVar).getClass();
        com.tencent.mm.pluginsdk.ui.u.b(imageView, str, 0.5f, true);
        com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView = e3Var.f99441b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str2 = eVar.field_username;
        ((sg3.a) v0Var).getClass();
        java.lang.String e17 = c01.a2.e(str2);
        float textSize = e3Var.f99441b.getTextSize();
        ((ke0.e) xVar).getClass();
        noMeasuredTextView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(exdeviceLikeUI, e17, textSize));
        if (com.tencent.mm.sdk.platformtools.t8.K0(eVar.field_liketips) || (textView = e3Var.f99442c) == null) {
            android.widget.TextView textView2 = e3Var.f99442c;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else {
            textView.setVisibility(0);
            e3Var.f99442c.setText(eVar.field_liketips);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        long j17 = eVar.field_timestamp;
        int i18 = (int) (((currentTimeMillis - j17) / 60) + 1);
        if (i18 <= 30) {
            e3Var.f99443d.setText(exdeviceLikeUI.getString(com.tencent.mm.R.string.c3p, java.lang.Integer.valueOf(i18)));
        } else {
            e3Var.f99443d.setText(k35.m1.f(exdeviceLikeUI, j17 * 1000, true, false));
        }
        return view;
    }
}
