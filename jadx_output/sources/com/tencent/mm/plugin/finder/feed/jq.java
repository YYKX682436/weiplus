package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class jq extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f107128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(android.app.Activity activity) {
        super(2);
        this.f107128d = activity;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.mi2 req = (r45.mi2) obj;
        r45.ix0 ret = (r45.ix0) obj2;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        android.app.Activity activity = this.f107128d;
        db5.t7.f(activity, activity.getString(com.tencent.mm.R.string.cn7), com.tencent.mm.plugin.finder.feed.iq.f107048a);
        cu2.u.f222441a.m(kz5.p0.f313996d, 2, "", true);
        return jz5.f0.f302826a;
    }
}
