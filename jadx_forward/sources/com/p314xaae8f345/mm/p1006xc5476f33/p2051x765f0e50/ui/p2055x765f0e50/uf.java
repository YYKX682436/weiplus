package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public class uf extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f243143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17432x38b6fe4 f243144e;

    public uf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17432x38b6fe4 activityC17432x38b6fe4, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.mf mfVar) {
        this.f243144e = activityC17432x38b6fe4;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r45.ov6 getItem(int i17) {
        if (i17 < 0 || i17 >= getCount()) {
            return null;
        }
        return (r45.ov6) this.f243143d.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f243143d;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.f243143d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tf tfVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17432x38b6fe4 activityC17432x38b6fe4 = this.f243144e;
        if (view == null) {
            view = activityC17432x38b6fe4.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cl7, (android.view.ViewGroup) null);
            tfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tf(this, null);
            view.setTag(tfVar);
        } else {
            tfVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tf) view.getTag();
        }
        tfVar.f243108a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568399mp2);
        tfVar.f243109b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568402mp5);
        tfVar.f243110c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.moz);
        android.widget.Button button = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.mou);
        tfVar.f243111d = button;
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.sf(this, i17));
        if (activityC17432x38b6fe4.f242022i) {
            tfVar.f243111d.setVisibility(0);
        } else {
            tfVar.f243111d.setVisibility(8);
        }
        if (getItem(i17) != null) {
            tfVar.f243108a.setText(getItem(i17).f464094e);
            tfVar.f243109b.setText(getItem(i17).f464098i);
            android.widget.TextView textView = tfVar.f243110c;
            java.util.LinkedList linkedList = getItem(i17).f464096g;
            activityC17432x38b6fe4.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb6.append(((r45.pv6) it.next()).f464954e);
                sb6.append(",");
            }
            if (sb6.length() > 0) {
                sb6.deleteCharAt(sb6.length() - 1);
            }
            textView.setText(sb6.toString());
        }
        return view;
    }
}
