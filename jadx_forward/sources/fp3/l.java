package fp3;

/* loaded from: classes9.dex */
public class l extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16777xd3921e27 f346847d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16777xd3921e27 activityC16777xd3921e27, fp3.k kVar) {
        this.f346847d = activityC16777xd3921e27;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f346847d.f234382f).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49) ((java.util.ArrayList) this.f346847d.f234382f).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        fp3.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16777xd3921e27 activityC16777xd3921e27 = this.f346847d;
        if (view == null) {
            view = android.view.View.inflate(activityC16777xd3921e27, com.p314xaae8f345.mm.R.C30864xbddafb2a.bws, null);
            nVar = new fp3.n(activityC16777xd3921e27, null);
            nVar.f346850d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.hj7);
            nVar.f346852f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.hj6);
            nVar.f346853g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f566923hj3);
            nVar.f346854h = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.hj8);
            nVar.f346855i = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f566924hj4);
            nVar.f346856m = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.hj9);
            view.setTag(nVar);
        } else {
            nVar = (fp3.n) view.getTag();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49 c16775xba5fef49 = (com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49) ((java.util.ArrayList) activityC16777xd3921e27.f234382f).get(i17);
        java.lang.String str = c16775xba5fef49.f234342d;
        nVar.f346851e = str;
        if (android.text.TextUtils.isEmpty(str) || !com.p314xaae8f345.mm.p2802xd031a825.ui.r1.Q(nVar.f346851e)) {
            nVar.f346850d.setImageResource(com.p314xaae8f345.mm.R.raw.f80576xece6d55b);
        } else {
            y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
            hp3.c cVar = new hp3.c(nVar.f346851e);
            ((x60.e) fVar).getClass();
            nVar.f346850d.setImageBitmap(x51.w0.d(cVar));
        }
        nVar.f346852f.setText(c16775xba5fef49.f234343e);
        nVar.f346853g.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49.Skus.a(c16775xba5fef49.f234344f));
        nVar.f346854h.setText(c16775xba5fef49.f234346h);
        nVar.f346855i.setText("+" + c16775xba5fef49.f234345g);
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(nVar);
        nVar.f346856m.setVisibility(8);
        return view;
    }
}
