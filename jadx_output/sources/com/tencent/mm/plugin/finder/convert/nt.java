package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class nt implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104124a;

    public nt(in5.s0 s0Var) {
        this.f104124a = s0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        android.content.Intent intent;
        in5.s0 s0Var = this.f104124a;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.util.Map l17 = kz5.c1.l(new jz5.l("finder_usnername", ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).getUsername()));
        android.content.Context context2 = s0Var.f293121e;
        android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        long longExtra = (activity == null || (intent = activity.getIntent()) == null) ? 0L : intent.getLongExtra("finder_from_feed_id", 0L);
        if (longExtra != 0) {
            l17.put("source_feedid", pm0.v.u(longExtra));
        }
        return l17;
    }
}
