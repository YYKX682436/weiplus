package tt2;

/* loaded from: classes3.dex */
public final class s0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f503523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f503524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f503525f;

    public s0(tt2.e1 e1Var, boolean z17, cm2.m0 m0Var) {
        this.f503523d = e1Var;
        this.f503524e = z17;
        this.f503525f = m0Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        java.lang.String string;
        r45.y23 y23Var;
        r45.rt3 rt3Var;
        tt2.e1 e1Var = this.f503523d;
        g4Var.g(1, e1Var.f503413h.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nus), com.p314xaae8f345.mm.R.raw.f78700xc776c4cb);
        android.content.Context context = e1Var.f503413h;
        java.util.List list = g4Var.f309877d;
        android.content.Context context2 = g4Var.f309879f;
        if (this.f503524e) {
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nuv);
            int color = context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30);
            java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nut);
            db5.h4 h4Var = new db5.h4(context2, 2, 0);
            h4Var.f309901i = string2;
            h4Var.f309903n = color;
            h4Var.f309906q = string3;
            h4Var.f309907r = com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c;
            h4Var.f309908s = false;
            ((java.util.ArrayList) list).add(h4Var);
            return;
        }
        java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nuv);
        int color2 = context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c);
        cm2.m0 m0Var = this.f503525f;
        if (m0Var == null || (y23Var = m0Var.f124901v) == null || (rt3Var = (r45.rt3) y23Var.m75936x14adae67(69)) == null || (string = rt3Var.m75945x2fec8307(2)) == null) {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nuu);
        }
        db5.h4 h4Var2 = new db5.h4(context2, 2, 0);
        h4Var2.f309901i = string4;
        h4Var2.f309903n = color2;
        h4Var2.f309906q = string;
        h4Var2.f309907r = com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a;
        h4Var2.f309908s = true;
        ((java.util.ArrayList) list).add(h4Var2);
    }
}
