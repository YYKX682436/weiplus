package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class ExdeviceProfileAffectedUserView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f99297d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f99298e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMHorList f99299f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.ui.u3 f99300g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f99301h;

    public ExdeviceProfileAffectedUserView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a_1, (android.view.ViewGroup) this, true);
        this.f99298e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.l88);
        com.tencent.mm.ui.base.MMHorList mMHorList = (com.tencent.mm.ui.base.MMHorList) inflate.findViewById(com.tencent.mm.R.id.l87);
        this.f99299f = mMHorList;
        mMHorList.setCenterInParent(true);
        int b17 = i65.a.b(context, 44);
        this.f99299f.setOverScrollEnabled(true);
        this.f99299f.setItemWidth(b17);
        this.f99299f.setCenterInParent(true);
        com.tencent.mm.plugin.exdevice.ui.u3 u3Var = new com.tencent.mm.plugin.exdevice.ui.u3(this, null);
        this.f99300g = u3Var;
        this.f99299f.setAdapter((android.widget.ListAdapter) u3Var);
        this.f99299f.setOnItemClickListener(new com.tencent.mm.plugin.exdevice.ui.p3(this, context));
        this.f99298e.setOnClickListener(new com.tencent.mm.plugin.exdevice.ui.q3(this));
        setOnClickListener(new com.tencent.mm.plugin.exdevice.ui.r3(this));
        setVisibility(8);
    }

    public void setAffectedUserInfo(java.util.ArrayList<java.lang.String> arrayList) {
        this.f99301h = arrayList;
        if (arrayList == null || arrayList.size() == 0) {
            this.f99298e.setText("");
            setVisibility(8);
        } else {
            setVisibility(0);
            this.f99298e.setText(getResources().getString(com.tencent.mm.R.string.c4_, java.lang.Integer.valueOf(this.f99301h.size())));
            this.f99300g.notifyDataSetChanged();
        }
    }

    public void setUsername(java.lang.String str) {
        this.f99297d = str;
    }
}
