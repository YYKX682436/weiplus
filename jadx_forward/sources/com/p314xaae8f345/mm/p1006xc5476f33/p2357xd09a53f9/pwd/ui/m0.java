package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class m0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f260566d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f260567e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19047xd92a1b55 f260568f;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19047xd92a1b55 activityC19047xd92a1b55, android.content.Context context) {
        this.f260568f = activityC19047xd92a1b55;
        this.f260566d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f260567e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        if (i17 < 0 || i17 > this.f260567e.size() - 1) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) this.f260567e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = null;
        android.content.Context context = this.f260566d;
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = view == null ? (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d5c, null) : (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) view;
        if (i17 >= 0 && i17 <= this.f260567e.size() - 1) {
            c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) this.f260567e.get(i17);
        }
        if (c19091x9511676c != null) {
            java.lang.String str = c19091x9511676c.f69233x225aa2b6;
            if (c19091x9511676c.f69220xb7753620 == 1) {
                str = str + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575065km4);
            }
            viewOnFocusChangeListenerC22907xe18534c2.m83213x765074af(str);
        }
        viewOnFocusChangeListenerC22907xe18534c2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.l0(this, c19091x9511676c));
        return viewOnFocusChangeListenerC22907xe18534c2;
    }
}
