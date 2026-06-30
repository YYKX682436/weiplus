package jm3;

/* loaded from: classes10.dex */
public final class y implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f381897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a f381898e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f381899f;

    public y(android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activityC16653xffd2636a, android.widget.TextView textView2) {
        this.f381897d = textView;
        this.f381898e = activityC16653xffd2636a;
        this.f381899f = textView2;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        android.widget.TextView textView = this.f381897d;
        android.widget.TextView textView2 = this.f381899f;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activityC16653xffd2636a = this.f381898e;
        if (num != null && num.intValue() == 0) {
            if (textView != null) {
                textView.setTextColor(activityC16653xffd2636a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
            }
            if (textView2 != null) {
                textView2.setTextColor(activityC16653xffd2636a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a.V6(activityC16653xffd2636a);
            return;
        }
        if (textView2 != null) {
            textView2.setTextColor(activityC16653xffd2636a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        }
        if (textView != null) {
            textView.setTextColor(activityC16653xffd2636a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a.f232401u;
        activityC16653xffd2636a.getClass();
        java.util.ArrayList arrayList = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4) pf5.z.f435481a.a(activityC16653xffd2636a).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4.class)).f233024h.f233598o;
        boolean z17 = false;
        if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((gm3.c) it.next()).f355077e != 0) {
                    z17 = true;
                    break;
                }
            }
        }
        activityC16653xffd2636a.c7(z17);
    }
}
