package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public class s6 implements w82.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d f182969a;

    public s6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d activityC13572xe5ee659d) {
        this.f182969a = activityC13572xe5ee659d;
    }

    @Override // w82.m0
    public void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d activityC13572xe5ee659d = this.f182969a;
        if (activityC13572xe5ee659d.f181950g.m79122xe175c322().contains(str2)) {
            activityC13572xe5ee659d.f181950g.p(str);
            return;
        }
        for (int i17 = 0; i17 < activityC13572xe5ee659d.f181950g.getChildCount(); i17++) {
            android.view.View childAt = activityC13572xe5ee659d.f181950g.getChildAt(i17);
            if (childAt.getClass() == android.widget.TextView.class) {
                android.widget.TextView textView = (android.widget.TextView) childAt;
                if (textView.getText().toString().equals(str)) {
                    textView.setText(str2);
                    childAt.invalidate();
                }
            }
        }
        activityC13572xe5ee659d.f181950g.v(str, str2);
    }

    @Override // w82.m0
    public void b(java.lang.String str) {
        this.f182969a.f181950g.p(str);
    }
}
