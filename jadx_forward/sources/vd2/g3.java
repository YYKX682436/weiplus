package vd2;

/* loaded from: classes3.dex */
public final class g3 implements i50.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f517269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f517270b;

    public g3(r45.h32 h32Var, android.content.Context context) {
        this.f517269a = h32Var;
        this.f517270b = context;
    }

    @Override // i50.n
    public void a(boolean z17) {
        r45.q65 q65Var;
        boolean z18 = false;
        r45.h32 h32Var = this.f517269a;
        if (h32Var != null && (q65Var = (r45.q65) h32Var.m75936x14adae67(10)) != null && q65Var.m75933x41a8a7f2(0)) {
            z18 = true;
        }
        android.content.Context context = this.f517270b;
        java.lang.String string = z18 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0k) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        db5.t7.m(context, string);
    }
}
