package ey4;

/* loaded from: classes8.dex */
public class y extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19495xb67e4e30 f339169d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19495xb67e4e30 c19495xb67e4e30, ey4.x xVar) {
        this.f339169d = c19495xb67e4e30;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f339169d.f268848g;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        ey4.z zVar;
        android.graphics.drawable.Drawable drawable = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19495xb67e4e30 c19495xb67e4e30 = this.f339169d;
        if (view == null || view.getTag() == null) {
            view = com.p314xaae8f345.mm.ui.id.b(c19495xb67e4e30.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d_1, (android.view.ViewGroup) null);
            view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, ((c19495xb67e4e30.f268846e.f339145d - i65.a.h(c19495xb67e4e30.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561410hq)) - i65.a.h(c19495xb67e4e30.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561911w9)) / c19495xb67e4e30.f268851m));
            zVar = new ey4.z(view);
            view.setTag(zVar);
        } else {
            zVar = (ey4.z) view.getTag();
        }
        int i18 = c19495xb67e4e30.f268848g;
        if (i17 == i18 - 1) {
            zVar.f339170a.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562880r0);
            zVar.f339170a.setContentDescription(c19495xb67e4e30.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bof));
        } else {
            int i19 = ((i18 - 1) * c19495xb67e4e30.f268849h) + i17;
            if (i19 > c19495xb67e4e30.f268847f - 1) {
                zVar.f339170a.setImageDrawable(null);
            } else {
                com.p314xaae8f345.mm.p2614xca6eae71.e1 e1Var = (com.p314xaae8f345.mm.p2614xca6eae71.e1) c19495xb67e4e30.f268846e.a();
                android.util.SparseArray sparseArray = e1Var.f274777d;
                if (sparseArray == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MergerSmileyManager", "getSmileyDrawable smiley panel map is null.");
                } else {
                    com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21055x16b9a563 c21055x16b9a563 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21055x16b9a563) sparseArray.get(i19);
                    if (c21055x16b9a563 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MergerSmileyManager", "getSmileyDrawable smiley info is null.");
                    } else {
                        drawable = e1Var.c(c21055x16b9a563.f67353x4b6e619a);
                    }
                }
                zVar.f339170a.setImageDrawable(drawable);
            }
        }
        return view;
    }
}
