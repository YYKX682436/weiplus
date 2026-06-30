package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes12.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13052x7242bfaf f176509d;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13052x7242bfaf activityC13052x7242bfaf) {
        this.f176509d = activityC13052x7242bfaf;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13052x7242bfaf activityC13052x7242bfaf = this.f176509d;
        android.widget.ProgressBar progressBar = activityC13052x7242bfaf.f176384p;
        if (progressBar != null && progressBar.getVisibility() != 8) {
            activityC13052x7242bfaf.f176384p.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda c22626x3e1b8dda = activityC13052x7242bfaf.f176385q;
        if (c22626x3e1b8dda == null || c22626x3e1b8dda.getVisibility() == 8) {
            return;
        }
        activityC13052x7242bfaf.f176385q.setVisibility(8);
    }
}
