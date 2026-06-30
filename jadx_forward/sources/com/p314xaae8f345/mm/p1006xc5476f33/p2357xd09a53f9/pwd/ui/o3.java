package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class o3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f260578d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f260579e;

    public o3(android.content.Context context) {
        this.f260578d = context;
    }

    public void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUniversalPayOrderUI", "swipe: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f260579e.add(i18, (r45.pr6) this.f260579e.remove(i17));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f260579e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.List list = this.f260579e;
        if (list == null) {
            return null;
        }
        return (r45.pr6) list.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = android.view.LayoutInflater.from(this.f260578d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d6a, viewGroup, false);
            view.setTag(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.p3(view));
        }
        java.util.List list = this.f260579e;
        r45.pr6 pr6Var = list == null ? null : (r45.pr6) list.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.p3 p3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.p3) view.getTag();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = p3Var.f260589b;
        c19659x677e0913.setImageBitmap(null);
        c19659x677e0913.b(pr6Var.f464874e, 0, 0, com.p314xaae8f345.mm.R.C30861xcebc809e.f563723b84);
        p3Var.f260590c.setText(pr6Var.f464875f);
        return view;
    }
}
