package e05;

/* loaded from: classes9.dex */
public class e extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ViewOnClickListenerC19553xcfaf7ef f327709d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ViewOnClickListenerC19553xcfaf7ef viewOnClickListenerC19553xcfaf7ef) {
        this.f327709d = viewOnClickListenerC19553xcfaf7ef;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 2;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (d05.l) ((java.util.ArrayList) this.f327709d.f270058e).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ViewOnClickListenerC19553xcfaf7ef viewOnClickListenerC19553xcfaf7ef = this.f327709d;
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) android.view.View.inflate(viewOnClickListenerC19553xcfaf7ef, com.p314xaae8f345.mm.R.C30864xbddafb2a.f571158d70, null);
        if (i17 == 0) {
            checkedTextView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572141zu);
        } else {
            checkedTextView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572036wx);
        }
        if (viewOnClickListenerC19553xcfaf7ef.f270063m) {
            d05.l lVar = viewOnClickListenerC19553xcfaf7ef.f270059f;
            if (lVar.f307149h == null || !"Y".equals(lVar.f307144c)) {
                checkedTextView.setChecked(i17 != 0);
            } else {
                checkedTextView.setChecked(i17 == 0);
            }
        } else {
            d05.l lVar2 = viewOnClickListenerC19553xcfaf7ef.f270060g;
            if (lVar2.f307149h == null || !"Y".equals(lVar2.f307144c)) {
                checkedTextView.setChecked(i17 != 0);
            } else {
                checkedTextView.setChecked(i17 == 0);
            }
        }
        return checkedTextView;
    }
}
