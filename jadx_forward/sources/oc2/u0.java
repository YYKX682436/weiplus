package oc2;

/* loaded from: classes4.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f425813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b f425814e;

    public u0(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b c13738xbdff117b) {
        this.f425813d = list;
        this.f425814e = c13738xbdff117b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = this.f425813d.iterator();
        while (it.hasNext()) {
            this.f425814e.addView((android.view.View) it.next());
        }
    }
}
