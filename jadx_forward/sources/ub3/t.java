package ub3;

/* loaded from: classes15.dex */
public class t extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 f507671d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a404, ub3.j jVar) {
        this.f507671d = activityC16330x45b4a404;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f507671d.f226616t).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) ((java.util.ArrayList) this.f507671d.f226616t).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        ub3.s sVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a404 = this.f507671d;
        if (view == null) {
            view = android.view.LayoutInflater.from(activityC16330x45b4a404).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.buh, (android.view.ViewGroup) null);
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.j1u);
            android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.j1n);
            sVar = new ub3.s(this);
            sVar.f507668a = imageView;
            sVar.f507669b = imageView2;
            view.setTag(sVar);
        } else {
            sVar = (ub3.s) view.getTag();
        }
        java.lang.String str = (java.lang.String) ((java.util.HashMap) activityC16330x45b4a404.f226617u).get((java.lang.String) ((java.util.ArrayList) activityC16330x45b4a404.f226616t).get(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.b(sVar.f507668a, null, str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16330x45b4a404.L) || !activityC16330x45b4a404.L.equals(str)) {
            sVar.f507669b.setVisibility(4);
        } else {
            sVar.f507669b.setVisibility(0);
        }
        return view;
    }
}
