package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class nt implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185657a;

    public nt(in5.s0 s0Var) {
        this.f185657a = s0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        android.content.Intent intent;
        in5.s0 s0Var = this.f185657a;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.util.Map l17 = kz5.c1.l(new jz5.l("finder_usnername", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).m58743x6c03c64c()));
        android.content.Context context2 = s0Var.f374654e;
        android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        long longExtra = (activity == null || (intent = activity.getIntent()) == null) ? 0L : intent.getLongExtra("finder_from_feed_id", 0L);
        if (longExtra != 0) {
            l17.put("source_feedid", pm0.v.u(longExtra));
        }
        return l17;
    }
}
