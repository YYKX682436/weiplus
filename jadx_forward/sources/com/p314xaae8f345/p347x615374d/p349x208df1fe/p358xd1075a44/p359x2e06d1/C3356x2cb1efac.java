package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMListViewAdapter */
/* loaded from: classes15.dex */
public class C3356x2cb1efac extends android.widget.BaseAdapter {
    private static final java.lang.String TAG = "MicroMsg.MMListViewAdapter";

    /* renamed from: mContext */
    private android.content.Context f13252xd6cfe882;

    /* renamed from: mListViewCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3478xebeba033 f13253xa27b1c55;

    public C3356x2cb1efac(android.content.Context context, com.p314xaae8f345.p347x615374d.gen.AbstractC3478xebeba033 abstractC3478xebeba033) {
        this.f13252xd6cfe882 = context;
        this.f13253xa27b1c55 = abstractC3478xebeba033;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f13253xa27b1c55.mo28024x7444f759();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return this.f13253xa27b1c55.mo28025xc321a0f5(i17);
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getView %s %s", java.lang.Integer.valueOf(i17), view);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3355xa7b1bf3a c3355xa7b1bf3a = view != null ? (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3355xa7b1bf3a) view.getTag() : null;
        com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 mo28023xd483dfcd = this.f13253xa27b1c55.mo28023xd483dfcd(i17, c3355xa7b1bf3a != null ? c3355xa7b1bf3a : null);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0 c3352x70ee8bf0 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0) mo28023xd483dfcd;
        c3352x70ee8bf0.mo27110xfb86a31b().setTag(mo28023xd483dfcd);
        return c3352x70ee8bf0.mo27110xfb86a31b();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return this.f13253xa27b1c55.mo28026xb6da111a();
    }
}
