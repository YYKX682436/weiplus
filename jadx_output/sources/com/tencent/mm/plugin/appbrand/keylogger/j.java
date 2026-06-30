package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public class j extends android.widget.BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f84157f = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS);

    /* renamed from: d, reason: collision with root package name */
    public final android.view.LayoutInflater f84158d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f84159e;

    public j(android.content.Context context) {
        this.f84158d = android.view.LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f84159e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (kg1.c) this.f84159e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.appbrand.keylogger.k kVar;
        if (view == null) {
            view = this.f84158d.inflate(com.tencent.mm.R.layout.d3v, viewGroup, false);
            kVar = new com.tencent.mm.plugin.appbrand.keylogger.k();
            kVar.f84160a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cql);
            view.setTag(kVar);
        } else {
            kVar = (com.tencent.mm.plugin.appbrand.keylogger.k) view.getTag();
        }
        java.lang.String str = null;
        if (((kg1.c) this.f84159e.get(i17)).f307691a.isEmpty()) {
            kVar.f84160a.setText((java.lang.CharSequence) null);
        } else {
            com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo iKeyStepAnalyser$StepLogInfo = (com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo) ((kg1.c) this.f84159e.get(i17)).f307691a.get(0);
            if (iKeyStepAnalyser$StepLogInfo != null) {
                str = f84157f.format(java.lang.Long.valueOf(iKeyStepAnalyser$StepLogInfo.f84132d));
            }
        }
        kVar.f84160a.setText(str);
        return view;
    }
}
