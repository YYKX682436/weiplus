package tx2;

/* loaded from: classes2.dex */
public final class l implements i50.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tx2.s f504137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f504138b;

    public l(tx2.s sVar, boolean z17) {
        this.f504137a = sVar;
        this.f504138b = z17;
    }

    @Override // i50.n
    public void a(boolean z17) {
        tx2.s sVar = this.f504137a;
        r45.q65 q65Var = (r45.q65) sVar.f504182e.m75936x14adae67(10);
        boolean z18 = false;
        if (q65Var != null && q65Var.m75933x41a8a7f2(0)) {
            z18 = true;
        }
        if (this.f504138b) {
            android.app.Activity activity = sVar.f504180c;
            db5.t7.m(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0o));
        } else {
            java.lang.String string = z18 ? sVar.f504180c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0k) : sVar.f504180c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0j);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            db5.t7.m(sVar.f504180c, string);
        }
    }
}
