package jx2;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jx2.k f383936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f383937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jx2.h f383938f;

    public c(jx2.k kVar, android.content.Context context, jx2.h hVar) {
        this.f383936d = kVar;
        this.f383937e = context;
        this.f383938f = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jx2.k kVar = this.f383936d;
        ((jx2.l) kVar).f383971c.c();
        java.lang.String string = ((jx2.l) kVar).f383969a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ck6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        db5.t7.h(this.f383937e, string);
        yz5.a aVar = this.f383938f.f383963k;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
