package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes5.dex */
public final class a8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f155246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11447xc228938b f155247e;

    public a8(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11447xc228938b abstractActivityC11447xc228938b) {
        this.f155246d = i17;
        this.f155247e = abstractActivityC11447xc228938b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11447xc228938b abstractActivityC11447xc228938b = this.f155247e;
        android.widget.ScrollView scrollView = abstractActivityC11447xc228938b.f154966d;
        if (scrollView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scrollView");
            throw null;
        }
        int scrollY = this.f155246d - scrollView.getScrollY();
        if (scrollY > 0) {
            android.widget.ScrollView scrollView2 = abstractActivityC11447xc228938b.f154966d;
            if (scrollView2 != null) {
                scrollView2.smoothScrollBy(0, scrollY);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scrollView");
                throw null;
            }
        }
    }
}
