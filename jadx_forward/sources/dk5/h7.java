package dk5;

/* loaded from: classes12.dex */
public class h7 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final dk5.g7[] f316194d = {new dk5.g7(this, com.p314xaae8f345.mm.R.C30867xcad56011.bmb, com.p314xaae8f345.mm.R.raw.f81038x49c4ee16), new dk5.g7(this, com.p314xaae8f345.mm.R.C30867xcad56011.bmc, com.p314xaae8f345.mm.R.raw.f79136xc2a3e77f), new dk5.g7(this, com.p314xaae8f345.mm.R.C30867xcad56011.bma, com.p314xaae8f345.mm.R.raw.f80653xaabdd0e5)};

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22574x21ac54af f316195e;

    public h7(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22574x21ac54af activityC22574x21ac54af) {
        this.f316195e = activityC22574x21ac54af;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 3;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f316194d[i17];
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        dk5.i7 i7Var;
        if (view == null || view.getTag() == null) {
            com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22574x21ac54af activityC22574x21ac54af = this.f316195e;
            android.view.View inflate = android.view.LayoutInflater.from(activityC22574x21ac54af.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570994cn4, (android.view.ViewGroup) null);
            dk5.i7 i7Var2 = new dk5.i7(activityC22574x21ac54af, inflate);
            view = inflate;
            i7Var = i7Var2;
        } else {
            i7Var = (dk5.i7) view.getTag();
        }
        dk5.g7 g7Var = this.f316194d[i17];
        if (g7Var != null) {
            i7Var.f316214b.setText(g7Var.f316176a);
            i7Var.f316213a.setImageResource(g7Var.f316177b);
        }
        return view;
    }
}
