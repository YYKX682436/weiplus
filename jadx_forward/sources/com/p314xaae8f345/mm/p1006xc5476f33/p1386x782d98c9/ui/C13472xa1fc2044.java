package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView */
/* loaded from: classes12.dex */
public class C13472xa1fc2044 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f180830d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f180831e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 f180832f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u3 f180833g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f180834h;

    public C13472xa1fc2044(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a_1, (android.view.ViewGroup) this, true);
        this.f180831e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.l88);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 c21500x7be515c9 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9) inflate.findViewById(com.p314xaae8f345.mm.R.id.l87);
        this.f180832f = c21500x7be515c9;
        c21500x7be515c9.m79008x3ea112a6(true);
        int b17 = i65.a.b(context, 44);
        this.f180832f.m79011x15066afe(true);
        this.f180832f.m79010xdbabe831(b17);
        this.f180832f.m79008x3ea112a6(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u3 u3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u3(this, null);
        this.f180833g = u3Var;
        this.f180832f.setAdapter((android.widget.ListAdapter) u3Var);
        this.f180832f.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.p3(this, context));
        this.f180831e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.q3(this));
        setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.r3(this));
        setVisibility(8);
    }

    /* renamed from: setAffectedUserInfo */
    public void m55084x5a92862f(java.util.ArrayList<java.lang.String> arrayList) {
        this.f180834h = arrayList;
        if (arrayList == null || arrayList.size() == 0) {
            this.f180831e.setText("");
            setVisibility(8);
        } else {
            setVisibility(0);
            this.f180831e.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c4_, java.lang.Integer.valueOf(this.f180834h.size())));
            this.f180833g.notifyDataSetChanged();
        }
    }

    /* renamed from: setUsername */
    public void m55085x66bc2758(java.lang.String str) {
        this.f180830d = str;
    }
}
