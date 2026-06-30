package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes.dex */
public final class m5 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f183915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183916e;

    public m5(yz5.a aVar, android.content.Context context) {
        this.f183915d = aVar;
        this.f183916e = context;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.wh2 req = (r45.wh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        if (ret.m75939xb282bd08(1) == 0) {
            yz5.a aVar = this.f183915d;
            if (aVar != null) {
                aVar.mo152xb9724478();
                return;
            }
            return;
        }
        android.content.Context context = this.f183916e;
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573504lk5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        db5.t7.m(context, string);
    }
}
