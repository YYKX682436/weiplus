package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes15.dex */
public class q2 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19323xcd93a211 f268300d;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19323xcd93a211 activityC19323xcd93a211) {
        this.f268300d = activityC19323xcd93a211;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19323xcd93a211 activityC19323xcd93a211 = this.f268300d;
        activityC19323xcd93a211.f265253f = i17;
        int i18 = activityC19323xcd93a211.f265257m.getItem(i17).f462426d;
        if (i18 != 0 && i18 != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19323xcd93a211 activityC19323xcd93a2112 = this.f268300d;
            activityC19323xcd93a2112.f265258n.g(view, i17, j17, activityC19323xcd93a2112, activityC19323xcd93a2112.I, activityC19323xcd93a2112.f265254g, activityC19323xcd93a2112.f265255h);
        }
        return true;
    }
}
