package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui;

/* loaded from: classes9.dex */
public class q0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13137x38066d82 f177860d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13137x38066d82 activityC13137x38066d82, com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.l0 l0Var) {
        this.f177860d = activityC13137x38066d82;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f177860d.f177812q).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return ((java.util.ArrayList) this.f177860d.f177812q).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return view == null ? (android.view.View) this.f177860d.f177810o.get(i17) : view;
    }
}
