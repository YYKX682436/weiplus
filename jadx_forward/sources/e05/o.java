package e05;

/* loaded from: classes9.dex */
public class o extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ViewOnClickListenerC19553xcfaf7ef f327719d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ViewOnClickListenerC19553xcfaf7ef viewOnClickListenerC19553xcfaf7ef) {
        this.f327719d = viewOnClickListenerC19553xcfaf7ef;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f327719d.f270058e;
        if (list != null) {
            return ((java.util.ArrayList) list).size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (d05.l) ((java.util.ArrayList) this.f327719d.f270058e).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ViewOnClickListenerC19553xcfaf7ef viewOnClickListenerC19553xcfaf7ef = this.f327719d;
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) android.view.View.inflate(viewOnClickListenerC19553xcfaf7ef, com.p314xaae8f345.mm.R.C30864xbddafb2a.f571158d70, null);
        d05.l lVar = (d05.l) ((java.util.ArrayList) viewOnClickListenerC19553xcfaf7ef.f270058e).get(i17);
        checkedTextView.setText(lVar.f307146e);
        checkedTextView.setChecked(lVar.f307142a != 0);
        return checkedTextView;
    }
}
