package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes12.dex */
public class f extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f289036o;

    /* renamed from: p, reason: collision with root package name */
    public p35.b f289037p;

    public f(android.content.Context context) {
        super(context, null);
        this.f289036o = new java.util.ArrayList();
        this.f289037p = null;
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public /* bridge */ /* synthetic */ java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.z9, android.widget.Adapter
    public int getCount() {
        return this.f289036o.size();
    }

    @Override // com.p314xaae8f345.mm.ui.z9, android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.g) this.f289036o.get(i17);
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.h hVar;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.g gVar = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.g) this.f289036o.get(i17);
        if (view == null) {
            view = android.view.View.inflate(this.f294141e, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569524dh, null);
            hVar = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.h();
            hVar.f289042a = view;
            hVar.f289043b = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.f564159jo);
            view.setTag(hVar);
        } else {
            hVar = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.h) view.getTag();
        }
        if (gVar.a(hVar) != 0) {
            return null;
        }
        return view;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        java.util.ArrayList arrayList = this.f289036o;
        arrayList.clear();
        p35.b bVar = this.f289037p;
        if (bVar == null) {
            return;
        }
        arrayList.add(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.g(bVar));
        notifyDataSetChanged();
    }
}
