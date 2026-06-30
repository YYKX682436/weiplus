package com.tencent.mm.plugin.fav.ui.adapter;

/* loaded from: classes11.dex */
public abstract class g extends android.widget.BaseAdapter implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f100503d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f100504e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f100505f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f100506g = new android.util.SparseArray();

    public g(android.content.Context context) {
        this.f100503d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.LinkedList) this.f100505f).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) ((java.util.LinkedList) this.f100505f).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.content.Context context = this.f100503d;
        if (view == null) {
            view = android.view.View.inflate(context, com.tencent.mm.R.layout.f488764ac1, null);
            view.setOnClickListener(this);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.meh);
        java.lang.String str = (java.lang.String) ((java.util.LinkedList) this.f100505f).get(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        int textSize = (int) textView.getTextSize();
        int hashCode = str.hashCode();
        android.util.SparseArray sparseArray = this.f100506g;
        android.text.SpannableString spannableString = (android.text.SpannableString) sparseArray.get(hashCode);
        if (spannableString == null) {
            spannableString = new android.text.SpannableString(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, str, textSize));
            int indexOf = str.indexOf(this.f100504e);
            if (-1 == indexOf) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteTagSearchAdapter", "high light %s error", str);
            } else {
                int length = this.f100504e.length() + indexOf;
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.aaq)), indexOf, length, 33);
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
        java.lang.String charSequence = ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.meh)).getText().toString();
        com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI = ((com.tencent.mm.plugin.fav.ui.g6) this).f100864h;
        favTagEditUI.f100417g.d(charSequence, true);
        com.tencent.mm.plugin.fav.ui.adapter.f fVar = favTagEditUI.f100421n;
        ((java.util.HashSet) fVar.f100500g).add(charSequence);
        fVar.notifyDataSetChanged();
        favTagEditUI.f100417g.g();
        favTagEditUI.f100417g.f();
        favTagEditUI.T6();
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/adapter/FavoriteTagSearchAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
