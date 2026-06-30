package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes5.dex */
public final class m5 implements android.view.ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 f216655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f216656b;

    public m5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        this.f216655a = c15442xfd56d647;
        this.f216656b = activityC0065xcd7aa112;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public void onWindowFocusChanged(boolean z17) {
        if (z17) {
            this.f216655a.k7();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletUIC", "bulletBtnClick onWindowFocusChanged " + z17);
        }
        this.f216656b.getWindow().getDecorView().getViewTreeObserver().removeOnWindowFocusChangeListener(this);
    }
}
