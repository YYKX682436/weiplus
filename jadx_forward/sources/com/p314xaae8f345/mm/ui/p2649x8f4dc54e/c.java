package com.p314xaae8f345.mm.ui.p2649x8f4dc54e;

/* loaded from: classes11.dex */
public class c implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b f279575d;

    public c(com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b activityC21598xfb43db0b) {
        this.f279575d = activityC21598xfb43db0b;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b activityC21598xfb43db0b = this.f279575d;
        activityC21598xfb43db0b.f279556g = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) activityC21598xfb43db0b.f279555f.getItem(i17);
        activityC21598xfb43db0b.f279561o = activityC21598xfb43db0b.f279556g.h1();
        com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b activityC21598xfb43db0b2 = this.f279575d;
        activityC21598xfb43db0b2.f279557h.g(view, i17, j17, activityC21598xfb43db0b2, activityC21598xfb43db0b2.f279568v, activityC21598xfb43db0b2.f279563q, activityC21598xfb43db0b2.f279564r);
        return true;
    }
}
