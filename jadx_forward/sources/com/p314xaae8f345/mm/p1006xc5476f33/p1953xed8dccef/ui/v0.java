package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class v0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f234894d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f234895e;

    public v0(android.content.Context context) {
        this.f234894d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f234895e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (wq3.u) this.f234895e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.x0 x0Var;
        wq3.u uVar = (wq3.u) this.f234895e.get(i17);
        if (view == null || view.getTag() == null) {
            x0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.x0();
            view = android.view.View.inflate(this.f234894d, com.p314xaae8f345.mm.R.C30864xbddafb2a.cak, null);
            x0Var.f234906e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ja7);
            x0Var.f234905d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ja6);
            view.setTag(x0Var);
        } else {
            x0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.x0) view.getTag();
        }
        x0Var.f234907f = uVar;
        x0Var.f234906e.setText(uVar.f530139a);
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.o(uVar.f530140b);
        ((x60.e) fVar).getClass();
        x0Var.f234905d.setImageBitmap(x51.w0.d(oVar));
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(x0Var);
        return view;
    }
}
