package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class h extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16355x97a04787 f228507d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16355x97a04787 c16355x97a04787, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.f fVar) {
        this.f228507d = c16355x97a04787;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 2147483646;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return java.lang.Integer.valueOf(i17 % 10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.g gVar;
        if (view == null || view.getTag() == null) {
            view = android.view.LayoutInflater.from(this.f228507d.f227481d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bty, (android.view.ViewGroup) null);
            gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.g(this);
            gVar.f228454a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.o4m);
            view.setTag(gVar);
        } else {
            gVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.g) view.getTag();
        }
        gVar.f228454a.setImageResource(((java.lang.Integer) com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16355x97a04787.f227480m.get(i17 % 10)).intValue());
        return view;
    }
}
