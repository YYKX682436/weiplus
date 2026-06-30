package qe2;

/* loaded from: classes4.dex */
public final class i implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f443590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f443591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f443592c;

    public i(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, android.content.Context context, java.util.List list) {
        this.f443590a = f4Var;
        this.f443591b = context;
        this.f443592c = list;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.List list = this.f443592c;
        pm0.v.X(new qe2.h(this.f443590a, this.f443591b, (com.p314xaae8f345.mm.p944x882e457a.f) obj, list));
        return jz5.f0.f384359a;
    }
}
