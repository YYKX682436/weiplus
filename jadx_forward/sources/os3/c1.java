package os3;

/* loaded from: classes8.dex */
public class c1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public os3.a1 f429583d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f429584e = null;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16932x23233efa f429585f;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16932x23233efa activityC16932x23233efa, os3.u0 u0Var) {
        this.f429585f = activityC16932x23233efa;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public os3.a1 getItem(int i17) {
        java.util.List list = this.f429584e;
        if (list == null || list.size() <= i17) {
            return null;
        }
        return (os3.a1) this.f429584e.get(i17);
    }

    public java.lang.String c() {
        java.lang.String str;
        os3.a1 a1Var = this.f429583d;
        if (a1Var != null && (str = a1Var.f429561c) != null) {
            if (str.length() == 0) {
                return "";
            }
            os3.a1 a1Var2 = this.f429583d;
            int indexOf = a1Var2.f429559a.indexOf(a1Var2.f429561c);
            if (indexOf >= 0) {
                return this.f429583d.f429559a.substring(0, indexOf) + this.f429583d.f429561c;
            }
        }
        return null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f429584e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = android.view.View.inflate(this.f429585f.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bvi, null);
            os3.b1 b1Var = new os3.b1(this, null);
            b1Var.f429570a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f565910e26);
            b1Var.f429571b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.e2b);
            b1Var.f429572c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.e2g);
            b1Var.f429573d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.e2h);
            view.setTag(b1Var);
        }
        os3.b1 b1Var2 = (os3.b1) view.getTag();
        os3.a1 item = getItem(i17);
        if (i17 != 0 || c() == null) {
            b1Var2.f429570a.setImageResource(item.f429562d == 1 ? com.p314xaae8f345.mm.R.C30861xcebc809e.blm : o25.y.b(item.f429560b));
        } else {
            b1Var2.f429570a.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bll);
        }
        b1Var2.f429573d.setVisibility(item.f429564f ? 0 : 4);
        b1Var2.f429571b.setText(item.f429560b);
        b1Var2.f429572c.setText(item.f429563e);
        return view;
    }
}
