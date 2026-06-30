package r14;

/* loaded from: classes8.dex */
public final class c implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f450140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r14.y f450141b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f450142c;

    public c(java.lang.String str, r14.y yVar, java.lang.String str2) {
        this.f450140a = str;
        this.f450141b = yVar;
        this.f450142c = str2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        java.lang.String toUsers;
        if (!z17 || (toUsers = this.f450140a) == null) {
            return;
        }
        r14.y yVar = this.f450141b;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = yVar.f450166a;
        if (str == null) {
            str = "";
        }
        yVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUsers, "toUsers");
        java.lang.String path = this.f450142c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        g45.b.f350379a.a(toUsers, str, 0);
        ((dk5.s5) tg3.t1.a()).Vi(activity, toUsers, path, 0, "", "", null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), null, activity, null, null);
    }
}
