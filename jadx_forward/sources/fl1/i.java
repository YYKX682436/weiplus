package fl1;

/* loaded from: classes7.dex */
public final class i extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f345320d;

    public i(java.util.ArrayList arrayList) {
        this.f345320d = arrayList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList = this.f345320d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (fl1.j) this.f345320d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        fl1.h hVar;
        java.util.ArrayList arrayList = this.f345320d;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        fl1.j jVar = (fl1.j) arrayList.get(i17);
        if (view == null) {
            hVar = new fl1.h(null);
            view2 = android.view.View.inflate(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569695iv, null);
            hVar.f345309a = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.f564614w2);
            hVar.f345310b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f564612w0);
            view2.setTag(hVar);
        } else {
            view2 = view;
            hVar = (fl1.h) view.getTag();
        }
        int i18 = jVar.f345327b;
        if (i18 == 1) {
            hVar.f345309a.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c8r);
        } else if (i18 == 3) {
            hVar.f345309a.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c8q);
        } else {
            hVar.f345309a.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c8p);
        }
        hVar.f345310b.setText(jVar.f345328c);
        android.widget.ImageView imageView = hVar.f345309a;
        imageView.setOnClickListener(new fl1.g(this, jVar, imageView));
        return view2;
    }
}
