package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f;

/* loaded from: classes11.dex */
public abstract class g extends android.widget.BaseAdapter implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f182036d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f182037e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f182038f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f182039g = new android.util.SparseArray();

    public g(android.content.Context context) {
        this.f182036d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.LinkedList) this.f182038f).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) ((java.util.LinkedList) this.f182038f).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.content.Context context = this.f182036d;
        if (view == null) {
            view = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570297ac1, null);
            view.setOnClickListener(this);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.meh);
        java.lang.String str = (java.lang.String) ((java.util.LinkedList) this.f182038f).get(i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        int textSize = (int) textView.getTextSize();
        int hashCode = str.hashCode();
        android.util.SparseArray sparseArray = this.f182039g;
        android.text.SpannableString spannableString = (android.text.SpannableString) sparseArray.get(hashCode);
        if (spannableString == null) {
            spannableString = new android.text.SpannableString(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, str, textSize));
            int indexOf = str.indexOf(this.f182037e);
            if (-1 == indexOf) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteTagSearchAdapter", "high light %s error", str);
            } else {
                int length = this.f182037e.length() + indexOf;
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq)), indexOf, length, 33);
                spannableString.setSpan(new android.text.style.StyleSpan(1), indexOf, length, 33);
                sparseArray.put(hashCode, spannableString);
            }
        }
        textView.setText(spannableString);
        return view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/adapter/FavoriteTagSearchAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String charSequence = ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.meh)).getText().toString();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d activityC13572xe5ee659d = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.g6) this).f182397h;
        activityC13572xe5ee659d.f181950g.d(charSequence, true);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.f fVar = activityC13572xe5ee659d.f181954n;
        ((java.util.HashSet) fVar.f182033g).add(charSequence);
        fVar.notifyDataSetChanged();
        activityC13572xe5ee659d.f181950g.g();
        activityC13572xe5ee659d.f181950g.f();
        activityC13572xe5ee659d.T6();
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/adapter/FavoriteTagSearchAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
