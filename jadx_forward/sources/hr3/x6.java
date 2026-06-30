package hr3;

/* loaded from: classes9.dex */
public class x6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.a7 f365705d;

    public x6(hr3.a7 a7Var) {
        this.f365705d = a7Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        hr3.a7 a7Var = this.f365705d;
        a7Var.f364918n = false;
        android.content.Context context = a7Var.f364911d;
        a7Var.f364917m = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new hr3.y6(a7Var));
        c01.w9.h("fmessage", new hr3.z6(a7Var));
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.p314xaae8f345.mm.p957x53236a1b.g1.I("fmessage", 15);
        ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k("fmessage");
    }
}
