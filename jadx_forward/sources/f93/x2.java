package f93;

/* loaded from: classes9.dex */
public class x2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f342036d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f342037e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f342038f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f342039g = new android.util.SparseArray();

    public x2(android.content.Context context) {
        this.f342036d = context;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.String getItem(int i17) {
        if (this.f342038f == null || i17 >= getCount()) {
            return null;
        }
        return (java.lang.String) this.f342038f.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList = this.f342038f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        f93.d5 d5Var;
        android.content.Context context = this.f342036d;
        if (view == null || view.getTag() == null) {
            view = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a2c, viewGroup, false);
            d5Var = new f93.d5(view);
            view.setTag(d5Var);
        } else {
            d5Var = (f93.d5) view.getTag();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab56332 = d5Var.f341846d;
        java.lang.String item = getItem(i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (item == null) {
            item = "";
        }
        int textSize = (int) d5Var.f341846d.getTextSize();
        int hashCode = item.hashCode();
        android.util.SparseArray sparseArray = this.f342039g;
        android.text.SpannableString spannableString = (android.text.SpannableString) sparseArray.get(hashCode);
        if (spannableString == null) {
            spannableString = new android.text.SpannableString(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, item, textSize));
            int indexOf = item.indexOf(this.f342037e);
            if (indexOf == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelSearchAdapter", "hight light %s error.", item);
            } else {
                int length = this.f342037e.length() + indexOf;
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq)), indexOf, length, 33);
                spannableString.setSpan(new android.text.style.StyleSpan(1), indexOf, length, 33);
                sparseArray.put(hashCode, spannableString);
            }
        }
        c22632xdab56332.setText(spannableString);
        return view;
    }
}
