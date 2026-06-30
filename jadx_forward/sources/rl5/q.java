package rl5;

/* loaded from: classes15.dex */
public class q extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rl5.r f478864d;

    public q(rl5.r rVar, rl5.e eVar) {
        this.f478864d = rVar;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f478864d.f478889z.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) ((android.view.MenuItem) ((java.util.ArrayList) this.f478864d.f478889z.f309877d).get(i17)).getTitle();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        rl5.p pVar;
        rl5.r rVar = this.f478864d;
        boolean z17 = rVar.F;
        android.view.LayoutInflater layoutInflater = rVar.f478870e;
        android.widget.TextView textView = null;
        if (z17) {
            if (view == null) {
                view = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c_9, viewGroup, false);
                pVar = new rl5.p(this, null);
                pVar.f478862a = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.h5n);
                pVar.f478863b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc);
                view.setTag(pVar);
            } else {
                pVar = (rl5.p) view.getTag();
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = pVar.f478862a;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageDrawable(((android.view.MenuItem) ((java.util.ArrayList) rVar.f478889z.f309877d).get(i17)).getIcon());
            }
            android.widget.TextView textView2 = pVar.f478863b;
            if (textView2 != null) {
                textView2.setText(((android.view.MenuItem) ((java.util.ArrayList) rVar.f478889z.f309877d).get(i17)).getTitle());
            }
            return view;
        }
        if (view == null) {
            textView = (android.widget.TextView) layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c_a, viewGroup, false);
        } else if (view instanceof android.widget.TextView) {
            textView = (android.widget.TextView) view;
        }
        java.lang.String str = (java.lang.String) ((android.view.MenuItem) ((java.util.ArrayList) rVar.f478889z.f309877d).get(i17)).getTitle();
        if (textView != null) {
            textView.setTag(str);
            textView.setText(str);
            textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.auo);
        }
        if (rVar.U && rVar.T != 0) {
            textView.setTextColor(rVar.f478869d.getResources().getColor(rVar.T));
        }
        db5.r4 r4Var = rVar.f478885v;
        if (r4Var != null) {
            r4Var.a(textView, i17, (android.view.MenuItem) ((java.util.ArrayList) rVar.f478889z.f309877d).get(i17));
        }
        return textView;
    }
}
