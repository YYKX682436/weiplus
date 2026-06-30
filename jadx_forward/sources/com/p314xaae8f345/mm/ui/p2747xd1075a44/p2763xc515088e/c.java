package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes15.dex */
public class c implements v51.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 f293778a;

    public c(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f613) {
        this.f293778a = c22705x7e16f613;
    }

    @Override // v51.f
    public void a(java.util.Date date) {
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613.f293724y;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f613 = this.f293778a;
        c22705x7e16f613.getClass();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        c22705x7e16f613.f293730i = calendar.get(1);
        c22705x7e16f613.f293731m = calendar.get(2) + 1;
        c22705x7e16f613.f293732n = calendar.get(5);
        com.p314xaae8f345.mm.ui.yk.c("pvTime", "onTimeSelect", new java.lang.Object[0]);
        v51.f fVar = c22705x7e16f613.f293742x;
        if (fVar != null) {
            fVar.a(date);
        }
    }
}
