package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes13.dex */
public class q1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f225996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16255xf01eb285 f225997e;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16255xf01eb285 activityC16255xf01eb285, android.content.Context context) {
        android.os.Bundle bundle;
        this.f225997e = activityC16255xf01eb285;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().getClass();
        java.util.ArrayList arrayList = null;
        try {
            bundle = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.q.a("getLiteAppBaselibList", null, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "getLiteAppBaselibList bundle is null.");
        } else {
            bundle.setClassLoader(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef.class.getClassLoader());
            if (bundle.containsKey(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef.f14320x106b22d7)) {
                arrayList = bundle.getParcelableArrayList(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef.f14320x106b22d7);
            }
        }
        this.f225996d = arrayList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f225996d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.List list = this.f225996d;
        if (list == null || list.size() <= i17) {
            return null;
        }
        return (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef) list.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.r1 r1Var;
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef c3710x879b31ef = (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef) this.f225996d.get(i17);
        if (view == null || view.getTag() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16255xf01eb285 activityC16255xf01eb285 = this.f225997e;
            android.view.View inflate = android.view.LayoutInflater.from(activityC16255xf01eb285.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bpy, (android.view.ViewGroup) null, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.r1 r1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.r1(activityC16255xf01eb285, inflate);
            inflate.setTag(r1Var2);
            view = inflate;
            r1Var = r1Var2;
        } else {
            r1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.r1) view.getTag();
        }
        r1Var.f226004a.setText("基础库 大版本号：" + c3710x879b31ef.f14328xdbd3ccdf);
        r1Var.f226005b.setText("");
        return view;
    }
}
