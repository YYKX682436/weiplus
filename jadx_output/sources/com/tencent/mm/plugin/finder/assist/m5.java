package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class m5 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f102382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102383e;

    public m5(yz5.a aVar, android.content.Context context) {
        this.f102382d = aVar;
        this.f102383e = context;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.wh2 req = (r45.wh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        if (ret.getInteger(1) == 0) {
            yz5.a aVar = this.f102382d;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        android.content.Context context = this.f102383e;
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f491971lk5);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        db5.t7.m(context, string);
    }
}
